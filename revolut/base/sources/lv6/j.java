package lv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr6.g f200326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr6.j f200327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.p f200328c;
    public final whf.p d;

    public j(rr6.g cashbackBoosterInfo, rr6.j cashbackInfo, whf.p transactions, whf.p payouts) {
        Intrinsics.checkNotNullParameter(cashbackBoosterInfo, "cashbackBoosterInfo");
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(payouts, "payouts");
        this.f200326a = cashbackBoosterInfo;
        this.f200327b = cashbackInfo;
        this.f200328c = transactions;
        this.d = payouts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f200326a, jVar.f200326a) && Intrinsics.f(this.f200327b, jVar.f200327b) && Intrinsics.f(this.f200328c, jVar.f200328c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f200328c.hashCode() + ((this.f200327b.hashCode() + (this.f200326a.hashCode() * 31)) * 31)) * 31);
    }
}
