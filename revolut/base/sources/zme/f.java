package zme;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323484c;
    public final boolean d;
    public final String e;
    public final String f;

    public f(wi0.b countryCode, String str, String str2, boolean z, String str3, String str4) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f323482a = countryCode;
        this.f323483b = str;
        this.f323484c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f323482a, fVar.f323482a) && Intrinsics.f(this.f323483b, fVar.f323483b) && Intrinsics.f(this.f323484c, fVar.f323484c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f323482a.f297794a.hashCode() * 31;
        String str = this.f323483b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f323484c;
        int iC = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ f(wi0.b bVar, String str, String str2, boolean z, String str3, String str4, int i) {
        this(bVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
