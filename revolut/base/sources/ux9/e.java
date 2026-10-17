package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f283920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.b f283921b;

    public e(d id10, jq9.b paymentItem) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283920a = id10;
        this.f283921b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283921b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f283920a.equals(eVar.f283920a) && this.f283921b.equals(eVar.f283921b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283921b.hashCode() + (this.f283920a.hashCode() * 31)) * 31, 31);
    }
}
