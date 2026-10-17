package zq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq2.a f324351a;

    public f(xq2.a barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.f324351a = barcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f324351a, ((f) obj2).f324351a);
    }

    public final int hashCode() {
        return this.f324351a.hashCode();
    }
}
