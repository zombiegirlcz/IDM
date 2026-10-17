package kf1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183269b;

    public b(boolean z, boolean z3) {
        this.f183268a = z;
        this.f183269b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f183268a == bVar.f183268a && this.f183269b == bVar.f183269b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183269b) + (Boolean.hashCode(this.f183268a) * 31);
    }
}
