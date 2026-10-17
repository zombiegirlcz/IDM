package mkk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f206486b;

    public j(List items, f header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f206485a = items;
        this.f206486b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f206485a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f206485a, jVar.f206485a) && Intrinsics.f(this.f206486b, jVar.f206486b);
    }

    public final int hashCode() {
        return this.f206486b.f206482a.hashCode() + (this.f206485a.hashCode() * 31);
    }
}
