package e10;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f121833a;

    public p(ByteBuffer image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f121833a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f121833a, ((p) obj2).f121833a);
    }

    public final int hashCode() {
        return this.f121833a.hashCode();
    }
}
