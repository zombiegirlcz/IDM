package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f204498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f204499b;

    public t(e type, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        o currency = bVar != null ? new n(bVar) : m.f204493a;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f204498a = type;
        this.f204499b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f204498a == tVar.f204498a && Intrinsics.f(this.f204499b, tVar.f204499b);
    }

    public final int hashCode() {
        return this.f204499b.hashCode() + (this.f204498a.hashCode() * 31);
    }
}
