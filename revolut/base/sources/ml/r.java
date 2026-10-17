package ml;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206545a;

    public r(List backstackSnapshot) {
        Intrinsics.checkNotNullParameter(backstackSnapshot, "backstackSnapshot");
        this.f206545a = backstackSnapshot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f206545a, ((r) obj2).f206545a);
    }

    public final int hashCode() {
        return this.f206545a.hashCode();
    }

    public final String toString() {
        return "OnBackPressed(backstackSnapshot=" + this.f206545a + ")";
    }
}
