package dw;

import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatBuffer f118209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118210b;

    public r(FloatBuffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f118209a = buffer;
        this.f118210b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f118209a, rVar.f118209a) && this.f118210b == rVar.f118210b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118210b) + (this.f118209a.hashCode() * 31);
    }
}
