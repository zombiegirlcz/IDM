package fo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn2.c f136792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2.c f136793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wn2.c f136794c;
    public final wn2.c d;

    public m(wn2.c title, wn2.c cVar, wn2.c primaryActionText, wn2.c cVar2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryActionText, "primaryActionText");
        this.f136792a = title;
        this.f136793b = cVar;
        this.f136794c = primaryActionText;
        this.d = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f136792a, mVar.f136792a) && Intrinsics.f(this.f136793b, mVar.f136793b) && Intrinsics.f(this.f136794c, mVar.f136794c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f136792a.hashCode() * 31;
        wn2.c cVar = this.f136793b;
        int iHashCode2 = (this.f136794c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        wn2.c cVar2 = this.d;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
