package cv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f109236a;

    public b(h offerType) {
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        this.f109236a = offerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f109236a == ((b) obj2).f109236a;
    }

    public final int hashCode() {
        return this.f109236a.hashCode();
    }
}
