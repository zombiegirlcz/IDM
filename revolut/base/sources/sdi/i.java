package sdi;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdi.b f261908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tdi.h f261909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.l f261910c;
    public final edi.a d;
    public final kbb.c e;

    public i(kdi.b thresholdsBreakdownControllerExtension, tdi.h pointsPocketTransferDialogMapper, q06.l deeplinkRouter, edi.a revPointsPocketDestinationProvider, kbb.c hiddenAccountsActionsExtensionProvider) {
        Intrinsics.checkNotNullParameter(thresholdsBreakdownControllerExtension, "thresholdsBreakdownControllerExtension");
        Intrinsics.checkNotNullParameter(pointsPocketTransferDialogMapper, "pointsPocketTransferDialogMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(revPointsPocketDestinationProvider, "revPointsPocketDestinationProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        this.f261908a = thresholdsBreakdownControllerExtension;
        this.f261909b = pointsPocketTransferDialogMapper;
        this.f261910c = deeplinkRouter;
        this.d = revPointsPocketDestinationProvider;
        this.e = hiddenAccountsActionsExtensionProvider;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        return new h(this.f261908a, this.f261909b, this.f261910c, this.d, this.e.R());
    }
}
