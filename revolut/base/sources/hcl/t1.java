package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final r1 Companion = new r1();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f151160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151162c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new h43.b(24)), null, null, yhm.j.c(kVar, new h43.b(25)), yhm.j.c(kVar, new h43.b(26))};
    }

    public /* synthetic */ t1(int i, s1 s1Var, String str, String str2, List list, List list2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q1.f151114a.getDescriptor(), i, 3);
            throw null;
        }
        this.f151160a = s1Var;
        this.f151161b = str;
        if ((i & 4) == 0) {
            this.f151162c = null;
        } else {
            this.f151162c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return this.f151160a == t1Var.f151160a && Intrinsics.f(this.f151161b, t1Var.f151161b) && Intrinsics.f(this.f151162c, t1Var.f151162c) && Intrinsics.f(this.d, t1Var.d) && Intrinsics.f(this.e, t1Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151160a.hashCode() * 31, 31, this.f151161b);
        String str = this.f151162c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public t1(s1 type, String title, String str, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f151160a = type;
        this.f151161b = title;
        this.f151162c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }
}
