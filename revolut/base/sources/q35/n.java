package q35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f241835b;

    public n(String sourceId, a state) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f241834a = sourceId;
        this.f241835b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f241834a, nVar.f241834a) && this.f241835b == nVar.f241835b;
    }

    @Override // q35.o
    public final a getState() {
        return this.f241835b;
    }

    public final int hashCode() {
        return this.f241835b.hashCode() + (this.f241834a.hashCode() * 31);
    }
}
