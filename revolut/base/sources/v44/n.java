package v44;

import cli.y;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$BoundedAgreementWebView;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends oki.h implements dli.b {

    @NotNull
    public static final m Companion = new m();
    public final CreditApplicationDocumentViewerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y74.a f285958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hz3.c f285959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bk0.e f285960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f285961s;

    public n(cli.n stateMapper, CreditApplicationDocumentViewerScreenContract$InputData inputData, y74.a pdfDownloadControllerModelExtension, hz3.c creditApplicationCommandsFactory, bk0.e revolutHeadersProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pdfDownloadControllerModelExtension, "pdfDownloadControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f285958p = pdfDownloadControllerModelExtension;
        this.f285959q = creditApplicationCommandsFactory;
        this.f285960r = revolutHeadersProvider;
        this.f285961s = mra.d.b(this, new g(inputData.f66987a, inputData.f66988b, inputData.f66989c, inputData.d, false, inputData.e, inputData.f66990g, inputData.f66991h, null, ((jte.d) featureToggleInteractor).c(CreditApplicationPluginsApi$Toggles$BoundedAgreementWebView.f66274c)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new uxe.l(this, null, 6), new v25.k(this, 4));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f285961s;
    }
}
