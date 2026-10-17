package dh4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114749b;

    public i(String facilityId, List screens) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f114748a = facilityId;
        this.f114749b = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f114748a, iVar.f114748a) && Intrinsics.f(this.f114749b, iVar.f114749b);
    }

    public final int hashCode() {
        return this.f114749b.hashCode() + (this.f114748a.hashCode() * 31);
    }
}
