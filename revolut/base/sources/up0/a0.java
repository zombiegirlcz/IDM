package up0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f281675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f281676c;

    public a0(String id10, BigDecimal normalizedBalanceAmount, b configuration) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(normalizedBalanceAmount, "normalizedBalanceAmount");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f281674a = id10;
        this.f281675b = normalizedBalanceAmount;
        this.f281676c = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f281674a, a0Var.f281674a) && Intrinsics.f(this.f281675b, a0Var.f281675b) && Intrinsics.f(this.f281676c, a0Var.f281676c);
    }

    public final int hashCode() {
        return this.f281676c.hashCode() + t61.a.d(this.f281675b, this.f281674a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParticlesThemeContent(<redacted>)";
    }
}
