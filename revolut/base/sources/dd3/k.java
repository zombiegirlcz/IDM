package dd3;

import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements b, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PercentageClause f113094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PercentageClause f113095b;

    public k(PercentageClause euCashbackPercentage, PercentageClause nonEuCashbackPercentage) {
        Intrinsics.checkNotNullParameter(euCashbackPercentage, "euCashbackPercentage");
        Intrinsics.checkNotNullParameter(nonEuCashbackPercentage, "nonEuCashbackPercentage");
        this.f113094a = euCashbackPercentage;
        this.f113095b = nonEuCashbackPercentage;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.cashback_source_metal_subtitle, zhm.v.k(this.f113094a, this.f113095b), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f113094a.equals(kVar.f113094a) && this.f113095b.equals(kVar.f113095b);
    }

    public final int hashCode() {
        return this.f113095b.hashCode() + (this.f113094a.hashCode() * 31);
    }
}
