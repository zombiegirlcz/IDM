package bh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15278b;

    public h(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15277a = value;
        this.f15278b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f15277a, hVar.f15277a) && Intrinsics.f(this.f15278b, hVar.f15278b);
    }

    public final int hashCode() {
        int iHashCode = this.f15277a.hashCode() * 31;
        String str = this.f15278b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
