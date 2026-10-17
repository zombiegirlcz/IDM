package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f272941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f272942c;

    public n1(String id10, p1 state, o1 sender) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.f272940a = id10;
        this.f272941b = state;
        this.f272942c = sender;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f272940a, n1Var.f272940a) && this.f272941b == n1Var.f272941b && Intrinsics.f(this.f272942c, n1Var.f272942c);
    }

    public final int hashCode() {
        return this.f272942c.hashCode() + ((this.f272941b.hashCode() + (this.f272940a.hashCode() * 31)) * 31);
    }
}
