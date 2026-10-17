package fyk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f139057c;
    public final Boolean d;
    public final Boolean e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new fyh.k(5)), null, yhm.j.c(kVar, new fyh.k(6)), null, null};
    }

    public /* synthetic */ w(int i, List list, String str, List list2, Boolean bool, Boolean bool2) {
        if (31 != (i & 31)) {
            j1.f(u.f139054a.getDescriptor(), i, 31);
            throw null;
        }
        this.f139055a = list;
        this.f139056b = str;
        this.f139057c = list2;
        this.d = bool;
        this.e = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f139055a, wVar.f139055a) && Intrinsics.f(this.f139056b, wVar.f139056b) && Intrinsics.f(this.f139057c, wVar.f139057c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f139055a.hashCode() * 31;
        String str = this.f139056b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f139057c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
