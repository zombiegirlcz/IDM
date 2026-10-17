package w38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n38.p f294180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f294181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f294182c;

    public i(n38.p state, int i, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f294180a = state;
        this.f294181b = i;
        this.f294182c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f294180a, iVar.f294180a) && this.f294181b == iVar.f294181b && this.f294182c == iVar.f294182c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f294182c) + j6.a.b(this.f294181b, this.f294180a.hashCode() * 31, 31);
    }
}
