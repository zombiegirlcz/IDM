package usj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f282962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f282963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f282964c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new us4.b(4)), yhm.j.c(kVar, new us4.b(5)), yhm.j.c(kVar, new us4.b(6))};
    }

    public /* synthetic */ r(int i, List list, List list2, List list3) {
        if (1 != (i & 1)) {
            j1.f(p.f282961a.getDescriptor(), i, 1);
            throw null;
        }
        this.f282962a = list;
        if ((i & 2) == 0) {
            this.f282963b = null;
        } else {
            this.f282963b = list2;
        }
        if ((i & 4) == 0) {
            this.f282964c = null;
        } else {
            this.f282964c = list3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f282962a, rVar.f282962a) && Intrinsics.f(this.f282963b, rVar.f282963b) && Intrinsics.f(this.f282964c, rVar.f282964c);
    }

    public final int hashCode() {
        int iHashCode = this.f282962a.hashCode() * 31;
        List list = this.f282963b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f282964c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
