package ac1;

import a08.o;
import a08.o0;
import a08.p0;
import a2i.j;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import te0.w;
import ufm.i;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ma1.d f3017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g1 f3018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xc1.d f3019n;
    public final ifm.b o;

    public e(ma1.d batteryInteractor, g1 shotDialogDisplayer, xc1.d stickyActionExtension) {
        Intrinsics.checkNotNullParameter(batteryInteractor, "batteryInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
        this.f3017l = batteryInteractor;
        this.f3018m = shotDialogDisplayer;
        this.f3019n = stickyActionExtension;
        this.o = new ifm.b();
    }

    @Override // yji.n
    public final void E2() {
        this.o.dispose();
    }

    public final void Z2(Function0 onNotificationEnd) {
        Intrinsics.checkNotNullParameter(onNotificationEnd, "onNotificationEnd");
        ifm.b bVar = this.o;
        bVar.d();
        this.f3019n.d.onNext(xc1.d.f);
        ufm.n nVarI = o70.a.i(this.f3017l.b());
        o oVar = new o(this, onNotificationEnd, 28);
        b bVar2 = new b(0, onNotificationEnd);
        i iVar = new i(nVarI, new p0(1, new j(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new o0(1, oVar), new o0(1, bVar2), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(bVar, iVar2);
    }
}
