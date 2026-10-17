package egb;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125615c;
    public final List d;

    public /* synthetic */ r(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(p.f125607a.getDescriptor(), i, 15);
            throw null;
        }
        this.f125613a = str;
        this.f125614b = str2;
        this.f125615c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f125613a, rVar.f125613a) && Intrinsics.f(this.f125614b, rVar.f125614b) && Intrinsics.f(this.f125615c, rVar.f125615c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f125613a.hashCode() * 31, 31, this.f125614b), 31, this.f125615c);
        List list = this.d;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
