package ifd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f161002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161003b;

    public c(b valueVariant, boolean z) {
        Intrinsics.checkNotNullParameter(valueVariant, "valueVariant");
        this.f161002a = valueVariant;
        this.f161003b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161002a, cVar.f161002a) && this.f161003b == cVar.f161003b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161003b) + (this.f161002a.hashCode() * 31);
    }
}
