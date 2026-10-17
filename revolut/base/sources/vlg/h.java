package vlg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f290439b;

    public h(String currentRegionName, ArrayList regionModels) {
        Intrinsics.checkNotNullParameter(currentRegionName, "currentRegionName");
        Intrinsics.checkNotNullParameter(regionModels, "regionModels");
        this.f290438a = currentRegionName;
        this.f290439b = regionModels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f290438a.equals(hVar.f290438a) && this.f290439b.equals(hVar.f290439b);
    }

    public final int hashCode() {
        return this.f290439b.hashCode() + (this.f290438a.hashCode() * 31);
    }
}
