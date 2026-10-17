package wj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.l f298009a;

    public j(yy0.l image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f298009a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f298009a, ((j) obj2).f298009a);
    }

    public final int hashCode() {
        return this.f298009a.hashCode();
    }
}
