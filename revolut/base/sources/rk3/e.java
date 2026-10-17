package rk3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f254731c;
    public final boolean d;
    public final String e;
    public final nk3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f254732g;

    public e(String phoneNumber, String enteredOtp, long j2, boolean z, String str, nk3.a currentChannel, boolean z3) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(enteredOtp, "enteredOtp");
        Intrinsics.checkNotNullParameter(currentChannel, "currentChannel");
        this.f254729a = phoneNumber;
        this.f254730b = enteredOtp;
        this.f254731c = j2;
        this.d = z;
        this.e = str;
        this.f = currentChannel;
        this.f254732g = z3;
    }

    public static e a(e eVar, String str, long j2, boolean z, String str2, nk3.a aVar, int i) {
        String phoneNumber = eVar.f254729a;
        if ((i & 2) != 0) {
            str = eVar.f254730b;
        }
        String enteredOtp = str;
        if ((i & 4) != 0) {
            j2 = eVar.f254731c;
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str2 = eVar.e;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            aVar = eVar.f;
        }
        nk3.a currentChannel = aVar;
        boolean z4 = (i & 64) != 0 ? eVar.f254732g : true;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(enteredOtp, "enteredOtp");
        Intrinsics.checkNotNullParameter(currentChannel, "currentChannel");
        return new e(phoneNumber, enteredOtp, j3, z3, str3, currentChannel, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254729a, eVar.f254729a) && Intrinsics.f(this.f254730b, eVar.f254730b) && this.f254731c == eVar.f254731c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && this.f254732g == eVar.f254732g;
    }

    public final int hashCode() {
        int iC = j6.a.c(a0.d.c(p.a.c(this.f254729a.hashCode() * 31, 31, this.f254730b), 31, this.f254731c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f254732g) + ((this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
