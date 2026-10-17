package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo0.d f181047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f181048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo0.e f181049c;

    public d0(xo0.d dVar, e0 type, xo0.e source) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f181047a = dVar;
        this.f181048b = type;
        this.f181049c = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f181047a, d0Var.f181047a) && this.f181048b == d0Var.f181048b && this.f181049c == d0Var.f181049c;
    }

    public final int hashCode() {
        xo0.d dVar = this.f181047a;
        return this.f181049c.hashCode() + ((this.f181048b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31);
    }
}
