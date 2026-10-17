package ukc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f280722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f280723c;
    public final d d;

    public a(String informationRequestId, c type, b state, d dVar) {
        Intrinsics.checkNotNullParameter(informationRequestId, "informationRequestId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f280721a = informationRequestId;
        this.f280722b = type;
        this.f280723c = state;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f280721a, aVar.f280721a) && this.f280722b == aVar.f280722b && this.f280723c == aVar.f280723c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f280723c.hashCode() + ((this.f280722b.hashCode() + (this.f280721a.hashCode() * 31)) * 31)) * 31;
        d dVar = this.d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
