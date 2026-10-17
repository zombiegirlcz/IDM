package ke7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f183021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be7.a f183022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f183023c;
    public final fe7.a d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f183024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f183025h;

    public n(m callTimeStatus, be7.a connectivityState, boolean z, fe7.a audioOutputState, String str, String str2, String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(callTimeStatus, "callTimeStatus");
        Intrinsics.checkNotNullParameter(connectivityState, "connectivityState");
        Intrinsics.checkNotNullParameter(audioOutputState, "audioOutputState");
        this.f183021a = callTimeStatus;
        this.f183022b = connectivityState;
        this.f183023c = z;
        this.d = audioOutputState;
        this.e = str;
        this.f = str2;
        this.f183024g = str3;
        this.f183025h = z3;
    }

    public static n a(n nVar, m mVar, be7.a aVar, boolean z, fe7.a aVar2, String str, String str2, String str3, boolean z3, int i) {
        if ((i & 1) != 0) {
            mVar = nVar.f183021a;
        }
        m callTimeStatus = mVar;
        if ((i & 2) != 0) {
            aVar = nVar.f183022b;
        }
        be7.a connectivityState = aVar;
        if ((i & 4) != 0) {
            z = nVar.f183023c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            aVar2 = nVar.d;
        }
        fe7.a audioOutputState = aVar2;
        if ((i & 16) != 0) {
            str = nVar.e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            str2 = nVar.f;
        }
        String str5 = str2;
        String str6 = (i & 64) != 0 ? nVar.f183024g : str3;
        boolean z6 = (i & 128) != 0 ? nVar.f183025h : z3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(callTimeStatus, "callTimeStatus");
        Intrinsics.checkNotNullParameter(connectivityState, "connectivityState");
        Intrinsics.checkNotNullParameter(audioOutputState, "audioOutputState");
        return new n(callTimeStatus, connectivityState, z4, audioOutputState, str4, str5, str6, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f183021a, nVar.f183021a) && this.f183022b == nVar.f183022b && this.f183023c == nVar.f183023c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f183024g, nVar.f183024g) && this.f183025h == nVar.f183025h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c((this.f183022b.hashCode() + (this.f183021a.hashCode() * 31)) * 31, 31, this.f183023c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f183024g;
        return Boolean.hashCode(this.f183025h) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
