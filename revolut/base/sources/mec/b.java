package mec;

import a0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f204649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f204651c;

    public b(long j2, long j3, long j5) {
        this.f204649a = j2;
        this.f204650b = j3;
        this.f204651c = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f204649a == bVar.f204649a && this.f204650b == bVar.f204650b && this.f204651c == bVar.f204651c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f204651c) + d.c(Long.hashCode(this.f204649a) * 31, 31, this.f204650b);
    }
}
