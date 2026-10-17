package l7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192607b;

    public h(boolean z, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f192606a = z;
        this.f192607b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f192606a == hVar.f192606a && Intrinsics.f(this.f192607b, hVar.f192607b);
    }

    public final int hashCode() {
        return this.f192607b.hashCode() + (Boolean.hashCode(this.f192606a) * 31);
    }
}
