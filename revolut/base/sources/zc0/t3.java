package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321130b;

    public t3(String itemId, String value) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321129a = itemId;
        this.f321130b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return Intrinsics.f(this.f321129a, t3Var.f321129a) && Intrinsics.f(this.f321130b, t3Var.f321130b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321129a;
    }

    public final int hashCode() {
        return this.f321130b.hashCode() + (this.f321129a.hashCode() * 31);
    }
}
