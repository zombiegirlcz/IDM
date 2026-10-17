package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.b f283917b;

    public a(String id10, jq9.b paymentItem) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283916a = id10;
        this.f283917b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283917b;
    }

    public final String c() {
        return this.f283916a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283916a, aVar.f283916a) && this.f283917b.equals(aVar.f283917b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283917b.hashCode() + (this.f283916a.hashCode() * 31)) * 31, 31);
    }
}
