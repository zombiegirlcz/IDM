package j05;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169954c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new iw4.b(16)), yhm.j.c(kVar, new iw4.b(17)), yhm.j.c(kVar, new iw4.b(18))};
    }

    public /* synthetic */ f(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            j1.f(d.f169951a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169952a = list;
        this.f169953b = list2;
        this.f169954c = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f169952a, fVar.f169952a) && Intrinsics.f(this.f169953b, fVar.f169953b) && Intrinsics.f(this.f169954c, fVar.f169954c);
    }

    public final int hashCode() {
        List list = this.f169952a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f169953b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f169954c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
