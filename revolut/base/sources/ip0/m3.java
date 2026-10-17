package ip0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m3 implements o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f165309a;

    public m3(Map yAxisLabels) {
        Intrinsics.checkNotNullParameter(yAxisLabels, "yAxisLabels");
        this.f165309a = yAxisLabels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m3) && Intrinsics.f(this.f165309a, ((m3) obj2).f165309a);
    }

    public final int hashCode() {
        return this.f165309a.hashCode();
    }
}
