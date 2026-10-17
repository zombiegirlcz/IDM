package kf1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183275b;

    public h(boolean z, boolean z3) {
        this.f183274a = z;
        this.f183275b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f183274a == hVar.f183274a && this.f183275b == hVar.f183275b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183275b) + (Boolean.hashCode(this.f183274a) * 31);
    }
}
