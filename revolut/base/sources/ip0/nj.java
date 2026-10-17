package ip0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class nj {

    @NotNull
    public static final lj Companion = new lj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f165520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f165521b;

    public nj(ArrayList projections, List xAxis) {
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(projections, "projections");
        this.f165520a = xAxis;
        this.f165521b = projections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj2;
        return Intrinsics.f(this.f165520a, njVar.f165520a) && this.f165521b.equals(njVar.f165521b);
    }

    public final int hashCode() {
        return this.f165521b.hashCode() + (this.f165520a.hashCode() * 31);
    }
}
