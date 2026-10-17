package lp4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f198925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f198926b;

    public d(lw0.a header, aim.e items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f198925a = header;
        this.f198926b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f198926b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f198925a.equals(dVar.f198925a) && Intrinsics.f(this.f198926b, dVar.f198926b);
    }

    public final int hashCode() {
        return this.f198926b.hashCode() + (this.f198925a.hashCode() * 31);
    }
}
