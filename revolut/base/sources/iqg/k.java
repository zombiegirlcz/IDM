package iqg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f167844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167845b;

    public k(List items, lw0.m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167844a = header;
        this.f167845b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f167845b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f167844a, kVar.f167844a) && Intrinsics.f(this.f167845b, kVar.f167845b);
    }

    public final int hashCode() {
        return this.f167845b.hashCode() + (this.f167844a.hashCode() * 31);
    }
}
