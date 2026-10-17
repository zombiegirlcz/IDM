package jt6;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Ljt6/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentId", "paymentId", "Ljo3/a;", "b", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "c", "getDescription", "description", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentId")
    @NotNull
    private final String paymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    public m(String paymentId, String str, jo3.a amount) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.paymentId = paymentId;
        this.amount = amount;
        this.description = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.paymentId, mVar.paymentId) && Intrinsics.f(this.amount, mVar.amount) && Intrinsics.f(this.description, mVar.description);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, this.paymentId.hashCode() * 31, 31);
        String str = this.description;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
