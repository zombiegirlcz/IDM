package s6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f260231b;

    public m(String str, n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f260230a = str;
        this.f260231b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f260230a, mVar.f260230a) && this.f260231b == mVar.f260231b;
    }

    public final int hashCode() {
        String str = this.f260230a;
        return this.f260231b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
