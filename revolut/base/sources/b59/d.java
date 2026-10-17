package b59;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f12477b;

    public d(b cryptoVolatility, b wealthInsightsAlert) {
        Intrinsics.checkNotNullParameter(cryptoVolatility, "cryptoVolatility");
        Intrinsics.checkNotNullParameter(wealthInsightsAlert, "wealthInsightsAlert");
        this.f12476a = cryptoVolatility;
        this.f12477b = wealthInsightsAlert;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f12476a, dVar.f12476a) && Intrinsics.f(this.f12477b, dVar.f12477b);
    }

    public final int hashCode() {
        return this.f12477b.f12475a.hashCode() + (this.f12476a.f12475a.hashCode() * 31);
    }
}
