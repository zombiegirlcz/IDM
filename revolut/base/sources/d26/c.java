package d26;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f110722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110723b;

    public c(double d, ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f110722a = d;
        this.f110723b = points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f110722a, cVar.f110722a) == 0 && this.f110723b.equals(cVar.f110723b);
    }

    public final int hashCode() {
        return this.f110723b.hashCode() + (Double.hashCode(this.f110722a) * 31);
    }
}
