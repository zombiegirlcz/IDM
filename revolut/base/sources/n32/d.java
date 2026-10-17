package n32;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq2.a f211673a;

    public d(xq2.a barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.f211673a = barcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f211673a, ((d) obj2).f211673a);
    }

    public final int hashCode() {
        return this.f211673a.hashCode();
    }
}
