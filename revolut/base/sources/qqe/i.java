package qqe;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f248529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248530b;

    public i(h header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248529a = header;
        this.f248530b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f248530b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248529a, iVar.f248529a) && Intrinsics.f(this.f248530b, iVar.f248530b);
    }

    public final int hashCode() {
        return this.f248530b.hashCode() + (this.f248529a.hashCode() * 31);
    }
}
