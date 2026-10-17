package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import eq5.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ CryptoAddress A;
    public j u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f71271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f71272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f71273y;
    public final /* synthetic */ xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, xi0.b bVar, CryptoAddress cryptoAddress, Continuation continuation) {
        super(1, continuation);
        this.f71273y = jVar;
        this.z = bVar;
        this.A = cryptoAddress;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f71273y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.kompot.navigable.vc.modal.a aVar;
        j jVar;
        xi0.b bVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f71272x;
        if (i == 0) {
            o.b(obj2);
            j jVar2 = this.f71273y;
            aVar = jVar2.G;
            x0 x0Var = jVar2.f71278q;
            this.u = jVar2;
            this.v = aVar;
            xi0.b bVar2 = this.z;
            this.f71271w = bVar2;
            this.f71272x = 1;
            Object objG = x0Var.g(this.A, this);
            if (objG == aVar2) {
                return aVar2;
            }
            jVar = jVar2;
            obj2 = objG;
            bVar = bVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.f71271w;
            aVar = this.v;
            jVar = this.u;
            o.b(obj2);
        }
        oki.h.x2(jVar, aVar, new CryptoSendAmountInputScreenContract$ModalStep.BalanceChooser(d0.i1((Iterable) obj2), bVar));
        return Unit.f186387a;
    }
}
