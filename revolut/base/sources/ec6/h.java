package ec6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.l f124450a;

    public h(ba6.l charity) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        this.f124450a = charity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f124450a, ((h) obj2).f124450a);
    }

    public final int hashCode() {
        return this.f124450a.hashCode();
    }
}
