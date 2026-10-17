package hqe;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154679a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oqk.l f154680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f154681c;
    public final Object d;
    public final Object e;

    public i(oqk.l transactionsWidgetActionExtensionProvider, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, gte.a featureToggleInteractor, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f154680b = transactionsWidgetActionExtensionProvider;
        this.f154681c = externalPocketNavigationFactory;
        this.d = featureToggleInteractor;
        this.e = externalInstitutionsInteractor;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        switch (this.f154679a) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                return new h(this.f154680b.a(bottomDialogExtension, popupMenuDialogDisplayer), ((kbb.c) this.f154681c).R(), bottomDialogExtension, (wsg.b) this.d, (xea.c) this.e);
            default:
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                return new yg6.p(this.f154680b.a(bottomDialogExtension, popupMenuDialogDisplayer), (com.revolut.feature.external_accounts.api.navigation.a) this.f154681c, (gte.a) this.d, (oe6.a) this.e);
        }
    }

    public i(oqk.l transactionsWidgetActionExtensionProvider, kbb.c hiddenAccountsActionsExtensionProvider, wsg.b newWalletInteractor, xea.c pocketItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        this.f154680b = transactionsWidgetActionExtensionProvider;
        this.f154681c = hiddenAccountsActionsExtensionProvider;
        this.d = newWalletInteractor;
        this.e = pocketItemMapper;
    }
}
