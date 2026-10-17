package vy;

import gv.m;
import gv.n;
import gv.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f293117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f293118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f293119c;

    public d(m media, n metadata, q telemetry) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.f293117a = media;
        this.f293118b = metadata;
        this.f293119c = telemetry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f293117a, dVar.f293117a) && Intrinsics.f(this.f293118b, dVar.f293118b) && Intrinsics.f(this.f293119c, dVar.f293119c);
    }

    public final int hashCode() {
        return this.f293119c.hashCode() + ((this.f293118b.hashCode() + (this.f293117a.hashCode() * 31)) * 31);
    }
}
