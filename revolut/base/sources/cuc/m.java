package cuc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108961b;

    public m(String str, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f108960a = str;
        this.f108961b = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!m.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.SecurityDelayRepositoryImpl.TransactionSecurityDelayInfoParams");
        return Intrinsics.f(this.f108961b, ((m) obj2).f108961b);
    }

    public final int hashCode() {
        return this.f108961b.hashCode();
    }
}
