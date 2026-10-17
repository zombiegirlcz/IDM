package iqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f167887a;

    public e(ede.a suspiciousTransactionReviewDelegate) {
        Intrinsics.checkNotNullParameter(suspiciousTransactionReviewDelegate, "suspiciousTransactionReviewDelegate");
        this.f167887a = suspiciousTransactionReviewDelegate;
    }

    @Override // phm.a
    public final Object get() {
        Object obj2 = this.f167887a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (d) obj2;
    }
}
