package zda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f321382m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321385c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f321386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f321387h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f321388j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f321389l;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f321382m = new Lazy[]{null, null, null, null, null, null, null, null, yhm.j.c(kVar, new zc0.m(8)), null, yhm.j.c(kVar, new zc0.m(9)), null};
    }

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4, String str5, String str6, l lVar, e1 e1Var, List list, f fVar, List list2, j0 j0Var) {
        if (4095 != (i & 4095)) {
            j1.f(g.f321377a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f321383a = str;
        this.f321384b = str2;
        this.f321385c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f321386g = lVar;
        this.f321387h = e1Var;
        this.i = list;
        this.f321388j = fVar;
        this.k = list2;
        this.f321389l = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f321383a, iVar.f321383a) && Intrinsics.f(this.f321384b, iVar.f321384b) && Intrinsics.f(this.f321385c, iVar.f321385c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f321386g, iVar.f321386g) && Intrinsics.f(this.f321387h, iVar.f321387h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f321388j, iVar.f321388j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f321389l, iVar.f321389l);
    }

    public final int hashCode() {
        String str = this.f321383a;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f321384b), 31, this.f321385c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        l lVar = this.f321386g;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e1 e1Var = this.f321387h;
        int iHashCode3 = (iHashCode2 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        List list = this.i;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        f fVar = this.f321388j;
        int iD = p.a.d((iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.k);
        j0 j0Var = this.f321389l;
        return iD + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public i(String str, String currency, String country, String type, String name, String str2, l lVar, e1 e1Var, f fVar, List qrCodes, j0 j0Var) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(qrCodes, "qrCodes");
        this.f321383a = str;
        this.f321384b = currency;
        this.f321385c = country;
        this.d = type;
        this.e = name;
        this.f = str2;
        this.f321386g = lVar;
        this.f321387h = e1Var;
        this.i = null;
        this.f321388j = fVar;
        this.k = qrCodes;
        this.f321389l = j0Var;
    }
}
