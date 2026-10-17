package jqd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f177703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f177705c;
    public final krf.c d;
    public final kq2.c e;

    public e(f5j.a beneficiary, dj0.d value, String str, krf.c cVar, kq2.c cVar2) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f177703a = beneficiary;
        this.f177704b = value;
        this.f177705c = str;
        this.d = cVar;
        this.e = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f177703a, eVar.f177703a) && Intrinsics.f(this.f177704b, eVar.f177704b) && Intrinsics.f(this.f177705c, eVar.f177705c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iC = v7.c(this.f177703a.hashCode() * 31, 31, this.f177704b);
        String str = this.f177705c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        krf.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        kq2.c cVar2 = this.e;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
