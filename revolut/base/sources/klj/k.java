package klj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f185641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingScheduleOption f185642b;

    public k(LocalDate localDate, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption) {
        this.f185641a = localDate;
        this.f185642b = esimPhoneNumberPortingScheduleOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f185641a, kVar.f185641a) && Intrinsics.f(this.f185642b, kVar.f185642b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f185641a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.f185642b;
        return iHashCode + (esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.hashCode() : 0);
    }
}
