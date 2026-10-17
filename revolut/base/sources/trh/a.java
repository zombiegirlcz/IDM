package trh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f273793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273795c;
    public final String d;

    public a(long j2, String ipAddress, String deviceInfo, String str) {
        Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f273793a = j2;
        this.f273794b = ipAddress;
        this.f273795c = deviceInfo;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f273793a == aVar.f273793a && this.f273794b.equals(aVar.f273794b) && Intrinsics.f(this.f273795c, aVar.f273795c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Long.hashCode(this.f273793a) * 31, 31, this.f273794b), 31, this.f273795c);
        String str = this.d;
        return (iC + (str == null ? 0 : str.hashCode())) * 31;
    }
}
