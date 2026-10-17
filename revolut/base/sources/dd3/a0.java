package dd3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements b, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113085a;

    public a0(String cashbackPercentage) {
        Intrinsics.checkNotNullParameter(cashbackPercentage, "cashbackPercentage");
        this.f113085a = cashbackPercentage;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.cashback_source_stays_subtitle, zhm.u.c(this.f113085a), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f113085a, ((a0) obj2).f113085a);
    }

    public final int hashCode() {
        return this.f113085a.hashCode();
    }
}
