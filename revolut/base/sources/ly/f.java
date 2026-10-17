package ly;

import gv.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.m f200614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.n f200615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f200616c;

    public f(gv.m media, gv.n metadata, q telemetry) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.f200614a = media;
        this.f200615b = metadata;
        this.f200616c = telemetry;
    }

    @Override // ly.g
    public final gv.m J() {
        return this.f200614a;
    }

    @Override // ly.g
    public final q a() {
        return this.f200616c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f200614a, fVar.f200614a) && Intrinsics.f(this.f200615b, fVar.f200615b) && Intrinsics.f(this.f200616c, fVar.f200616c);
    }

    @Override // ly.g
    public final gv.n getMetadata() {
        return this.f200615b;
    }

    public final int hashCode() {
        return this.f200616c.hashCode() + ((this.f200615b.hashCode() + (this.f200614a.hashCode() * 31)) * 31);
    }
}
