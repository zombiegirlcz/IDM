package com.revolut.data.network.models.beneficiary;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraAccountFieldsNetworkModel;", "", "currency", "", "bankCountry", "firstName", "lastName", "companyName", "account", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCurrency", "()Ljava/lang/String;", "getBankCountry", "getFirstName", "getLastName", "getCompanyName", "getAccount", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryExtraAccountFieldsNetworkModel {

    @b("account")
    private final Map<String, String> account;

    @b("bankCountry")
    @NotNull
    private final String bankCountry;

    @b("companyName")
    private final String companyName;

    @b("currency")
    @NotNull
    private final String currency;

    @b("firstName")
    private final String firstName;

    @b("lastName")
    private final String lastName;

    public BeneficiaryExtraAccountFieldsNetworkModel(@NotNull String currency, @NotNull String bankCountry, String str, String str2, String str3, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        this.currency = currency;
        this.bankCountry = bankCountry;
        this.firstName = str;
        this.lastName = str2;
        this.companyName = str3;
        this.account = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryExtraAccountFieldsNetworkModel copy$default(BeneficiaryExtraAccountFieldsNetworkModel beneficiaryExtraAccountFieldsNetworkModel, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryExtraAccountFieldsNetworkModel.currency;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryExtraAccountFieldsNetworkModel.bankCountry;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryExtraAccountFieldsNetworkModel.firstName;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryExtraAccountFieldsNetworkModel.lastName;
        }
        if ((i & 16) != 0) {
            str5 = beneficiaryExtraAccountFieldsNetworkModel.companyName;
        }
        if ((i & 32) != 0) {
            map = beneficiaryExtraAccountFieldsNetworkModel.account;
        }
        String str6 = str5;
        Map map2 = map;
        return beneficiaryExtraAccountFieldsNetworkModel.copy(str, str2, str3, str4, str6, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    public final Map<String, String> component6() {
        return this.account;
    }

    @NotNull
    public final BeneficiaryExtraAccountFieldsNetworkModel copy(@NotNull String currency, @NotNull String bankCountry, String firstName, String lastName, String companyName, Map<String, String> account) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        return new BeneficiaryExtraAccountFieldsNetworkModel(currency, bankCountry, firstName, lastName, companyName, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryExtraAccountFieldsNetworkModel)) {
            return false;
        }
        BeneficiaryExtraAccountFieldsNetworkModel beneficiaryExtraAccountFieldsNetworkModel = (BeneficiaryExtraAccountFieldsNetworkModel) other;
        return Intrinsics.f(this.currency, beneficiaryExtraAccountFieldsNetworkModel.currency) && Intrinsics.f(this.bankCountry, beneficiaryExtraAccountFieldsNetworkModel.bankCountry) && Intrinsics.f(this.firstName, beneficiaryExtraAccountFieldsNetworkModel.firstName) && Intrinsics.f(this.lastName, beneficiaryExtraAccountFieldsNetworkModel.lastName) && Intrinsics.f(this.companyName, beneficiaryExtraAccountFieldsNetworkModel.companyName) && Intrinsics.f(this.account, beneficiaryExtraAccountFieldsNetworkModel.account);
    }

    public final Map<String, String> getAccount() {
        return this.account;
    }

    @NotNull
    public final String getBankCountry() {
        return this.bankCountry;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        int iC = a.c(this.currency.hashCode() * 31, 31, this.bankCountry);
        String str = this.firstName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.account;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
