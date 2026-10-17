package xpk;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {
    public static FavouritesAssetTypeKey a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (cp5.d.A(currency)) {
            y1d.b.Companion.getClass();
            return y1d.a.f310358b;
        }
        if (cp5.d.z(currency)) {
            y1d.b.Companion.getClass();
            return y1d.a.f310359c;
        }
        if (cp5.d.y(currency)) {
            y1d.b.Companion.getClass();
            return y1d.a.d;
        }
        y1d.b.Companion.getClass();
        return y1d.a.f310358b;
    }
}
