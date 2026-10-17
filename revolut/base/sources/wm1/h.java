package wm1;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import qua.w;
import yji.l;
import yua.q;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements d {
    public final xua.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nm1.c f298594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qm1.h f298595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f298596r;

    public h(xua.a recurringPaymentInteractor, nm1.c boletoFinderNavigationProvider, qm1.h boletoFinderSearchErrorDialogProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(boletoFinderNavigationProvider, "boletoFinderNavigationProvider");
        Intrinsics.checkNotNullParameter(boletoFinderSearchErrorDialogProvider, "boletoFinderSearchErrorDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = recurringPaymentInteractor;
        this.f298594p = boletoFinderNavigationProvider;
        this.f298595q = boletoFinderSearchErrorDialogProvider;
        this.f298596r = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        q qVar = (q) this.o;
        l.a1(this, rd0.e.b(nim.a.w(qVar.i(qVar.s(false, w.f249340a, false), new ypg.h(23)), new wl3.d(17))), null, null, new wka.e(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f298596r;
    }
}
