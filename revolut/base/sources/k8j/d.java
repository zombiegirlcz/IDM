package k8j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAssetStats f182169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f182170b;

    public d(Clause tickerClause, CryptoAssetStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(tickerClause, "tickerClause");
        this.f182169a = stats;
        this.f182170b = tickerClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f182169a, dVar.f182169a) && this.f182170b.equals(dVar.f182170b);
    }

    public final int hashCode() {
        return this.f182170b.hashCode() + (this.f182169a.hashCode() * 31);
    }
}
