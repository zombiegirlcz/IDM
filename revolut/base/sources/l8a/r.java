package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll8a/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ll8a/n;", "b", "Ll8a/n;", "getPaymentMethodDetails", "()Ll8a/n;", "paymentMethodDetails", "Ll8a/w0;", "c", "Ll8a/w0;", "getSettings", "()Ll8a/w0;", "settings", "Ljo3/a;", "d", "Ljo3/a;", "getTransactionLimit", "()Ljo3/a;", "transactionLimit", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetails")
    @NotNull
    private final n paymentMethodDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    @NotNull
    private final w0 settings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionLimit")
    private final jo3.a transactionLimit;

    public r(n paymentMethodDetails, w0 settings, jo3.a aVar) {
        Intrinsics.checkNotNullParameter("PIX_MANDATE", "paymentMethod");
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.paymentMethod = "PIX_MANDATE";
        this.paymentMethodDetails = paymentMethodDetails;
        this.settings = settings;
        this.transactionLimit = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.paymentMethod, rVar.paymentMethod) && Intrinsics.f(this.paymentMethodDetails, rVar.paymentMethodDetails) && Intrinsics.f(this.settings, rVar.settings) && Intrinsics.f(this.transactionLimit, rVar.transactionLimit);
    }

    public final int hashCode() {
        int iHashCode = (this.settings.hashCode() + ((this.paymentMethodDetails.hashCode() + (this.paymentMethod.hashCode() * 31)) * 31)) * 31;
        jo3.a aVar = this.transactionLimit;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
