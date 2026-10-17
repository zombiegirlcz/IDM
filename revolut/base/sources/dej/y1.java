package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.time.b f113694a;

    public y1(kotlin.time.b bVar) {
        this.f113694a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y1) && Intrinsics.f(this.f113694a, ((y1) obj2).f113694a);
    }

    public final int hashCode() {
        kotlin.time.b bVar = this.f113694a;
        if (bVar == null) {
            return 0;
        }
        return Long.hashCode(bVar.f187924a);
    }
}
