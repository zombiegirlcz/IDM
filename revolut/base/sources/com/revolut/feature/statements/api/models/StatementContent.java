package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementContent;", "", "phone", "", "companyInfo", "cryptoInfo", "legalInfo", "customersNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getCompanyInfo", "getCryptoInfo", "getLegalInfo", "getCustomersNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementContent {

    @NotNull
    private final String companyInfo;
    private final String cryptoInfo;
    private final String customersNumber;
    private final String legalInfo;

    @NotNull
    private final String phone;

    public StatementContent(@NotNull String phone, @NotNull String companyInfo, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(companyInfo, "companyInfo");
        this.phone = phone;
        this.companyInfo = companyInfo;
        this.cryptoInfo = str;
        this.legalInfo = str2;
        this.customersNumber = str3;
    }

    public static /* synthetic */ StatementContent copy$default(StatementContent statementContent, String str, String str2, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = statementContent.phone;
        }
        if ((i & 2) != 0) {
            str2 = statementContent.companyInfo;
        }
        if ((i & 4) != 0) {
            str3 = statementContent.cryptoInfo;
        }
        if ((i & 8) != 0) {
            str4 = statementContent.legalInfo;
        }
        if ((i & 16) != 0) {
            str5 = statementContent.customersNumber;
        }
        String str6 = str5;
        String str7 = str3;
        return statementContent.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCompanyInfo() {
        return this.companyInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegalInfo() {
        return this.legalInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomersNumber() {
        return this.customersNumber;
    }

    @NotNull
    public final StatementContent copy(@NotNull String phone, @NotNull String companyInfo, String cryptoInfo, String legalInfo, String customersNumber) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(companyInfo, "companyInfo");
        return new StatementContent(phone, companyInfo, cryptoInfo, legalInfo, customersNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementContent)) {
            return false;
        }
        StatementContent statementContent = (StatementContent) other;
        return Intrinsics.f(this.phone, statementContent.phone) && Intrinsics.f(this.companyInfo, statementContent.companyInfo) && Intrinsics.f(this.cryptoInfo, statementContent.cryptoInfo) && Intrinsics.f(this.legalInfo, statementContent.legalInfo) && Intrinsics.f(this.customersNumber, statementContent.customersNumber);
    }

    @NotNull
    public final String getCompanyInfo() {
        return this.companyInfo;
    }

    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    public final String getCustomersNumber() {
        return this.customersNumber;
    }

    public final String getLegalInfo() {
        return this.legalInfo;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int iC = a.c(this.phone.hashCode() * 31, 31, this.companyInfo);
        String str = this.cryptoInfo;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.legalInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customersNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
