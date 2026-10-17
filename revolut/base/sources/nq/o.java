package nq;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f218321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f218322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vw.a f218323c;

    public o(a metadata, ByteBuffer image, vw.a aVar) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f218321a = metadata;
        this.f218322b = image;
        this.f218323c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f218321a, oVar.f218321a) && Intrinsics.f(this.f218322b, oVar.f218322b) && Intrinsics.f(this.f218323c, oVar.f218323c);
    }

    public final int hashCode() {
        int iHashCode = (this.f218322b.hashCode() + (this.f218321a.hashCode() * 31)) * 31;
        vw.a aVar = this.f218323c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
