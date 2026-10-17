package bfd;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14965b;

    public f(ArrayList items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14964a = header;
        this.f14965b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f14965b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f14964a.equals(fVar.f14964a) && this.f14965b.equals(fVar.f14965b);
    }

    public final int hashCode() {
        return this.f14965b.hashCode() + (this.f14964a.hashCode() * 31);
    }
}
