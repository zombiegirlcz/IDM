package ks6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f189140c;

    public d0(double d, String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f189138a = id10;
        this.f189139b = name;
        this.f189140c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f189138a, d0Var.f189138a) && Intrinsics.f(this.f189139b, d0Var.f189139b) && Double.compare(this.f189140c, d0Var.f189140c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f189140c) + p.a.c(this.f189138a.hashCode() * 31, 31, this.f189139b);
    }
}
