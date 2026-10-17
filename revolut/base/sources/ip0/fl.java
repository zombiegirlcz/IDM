package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class fl {

    @NotNull
    public static final el Companion = new el();
    public static final fl d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f164274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sequence f164275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3 f164276c;

    static {
        zhm.f0 f0Var = zhm.f0.f322471a;
        Sequence sequenceD = nkm.t.d();
        xi0.b.Companion.getClass();
        d = new fl(f0Var, sequenceD, new n3(xi0.b.f306271c));
    }

    public fl(List categories, Sequence series, o3 yAxisLabels) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(yAxisLabels, "yAxisLabels");
        this.f164274a = categories;
        this.f164275b = series;
        this.f164276c = yAxisLabels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj2;
        return Intrinsics.f(this.f164274a, flVar.f164274a) && Intrinsics.f(this.f164275b, flVar.f164275b) && Intrinsics.f(this.f164276c, flVar.f164276c);
    }

    public final int hashCode() {
        return this.f164276c.hashCode() + ((this.f164275b.hashCode() + (this.f164274a.hashCode() * 31)) * 31);
    }
}
