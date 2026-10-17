package ed5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f124916a;

    public a(d region) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.f124916a = region;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f124916a == ((a) obj2).f124916a;
    }

    public final int hashCode() {
        return this.f124916a.hashCode();
    }
}
