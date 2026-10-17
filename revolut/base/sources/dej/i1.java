package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113558c;

    public i1(String title, String assetUri, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f113556a = title;
        this.f113557b = assetUri;
        this.f113558c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f113556a, i1Var.f113556a) && Intrinsics.f(this.f113557b, i1Var.f113557b) && Intrinsics.f(this.f113558c, i1Var.f113558c);
    }

    public final int hashCode() {
        return this.f113558c.hashCode() + p.a.c(this.f113556a.hashCode() * 31, 31, this.f113557b);
    }
}
