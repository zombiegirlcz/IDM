package tx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f275269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f275270c;
    public final aw0.d0 d;
    public final boolean e;

    public x0(List pages, b1 pageAutoScroll, aw0.d0 aspectRatio, int i) {
        pageAutoScroll = (i & 4) != 0 ? b1.MEDIUM : pageAutoScroll;
        boolean z = (i & 16) == 0;
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pageAutoScroll, "pageAutoScroll");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.f275268a = "";
        this.f275269b = pages;
        this.f275270c = pageAutoScroll;
        this.d = aspectRatio;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f275268a, x0Var.f275268a) && Intrinsics.f(this.f275269b, x0Var.f275269b) && this.f275270c == x0Var.f275270c && Intrinsics.f(this.d, x0Var.d) && this.e == x0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f275270c.hashCode() + p.a.d(this.f275268a.hashCode() * 31, 31, this.f275269b)) * 31)) * 31);
    }
}
