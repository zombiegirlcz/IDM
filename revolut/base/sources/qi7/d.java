package qi7;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f246665a;

    public d(BigDecimal dividendYield) {
        Intrinsics.checkNotNullParameter(dividendYield, "dividendYield");
        this.f246665a = dividendYield;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f246665a, ((d) obj2).f246665a);
    }

    public final int hashCode() {
        return this.f246665a.hashCode();
    }
}
