package a8g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f2204g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2207c;
    public final z7g.c d;
    public final String e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f2204g = new Lazy[]{null, yhm.j.c(kVar, new a32.g(21)), yhm.j.c(kVar, new a32.g(22)), null, null, yhm.j.c(kVar, new a32.g(23))};
    }

    public /* synthetic */ c(int i, String str, List list, List list2, z7g.c cVar, String str2, List list3) {
        if (11 != (i & 11)) {
            j1.f(a.f2196a.getDescriptor(), i, 11);
            throw null;
        }
        this.f2205a = str;
        this.f2206b = list;
        if ((i & 4) == 0) {
            this.f2207c = null;
        } else {
            this.f2207c = list2;
        }
        this.d = cVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f2205a, cVar.f2205a) && Intrinsics.f(this.f2206b, cVar.f2206b) && Intrinsics.f(this.f2207c, cVar.f2207c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f2205a.hashCode() * 31, 31, this.f2206b);
        List list = this.f2207c;
        int iHashCode = (this.d.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
