package fjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f135591a;

    public q() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f135591a, ((q) obj2).f135591a);
    }

    public final int hashCode() {
        co3.a aVar = this.f135591a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public q(co3.a aVar) {
        this.f135591a = aVar;
    }
}
