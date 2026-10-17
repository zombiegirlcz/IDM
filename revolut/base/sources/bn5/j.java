package bn5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17114b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17113a = items;
        this.f17114b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f17113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f17113a, jVar.f17113a) && this.f17114b == jVar.f17114b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17114b) + (this.f17113a.hashCode() * 31);
    }
}
