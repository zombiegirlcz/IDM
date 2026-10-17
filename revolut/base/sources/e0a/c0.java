package e0a;

import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iz9.e f121485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tx9.f f121486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PeerToPeerChatScreenContract$InputData f121487n;
    public final pu9.b o;

    public c0(iz9.e socialPaymentsInteractor, tx9.f recentTimestampManager, PeerToPeerChatScreenContract$InputData inputData, pu9.b activeChatInteractor) {
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(recentTimestampManager, "recentTimestampManager");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activeChatInteractor, "activeChatInteractor");
        this.f121485l = socialPaymentsInteractor;
        this.f121486m = recentTimestampManager;
        this.f121487n = inputData;
        this.o = activeChatInteractor;
    }

    @Override // yji.n
    public final void F2() {
        T2(new dz6.o(this, this.f121487n.f79768a, null, 10), new yi5.b(27));
        this.o.f239841b.f189756a = null;
    }

    @Override // yji.n
    public final void H2() {
        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = this.f121487n;
        zm3.a aVar = peerToPeerChatScreenContract$InputData.f79768a;
        Continuation continuation = null;
        if (aVar instanceof zm3.l) {
            zm3.l contact = (zm3.l) aVar;
            qz9.r rVar = (qz9.r) this.f121485l;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(contact, "contact");
            efm.r rVarC = rVar.f250445a.i(new dv9.l(contact.getCode())).ignoreElements().C();
            Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
            yji.n.l2(this, rd0.e.b(rVarC), null, null, 7);
        } else if (!(aVar instanceof zm3.g) && !(aVar instanceof zm3.p)) {
            throw new NoWhenBranchMatchedException();
        }
        T2(new dz6.o(this, peerToPeerChatScreenContract$InputData.f79768a, continuation, 10), new yi5.b(27));
        zm3.a aVar2 = peerToPeerChatScreenContract$InputData.f79768a;
        if (aVar2 instanceof zm3.l) {
            this.o.a(new dv9.l(((zm3.l) aVar2).getCode()));
        } else if (!(aVar2 instanceof zm3.g) && !(aVar2 instanceof zm3.p)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
