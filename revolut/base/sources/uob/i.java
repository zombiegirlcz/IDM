package uob;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f281596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281597b;

    public i(List items, lw0.m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281596a = header;
        this.f281597b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f281597b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f281596a, iVar.f281596a) && Intrinsics.f(this.f281597b, iVar.f281597b);
    }

    public final int hashCode() {
        return this.f281597b.hashCode() + (this.f281596a.hashCode() * 31);
    }
}
