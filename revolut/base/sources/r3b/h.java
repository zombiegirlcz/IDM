package r3b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y49.f f251240b;

    public h(List positionsPerformance, y49.f unrealisedPerformance) {
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        this.f251239a = positionsPerformance;
        this.f251240b = unrealisedPerformance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f251239a, hVar.f251239a) && Intrinsics.f(this.f251240b, hVar.f251240b);
    }

    public final int hashCode() {
        return this.f251240b.hashCode() + (this.f251239a.hashCode() * 31);
    }
}
