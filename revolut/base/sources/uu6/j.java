package uu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f283145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l header, aim.e items) {
        super(items);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283145b = header;
        this.f283146c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f283146c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f283145b, jVar.f283145b) && Intrinsics.f(this.f283146c, jVar.f283146c);
    }

    public final int hashCode() {
        return this.f283146c.hashCode() + (this.f283145b.hashCode() * 31);
    }
}
