package com.revolut.data.network.models.beneficiary;

import com.revolut.data.network.models.address.AddressModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÕ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a¨\u0006E"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;", "", "identityType", "", "firstName", "lastName", "companyName", "phone", "email", "currency", "bankCountry", "paymentMethod", "account", "", "accountOptionType", "address", "Lcom/revolut/data/network/models/address/AddressModel;", "extraFields", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "verification", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;", "extractionTaskId", "paymentWidgetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/revolut/data/network/models/address/AddressModel;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;Ljava/lang/String;Ljava/lang/String;)V", "getIdentityType", "()Ljava/lang/String;", "getFirstName", "getLastName", "getCompanyName", "getPhone", "getEmail", "getCurrency", "getBankCountry", "getPaymentMethod", "getAccount", "()Ljava/util/Map;", "getAccountOptionType", "getAddress", "()Lcom/revolut/data/network/models/address/AddressModel;", "getExtraFields", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "getVerification", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;", "getExtractionTaskId", "getPaymentWidgetId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankBeneficiaryParamsNetworkModel {

    @b("account")
    private final Map<String, String> account;

    @b("accountOptionType")
    private final String accountOptionType;

    @b("address")
    private final AddressModel address;

    @b("bankCountry")
    private final String bankCountry;

    @b("companyName")
    private final String companyName;

    @b("currency")
    private final String currency;

    @b("email")
    private final String email;

    @b("extraFields")
    private final BeneficiaryExtraFieldsDto extraFields;

    @b("extractionTaskId")
    private final String extractionTaskId;

    @b("firstName")
    private final String firstName;

    @b("identityType")
    private final String identityType;

    @b("lastName")
    private final String lastName;

    @b("paymentMethod")
    private final String paymentMethod;

    @b("paymentWidgetId")
    private final String paymentWidgetId;

    @b("phone")
    private final String phone;

    @b("verification")
    private final BeneficiaryVerificationDto verification;

    public BankBeneficiaryParamsNetworkModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, String str10, AddressModel addressModel, BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, BeneficiaryVerificationDto beneficiaryVerificationDto, String str11, String str12) {
        this.identityType = str;
        this.firstName = str2;
        this.lastName = str3;
        this.companyName = str4;
        this.phone = str5;
        this.email = str6;
        this.currency = str7;
        this.bankCountry = str8;
        this.paymentMethod = str9;
        this.account = map;
        this.accountOptionType = str10;
        this.address = addressModel;
        this.extraFields = beneficiaryExtraFieldsDto;
        this.verification = beneficiaryVerificationDto;
        this.extractionTaskId = str11;
        this.paymentWidgetId = str12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    public final Map<String, String> component10() {
        return this.account;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAccountOptionType() {
        return this.accountOptionType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final AddressModel getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BeneficiaryExtraFieldsDto getExtraFields() {
        return this.extraFields;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BeneficiaryVerificationDto getVerification() {
        return this.verification;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExtractionTaskId() {
        return this.extractionTaskId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPaymentWidgetId() {
        return this.paymentWidgetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @NotNull
    public final BankBeneficiaryParamsNetworkModel copy(String identityType, String firstName, String lastName, String companyName, String phone, String email, String currency, String bankCountry, String paymentMethod, Map<String, String> account, String accountOptionType, AddressModel address, BeneficiaryExtraFieldsDto extraFields, BeneficiaryVerificationDto verification, String extractionTaskId, String paymentWidgetId) {
        return new BankBeneficiaryParamsNetworkModel(identityType, firstName, lastName, companyName, phone, email, currency, bankCountry, paymentMethod, account, accountOptionType, address, extraFields, verification, extractionTaskId, paymentWidgetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankBeneficiaryParamsNetworkModel)) {
            return false;
        }
        BankBeneficiaryParamsNetworkModel bankBeneficiaryParamsNetworkModel = (BankBeneficiaryParamsNetworkModel) other;
        return Intrinsics.f(this.identityType, bankBeneficiaryParamsNetworkModel.identityType) && Intrinsics.f(this.firstName, bankBeneficiaryParamsNetworkModel.firstName) && Intrinsics.f(this.lastName, bankBeneficiaryParamsNetworkModel.lastName) && Intrinsics.f(this.companyName, bankBeneficiaryParamsNetworkModel.companyName) && Intrinsics.f(this.phone, bankBeneficiaryParamsNetworkModel.phone) && Intrinsics.f(this.email, bankBeneficiaryParamsNetworkModel.email) && Intrinsics.f(this.currency, bankBeneficiaryParamsNetworkModel.currency) && Intrinsics.f(this.bankCountry, bankBeneficiaryParamsNetworkModel.bankCountry) && Intrinsics.f(this.paymentMethod, bankBeneficiaryParamsNetworkModel.paymentMethod) && Intrinsics.f(this.account, bankBeneficiaryParamsNetworkModel.account) && Intrinsics.f(this.accountOptionType, bankBeneficiaryParamsNetworkModel.accountOptionType) && Intrinsics.f(this.address, bankBeneficiaryParamsNetworkModel.address) && Intrinsics.f(this.extraFields, bankBeneficiaryParamsNetworkModel.extraFields) && Intrinsics.f(this.verification, bankBeneficiaryParamsNetworkModel.verification) && Intrinsics.f(this.extractionTaskId, bankBeneficiaryParamsNetworkModel.extractionTaskId) && Intrinsics.f(this.paymentWidgetId, bankBeneficiaryParamsNetworkModel.paymentWidgetId);
    }

    public final Map<String, String> getAccount() {
        return this.account;
    }

    public final String getAccountOptionType() {
        return this.accountOptionType;
    }

    public final AddressModel getAddress() {
        return this.address;
    }

    public final String getBankCountry() {
        return this.bankCountry;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final BeneficiaryExtraFieldsDto getExtraFields() {
        return this.extraFields;
    }

    public final String getExtractionTaskId() {
        return this.extractionTaskId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getIdentityType() {
        return this.identityType;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentWidgetId() {
        return this.paymentWidgetId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final BeneficiaryVerificationDto getVerification() {
        return this.verification;
    }

    public int hashCode() {
        String str = this.identityType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.companyName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bankCountry;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentMethod;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map = this.account;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        String str10 = this.accountOptionType;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AddressModel addressModel = this.address;
        int iHashCode12 = (iHashCode11 + (addressModel == null ? 0 : addressModel.hashCode())) * 31;
        BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto = this.extraFields;
        int iHashCode13 = (iHashCode12 + (beneficiaryExtraFieldsDto == null ? 0 : beneficiaryExtraFieldsDto.hashCode())) * 31;
        BeneficiaryVerificationDto beneficiaryVerificationDto = this.verification;
        int iHashCode14 = (iHashCode13 + (beneficiaryVerificationDto == null ? 0 : beneficiaryVerificationDto.hashCode())) * 31;
        String str11 = this.extractionTaskId;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentWidgetId;
        return iHashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public /* synthetic */ BankBeneficiaryParamsNetworkModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, String str10, AddressModel addressModel, BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, BeneficiaryVerificationDto beneficiaryVerificationDto, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, map, str10, addressModel, beneficiaryExtraFieldsDto, beneficiaryVerificationDto, str11, (i & 32768) != 0 ? null : str12);
    }
}
