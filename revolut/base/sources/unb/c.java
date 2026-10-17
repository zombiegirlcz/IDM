package unb;

import jla.h;
import kotlin.jvm.internal.Intrinsics;
import wa7.p;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f281383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f281384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f281385c;
    public final p d;

    public c(a savingsHomeActionItemFactory, gte.a featureToggleInteractor, h productCatalogueInteractor, p hiddenAccountsActionsProvider) {
        Intrinsics.checkNotNullParameter(savingsHomeActionItemFactory, "savingsHomeActionItemFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f281383a = savingsHomeActionItemFactory;
        this.f281384b = featureToggleInteractor;
        this.f281385c = productCatalogueInteractor;
        this.d = hiddenAccountsActionsProvider;
    }
}
