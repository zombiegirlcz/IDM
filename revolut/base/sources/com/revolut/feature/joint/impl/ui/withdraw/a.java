package com.revolut.feature.joint.impl.ui.withdraw;

import com.revolut.data.model.Data;
import gim.i;
import io3.d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import yhm.o;
import z92.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f76607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f76607w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f76607w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AmountInputVerificationData amountInputVerificationData;
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Data data = (Data) pair.f186385a;
            Data data2 = (Data) pair.f186386b;
            AmountData amount = (AmountData) data.getContent();
            d pocket = (d) data2.getContent();
            boolean z = false;
            boolean z3 = data.getLoading() || data2.getLoading();
            Throwable error = data.getError();
            if (error == null) {
                error = data2.getError();
            }
            if (amount == null || pocket == null) {
                amountInputVerificationData = null;
            } else {
                AmountInputVerificationData.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                dj0.d dVar = amount.f76598a;
                boolean z4 = !Intrinsics.f(dVar.f115083b, f.j(pocket).f115083b) || dVar.h(f.j(pocket));
                boolean zK = dVar.k();
                AmountData.INSTANCE.getClass();
                if (!amount.equals(AmountData.d) && z4 && amount.f76599b.length() > 0 && !zK) {
                    z = true;
                }
                amountInputVerificationData = new AmountInputVerificationData(z, z4, zK);
            }
            z1 z1Var = this.f76607w.f76615y;
            Data data3 = new Data(amountInputVerificationData, error, z3);
            this.v = null;
            this.u = 1;
            if (z1Var.emit(data3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
