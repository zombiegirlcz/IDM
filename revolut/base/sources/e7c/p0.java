package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Le7c/p0;", "", "", "toString", "()Ljava/lang/String;", "", "Le7c/z;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "paymentMethods", "b", "Ljava/lang/String;", "defaultPaymentMethodId", "defaultPocketId", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethods")
    @NotNull
    private final List<z> paymentMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultPaymentMethodId")
    private final String defaultPaymentMethodId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultPocketId")
    private final String defaultPocketId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultPocketId() {
        return this.defaultPocketId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPaymentMethods() {
        return this.paymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.paymentMethods, p0Var.paymentMethods) && Intrinsics.f(this.defaultPaymentMethodId, p0Var.defaultPaymentMethodId) && Intrinsics.f(this.defaultPocketId, p0Var.defaultPocketId);
    }

    public final int hashCode() {
        int iHashCode = this.paymentMethods.hashCode() * 31;
        String str = this.defaultPaymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultPocketId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
