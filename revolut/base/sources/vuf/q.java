package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292389b;

    public q(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f292388a = value;
        this.f292389b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f292388a, qVar.f292388a) && Intrinsics.f(this.f292389b, qVar.f292389b);
    }

    public final int hashCode() {
        int iHashCode = this.f292388a.hashCode() * 31;
        String str = this.f292389b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
