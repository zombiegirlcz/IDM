package nr6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f218570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f218571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f218572c;

    public k0(ArrayList orders, j0 scannedInterval, j0 j0Var) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(scannedInterval, "scannedInterval");
        this.f218570a = orders;
        this.f218571b = scannedInterval;
        this.f218572c = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f218570a.equals(k0Var.f218570a) && this.f218571b.equals(k0Var.f218571b) && Intrinsics.f(this.f218572c, k0Var.f218572c);
    }

    public final int hashCode() {
        int iHashCode = (this.f218571b.hashCode() + (this.f218570a.hashCode() * 31)) * 31;
        j0 j0Var = this.f218572c;
        return iHashCode + (j0Var == null ? 0 : j0Var.hashCode());
    }
}
