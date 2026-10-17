package kf1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183280b;

    public l(boolean z, boolean z3) {
        this.f183279a = z;
        this.f183280b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f183279a == lVar.f183279a && this.f183280b == lVar.f183280b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183280b) + (Boolean.hashCode(this.f183279a) * 31);
    }
}
