package t2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdh.e f267562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f267563b;

    public a(bfl.g gVar, hdh.e actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f267562a = actions;
        this.f267563b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f267562a, aVar.f267562a) && this.f267563b == aVar.f267563b;
    }

    public final int hashCode() {
        int iHashCode = this.f267562a.f151437a.hashCode() * 31;
        bfl.g gVar = this.f267563b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
