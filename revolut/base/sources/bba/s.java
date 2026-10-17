package bba;

import cli.y;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends oki.h implements k {
    public final ogm.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f8a.c f14217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s8a.l f14218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tca.f f14219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f14220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i8a.e f14221t;
    public final j60.a u;
    public final y v;

    public s(cli.n stateMapper, ogm.i pixBeneficiaryInteractor, f8a.c pixTransactionsInteractor, s8a.l pixQrCodeInteractor, tca.f pixQrResultDataExtractor, n sendScreenDialogProvider, i8a.e qrDialogProvider, j60.a bottomExpandableDialog) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pixBeneficiaryInteractor, "pixBeneficiaryInteractor");
        Intrinsics.checkNotNullParameter(pixTransactionsInteractor, "pixTransactionsInteractor");
        Intrinsics.checkNotNullParameter(pixQrCodeInteractor, "pixQrCodeInteractor");
        Intrinsics.checkNotNullParameter(pixQrResultDataExtractor, "pixQrResultDataExtractor");
        Intrinsics.checkNotNullParameter(sendScreenDialogProvider, "sendScreenDialogProvider");
        Intrinsics.checkNotNullParameter(qrDialogProvider, "qrDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        this.o = pixBeneficiaryInteractor;
        this.f14217p = pixTransactionsInteractor;
        this.f14218q = pixQrCodeInteractor;
        this.f14219r = pixQrResultDataExtractor;
        this.f14220s = sendScreenDialogProvider;
        this.f14221t = qrDialogProvider;
        this.u = bottomExpandableDialog;
        this.v = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ogm.i iVar = this.o;
        yji.l.a1(this, rd0.e.b(nim.a.w(xx9.p.c((xx9.p) iVar.f225222b, false, null, 3), new s6e.g(iVar, 26))), null, null, new b74.e(this, null, 15), 3);
    }

    public final void I2(PixIdentifiedType.Valid valid) {
        l2(new p(this, valid, null), new b58.f(this, valid, 22));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
