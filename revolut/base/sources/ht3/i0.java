package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f155282a;

    public i0(h0 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f155282a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f155282a, ((i0) obj2).f155282a);
    }

    public final int hashCode() {
        return this.f155282a.hashCode();
    }
}
