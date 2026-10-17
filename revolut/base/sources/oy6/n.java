package oy6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f230903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f230904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f230905c;

    public n(m header, List items, l footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f230903a = header;
        this.f230904b = items;
        this.f230905c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f230904b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f230903a, nVar.f230903a) && Intrinsics.f(this.f230904b, nVar.f230904b) && Intrinsics.f(this.f230905c, nVar.f230905c);
    }

    public final int hashCode() {
        return this.f230905c.hashCode() + p.a.d(this.f230903a.hashCode() * 31, 31, this.f230904b);
    }
}
