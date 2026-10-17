package xkj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import java.time.LocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingServiceProvider f306819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingContractType f306820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingScheduleOption f306821c;
    public final LocalDate d;
    public final EsimPhoneNumberPortingOwnerAccountType e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f306822g;

    public g(EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider, EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType, Map userInputs, Map contractTypeUserInputs) {
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(contractTypeUserInputs, "contractTypeUserInputs");
        this.f306819a = esimPhoneNumberPortingServiceProvider;
        this.f306820b = esimPhoneNumberPortingContractType;
        this.f306821c = esimPhoneNumberPortingScheduleOption;
        this.d = localDate;
        this.e = esimPhoneNumberPortingOwnerAccountType;
        this.f = userInputs;
        this.f306822g = contractTypeUserInputs;
    }

    public static g a(g gVar, EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider, EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, LocalDate localDate, EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            esimPhoneNumberPortingServiceProvider = gVar.f306819a;
        }
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider2 = esimPhoneNumberPortingServiceProvider;
        if ((i & 2) != 0) {
            esimPhoneNumberPortingContractType = gVar.f306820b;
        }
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType2 = esimPhoneNumberPortingContractType;
        if ((i & 4) != 0) {
            esimPhoneNumberPortingScheduleOption = gVar.f306821c;
        }
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption2 = esimPhoneNumberPortingScheduleOption;
        if ((i & 8) != 0) {
            localDate = gVar.d;
        }
        LocalDate localDate2 = localDate;
        if ((i & 16) != 0) {
            esimPhoneNumberPortingOwnerAccountType = gVar.e;
        }
        EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType2 = esimPhoneNumberPortingOwnerAccountType;
        if ((i & 32) != 0) {
            map = gVar.f;
        }
        Map userInputs = map;
        if ((i & 64) != 0) {
            map2 = gVar.f306822g;
        }
        Map contractTypeUserInputs = map2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(contractTypeUserInputs, "contractTypeUserInputs");
        return new g(esimPhoneNumberPortingServiceProvider2, esimPhoneNumberPortingContractType2, esimPhoneNumberPortingScheduleOption2, localDate2, esimPhoneNumberPortingOwnerAccountType2, userInputs, contractTypeUserInputs);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f306819a, gVar.f306819a) && Intrinsics.f(this.f306820b, gVar.f306820b) && Intrinsics.f(this.f306821c, gVar.f306821c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f306822g, gVar.f306822g);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = this.f306819a;
        int iHashCode = (esimPhoneNumberPortingServiceProvider == null ? 0 : esimPhoneNumberPortingServiceProvider.hashCode()) * 31;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = this.f306820b;
        int iHashCode2 = (iHashCode + (esimPhoneNumberPortingContractType == null ? 0 : esimPhoneNumberPortingContractType.hashCode())) * 31;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.f306821c;
        int iHashCode3 = (iHashCode2 + (esimPhoneNumberPortingScheduleOption == null ? 0 : esimPhoneNumberPortingScheduleOption.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = this.e;
        return this.f306822g.hashCode() + p.a.e((iHashCode4 + (esimPhoneNumberPortingOwnerAccountType != null ? esimPhoneNumberPortingOwnerAccountType.hashCode() : 0)) * 31, 31, this.f);
    }
}
