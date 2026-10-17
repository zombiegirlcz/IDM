package hj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152660b;

    public d(String label, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f152659a = label;
        this.f152660b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f152659a, dVar.f152659a) && Intrinsics.f(this.f152660b, dVar.f152660b);
    }

    public final int hashCode() {
        int iHashCode = this.f152659a.hashCode() * 31;
        String str = this.f152660b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
