package pfj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtpResend;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f235615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingOtpResend f235616b;

    public i(d authorization, EsimPhoneNumberPortingOtpResend esimPhoneNumberPortingOtpResend) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        this.f235615a = authorization;
        this.f235616b = esimPhoneNumberPortingOtpResend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235615a, iVar.f235615a) && Intrinsics.f(this.f235616b, iVar.f235616b);
    }

    public final int hashCode() {
        int iHashCode = this.f235615a.hashCode() * 31;
        EsimPhoneNumberPortingOtpResend esimPhoneNumberPortingOtpResend = this.f235616b;
        return iHashCode + (esimPhoneNumberPortingOtpResend == null ? 0 : esimPhoneNumberPortingOtpResend.hashCode());
    }
}
