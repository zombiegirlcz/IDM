package pja;

import com.revolut.feature.product.onboarding.domain.models.ScreenConfiguration;
import qja.s;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {
    public static ScreenConfiguration a(s sVar) {
        return new ScreenConfiguration(sVar.getTitle(), sVar.getSubtitle(), sVar.getAsset());
    }

    public static uja.a b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1942051728) {
            if (iHashCode != -1429540080) {
                if (iHashCode == 35394935 && str.equals("PENDING")) {
                    return uja.a.PENDING;
                }
            } else if (str.equals("SKIPPED")) {
                return uja.a.SKIPPED;
            }
        } else if (str.equals("PASSED")) {
            return uja.a.PASSED;
        }
        throw new IllegalStateException("Unexpected step state ".concat(str));
    }
}
