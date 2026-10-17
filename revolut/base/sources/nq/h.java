package nq;

import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f218298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f218299b;

    public h(f metadata, FloatBuffer embedding) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(embedding, "embedding");
        this.f218298a = metadata;
        this.f218299b = embedding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f218298a, hVar.f218298a) && Intrinsics.f(this.f218299b, hVar.f218299b);
    }

    public final int hashCode() {
        return this.f218299b.hashCode() + (this.f218298a.hashCode() * 31);
    }
}
