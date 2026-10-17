package q35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f241831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241833c;
    public final a d;

    public m(io3.d pocket, String sourceId, String str, a state) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f241831a = pocket;
        this.f241832b = sourceId;
        this.f241833c = str;
        this.d = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f241831a, mVar.f241831a) && Intrinsics.f(this.f241832b, mVar.f241832b) && Intrinsics.f(this.f241833c, mVar.f241833c) && this.d == mVar.d;
    }

    @Override // q35.o
    public final a getState() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f241831a.hashCode() * 31, 31, this.f241832b);
        String str = this.f241833c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
