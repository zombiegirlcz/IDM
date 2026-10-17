package fsl;

import kotlin.jvm.internal.Intrinsics;
import yp0.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f137727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137728b;

    public j() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f137727a == jVar.f137727a && this.f137728b == jVar.f137728b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137728b) + (this.f137727a.hashCode() * 31);
    }

    public j(e0 subheaderPosition, int i) {
        subheaderPosition = (i & 1) != 0 ? e0.OUTSIDE_BOX : subheaderPosition;
        Intrinsics.checkNotNullParameter(subheaderPosition, "subheaderPosition");
        this.f137727a = subheaderPosition;
        this.f137728b = 3;
    }
}
