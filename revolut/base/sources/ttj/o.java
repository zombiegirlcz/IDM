package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(8)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274383c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f274384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f274385h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f274386j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f274387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f274388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f274389n;

    public /* synthetic */ o(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, Integer num, List list, Boolean bool, l lVar, Boolean bool2, Boolean bool3) {
        if (16383 != (i & 16383)) {
            qlm.j1.f(m.f274367a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f274381a = str;
        this.f274382b = str2;
        this.f274383c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f274384g = l2;
        this.f274385h = l3;
        this.i = num;
        this.f274386j = list;
        this.k = bool;
        this.f274387l = lVar;
        this.f274388m = bool2;
        this.f274389n = bool3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f274381a, oVar.f274381a) && Intrinsics.f(this.f274382b, oVar.f274382b) && Intrinsics.f(this.f274383c, oVar.f274383c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f274384g, oVar.f274384g) && Intrinsics.f(this.f274385h, oVar.f274385h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f274386j, oVar.f274386j) && Intrinsics.f(this.k, oVar.k) && Intrinsics.f(this.f274387l, oVar.f274387l) && Intrinsics.f(this.f274388m, oVar.f274388m) && Intrinsics.f(this.f274389n, oVar.f274389n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f274381a.hashCode() * 31, 31, this.f274382b), 31, this.f274383c), 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.f274384g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f274385h;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.i;
        int iD = p.a.d((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f274386j);
        Boolean bool = this.k;
        int iHashCode3 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        l lVar = this.f274387l;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Boolean bool2 = this.f274388m;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f274389n;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
