package fla;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f135933g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f135936c;
    public final List d;
    public final List e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f135933g = new Lazy[]{yhm.j.c(kVar, new fk8.a(19)), yhm.j.c(kVar, new fk8.a(20)), yhm.j.c(kVar, new fk8.a(21)), yhm.j.c(kVar, new fk8.a(22)), yhm.j.c(kVar, new fk8.a(23)), yhm.j.c(kVar, new fk8.a(24))};
    }

    public /* synthetic */ m(int i, List list, List list2, List list3, List list4, List list5, List list6) {
        if (63 != (i & 63)) {
            j1.f(k.f135932a.getDescriptor(), i, 63);
            throw null;
        }
        this.f135934a = list;
        this.f135935b = list2;
        this.f135936c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f135934a, mVar.f135934a) && Intrinsics.f(this.f135935b, mVar.f135935b) && Intrinsics.f(this.f135936c, mVar.f135936c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        List list = this.f135934a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f135935b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f135936c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        return iHashCode5 + (list6 != null ? list6.hashCode() : 0);
    }
}
