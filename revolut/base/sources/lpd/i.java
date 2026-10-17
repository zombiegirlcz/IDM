package lpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.e f198972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f198973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f198974c;

    public i(lzi.e cycle, h choice, boolean z) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f198972a = cycle;
        this.f198973b = choice;
        this.f198974c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f198972a, iVar.f198972a) && Intrinsics.f(this.f198973b, iVar.f198973b) && this.f198974c == iVar.f198974c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198974c) + ((this.f198973b.hashCode() + (this.f198972a.hashCode() * 31)) * 31);
    }
}
