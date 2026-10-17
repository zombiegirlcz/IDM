package f47;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f132019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f132020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f132021c;

    public j(i headerState, h footerState, aim.e items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f132019a = headerState;
        this.f132020b = footerState;
        this.f132021c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f132021c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f132019a, jVar.f132019a) && Intrinsics.f(this.f132020b, jVar.f132020b) && Intrinsics.f(this.f132021c, jVar.f132021c);
    }

    public final int hashCode() {
        return this.f132021c.hashCode() + t61.a.a(this.f132019a.f132018a.hashCode() * 31, 31, this.f132020b.f132017a);
    }
}
