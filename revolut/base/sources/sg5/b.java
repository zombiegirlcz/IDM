package sg5;

import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f262586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f262587b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f262586a = featureToggleInteractor;
        this.f262587b = y0.b("crypto/gifted-assets");
    }

    @Override // xii.b
    public final Set a() {
        return this.f262587b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f262586a.a(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c)) {
            return null;
        }
        return CryptoGiftAssetDestination.f70861a;
    }
}
