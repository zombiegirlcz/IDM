package glj;

import cli.j;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingOwnerAccountType f144710a;

    public d(EsimPhoneNumberPortingOwnerAccountType selectedPhoneNumberType) {
        Intrinsics.checkNotNullParameter(selectedPhoneNumberType, "selectedPhoneNumberType");
        this.f144710a = selectedPhoneNumberType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f144710a, ((d) obj2).f144710a);
    }

    public final int hashCode() {
        return this.f144710a.hashCode();
    }
}
