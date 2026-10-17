package nya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f220734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru.w f220735b;

    public i() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f220734a == iVar.f220734a && Intrinsics.f(this.f220735b, iVar.f220735b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f220734a) * 31;
        ru.w wVar = this.f220735b;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public /* synthetic */ i(int i) {
        this(false, null);
    }

    public i(boolean z, ru.w wVar) {
        this.f220734a = z;
        this.f220735b = wVar;
    }
}
