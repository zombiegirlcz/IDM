package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2463b;

    public d0(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2462a = id10;
        this.f2463b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f2462a, d0Var.f2462a) && Intrinsics.f(this.f2463b, d0Var.f2463b);
    }

    public final int hashCode() {
        return this.f2463b.hashCode() + (this.f2462a.hashCode() * 31);
    }
}
