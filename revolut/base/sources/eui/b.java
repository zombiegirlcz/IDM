package eui;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftCheckoutScreenContract$InputData f129613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd7.d f129614b;

    public b(AsftCheckoutScreenContract$InputData inputData, nd7.d termsClauseMapper, g dynamicTermsAssetTypeExtractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        Intrinsics.checkNotNullParameter(dynamicTermsAssetTypeExtractor, "dynamicTermsAssetTypeExtractor");
        this.f129613a = inputData;
        this.f129614b = termsClauseMapper;
    }
}
