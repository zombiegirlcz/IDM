package m0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import efm.r;
import i0k.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f201163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0k.d f201164b;

    public e(h wealthNewsRepository, n0k.d wealthNewsWithAssetTransformer) {
        Intrinsics.checkNotNullParameter(wealthNewsRepository, "wealthNewsRepository");
        Intrinsics.checkNotNullParameter(wealthNewsWithAssetTransformer, "wealthNewsWithAssetTransformer");
        this.f201163a = wealthNewsRepository;
        this.f201164b = wealthNewsWithAssetTransformer;
    }

    public static r a(e eVar, WealthNewsCategory category, String assetId, Integer num, boolean z) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        h hVar = eVar.f201163a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        return pd.b.r(nim.a.w(hVar.f157426b.f(new o0k.b(category, null, null, assetId, num), z), new lyd.b(29)), new d(eVar, category, 1));
    }

    public static r b(e eVar, WealthNewsCategory category, boolean z, String str, List assetsFilters, DateTime dateTime, DateTime dateTime2, Integer num, boolean z3, int i) {
        WealthNewsCategory category2;
        r rVarF;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            assetsFilters = f0.f322471a;
        }
        if ((i & 16) != 0) {
            dateTime = null;
        }
        if ((i & 32) != 0) {
            dateTime2 = null;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        eVar.getClass();
        h hVar = eVar.f201163a;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assetsFilters, "assetsFilters");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assetsFilters, "assetsFilters");
        if (z) {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(assetsFilters, "assetsFilters");
            category2 = category;
            rVarF = hVar.f157427c.f(new o0k.b(category2, assetsFilters, dateTime, dateTime2, str, num), z3);
        } else {
            category2 = category;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(category2, "category");
            rVarF = hVar.f157426b.f(new o0k.b(category2, dateTime, dateTime2, str, num), z3);
        }
        return pd.b.r(rVarF, new d(eVar, category2, 0));
    }
}
