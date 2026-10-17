package t3i;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f267796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URI f267797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f267798c;

    public h(d scan, URI uri2, a metadata) {
        Intrinsics.checkNotNullParameter(scan, "scan");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f267796a = scan;
        this.f267797b = uri2;
        this.f267798c = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f267796a, hVar.f267796a) && Intrinsics.f(this.f267797b, hVar.f267797b) && Intrinsics.f(this.f267798c, hVar.f267798c);
    }

    public final int hashCode() {
        int iHashCode = this.f267796a.hashCode() * 31;
        URI uri2 = this.f267797b;
        return this.f267798c.hashCode() + ((iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31);
    }
}
