package y65;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f311165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311166b;

    public j(i header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311165a = header;
        this.f311166b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311166b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f311165a, jVar.f311165a) && Intrinsics.f(this.f311166b, jVar.f311166b);
    }

    public final int hashCode() {
        return this.f311166b.hashCode() + (this.f311165a.hashCode() * 31);
    }
}
