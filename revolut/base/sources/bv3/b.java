package bv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eu3.c f18944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.c f18945c;

    public b(c offerInfoContent, eu3.c cVar, fu3.c cVar2) {
        Intrinsics.checkNotNullParameter(offerInfoContent, "offerInfoContent");
        this.f18943a = offerInfoContent;
        this.f18944b = cVar;
        this.f18945c = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f18943a, bVar.f18943a) && Intrinsics.f(this.f18944b, bVar.f18944b) && Intrinsics.f(this.f18945c, bVar.f18945c);
    }

    public final int hashCode() {
        int iHashCode = this.f18943a.hashCode() * 31;
        eu3.c cVar = this.f18944b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        fu3.c cVar2 = this.f18945c;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
