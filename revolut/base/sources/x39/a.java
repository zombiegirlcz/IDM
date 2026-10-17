package x39;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302714c;

    public a() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302712a, aVar.f302712a) && Intrinsics.f(this.f302713b, aVar.f302713b) && Intrinsics.f(this.f302714c, aVar.f302714c);
    }

    public final int hashCode() {
        String str = this.f302712a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f302713b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f302714c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(String str, String str2, String str3) {
        this.f302712a = str;
        this.f302713b = str2;
        this.f302714c = str3;
    }
}
