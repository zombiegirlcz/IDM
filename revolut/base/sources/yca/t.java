package yca;

import cli.y;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import kotlin.jvm.internal.Intrinsics;
import y7k.g0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends oki.h implements m {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f312594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i8a.a f312595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hp.g f312596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f8a.c f312597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x2k.e f312598t;
    public final y u;

    public t(w mapper, PixTransferInputKeyScreenContract$InputData inputData, j60.a bottomExpandableDialog, o screenDialogProvider, i8a.a aliasResolveErrorDialogProvider, hp.g pixKeyValidator, f8a.c interactor, x2k.e paymentsBankTransferNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(screenDialogProvider, "screenDialogProvider");
        Intrinsics.checkNotNullParameter(aliasResolveErrorDialogProvider, "aliasResolveErrorDialogProvider");
        Intrinsics.checkNotNullParameter(pixKeyValidator, "pixKeyValidator");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        this.o = bottomExpandableDialog;
        this.f312594p = screenDialogProvider;
        this.f312595q = aliasResolveErrorDialogProvider;
        this.f312596r = pixKeyValidator;
        this.f312597s = interactor;
        this.f312598t = paymentsBankTransferNaviCommandProvider;
        this.u = mra.d.b(this, new h(inputData.f80764a, 1), mapper, null, false, 12);
    }

    public final void I2(PixIdentifiedType.Valid valid) {
        n2(new s(this, valid, null), new g0(this, valid, 14));
    }

    public final void J2() {
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.A;
        xi0.b.Companion.getClass();
        C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
