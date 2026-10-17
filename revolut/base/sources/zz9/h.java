package zz9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.contacts.api.navigation.ContactFlowConfiguration;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import dce.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarF3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3;
        cli.y yVar = dVar.I;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof MessageType.Sticker) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            s sVar = ((q) j2Var.getValue()).f326627c;
            if (sVar == s.ENABLED || sVar == s.TEXT_NOT_SUPPORTED) {
                e0a.b0 b0Var = dVar.f79781s;
                MessageType.Sticker messageType = new MessageType.Sticker(((MessageType.Sticker) obj3).f79559b);
                zm3.a contact = ((q) j2Var2.getValue()).f326625a;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(messageType, "messageType");
                Intrinsics.checkNotNullParameter(contact, "contact");
                b0Var.T2(new s0(b0Var, messageType, contact, null, 26), new yi5.b(27));
            } else {
                dVar.f79785y.Z2(sVar, ((q) j2Var2.getValue()).f326625a);
            }
        } else if (obj3 instanceof t) {
            e0a.i iVar = (e0a.i) dVar.v;
            iVar.A2(u0.c(new ContactFlowFeatureConfig(new ContactFlowConfiguration(iVar.f121497l.f79768a, null))));
        }
        return Unit.f186387a;
    }
}
