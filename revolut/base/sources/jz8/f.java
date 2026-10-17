package jz8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179614c;
    public final List d;

    public f(String category, String title, String variant, List productDomains) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(productDomains, "productDomains");
        this.f179612a = category;
        this.f179613b = title;
        this.f179614c = variant;
        this.d = productDomains;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f179612a, fVar.f179612a) && Intrinsics.f(this.f179613b, fVar.f179613b) && Intrinsics.f(this.f179614c, fVar.f179614c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f179612a.hashCode() * 31, 31, this.f179613b), 31, this.f179614c);
    }
}
