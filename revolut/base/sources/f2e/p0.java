package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f131684h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131687c;
    public final List d;
    public final j2 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f131688g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f131684h = new Lazy[]{null, null, null, yhm.j.c(kVar, new i(6)), null, yhm.j.c(kVar, new i(7)), yhm.j.c(kVar, new i(8))};
    }

    public p0(String id10, String type, String str, ArrayList arrayList, j2 j2Var, ArrayList arrayList2, ArrayList arrayList3, int i) {
        str = (i & 4) != 0 ? null : str;
        arrayList = (i & 8) != 0 ? null : arrayList;
        j2Var = (i & 16) != 0 ? null : j2Var;
        arrayList2 = (i & 32) != 0 ? null : arrayList2;
        arrayList3 = (i & 64) != 0 ? null : arrayList3;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f131685a = id10;
        this.f131686b = type;
        this.f131687c = str;
        this.d = arrayList;
        this.e = j2Var;
        this.f = arrayList2;
        this.f131688g = arrayList3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f131685a, p0Var.f131685a) && Intrinsics.f(this.f131686b, p0Var.f131686b) && Intrinsics.f(this.f131687c, p0Var.f131687c) && Intrinsics.f(this.d, p0Var.d) && Intrinsics.f(this.e, p0Var.e) && Intrinsics.f(this.f, p0Var.f) && Intrinsics.f(this.f131688g, p0Var.f131688g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131685a.hashCode() * 31, 31, this.f131686b);
        String str = this.f131687c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        j2 j2Var = this.e;
        int iHashCode3 = (iHashCode2 + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f131688g;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public /* synthetic */ p0(int i, String str, String str2, String str3, List list, j2 j2Var, List list2, List list3) {
        if (3 != (i & 3)) {
            qlm.j1.f(n0.f131663a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131685a = str;
        this.f131686b = str2;
        if ((i & 4) == 0) {
            this.f131687c = null;
        } else {
            this.f131687c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j2Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.f131688g = null;
        } else {
            this.f131688g = list3;
        }
    }
}
