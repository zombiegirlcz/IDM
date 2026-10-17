package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120844b;

    public x5(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f120843a = title;
        this.f120844b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj2;
        return Intrinsics.f(this.f120843a, x5Var.f120843a) && Intrinsics.f(this.f120844b, x5Var.f120844b);
    }

    public final int hashCode() {
        return this.f120844b.hashCode() + (this.f120843a.hashCode() * 31);
    }
}
