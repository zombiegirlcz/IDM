package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215964c;
    public final String d;
    public final String e;

    public o(String str, String str2, String str3, String str4, String str5) {
        this.f215962a = str;
        this.f215963b = str2;
        this.f215964c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f215963b;
    }

    public final String c() {
        return this.f215964c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f215962a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f215962a, oVar.f215962a) && Intrinsics.f(this.f215963b, oVar.f215963b) && Intrinsics.f(this.f215964c, oVar.f215964c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        String str = this.f215962a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215963b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215964c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
