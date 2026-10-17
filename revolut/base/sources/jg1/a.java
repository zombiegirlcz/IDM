package jg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173896c;
    public final String d;

    public /* synthetic */ a(String str, String str2, String str3, int i) {
        this(str, str2, str3, (i & 16) != 0 ? null : "REVIVAL_APPROVE");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173894a, aVar.f173894a) && Intrinsics.f(this.f173895b, aVar.f173895b) && Intrinsics.f(this.f173896c, aVar.f173896c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173894a.hashCode() * 31, 31, this.f173895b);
        String str = this.f173896c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public a(String tokenUniqueReference, String lastFour, String str, String str2) {
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f173894a = tokenUniqueReference;
        this.f173895b = lastFour;
        this.f173896c = str;
        this.d = str2;
    }
}
