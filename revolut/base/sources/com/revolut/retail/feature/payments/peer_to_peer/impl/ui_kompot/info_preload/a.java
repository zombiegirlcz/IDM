package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PreloadScenario;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlowContract$Step;
import gim.i;
import j9k.r;
import j9k.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            t tVar = bVar.f102355p;
            PreloadScenario preloadScenario = bVar.o.f102353a;
            this.u = 1;
            if (preloadScenario instanceof PreloadScenario.TransferToSubaccount) {
                obj2 = tVar.a((PreloadScenario.TransferToSubaccount) preloadScenario, this);
            } else {
                tVar.getClass();
                if (!(preloadScenario instanceof PreloadScenario.TransferToAnonymousSplitLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = e0.o(new r(tVar, (PreloadScenario.TransferToAnonymousSplitLink) preloadScenario, null), this);
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.u2(bVar, bVar.f102357r, new PeerToPeerInfoPreloadFlowContract$Step.Transfer((PeerToPeerTransferInputData) obj2), null, 6);
        return Unit.f186387a;
    }
}
