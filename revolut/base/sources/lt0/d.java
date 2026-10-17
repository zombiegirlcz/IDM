package lt0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f199732c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f199734b;

    static {
        f0 f0Var = f0.f322471a;
        f199732c = new d(f0Var, f0Var);
    }

    public d(List xAxis, List projections) {
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(projections, "projections");
        this.f199733a = xAxis;
        this.f199734b = projections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f199733a, dVar.f199733a) && Intrinsics.f(this.f199734b, dVar.f199734b);
    }

    public final int hashCode() {
        return this.f199734b.hashCode() + (this.f199733a.hashCode() * 31);
    }
}
