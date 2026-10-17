package tof;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f272934b;

    public m6(dj0.d grossAmount, ArrayList taxes) {
        Intrinsics.checkNotNullParameter(grossAmount, "grossAmount");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f272933a = grossAmount;
        this.f272934b = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj2;
        return this.f272933a.equals(m6Var.f272933a) && this.f272934b.equals(m6Var.f272934b);
    }

    public final int hashCode() {
        return this.f272934b.hashCode() + (this.f272933a.hashCode() * 31);
    }
}
