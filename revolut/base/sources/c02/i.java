package c02;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f20112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20113b;

    public i(dj0.d total, ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f20112a = total;
        this.f20113b = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f20112a.equals(iVar.f20112a) && this.f20113b.equals(iVar.f20113b);
    }

    public final int hashCode() {
        return this.f20113b.hashCode() + (this.f20112a.hashCode() * 31);
    }
}
