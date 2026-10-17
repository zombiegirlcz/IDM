package bn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17109a;

    public e() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f17109a, ((e) obj2).f17109a);
    }

    public final int hashCode() {
        g gVar = this.f17109a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public e(g gVar) {
        this.f17109a = gVar;
    }
}
