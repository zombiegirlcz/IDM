package klj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f185637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingScheduleOption f185638b;

    public i(LocalDate localDate, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption) {
        this.f185637a = localDate;
        this.f185638b = esimPhoneNumberPortingScheduleOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f185637a, iVar.f185637a) && Intrinsics.f(this.f185638b, iVar.f185638b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f185637a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.f185638b;
        return iHashCode + (esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.hashCode() : 0);
    }
}
