package nq;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements t {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f218302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f218303b;

    public j(a metadata, ByteBuffer image) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f218302a = metadata;
        this.f218303b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f218302a, jVar.f218302a) && Intrinsics.f(this.f218303b, jVar.f218303b);
    }

    public final int hashCode() {
        return this.f218303b.hashCode() + (this.f218302a.hashCode() * 31);
    }
}
