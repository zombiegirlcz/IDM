package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f120725b;

    public q0(String title, p0 state) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f120724a = title;
        this.f120725b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f120724a, q0Var.f120724a) && this.f120725b == q0Var.f120725b;
    }

    public final int hashCode() {
        return this.f120725b.hashCode() + (this.f120724a.hashCode() * 31);
    }
}
