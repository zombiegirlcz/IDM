package o83;

import cli.y;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListControllerContract$InputData;
import g48.r0;
import k71.p;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements e {
    public final SubscriptionsListControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t73.f f222924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d9e.a f222925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z8e.a f222926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f222927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nhf.a f222928t;
    public final String u;
    public final y v;

    public m(cli.n stateMapper, SubscriptionsListControllerContract$InputData inputData, t73.f subscriptionsInteractor, d9e.a raisedSubscriptionsExtension, z8e.a subscriptionsAppNavigationProvider, r0 jointInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(raisedSubscriptionsExtension, "raisedSubscriptionsExtension");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.o = inputData;
        this.f222924p = subscriptionsInteractor;
        this.f222925q = raisedSubscriptionsExtension;
        this.f222926r = subscriptionsAppNavigationProvider;
        this.f222927s = jointInteractor;
        this.f222928t = unitedWalletInteractor;
        this.u = inputData.f65498a.f150110a;
        CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = inputData.f65499b;
        q.Companion.getClass();
        this.v = mra.d.b(this, new f(cardsStateSnapshot$SubscriptionsContent, p.a()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, new n1g.p(rd0.e.b(this.f222924p.a(this.u)), this, 26), null, new l(this, null, 0), 3);
        yji.l.b1(this, rd0.e.b(((njf.j) this.f222928t).f()), null, new l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
