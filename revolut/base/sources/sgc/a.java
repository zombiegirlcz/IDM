package sgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262638c;
    public final String d;
    public final Integer e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f262639g;

    public a(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
        this.f262636a = str;
        this.f262637b = str2;
        this.f262638c = str3;
        this.d = str4;
        this.e = num;
        this.f = str5;
        this.f262639g = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f262636a, aVar.f262636a) && Intrinsics.f(this.f262637b, aVar.f262637b) && Intrinsics.f(this.f262638c, aVar.f262638c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f262639g, aVar.f262639g);
    }

    public final int hashCode() {
        String str = this.f262636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f262637b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f262638c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f262639g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }
}
