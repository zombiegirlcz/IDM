package ayc;

import gr2.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f11125a;

    public /* synthetic */ e(int i, y yVar) {
        if (1 == (i & 1)) {
            this.f11125a = yVar;
        } else {
            j1.f(c.f11124a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f11125a, ((e) obj2).f11125a);
    }

    public final int hashCode() {
        y yVar = this.f11125a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public e(y yVar) {
        this.f11125a = yVar;
    }
}
