package hfg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f151833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f151835c;
    public final dj0.d d;
    public final String e;

    public f0(e0 type, String name, double d, dj0.d taxesPrice, String bookingUrl) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(taxesPrice, "taxesPrice");
        Intrinsics.checkNotNullParameter(bookingUrl, "bookingUrl");
        this.f151833a = type;
        this.f151834b = name;
        this.f151835c = d;
        this.d = taxesPrice;
        this.e = bookingUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f151833a == f0Var.f151833a && Intrinsics.f(this.f151834b, f0Var.f151834b) && Double.compare(this.f151835c, f0Var.f151835c) == 0 && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(m72.b.c(p.a.c(this.f151833a.hashCode() * 31, 31, this.f151834b), this.f151835c, 31), 31, this.d);
    }
}
