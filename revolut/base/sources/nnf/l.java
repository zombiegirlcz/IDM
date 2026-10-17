package nnf;

import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreenContract$InputData;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mjf.u;
import nn3.z;
import org.jetbrains.annotations.NotNull;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends jki.g implements f {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PendingTransactionScreenContract$InputData f217623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f217624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f217625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f217626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f217627t;
    public final d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, PendingTransactionScreenContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, u recallableInteractor, j60.a bottomExpandableDialogControllerExtension, a bottomDialogModelProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(bottomDialogModelProvider, "bottomDialogModelProvider");
        this.f217623p = inputData;
        this.f217624q = transactionsInteractor;
        this.f217625r = recallableInteractor;
        this.f217626s = bottomExpandableDialogControllerExtension;
        this.f217627t = bottomDialogModelProvider;
        this.u = new d(0);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(y2()), null, null, new j(this, null, 0), 3);
        yji.l.a1(this, rd0.e.b(pd.b.r(y2(), new z(this, 10))), null, null, new j(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final r y2() {
        return nim.a.w(com.revolut.domain.interactors.transactions.a.d(this.f217624q, new r9(this.f217623p.f92079a), null, 1, null, null, 26), new h(0));
    }
}
