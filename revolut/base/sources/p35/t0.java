package p35;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f232673a;

    public t0(s0 s0Var) {
        this.f232673a = s0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && this.f232673a == ((t0) obj2).f232673a;
    }

    public final int hashCode() {
        s0 s0Var = this.f232673a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }
}
