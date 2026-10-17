package v06;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284758c;
    public final Integer d;

    public d(Integer num, String str, String str2, String str3) {
        this.f284756a = str;
        this.f284757b = str2;
        this.f284758c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f284756a, dVar.f284756a) && Intrinsics.f(this.f284757b, dVar.f284757b) && Intrinsics.f(this.f284758c, dVar.f284758c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        String str = this.f284756a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f284757b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f284758c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
