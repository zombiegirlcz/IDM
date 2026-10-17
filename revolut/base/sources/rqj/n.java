package rqj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f256571a;

    public /* synthetic */ n(int i, f fVar) {
        if (1 == (i & 1)) {
            this.f256571a = fVar;
        } else {
            j1.f(l.f256570a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f256571a, ((n) obj2).f256571a);
    }

    public final int hashCode() {
        f fVar = this.f256571a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public n(f fVar) {
        this.f256571a = fVar;
    }
}
