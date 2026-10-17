package glj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingOwnerAccountType f144711a;

    public e(EsimPhoneNumberPortingOwnerAccountType phoneNumberType) {
        Intrinsics.checkNotNullParameter(phoneNumberType, "phoneNumberType");
        this.f144711a = phoneNumberType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f144711a, ((e) obj2).f144711a);
    }

    public final int hashCode() {
        return this.f144711a.hashCode();
    }
}
