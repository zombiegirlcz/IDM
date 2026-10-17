package qca;

import cli.y;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends oki.h implements n {
    public final i8a.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PixTransferNavigation$InputData.NewContact f244682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j8a.b f244683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yca.o f244684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f244685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hp.g f244686t;
    public final f8a.b u;
    public final y v;

    public q(i8a.a aliasResolveErrorDialogProvider, PixTransferNavigation$InputData.NewContact inputData, j8a.b keyTypeMapper, yca.o transferInputKeyScreenDialogProvider, j60.a bottomExpandableDialog, hp.g keyValidator, f8a.b contactsInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(aliasResolveErrorDialogProvider, "aliasResolveErrorDialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyTypeMapper, "keyTypeMapper");
        Intrinsics.checkNotNullParameter(transferInputKeyScreenDialogProvider, "transferInputKeyScreenDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(keyValidator, "keyValidator");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasResolveErrorDialogProvider;
        this.f244682p = inputData;
        this.f244683q = keyTypeMapper;
        this.f244684r = transferInputKeyScreenDialogProvider;
        this.f244685s = bottomExpandableDialog;
        this.f244686t = keyValidator;
        this.u = contactsInteractor;
        this.v = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2(this.f244682p.f80529a);
    }

    public final void I2(String str) {
        PixIdentifiedType pixIdentifiedTypeA = this.f244686t.a(str);
        H2(this.v, new pza.d(str, 18, pixIdentifiedTypeA, this));
        if (pixIdentifiedTypeA instanceof PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) {
            this.f244684r.getClass();
            this.f244685s.x(yca.o.b((PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) pixIdentifiedTypeA));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
