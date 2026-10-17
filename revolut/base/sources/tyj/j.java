package tyj;

import com.revolut.data.model.Data;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tjf.p0;
import tof.a3;
import vkm.q;
import vkm.z1;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f275676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g09.j f275677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f275678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j61.b f275679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f275680t;
    public final z1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, whf.b transactionsListContentProvider, g09.j interactor, n walletInteractor, j61.b mainWalletTransactionsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(mainWalletTransactionsInteractor, "mainWalletTransactionsInteractor");
        this.f275676p = transactionsListContentProvider;
        this.f275677q = interactor;
        this.f275678r = walletInteractor;
        this.f275679s = mainWalletTransactionsInteractor;
        this.f275680t = new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
        this.u = q.b(1, 5, null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0(this, null, 22), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f275680t;
    }

    public final void y2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof e) {
            this.u.k(Unit.f186387a);
            return;
        }
        if (!(event instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((f) event).f275674a.u;
        a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
        if (a3Var == null) {
            return;
        }
        C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(a3Var), null, null, null, 126))));
    }
}
