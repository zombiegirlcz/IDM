package zz9;

import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$ReactionAuthor;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326601a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d f326602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerChatScreenContract$ScreenModelApi$ModalStep f326603c;

    public /* synthetic */ b0(PeerToPeerChatScreenContract$ScreenModelApi$ModalStep peerToPeerChatScreenContract$ScreenModelApi$ModalStep, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar) {
        this.f326603c = peerToPeerChatScreenContract$ScreenModelApi$ModalStep;
        this.f326602b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f326601a) {
            case 0:
                fu9.f output = (fu9.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, fu9.f.f138153a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.Reactions reactions = (PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.Reactions) this.f326603c;
                Iterator it8 = reactions.f79771a.f79508a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((ReactionsAuthorsViewer$ReactionAuthor) next).d) {
                        }
                    } else {
                        next = null;
                    }
                }
                ReactionsAuthorsViewer$ReactionAuthor reactionsAuthorsViewer$ReactionAuthor = (ReactionsAuthorsViewer$ReactionAuthor) next;
                if (reactionsAuthorsViewer$ReactionAuthor != null) {
                    com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = this.f326602b;
                    ((e0a.w) dVar.f79783w).b3(reactionsAuthorsViewer$ReactionAuthor.f79511c, reactions.f79772b, ((q) ((j2) dVar.I.f22677a).getValue()).f326625a);
                }
                return Unit.f186387a;
            default:
                fu9.d output2 = (fu9.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = this.f326602b;
                ((e0a.w) dVar2.f79783w).b3(output2.f138151a, ((PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.ReactionsPicker) this.f326603c).f79773a, ((q) ((j2) dVar2.I.f22677a).getValue()).f326625a);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b0(com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar, PeerToPeerChatScreenContract$ScreenModelApi$ModalStep peerToPeerChatScreenContract$ScreenModelApi$ModalStep) {
        this.f326602b = dVar;
        this.f326603c = peerToPeerChatScreenContract$ScreenModelApi$ModalStep;
    }
}
