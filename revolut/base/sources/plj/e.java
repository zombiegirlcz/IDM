package plj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingServiceProvider f237416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingContractType f237417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingScheduleOption f237418c;
    public final LocalDate d;
    public final EsimPhoneNumberPortingOwnerAccountType e;

    public e(EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider, EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType) {
        this.f237416a = esimPhoneNumberPortingServiceProvider;
        this.f237417b = esimPhoneNumberPortingContractType;
        this.f237418c = esimPhoneNumberPortingScheduleOption;
        this.d = localDate;
        this.e = esimPhoneNumberPortingOwnerAccountType;
    }

    public static e a(e eVar, EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider, EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType, int i) {
        if ((i & 1) != 0) {
            esimPhoneNumberPortingServiceProvider = eVar.f237416a;
        }
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider2 = esimPhoneNumberPortingServiceProvider;
        if ((i & 2) != 0) {
            esimPhoneNumberPortingContractType = eVar.f237417b;
        }
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType2 = esimPhoneNumberPortingContractType;
        if ((i & 4) != 0) {
            esimPhoneNumberPortingScheduleOption = eVar.f237418c;
        }
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption2 = esimPhoneNumberPortingScheduleOption;
        if ((i & 8) != 0) {
            localDate = eVar.d;
        }
        LocalDate localDate2 = localDate;
        if ((i & 16) != 0) {
            esimPhoneNumberPortingOwnerAccountType = eVar.e;
        }
        eVar.getClass();
        return new e(esimPhoneNumberPortingServiceProvider2, esimPhoneNumberPortingContractType2, esimPhoneNumberPortingScheduleOption2, localDate2, esimPhoneNumberPortingOwnerAccountType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f237416a, eVar.f237416a) && Intrinsics.f(this.f237417b, eVar.f237417b) && Intrinsics.f(this.f237418c, eVar.f237418c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = this.f237416a;
        int iHashCode = (esimPhoneNumberPortingServiceProvider == null ? 0 : esimPhoneNumberPortingServiceProvider.hashCode()) * 31;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = this.f237417b;
        int iHashCode2 = (iHashCode + (esimPhoneNumberPortingContractType == null ? 0 : esimPhoneNumberPortingContractType.hashCode())) * 31;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.f237418c;
        int iHashCode3 = (iHashCode2 + (esimPhoneNumberPortingScheduleOption == null ? 0 : esimPhoneNumberPortingScheduleOption.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = this.e;
        return iHashCode4 + (esimPhoneNumberPortingOwnerAccountType != null ? esimPhoneNumberPortingOwnerAccountType.hashCode() : 0);
    }
}
