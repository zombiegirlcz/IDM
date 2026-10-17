package kf1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183282b;

    public n(boolean z, boolean z3) {
        this.f183281a = z;
        this.f183282b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f183281a == nVar.f183281a && this.f183282b == nVar.f183282b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183282b) + (Boolean.hashCode(this.f183281a) * 31);
    }
}
