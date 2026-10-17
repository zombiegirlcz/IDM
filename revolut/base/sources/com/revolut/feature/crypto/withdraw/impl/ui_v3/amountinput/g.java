package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoAddress f71268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f71269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wk5.a f71270y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, CryptoAddress cryptoAddress, List list, wk5.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f71268w = cryptoAddress;
        this.f71269x = list;
        this.f71270y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f71268w, this.f71269x, this.f71270y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            l lVarF = jVar.f71278q.f(this.f71268w, this.f71269x);
            this.u = 1;
            obj2 = q.x(lVarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.v2(jVar.G, new CryptoSendAmountInputScreenContract$ModalStep.NetworkPicker((List) obj2, this.f71270y), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
