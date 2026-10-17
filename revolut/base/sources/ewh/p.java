package ewh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f130278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f130279b;

    public p(List items, lw0.m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130278a = header;
        this.f130279b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f130279b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f130278a, pVar.f130278a) && Intrinsics.f(this.f130279b, pVar.f130279b);
    }

    public final int hashCode() {
        return this.f130279b.hashCode() + (this.f130278a.hashCode() * 31);
    }
}
