package wtg;

import java.time.LocalDate;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f299980g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f299981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f299982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299983c;
    public final List d;
    public final boolean e;
    public final LocalDate f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f299980g = new Lazy[]{null, null, yhm.j.c(kVar, new wq1.a(14)), yhm.j.c(kVar, new wq1.a(15)), null, null};
    }

    public /* synthetic */ z(int i, w wVar, c0 c0Var, List list, List list2, boolean z, LocalDate localDate) {
        if (63 != (i & 63)) {
            j1.f(x.f299979a.getDescriptor(), i, 63);
            throw null;
        }
        this.f299981a = wVar;
        this.f299982b = c0Var;
        this.f299983c = list;
        this.d = list2;
        this.e = z;
        this.f = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f299981a, zVar.f299981a) && Intrinsics.f(this.f299982b, zVar.f299982b) && Intrinsics.f(this.f299983c, zVar.f299983c) && Intrinsics.f(this.d, zVar.d) && this.e == zVar.e && Intrinsics.f(this.f, zVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.d(p.a.d((this.f299982b.hashCode() + (this.f299981a.hashCode() * 31)) * 31, 31, this.f299983c), 31, this.d), 31, this.e);
    }
}
