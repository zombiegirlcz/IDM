package a26;

import cli.y;
import com.revolut.feature.defi.feed.api.widget.DeFiPortfolioWidgetContext;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import tof.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements d {
    public final ut5.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ash.e f680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f683s;

    public k(m stateMapper, ut5.e splitAccountsWidgetExtension, ash.e widgetsControllerModelExtension, com.revolut.domain.interactors.transactions.a transactionsInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(splitAccountsWidgetExtension, "splitAccountsWidgetExtension");
        Intrinsics.checkNotNullParameter(widgetsControllerModelExtension, "widgetsControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = splitAccountsWidgetExtension;
        this.f680p = widgetsControllerModelExtension;
        this.f681q = transactionsInteractor;
        this.f682r = termsNavigationFactory;
        this.f683s = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.o.Z2(), null, new g(this, null, 0), 3);
        DeFiPortfolioWidgetContext.INSTANCE.getClass();
        yji.l.b1(this, this.f680p.c3(new DeFiPortfolioWidgetContext(null, 1, null), dsh.s.ADD_NEW_WIDGET), null, new g(this, null, 1), 3);
        ((b0) this.f681q).t(m0.f272923a);
        n2(new h(this, null, 0), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f683s;
    }
}
