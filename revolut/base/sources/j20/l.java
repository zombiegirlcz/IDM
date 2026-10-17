package j20;

import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class l {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f170649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170651c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new q0(1)), yhm.j.c(kVar, new q0(2))};
    }

    public /* synthetic */ l(int i, k kVar, List list, List list2) {
        if (7 != (i & 7)) {
            j1.f(a.f170637a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170649a = kVar;
        this.f170650b = list;
        this.f170651c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f170649a, lVar.f170649a) && Intrinsics.f(this.f170650b, lVar.f170650b) && Intrinsics.f(this.f170651c, lVar.f170651c);
    }

    public final int hashCode() {
        return this.f170651c.hashCode() + p.a.d(this.f170649a.hashCode() * 31, 31, this.f170650b);
    }
}
