package dd3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements b, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113088a;

    public d0(String cashbackPercentage) {
        Intrinsics.checkNotNullParameter(cashbackPercentage, "cashbackPercentage");
        this.f113088a = cashbackPercentage;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.cashback_source_travel_subtitle, zhm.u.c(this.f113088a), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f113088a, ((d0) obj2).f113088a);
    }

    public final int hashCode() {
        return this.f113088a.hashCode();
    }
}
