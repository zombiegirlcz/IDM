package nq;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements t {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f218319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f218320b;

    public n(v metadata, ByteBuffer bytes) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f218319a = metadata;
        this.f218320b = bytes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f218319a, nVar.f218319a) && Intrinsics.f(this.f218320b, nVar.f218320b);
    }

    public final int hashCode() {
        return this.f218320b.hashCode() + (this.f218319a.hashCode() * 31);
    }
}
