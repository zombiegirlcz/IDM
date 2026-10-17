package nj9;

import cli.y;
import com.revolut.data.model.Data;
import ej9.e0;
import ej9.z;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends oki.h implements i {
    public final xh9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final di9.c f216427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f216428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qi9.d f216429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f216430s;

    public n(cli.n mapper, xh9.a payLaterInteractor, di9.c payLaterModeActivationExtension, j60.a bottomDialog, qi9.d payLaterNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        this.o = payLaterInteractor;
        this.f216427p = payLaterModeActivationExtension;
        this.f216428q = bottomDialog;
        this.f216429r = payLaterNavigationCommandFactory;
        this.f216430s = mra.d.b(this, new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.o;
        w4l.i loadingStrategy = w4l.i.f294643c;
        yji.l.a1(this, rd0.e.b(gVar.h(loadingStrategy)), null, null, new m(this, null, 0), 3);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) gVar.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, nim.a.v(e0Var.f126804j.a(Unit.f186387a, loadingStrategy), z.f), null, null, new m(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f216430s;
    }
}
