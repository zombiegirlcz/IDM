package dv;

import gv.n;
import gv.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.m f118004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f118005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f118006c;

    public f(gv.m media, n metadata, q telemetry) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.f118004a = media;
        this.f118005b = metadata;
        this.f118006c = telemetry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f118004a, fVar.f118004a) && Intrinsics.f(this.f118005b, fVar.f118005b) && Intrinsics.f(this.f118006c, fVar.f118006c);
    }

    public final int hashCode() {
        return this.f118006c.hashCode() + ((this.f118005b.hashCode() + (this.f118004a.hashCode() * 31)) * 31);
    }
}
