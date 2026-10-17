package fij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberSelections f135464b;

    public v(String mobilePlanId, EsimPhoneNumberSelections esimPhoneNumberSelections) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f135463a = mobilePlanId;
        this.f135464b = esimPhoneNumberSelections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f135463a, vVar.f135463a) && Intrinsics.f(this.f135464b, vVar.f135464b);
    }

    public final int hashCode() {
        int iHashCode = this.f135463a.hashCode() * 31;
        EsimPhoneNumberSelections esimPhoneNumberSelections = this.f135464b;
        return iHashCode + (esimPhoneNumberSelections == null ? 0 : esimPhoneNumberSelections.hashCode());
    }
}
