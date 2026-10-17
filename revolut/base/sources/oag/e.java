package oag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgi.b f223618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223619b;

    public e(dgi.b propertySearch, int i) {
        Intrinsics.checkNotNullParameter(propertySearch, "propertySearch");
        this.f223618a = propertySearch;
        this.f223619b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f223618a, eVar.f223618a) && this.f223619b == eVar.f223619b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223619b) + (this.f223618a.hashCode() * 31);
    }
}
