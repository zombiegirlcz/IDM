package p4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232891a;

    public s(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f232891a = sku;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f232891a, ((s) obj2).f232891a);
    }

    public final int hashCode() {
        return this.f232891a.hashCode();
    }
}
