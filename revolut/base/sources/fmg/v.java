package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136451b;

    public v(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f136450a = title;
        this.f136451b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f136450a, vVar.f136450a) && Intrinsics.f(this.f136451b, vVar.f136451b);
    }

    public final int hashCode() {
        int iHashCode = this.f136450a.hashCode() * 31;
        String str = this.f136451b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
