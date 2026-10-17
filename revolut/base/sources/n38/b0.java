package n38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211932b;

    public b0(String id10, String type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f211931a = id10;
        this.f211932b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f211931a, b0Var.f211931a) && Intrinsics.f(this.f211932b, b0Var.f211932b);
    }

    public final int hashCode() {
        return this.f211932b.hashCode() + (this.f211931a.hashCode() * 31);
    }
}
