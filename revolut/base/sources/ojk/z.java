package ojk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f225848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f225849b;

    public z(u firstAction, u secondAction) {
        Intrinsics.checkNotNullParameter(firstAction, "firstAction");
        Intrinsics.checkNotNullParameter(secondAction, "secondAction");
        this.f225848a = firstAction;
        this.f225849b = secondAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f225848a.equals(zVar.f225848a) && this.f225849b.equals(zVar.f225849b);
    }

    public final int hashCode() {
        return this.f225849b.f225843a.hashCode() + (this.f225848a.f225843a.hashCode() * 31);
    }
}
