package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen;

import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$InputData;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import wu9.h;
import yhm.o;
import zhm.u;
import zm3.l;
import zz9.q;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ P2PChatItem f79777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, P2PChatItem p2PChatItem, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f79777w = p2PChatItem;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f79777w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        P2PChatItem p2PChatItem = this.f79777w;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zm3.a aVar2 = ((q) ((j2) dVar.I.f22677a).getValue()).f326625a;
            l lVar = aVar2 instanceof l ? (l) aVar2 : null;
            if (lVar == null) {
                return Unit.f186387a;
            }
            h hVar = dVar.D;
            dv9.l lVar2 = new dv9.l(lVar.getCode());
            List listC = u.c(new fu9.b(hx7.q.v(lVar), lVar.getCode(), false));
            this.u = 1;
            obj2 = hVar.a(p2PChatItem, lVar2, listC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ReactionsAuthorsViewer$InputData reactionsAuthorsViewer$InputData = (ReactionsAuthorsViewer$InputData) obj2;
        if (reactionsAuthorsViewer$InputData != null) {
            oki.h.v2(dVar.J, new PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.Reactions(reactionsAuthorsViewer$InputData, p2PChatItem), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
