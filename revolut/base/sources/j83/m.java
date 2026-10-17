package j83;

import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreenContract$InputData;
import ha3.x;
import j82.q;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import v6l.b1;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TerminatedCardChargebackScreenContract$InputData f172113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f172114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final whf.b f172115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f172116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f172117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, TerminatedCardChargebackScreenContract$InputData inputData, l93.f revolutCardsInteractor, whf.b transactionsContentProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f172113p = inputData;
        this.f172114q = revolutCardsInteractor;
        this.f172115r = transactionsContentProvider;
        this.f172116s = new f(0);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f172116s;
    }

    public final void y2() {
        a2 a2Var = this.f172117t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String cardId = this.f172113p.f65496a.f65547a;
        x xVar = (x) this.f172114q;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        s sVar = xVar.f;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        b1 b1Var = (b1) sVar.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f172117t = yji.l.a1(this, rd0.e.b(pd.b.r(rd0.e.c(rd0.e.b(b1Var.f286433p.f(cardId, false)), kotlin.coroutines.g.f186406a), new iyi.i(this, 28))), null, null, new q(this, continuation, 2), 3);
    }
}
