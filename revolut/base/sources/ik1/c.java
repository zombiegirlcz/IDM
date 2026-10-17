package ik1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161871c;
    public final String d;

    public c(String redirectUrl, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f161869a = redirectUrl;
        this.f161870b = str;
        this.f161871c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161869a, cVar.f161869a) && Intrinsics.f(this.f161870b, cVar.f161870b) && Intrinsics.f(this.f161871c, cVar.f161871c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f161869a.hashCode() * 31;
        String str = this.f161870b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f161871c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
