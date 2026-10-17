package mel;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f204734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f204735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f204736c;
    public final int d;

    public c(dj0.d high, dj0.d low, dj0.d mean, int i) {
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(mean, "mean");
        this.f204734a = high;
        this.f204735b = low;
        this.f204736c = mean;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f204734a, cVar.f204734a) && Intrinsics.f(this.f204735b, cVar.f204735b) && Intrinsics.f(this.f204736c, cVar.f204736c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(v7.c(this.f204734a.hashCode() * 31, 31, this.f204735b), 31, this.f204736c);
    }
}
