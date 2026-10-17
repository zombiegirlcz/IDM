package pej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f235384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235386c;
    public final String d;

    public c(int i, String iccId, String mcc2, String mnc2) {
        Intrinsics.checkNotNullParameter(iccId, "iccId");
        Intrinsics.checkNotNullParameter(mcc2, "mcc");
        Intrinsics.checkNotNullParameter(mnc2, "mnc");
        this.f235384a = i;
        this.f235385b = iccId;
        this.f235386c = mcc2;
        this.d = mnc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f235384a == cVar.f235384a && Intrinsics.f(this.f235385b, cVar.f235385b) && Intrinsics.f(this.f235386c, cVar.f235386c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(Integer.hashCode(this.f235384a) * 31, 31, this.f235385b), 31, this.f235386c);
    }
}
