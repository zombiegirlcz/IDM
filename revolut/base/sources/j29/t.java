package j29;

import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f170766c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f170767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170768b;

    public /* synthetic */ t(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(r.f170765a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170767a = aVar;
        this.f170768b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f170767a, tVar.f170767a) && Intrinsics.f(this.f170768b, tVar.f170768b);
    }

    public final int hashCode() {
        int iHashCode = this.f170767a.hashCode() * 31;
        List list = this.f170768b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
