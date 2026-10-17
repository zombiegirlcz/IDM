package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f113532b;

    public f1(String id10, h1 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f113531a = id10;
        this.f113532b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f113531a, f1Var.f113531a) && Intrinsics.f(this.f113532b, f1Var.f113532b);
    }

    public final int hashCode() {
        return this.f113532b.hashCode() + (this.f113531a.hashCode() * 31);
    }
}
