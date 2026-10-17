package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f215994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215996c;
    public final String d;

    public p(String str, Long l2, String str2, String str3) {
        this.f215994a = l2;
        this.f215995b = str;
        this.f215996c = str2;
        this.d = str3;
    }

    public final Long a() {
        return this.f215994a;
    }

    public final String b() {
        return this.f215995b;
    }

    public final String c() {
        return this.f215996c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f215994a, pVar.f215994a) && Intrinsics.f(this.f215995b, pVar.f215995b) && Intrinsics.f(this.f215996c, pVar.f215996c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        Long l2 = this.f215994a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f215995b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215996c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
