package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f113676c;

    public w(p0 reason, String str, String str2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f113674a = str;
        this.f113675b = str2;
        this.f113676c = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f113674a, wVar.f113674a) && Intrinsics.f(this.f113675b, wVar.f113675b) && this.f113676c == wVar.f113676c;
    }

    public final int hashCode() {
        String str = this.f113674a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113675b;
        return this.f113676c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
