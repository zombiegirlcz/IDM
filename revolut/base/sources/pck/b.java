package pck;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f234922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f234923c;
    public final int d;

    public b(String code, Instant startDate, Instant endDate, int i) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f234921a = code;
        this.f234922b = startDate;
        this.f234923c = endDate;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f234921a, bVar.f234921a) && Intrinsics.f(this.f234922b, bVar.f234922b) && Intrinsics.f(this.f234923c, bVar.f234923c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r6.b.c(r6.b.c(this.f234921a.hashCode() * 31, 31, this.f234922b), 31, this.f234923c);
    }
}
