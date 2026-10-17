package n50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v20.c f212492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f212493b;

    public m(v20.c message, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f212492a = message;
        this.f212493b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f212492a, mVar.f212492a) && this.f212493b == mVar.f212493b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212493b) + (this.f212492a.hashCode() * 31);
    }
}
