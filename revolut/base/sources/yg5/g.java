package yg5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug5.a f313524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f313525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f313526c;
    public final String d;
    public final String e;

    public g() {
        this(0);
    }

    public static g a(g gVar, ug5.a aVar, f fVar, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            aVar = gVar.f313524a;
        }
        ug5.a aVar2 = aVar;
        if ((i & 2) != 0) {
            fVar = gVar.f313525b;
        }
        f currencySelection = fVar;
        if ((i & 4) != 0) {
            z = gVar.f313526c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = gVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = gVar.e;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currencySelection, "currencySelection");
        return new g(aVar2, currencySelection, z3, str3, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f313524a, gVar.f313524a) && Intrinsics.f(this.f313525b, gVar.f313525b) && this.f313526c == gVar.f313526c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        ug5.a aVar = this.f313524a;
        int iC = j6.a.c((this.f313525b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31, 31, this.f313526c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public g(ug5.a aVar, f currencySelection, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(currencySelection, "currencySelection");
        this.f313524a = aVar;
        this.f313525b = currencySelection;
        this.f313526c = z;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ g(int i) {
        this(null, d.f313522a, true, null, null);
    }
}
