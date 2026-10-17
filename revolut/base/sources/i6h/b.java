package i6h;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159010c;
    public final boolean d;
    public final BigDecimal e;

    public b(String holdingId, String ref2, String symbol, boolean z, BigDecimal maintenance) {
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(maintenance, "maintenance");
        this.f159008a = holdingId;
        this.f159009b = ref2;
        this.f159010c = symbol;
        this.d = z;
        this.e = maintenance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f159008a, bVar.f159008a) && Intrinsics.f(this.f159009b, bVar.f159009b) && Intrinsics.f(this.f159010c, bVar.f159010c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f159008a.hashCode() * 31, 31, this.f159009b), 31, this.f159010c), 31, this.d);
    }
}
