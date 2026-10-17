package hjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo3.a f152719a;

    public v(bo3.a aVar) {
        this.f152719a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f152719a, ((v) obj2).f152719a);
    }

    public final int hashCode() {
        bo3.a aVar = this.f152719a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
