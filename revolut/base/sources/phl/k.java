package phl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f236360b;

    public k(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f236359a = id10;
        this.f236360b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f236359a, kVar.f236359a) && this.f236360b == kVar.f236360b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236360b) + (this.f236359a.hashCode() * 31);
    }
}
