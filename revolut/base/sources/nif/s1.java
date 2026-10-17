package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216033c;

    public s1(String str, String str2, String str3) {
        this.f216031a = str;
        this.f216032b = str2;
        this.f216033c = str3;
    }

    public final String a() {
        return this.f216033c;
    }

    public final String b() {
        return this.f216031a;
    }

    public final String c() {
        return this.f216032b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f216031a, s1Var.f216031a) && Intrinsics.f(this.f216032b, s1Var.f216032b) && Intrinsics.f(this.f216033c, s1Var.f216033c);
    }

    public final int hashCode() {
        String str = this.f216031a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f216032b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f216033c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
