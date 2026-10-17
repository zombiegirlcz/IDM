package cgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23926c;
    public final String d;
    public final Integer e;

    public p(int i, Integer num, String id10, String perkId, String str) {
        str = (i & 16) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        this.f23924a = id10;
        this.f23925b = perkId;
        this.f23926c = str;
        this.d = null;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f23924a, pVar.f23924a) && Intrinsics.f(this.f23925b, pVar.f23925b) && Intrinsics.f(this.f23926c, pVar.f23926c) && Intrinsics.f(this.d, pVar.d) && this.e.equals(pVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f23924a.hashCode() * 31, 29791, this.f23925b);
        String str = this.f23926c;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, false), 31, false), 31, false);
        String str2 = this.d;
        return this.e.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
