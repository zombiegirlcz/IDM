package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f292228c;

    public k(String id10, String text, j icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f292226a = id10;
        this.f292227b = text;
        this.f292228c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f292226a, kVar.f292226a) && Intrinsics.f(this.f292227b, kVar.f292227b) && Intrinsics.f(this.f292228c, kVar.f292228c);
    }

    public final int hashCode() {
        return this.f292228c.f292225a.hashCode() + p.a.c(this.f292226a.hashCode() * 31, 31, this.f292227b);
    }
}
