package x1d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    public static b a(String symbolData) {
        Intrinsics.checkNotNullParameter(symbolData, "symbolData");
        List listN0 = d0.n0(symbolData, new String[]{"-"}, 0, 6);
        if (listN0.size() != 3) {
            return null;
        }
        String upperCase = ((String) listN0.get(0)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new b(new FavouritesAssetTypeKey(upperCase), (String) listN0.get(1), (String) listN0.get(2));
    }
}
