package e99;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123936b;

    public a(String str, String str2) {
        this.f123935a = str;
        this.f123936b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f123935a, aVar.f123935a) && Intrinsics.f(this.f123936b, aVar.f123936b);
    }

    public final int hashCode() {
        String str = this.f123935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123936b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
