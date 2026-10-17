package df1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1.b f113747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf1.f f113748b;

    public b(rd1.b catalogueCommonItemsFactory, hf1.f shoppingCartCalculator) {
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        Intrinsics.checkNotNullParameter(shoppingCartCalculator, "shoppingCartCalculator");
        this.f113747a = catalogueCommonItemsFactory;
        this.f113748b = shoppingCartCalculator;
    }
}
