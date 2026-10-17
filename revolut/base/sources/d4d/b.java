package d4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mgd.h;
import mgd.i;
import mgd.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem a(c4d.a r15) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4d.b.a(c4d.a):com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem");
    }

    public static final c4d.a b(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar instanceof h) {
            h hVar = (h) jVar;
            String str = hVar.f205267a;
            FavouritesAssetDetails favouritesAssetDetails = hVar.f205268b;
            return new c4d.a(str, favouritesAssetDetails.f86863a, favouritesAssetDetails.f86865c, favouritesAssetDetails.d.f86866a, hVar.f205271h, hVar.f205269c, hVar.f, null, "TARGET_PRICE", hVar.d, hVar.e.name(), null, null, 6144);
        }
        if (!(jVar instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar = (i) jVar;
        String str2 = iVar.f205272a;
        FavouritesAssetDetails favouritesAssetDetails2 = iVar.f205273b;
        String str3 = favouritesAssetDetails2.f86863a;
        String str4 = favouritesAssetDetails2.f86865c;
        String str5 = favouritesAssetDetails2.d.f86866a;
        xi0.b.Companion.getClass();
        String str6 = xi0.b.i.f306286a;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new c4d.a(str2, str3, str4, str5, str6, ZERO, iVar.f, null, "PRICE_CHANGE", iVar.d, null, iVar.f205274c, iVar.e.name());
    }
}
