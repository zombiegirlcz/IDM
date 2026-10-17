package gmg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f144837j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f144838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f144840c;
    public final String d;
    public final boolean e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f144841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f144842h;
    public final String i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f144837j = new Lazy[]{null, yhm.j.c(kVar, new gla.k(8)), yhm.j.c(kVar, new gla.k(9)), null, null, null, null, null, null};
    }

    public /* synthetic */ s(int i, y yVar, List list, List list2, String str, boolean z, p pVar, String str2, String str3, String str4) {
        if (511 != (i & 511)) {
            j1.f(q.f144836a.getDescriptor(), i, 511);
            throw null;
        }
        this.f144838a = yVar;
        this.f144839b = list;
        this.f144840c = list2;
        this.d = str;
        this.e = z;
        this.f = pVar;
        this.f144841g = str2;
        this.f144842h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f144838a, sVar.f144838a) && Intrinsics.f(this.f144839b, sVar.f144839b) && Intrinsics.f(this.f144840c, sVar.f144840c) && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f144841g, sVar.f144841g) && Intrinsics.f(this.f144842h, sVar.f144842h) && Intrinsics.f(this.i, sVar.i);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f144838a.hashCode() * 31, 31, this.f144839b), 31, this.f144840c);
        String str = this.d;
        int iC = j6.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        p pVar = this.f;
        int iHashCode = (iC + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.f144841g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f144842h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
