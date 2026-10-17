package pm1;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om1.a f237442a;

    public a(om1.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f237442a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f237442a, ((a) obj2).f237442a);
    }

    public final int hashCode() {
        return this.f237442a.hashCode();
    }
}
