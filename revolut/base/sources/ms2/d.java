package ms2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ks2.c f208623a;

    public d(ks2.c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f208623a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f208623a, ((d) obj2).f208623a);
    }

    public final int hashCode() {
        return this.f208623a.hashCode();
    }
}
