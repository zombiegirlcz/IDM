package njj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f216557c;

    public e0(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f216555a = subscriptionId;
        this.f216556b = phoneNumberToTransfer;
        this.f216557c = porting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f216555a, e0Var.f216555a) && Intrinsics.f(this.f216556b, e0Var.f216556b) && Intrinsics.f(this.f216557c, e0Var.f216557c);
    }

    public final int hashCode() {
        return this.f216557c.hashCode() + p.a.c(this.f216555a.hashCode() * 31, 31, this.f216556b);
    }
}
