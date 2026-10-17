package mib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205637b;

    public c(String str, String str2) {
        this.f205636a = str;
        this.f205637b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205636a, cVar.f205636a) && Intrinsics.f(this.f205637b, cVar.f205637b);
    }

    public final int hashCode() {
        String str = this.f205636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205637b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
