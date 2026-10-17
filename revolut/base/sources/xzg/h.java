package xzg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f309995b;

    public h(String percentageChange, ArrayList points) {
        Intrinsics.checkNotNullParameter(percentageChange, "percentageChange");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f309994a = percentageChange;
        this.f309995b = points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f309994a, hVar.f309994a) && this.f309995b.equals(hVar.f309995b);
    }

    public final int hashCode() {
        return this.f309995b.hashCode() + (this.f309994a.hashCode() * 31);
    }
}
