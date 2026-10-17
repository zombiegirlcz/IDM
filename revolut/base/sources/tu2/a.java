package tu2;

import h93.f0;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f274520a;

    public a(f0 f0Var) {
        this.f274520a = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274520a, ((a) obj2).f274520a);
    }

    public final int hashCode() {
        f0 f0Var = this.f274520a;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.hashCode();
    }
}
