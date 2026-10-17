package pni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f237816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f237817c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public l(String str, k resend, g notDeliveredFallback, boolean z, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(resend, "resend");
        Intrinsics.checkNotNullParameter(notDeliveredFallback, "notDeliveredFallback");
        this.f237815a = str;
        this.f237816b = resend;
        this.f237817c = notDeliveredFallback;
        this.d = z;
        this.e = z3;
        this.f = str2;
    }

    public static l a(l lVar, k kVar, boolean z, String str, int i) {
        String str2 = lVar.f237815a;
        if ((i & 2) != 0) {
            kVar = lVar.f237816b;
        }
        k resend = kVar;
        g notDeliveredFallback = lVar.f237817c;
        boolean z3 = lVar.d;
        if ((i & 16) != 0) {
            z = lVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            str = lVar.f;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(resend, "resend");
        Intrinsics.checkNotNullParameter(notDeliveredFallback, "notDeliveredFallback");
        return new l(str2, resend, notDeliveredFallback, z3, z4, str);
    }

    public final boolean c() {
        return this.d && !this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f237815a, lVar.f237815a) && Intrinsics.f(this.f237816b, lVar.f237816b) && this.f237817c == lVar.f237817c && this.d == lVar.d && this.e == lVar.e && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        String str = this.f237815a;
        int iC = j6.a.c(j6.a.c((this.f237817c.hashCode() + ((this.f237816b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
