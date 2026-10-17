package e10;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f121815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f121817c;

    public j(a boundingBox, float f, ArrayList kps) {
        Intrinsics.checkNotNullParameter(boundingBox, "boundingBox");
        Intrinsics.checkNotNullParameter(kps, "kps");
        this.f121815a = boundingBox;
        this.f121816b = f;
        this.f121817c = kps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f121815a, jVar.f121815a) && Float.compare(this.f121816b, jVar.f121816b) == 0 && this.f121817c.equals(jVar.f121817c);
    }

    public final int hashCode() {
        return this.f121817c.hashCode() + m72.b.b(this.f121816b, this.f121815a.hashCode() * 31, 31);
    }
}
