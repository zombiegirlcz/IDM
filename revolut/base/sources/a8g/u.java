package a8g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f2241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f2242c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new a32.g(24)), null, null, yhm.j.c(kVar, new a32.g(25))};
    }

    public /* synthetic */ u(int i, List list, x xVar, r rVar, List list2) {
        if (15 != (i & 15)) {
            j1.f(s.f2239a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2240a = list;
        this.f2241b = xVar;
        this.f2242c = rVar;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f2240a, uVar.f2240a) && Intrinsics.f(this.f2241b, uVar.f2241b) && Intrinsics.f(this.f2242c, uVar.f2242c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f2242c.hashCode() + ((this.f2241b.hashCode() + (this.f2240a.hashCode() * 31)) * 31)) * 31);
    }
}
