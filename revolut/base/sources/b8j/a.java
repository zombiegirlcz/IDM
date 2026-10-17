package b8j;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAssetStats f13269b;

    public a(Clause tickerClause, CryptoAssetStats stats) {
        Intrinsics.checkNotNullParameter(tickerClause, "tickerClause");
        Intrinsics.checkNotNullParameter(stats, "stats");
        this.f13268a = tickerClause;
        this.f13269b = stats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f13268a.equals(aVar.f13268a) && Intrinsics.f(this.f13269b, aVar.f13269b);
    }

    public final int hashCode() {
        return this.f13269b.hashCode() + (this.f13268a.hashCode() * 31);
    }
}
