package grc;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import wsg.n;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final g Companion = new g();
    public final wig.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f145974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jrc.g f145975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aqc.k f145976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u53.b f145977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f145978t;
    public final v60.e u;
    public final irc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f145979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f145980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f145981y;

    public k(cli.n stateMapper, wig.a fundsProtectionDialogMapper, j60.a bottomDialogController, jrc.g inputNumberValidator, aqc.k salarySwitchProcessInteractor, u53.b scanActivityCommandProvider, sf0.h serverErrorParser, v60.e serverErrorsProvider, irc.a panScannerControllerExtension, n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(fundsProtectionDialogMapper, "fundsProtectionDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogController, "bottomDialogController");
        Intrinsics.checkNotNullParameter(inputNumberValidator, "inputNumberValidator");
        Intrinsics.checkNotNullParameter(salarySwitchProcessInteractor, "salarySwitchProcessInteractor");
        Intrinsics.checkNotNullParameter(scanActivityCommandProvider, "scanActivityCommandProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(panScannerControllerExtension, "panScannerControllerExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = fundsProtectionDialogMapper;
        this.f145974p = bottomDialogController;
        this.f145975q = inputNumberValidator;
        this.f145976r = salarySwitchProcessInteractor;
        this.f145977s = scanActivityCommandProvider;
        this.f145978t = serverErrorParser;
        this.u = serverErrorsProvider;
        this.v = panScannerControllerExtension;
        this.f145979w = walletInteractor;
        this.f145980x = q.b(1, 1, ukm.f.DROP_OLDEST);
        this.f145981y = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null, 1), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, this.v.f168038c, null, new j(this, continuation, 0), 3);
        yji.l.b1(this, t1.d(q.q(this.f145980x), 300L), null, new j(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145981y;
    }
}
