package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f204485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f204486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f204487c;
    public final f d;

    public b(e type, o currency, d state, f balanceType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        this.f204485a = type;
        this.f204486b = currency;
        this.f204487c = state;
        this.d = balanceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f204485a == bVar.f204485a && Intrinsics.f(this.f204486b, bVar.f204486b) && this.f204487c == bVar.f204487c && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f204487c.hashCode() + ((this.f204486b.hashCode() + (this.f204485a.hashCode() * 31)) * 31)) * 31);
    }
}
