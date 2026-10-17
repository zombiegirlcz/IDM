package eag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f124250b;

    public a(String str, Object obj2) {
        this.f124249a = str;
        this.f124250b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f124249a, aVar.f124249a) && Intrinsics.f(this.f124250b, aVar.f124250b);
    }

    public final int hashCode() {
        String str = this.f124249a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj2 = this.f124250b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
