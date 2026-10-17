package cl4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f24938c;
    public final int d;

    public g(boolean z, long j2, dj0.d limitAmount, int i) {
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        this.f24936a = z;
        this.f24937b = j2;
        this.f24938c = limitAmount;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f24936a == gVar.f24936a && this.f24937b == gVar.f24937b && Intrinsics.f(this.f24938c, gVar.f24938c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(a0.d.c(Boolean.hashCode(this.f24936a) * 31, 31, this.f24937b), 31, this.f24938c);
    }
}
