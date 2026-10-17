package mb5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f204149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f204150c;
    public final int d;
    public final t e;

    public p(String id10, u paymentType, v state, int i, t source) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f204148a = id10;
        this.f204149b = paymentType;
        this.f204150c = state;
        this.d = i;
        this.e = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f204148a, pVar.f204148a) && this.f204149b == pVar.f204149b && this.f204150c == pVar.f204150c && this.d == pVar.d && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, (this.f204150c.hashCode() + ((this.f204149b.hashCode() + (this.f204148a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
