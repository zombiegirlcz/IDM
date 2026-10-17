package c0h;

import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f20274c;
    public final String d;
    public final String e;
    public final String f;

    public c(String ref2, String annualReturn, z instrumentType, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(annualReturn, "annualReturn");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f20272a = ref2;
        this.f20273b = annualReturn;
        this.f20274c = instrumentType;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20272a, cVar.f20272a) && Intrinsics.f(this.f20273b, cVar.f20273b) && this.f20274c == cVar.f20274c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f20274c.hashCode() + p.a.c(this.f20272a.hashCode() * 31, 31, this.f20273b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
