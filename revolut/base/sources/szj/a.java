package szj;

import aii.e;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthNewsCategory f266826b;

    public a(WealthNewsCategory category, String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f266825a = assetId;
        this.f266826b = category;
    }

    public final String b() {
        return this.f266825a;
    }

    public final WealthNewsCategory c() {
        return this.f266826b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266825a, aVar.f266825a) && Intrinsics.f(this.f266826b, aVar.f266826b);
    }

    public final int hashCode() {
        return this.f266826b.hashCode() + (this.f266825a.hashCode() * 31);
    }
}
