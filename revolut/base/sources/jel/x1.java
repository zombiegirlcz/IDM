package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173603b;

    public x1(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f173602a = title;
        this.f173603b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f173602a, x1Var.f173602a) && Intrinsics.f(this.f173603b, x1Var.f173603b);
    }

    public final int hashCode() {
        int iHashCode = this.f173602a.hashCode() * 31;
        String str = this.f173603b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
