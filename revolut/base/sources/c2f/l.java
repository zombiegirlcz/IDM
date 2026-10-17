package c2f;

import bw4.s;
import cli.y;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tsk.t;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements h {

    @NotNull
    private static final j Companion = new j();
    public final TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f20776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qr0.i f20777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f20778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f20779s;

    public l(o stateMapper, TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData inputData, t accountsInteractor, qr0.i agentsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        this.o = inputData;
        this.f20776p = accountsInteractor;
        this.f20777q = agentsInteractor;
        this.f20778r = new vii.b();
        this.f20779s = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(q.Q(this.f20778r, new s(continuation, this, 5)), h0.f322473a), null, null, new c1i.f(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f20779s;
    }
}
