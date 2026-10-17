package ipb;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements f {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f167718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f167719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f167720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f167721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ProtectionAndSafetyScreenContract$InputData f167722t;
    public final y u;

    public k(ijb.a savingsProductInteractor, j60.a bottomDialogExtension, mre.c termsNavigationFactory, f80.a uriHelper, x deeplinkHandler, ProtectionAndSafetyScreenContract$InputData input, n stateMapper) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsProductInteractor;
        this.f167718p = bottomDialogExtension;
        this.f167719q = termsNavigationFactory;
        this.f167720r = uriHelper;
        this.f167721s = deeplinkHandler;
        this.f167722t = input;
        this.u = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ijb.a.b(this.o, this.f167722t.f83379a), null, null, new ibg.g(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
