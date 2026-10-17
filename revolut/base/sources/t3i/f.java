package t3i;

import java.net.URI;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f267792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URI f267793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f267794c;

    public f(ArrayList scans, URI uri2, a metadata) {
        Intrinsics.checkNotNullParameter(scans, "scans");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f267792a = scans;
        this.f267793b = uri2;
        this.f267794c = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f267792a.equals(fVar.f267792a) && Intrinsics.f(this.f267793b, fVar.f267793b) && this.f267794c.equals(fVar.f267794c);
    }

    public final int hashCode() {
        int iHashCode = this.f267792a.hashCode() * 31;
        URI uri2 = this.f267793b;
        return this.f267794c.hashCode() + ((iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31);
    }
}
