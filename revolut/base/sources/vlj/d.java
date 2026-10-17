package vlj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f290478b;

    public d(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f290477a = items;
        this.f290478b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f290477a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f290477a, dVar.f290477a) && this.f290478b.equals(dVar.f290478b);
    }

    public final int hashCode() {
        return this.f290478b.hashCode() + (this.f290477a.hashCode() * 31);
    }
}
