package hs3;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht3.l0 f154866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f154867c;

    public b(String akahuLink, ht3.l0 intro, z2 z2Var) {
        Intrinsics.checkNotNullParameter(akahuLink, "akahuLink");
        Intrinsics.checkNotNullParameter(intro, "intro");
        this.f154865a = akahuLink;
        this.f154866b = intro;
        this.f154867c = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154865a, bVar.f154865a) && Intrinsics.f(this.f154866b, bVar.f154866b) && Intrinsics.f(this.f154867c, bVar.f154867c);
    }

    public final int hashCode() {
        int iHashCode = (this.f154866b.hashCode() + (this.f154865a.hashCode() * 31)) * 31;
        z2 z2Var = this.f154867c;
        return iHashCode + (z2Var == null ? 0 : z2Var.hashCode());
    }
}
