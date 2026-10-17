package hk9;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorControllerContract$InputData;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q0;
import zh9.c1;
import zh9.k1;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends oki.h implements k {

    @NotNull
    public static final m Companion = new m();
    public final xh9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f152885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final di9.c f152886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PurchaseCalculatorControllerContract$InputData f152887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f152888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f152889t;
    public final n60.a u;
    public final ik9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qi9.d f152890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f152891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cli.y f152892y;

    public q(cli.n mapper, xh9.a payLaterInteractor, j60.a bottomDialog, di9.c payLaterModeActivationExtension, PurchaseCalculatorControllerContract$InputData inputData, w80.b amountFormatter, r purchaseCalculatorExplainersMapper, n60.a keyboardControllerExtension, ik9.a purchaseAmountCache, qi9.d payLaterNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(purchaseCalculatorExplainersMapper, "purchaseCalculatorExplainersMapper");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(purchaseAmountCache, "purchaseAmountCache");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        this.o = payLaterInteractor;
        this.f152885p = bottomDialog;
        this.f152886q = payLaterModeActivationExtension;
        this.f152887r = inputData;
        this.f152888s = amountFormatter;
        this.f152889t = purchaseCalculatorExplainersMapper;
        this.u = keyboardControllerExtension;
        this.v = purchaseAmountCache;
        this.f152890w = payLaterNavigationCommandFactory;
        dj0.d dVar = (dj0.d) ((ne0.n) ((ik9.b) purchaseAmountCache).f161910a.getValue()).get("lastUsedAmount");
        this.f152891x = vkm.q.c(dVar == null ? new dj0.d(0L, inputData.f78904b) : dVar);
        this.f152892y = mra.d.b(this, new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f78903a, null, false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(new q0(t1.g(this.f152891x, 300L), new p(this, continuation, 1), 1), new hcj.o(continuation, this, 5)), null, null, new p(this, continuation, 2), 3);
        yji.l.a1(this, rd0.e.b(((ti9.g) this.o).h(w4l.h.f294642c)), null, null, new p(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f152885p.E()), null, null, new hbg.h(this, continuation, 11), 3);
    }

    public final void I2() {
        c1 c1Var = ((k1) zi0.c.I(((j) ((j2) this.f152892y.f22677a).getValue()).f152877b)).d;
        if (c1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, c1Var.e, null, null, 30)));
    }

    public final void J2(Function1 function1) {
        H2(this.f152892y, new a31.k(16, function1));
    }

    @Override // yji.l
    public final void K1() {
        dj0.d amount = (dj0.d) this.f152891x.getValue();
        ik9.b bVar = (ik9.b) this.v;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        ((ne0.n) bVar.f161910a.getValue()).f("lastUsedAmount", amount);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152892y;
    }
}
