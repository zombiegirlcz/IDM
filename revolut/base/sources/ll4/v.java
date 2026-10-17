package ll4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f196552a;

    public v(x xVar) {
        this.f196552a = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f196552a, ((v) obj2).f196552a);
    }

    public final int hashCode() {
        x xVar = this.f196552a;
        if (xVar == null) {
            return 0;
        }
        return xVar.hashCode();
    }
}
