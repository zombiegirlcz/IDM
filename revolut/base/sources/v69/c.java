package v69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286345c;
    public final String d;

    public c(String str, String str2, String str3, String str4) {
        this.f286343a = str;
        this.f286344b = str2;
        this.f286345c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f286343a, cVar.f286343a) && Intrinsics.f(this.f286344b, cVar.f286344b) && Intrinsics.f(this.f286345c, cVar.f286345c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.f286343a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f286344b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286345c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
