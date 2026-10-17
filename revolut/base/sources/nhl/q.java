package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f215544m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215547c;
    public final String d;
    public final int e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f215548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zel.d f215549h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f215550j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f215551l;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f215544m = new Lazy[]{null, null, null, null, null, null, yhm.j.c(kVar, new n85.b(18)), yhm.j.c(kVar, new n85.b(19)), null, yhm.j.c(kVar, new n85.b(20)), null, yhm.j.c(kVar, new n85.b(21))};
    }

    public q(String id10, String str, String name, String str2, int i, Integer num, ArrayList instrumentTypes, zel.d createdBy, ArrayList arrayList, k kVar, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        this.f215545a = id10;
        this.f215546b = str;
        this.f215547c = name;
        this.d = str2;
        this.e = i;
        this.f = num;
        this.f215548g = instrumentTypes;
        this.f215549h = createdBy;
        this.i = null;
        this.f215550j = arrayList;
        this.k = kVar;
        this.f215551l = arrayList2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f215545a, qVar.f215545a) && Intrinsics.f(this.f215546b, qVar.f215546b) && Intrinsics.f(this.f215547c, qVar.f215547c) && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f215548g, qVar.f215548g) && this.f215549h == qVar.f215549h && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f215550j, qVar.f215550j) && Intrinsics.f(this.k, qVar.k) && Intrinsics.f(this.f215551l, qVar.f215551l);
    }

    public final int hashCode() {
        int iHashCode = this.f215545a.hashCode() * 31;
        String str = this.f215546b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f215547c);
        String str2 = this.d;
        int iB = j6.a.b(this.e, (iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f;
        int iHashCode2 = (this.f215549h.hashCode() + p.a.d((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.f215548g)) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f215550j;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        k kVar = this.k;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List list2 = this.f215551l;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public /* synthetic */ q(int i, String str, String str2, String str3, String str4, int i2, Integer num, List list, zel.d dVar, String str5, List list2, k kVar, List list3) {
        if (1759 != (i & 1759)) {
            j1.f(o.f215542a.getDescriptor(), i, 1759);
            throw null;
        }
        this.f215545a = str;
        this.f215546b = str2;
        this.f215547c = str3;
        this.d = str4;
        this.e = i2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        this.f215548g = list;
        this.f215549h = dVar;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        this.f215550j = list2;
        this.k = kVar;
        if ((i & 2048) == 0) {
            this.f215551l = null;
        } else {
            this.f215551l = list3;
        }
    }
}
