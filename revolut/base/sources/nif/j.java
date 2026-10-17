package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215871c;

    public j(String str, String str2, String str3) {
        this.f215869a = str;
        this.f215870b = str2;
        this.f215871c = str3;
    }

    public final String a() {
        return this.f215870b;
    }

    public final String b() {
        return this.f215869a;
    }

    public final String c() {
        return this.f215871c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f215869a, jVar.f215869a) && Intrinsics.f(this.f215870b, jVar.f215870b) && Intrinsics.f(this.f215871c, jVar.f215871c);
    }

    public final int hashCode() {
        String str = this.f215869a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215870b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215871c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
