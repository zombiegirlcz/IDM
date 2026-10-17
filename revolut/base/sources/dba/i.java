package dba;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s8a.n;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements dli.b {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jpc.e f112700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f112701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fba.a f112702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f112703s;

    public i(k mapper, n trustedBeneficiariesInteractor, jpc.e pixAddTrustedAccountInteractor, j60.a bottomExpandableDialog, fba.a pixedTrustedListDialogFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(trustedBeneficiariesInteractor, "trustedBeneficiariesInteractor");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountInteractor, "pixAddTrustedAccountInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(pixedTrustedListDialogFactory, "pixedTrustedListDialogFactory");
        this.o = trustedBeneficiariesInteractor;
        this.f112700p = pixAddTrustedAccountInteractor;
        this.f112701q = bottomExpandableDialog;
        this.f112702r = pixedTrustedListDialogFactory;
        this.f112703s = mra.d.b(this, new e(0), mapper, null, false, 12);
    }

    public final void I2() {
        w4l.i iVar = w4l.i.f294643c;
        jpc.e eVar = this.f112700p;
        l.a1(this, nim.a.v(u0.m(eVar.V(iVar), rd0.e.b(nim.a.w(((u3a.n) ((d3a.b) eVar.f177256b)).d(null, u.c(d3a.a.APM_PIX), jq9.a.NONE), new s6e.g(22)))), new dak.c(3)), null, null, new d8j.c(this, (Continuation) null, 7), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112703s;
    }
}
