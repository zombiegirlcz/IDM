package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286282c;
    public final String d;
    public final String e;
    public final String f;

    public e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f286280a = str;
        this.f286281b = str2;
        this.f286282c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f286280a, eVar.f286280a) && Intrinsics.f(this.f286281b, eVar.f286281b) && Intrinsics.f(this.f286282c, eVar.f286282c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        String str = this.f286280a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f286281b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286282c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
