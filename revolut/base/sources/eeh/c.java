package eeh;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends aeh.b {
    @Override // aeh.b
    public final void Z2(aeh.f details) {
        Intrinsics.checkNotNullParameter(details, "details");
        A2(new AssetDetailsDestination(details.f3588a, null, false, null, null, null, 62));
    }
}
