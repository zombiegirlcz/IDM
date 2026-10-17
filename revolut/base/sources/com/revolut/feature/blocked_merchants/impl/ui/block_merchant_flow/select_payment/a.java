package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import gim.i;
import is2.f;
import is2.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import rd0.e;
import tof.a3;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f64266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f64266w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f64266w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f64266w;
            SelectPaymentToBlockScreenContract$ScreenType selectPaymentToBlockScreenContract$ScreenType = bVar2.f64270s.f64262b;
            if (Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a)) {
                a3 a3Var = ((f) bVar2.t2()).d;
                if (a3Var == null) {
                    throw new NullPointerException("transaction to block must be selected");
                }
                bVar2.z = l.a1(bVar2, e.b(bVar2.u.c(a3Var)), null, null, new s(bVar2, null, 0), 3);
                return Unit.f186387a;
            }
            if (!Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a)) {
                if (Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchantOld.f64264a)) {
                    throw new IllegalStateException("NextButton should be hidden for ScreenType BlockMerchantOld");
                }
                throw new NoWhenBranchMatchedException();
            }
            a3 a3Var2 = ((f) bVar2.t2()).d;
            if (a3Var2 == null) {
                return null;
            }
            String str = a3Var2.f272581b;
            this.u = bVar2;
            this.v = 1;
            obj2 = b.y2(bVar2, str, this);
            if (obj2 == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar3 = this.u;
            o.b(obj2);
            bVar = bVar3;
        }
        bVar.z = l.a1(bVar, e.b(bVar.v.c((p) obj2)), null, null, new s(bVar, null, 1), 3);
        return Unit.f186387a;
    }
}
