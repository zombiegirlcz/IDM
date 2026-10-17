package gr2;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Lazy[] f145873n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145876c;
    public final j d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f145877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145878h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f145879j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f145880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f145881m;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f145873n = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new gla.k(18)), yhm.j.c(kVar, new gla.k(19)), yhm.j.c(kVar, new gla.k(20)), null, yhm.j.c(kVar, new gla.k(21)), yhm.j.c(kVar, new gla.k(22)), null, yhm.j.c(kVar, new gla.k(23)), null};
    }

    public /* synthetic */ y(int i, String str, String str2, String str3, j jVar, List list, List list2, List list3, String str4, List list4, List list5, s sVar, List list6, String str5) {
        if (1 != (i & 1)) {
            j1.f(w.f145872a.getDescriptor(), i, 1);
            throw null;
        }
        this.f145874a = str;
        if ((i & 2) == 0) {
            this.f145875b = null;
        } else {
            this.f145875b = str2;
        }
        if ((i & 4) == 0) {
            this.f145876c = null;
        } else {
            this.f145876c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.f145877g = null;
        } else {
            this.f145877g = list3;
        }
        if ((i & 128) == 0) {
            this.f145878h = null;
        } else {
            this.f145878h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list4;
        }
        if ((i & 512) == 0) {
            this.f145879j = null;
        } else {
            this.f145879j = list5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = sVar;
        }
        if ((i & 2048) == 0) {
            this.f145880l = null;
        } else {
            this.f145880l = list6;
        }
        if ((i & 4096) == 0) {
            this.f145881m = null;
        } else {
            this.f145881m = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f145874a, yVar.f145874a) && Intrinsics.f(this.f145875b, yVar.f145875b) && Intrinsics.f(this.f145876c, yVar.f145876c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f145877g, yVar.f145877g) && Intrinsics.f(this.f145878h, yVar.f145878h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f145879j, yVar.f145879j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f145880l, yVar.f145880l) && Intrinsics.f(this.f145881m, yVar.f145881m);
    }

    public final int hashCode() {
        int iHashCode = this.f145874a.hashCode() * 31;
        String str = this.f145875b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145876c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f145877g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.f145878h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.i;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f145879j;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        s sVar = this.k;
        int iHashCode11 = (iHashCode10 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        List list6 = this.f145880l;
        int iHashCode12 = (iHashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str4 = this.f145881m;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }
}
