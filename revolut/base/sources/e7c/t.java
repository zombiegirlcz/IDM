package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Le7c/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "paymentToken", "b", "paymentState", "idempotencyKey", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentToken")
    @NotNull
    private final String paymentToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentState")
    @NotNull
    private final String paymentState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("idempotencyKey")
    private final String idempotencyKey;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaymentState() {
        return this.paymentState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.paymentToken, tVar.paymentToken) && Intrinsics.f(this.paymentState, tVar.paymentState) && Intrinsics.f(this.idempotencyKey, tVar.idempotencyKey);
    }

    public final int hashCode() {
        int iC = p.a.c(this.paymentToken.hashCode() * 31, 31, this.paymentState);
        String str = this.idempotencyKey;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
