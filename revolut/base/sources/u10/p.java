package u10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276316c;
    public final String d;

    public /* synthetic */ p(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    public final String a() {
        return this.f276316c;
    }

    public final String b() {
        return this.f276315b;
    }

    public final String c() {
        return this.f276314a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f276314a, pVar.f276314a) && Intrinsics.f(this.f276315b, pVar.f276315b) && Intrinsics.f(this.f276316c, pVar.f276316c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        String str = this.f276314a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f276315b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f276316c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public p(String str, String str2, String str3, String str4) {
        this.f276314a = str;
        this.f276315b = str2;
        this.f276316c = str3;
        this.d = str4;
    }
}
