package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import eq5.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public j u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f71274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f71275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f71276y;
    public final /* synthetic */ CryptoAddress z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, CryptoAddress cryptoAddress, Continuation continuation) {
        super(1, continuation);
        this.f71275x = jVar;
        this.f71276y = str;
        this.z = cryptoAddress;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f71275x, this.f71276y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        com.revolut.kompot.navigable.vc.modal.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f71274w;
        if (i == 0) {
            o.b(obj2);
            jVar = this.f71275x;
            com.revolut.kompot.navigable.vc.modal.a aVar3 = jVar.G;
            x0 x0Var = jVar.f71278q;
            this.u = jVar;
            this.v = aVar3;
            this.f71274w = 1;
            Object objA = x0Var.a(this.f71276y, this.z, this);
            if (objA == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.v;
            jVar = this.u;
            o.b(obj2);
        }
        oki.h.x2(jVar, aVar, new CryptoSendAmountInputScreenContract$ModalStep.DualChooser((DualChooserContract$InputData) obj2));
        return Unit.f186387a;
    }
}
