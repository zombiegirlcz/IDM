package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227849b;

    public p(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f227848a = code;
        this.f227849b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f227848a, pVar.f227848a) && Intrinsics.f(this.f227849b, pVar.f227849b);
    }

    public final int hashCode() {
        int iHashCode = this.f227848a.hashCode() * 31;
        String str = this.f227849b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
