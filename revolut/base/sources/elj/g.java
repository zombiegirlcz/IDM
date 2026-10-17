package elj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingScheduleOption f127496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f127497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mlj.i f127498c;

    public g(EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, mlj.i iVar) {
        this.f127496a = esimPhoneNumberPortingScheduleOption;
        this.f127497b = localDate;
        this.f127498c = iVar;
    }

    public static g a(g gVar, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, mlj.i iVar, int i) {
        if ((i & 1) != 0) {
            esimPhoneNumberPortingScheduleOption = gVar.f127496a;
        }
        if ((i & 2) != 0) {
            localDate = gVar.f127497b;
        }
        if ((i & 4) != 0) {
            iVar = gVar.f127498c;
        }
        gVar.getClass();
        return new g(esimPhoneNumberPortingScheduleOption, localDate, iVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f127496a, gVar.f127496a) && Intrinsics.f(this.f127497b, gVar.f127497b) && Intrinsics.f(this.f127498c, gVar.f127498c);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.f127496a;
        int iHashCode = (esimPhoneNumberPortingScheduleOption == null ? 0 : esimPhoneNumberPortingScheduleOption.hashCode()) * 31;
        LocalDate localDate = this.f127497b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        mlj.i iVar = this.f127498c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
