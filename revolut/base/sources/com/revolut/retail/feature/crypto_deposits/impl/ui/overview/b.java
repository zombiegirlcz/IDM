package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import te0.w;
import yhm.o;
import zbj.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk5.a f100087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, wk5.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f100087w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f100087w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            vbj.c cVar2 = cVar.u;
            cVar2.getClass();
            ufm.c cVar3 = new ufm.c(new s2i.i(cVar2, 14), 2);
            Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
            ufm.i iVar = new ufm.i(w.i0(cVar3), new zab.b(27, new j0(8)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = 1;
            obj2 = nim.a.b(iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.v2(cVar.G, new CryptoDepositsOverviewControllerContract$ModalStep.MindfulOfNetwork(this.f100087w), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            cVar.J2();
        }
        return Unit.f186387a;
    }
}
