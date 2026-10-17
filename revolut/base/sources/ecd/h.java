package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f124558a;

    public /* synthetic */ h(int i, g gVar) {
        if (1 == (i & 1)) {
            this.f124558a = gVar;
        } else {
            qlm.j1.f(c.f124502a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f124558a, ((h) obj2).f124558a);
    }

    public final int hashCode() {
        g gVar = this.f124558a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public h(g gVar) {
        this.f124558a = gVar;
    }
}
