package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195320c;

    public b(String giftId, String giftedPlanId, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f195318a = giftId;
        this.f195319b = giftedPlanId;
        this.f195320c = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f195318a, bVar.f195318a) && Intrinsics.f(this.f195319b, bVar.f195319b) && Intrinsics.f(this.f195320c, bVar.f195320c);
    }

    public final int hashCode() {
        return this.f195320c.hashCode() + p.a.c(this.f195318a.hashCode() * 31, 31, this.f195319b);
    }
}
