package cmf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25239c;
    public final String d;
    public final do3.c e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kq8.e f25240g;

    public i(String senderFirstName, String senderLastName, String senderCode, String senderUsername, do3.c cVar, String juniorFirstName, kq8.e settings) {
        Intrinsics.checkNotNullParameter(senderFirstName, "senderFirstName");
        Intrinsics.checkNotNullParameter(senderLastName, "senderLastName");
        Intrinsics.checkNotNullParameter(senderCode, "senderCode");
        Intrinsics.checkNotNullParameter(senderUsername, "senderUsername");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f25237a = senderFirstName;
        this.f25238b = senderLastName;
        this.f25239c = senderCode;
        this.d = senderUsername;
        this.e = cVar;
        this.f = juniorFirstName;
        this.f25240g = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25237a, iVar.f25237a) && Intrinsics.f(this.f25238b, iVar.f25238b) && Intrinsics.f(this.f25239c, iVar.f25239c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f25240g, iVar.f25240g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f25237a.hashCode() * 31, 31, this.f25238b), 31, this.f25239c), 31, this.d);
        do3.c cVar = this.e;
        return this.f25240g.hashCode() + p.a.c((iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f);
    }
}
