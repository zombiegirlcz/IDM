package rbj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbj.c f253122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f253123b;

    public b(jbj.c dataSource, boolean z) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f253122a = dataSource;
        this.f253123b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f253122a.equals(bVar.f253122a) && this.f253123b == bVar.f253123b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253123b) + (this.f253122a.hashCode() * 31);
    }
}
