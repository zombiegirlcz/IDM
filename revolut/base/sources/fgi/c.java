package fgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135081b;

    public c(String str, String str2) {
        this.f135080a = str;
        this.f135081b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f135080a, cVar.f135080a) && Intrinsics.f(this.f135081b, cVar.f135081b);
    }

    public final int hashCode() {
        String str = this.f135080a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f135081b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
