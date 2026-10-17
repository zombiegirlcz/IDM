package pdh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f235230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f235231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f235232c;
    public final ArrayList d;

    public b(Instant start, Instant end2, Instant lastUpdated, ArrayList points) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f235230a = start;
        this.f235231b = end2;
        this.f235232c = lastUpdated;
        this.d = points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f235230a.equals(bVar.f235230a) && this.f235231b.equals(bVar.f235231b) && this.f235232c.equals(bVar.f235232c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.g(this.f235232c, t61.a.g(this.f235231b, this.f235230a.hashCode() * 31, 31), 31);
    }
}
