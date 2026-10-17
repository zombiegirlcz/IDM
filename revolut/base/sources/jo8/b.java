package jo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f176889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model.b f176890c;

    public b(boolean z, boolean z3, RowDelegate.Model.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f176888a = z;
        this.f176889b = z3;
        this.f176890c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f176888a == bVar.f176888a && this.f176889b == bVar.f176889b && this.f176890c.equals(bVar.f176890c);
    }

    public final int hashCode() {
        return this.f176890c.hashCode() + j6.a.c(Boolean.hashCode(this.f176888a) * 31, 31, this.f176889b);
    }
}
