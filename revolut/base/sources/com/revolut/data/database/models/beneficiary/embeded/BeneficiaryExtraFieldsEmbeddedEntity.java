package com.revolut.data.database.models.beneficiary.embeded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "", "legalName", "", "dob", "reason", "companyDo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLegalName", "()Ljava/lang/String;", "getDob", "getReason", "getCompanyDo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryExtraFieldsEmbeddedEntity {

    @b("companyDo")
    private final String companyDo;

    @b("dob")
    private final String dob;

    @b("legalName")
    private final String legalName;

    @b("reason")
    private final String reason;

    public BeneficiaryExtraFieldsEmbeddedEntity(String str, String str2, String str3, String str4) {
        this.legalName = str;
        this.dob = str2;
        this.reason = str3;
        this.companyDo = str4;
    }

    public static /* synthetic */ BeneficiaryExtraFieldsEmbeddedEntity copy$default(BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = beneficiaryExtraFieldsEmbeddedEntity.legalName;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryExtraFieldsEmbeddedEntity.dob;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryExtraFieldsEmbeddedEntity.reason;
        }
        if ((i & 8) != 0) {
            str4 = beneficiaryExtraFieldsEmbeddedEntity.companyDo;
        }
        return beneficiaryExtraFieldsEmbeddedEntity.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyDo() {
        return this.companyDo;
    }

    @NotNull
    public final BeneficiaryExtraFieldsEmbeddedEntity copy(String legalName, String dob2, String reason, String companyDo) {
        return new BeneficiaryExtraFieldsEmbeddedEntity(legalName, dob2, reason, companyDo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryExtraFieldsEmbeddedEntity)) {
            return false;
        }
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity = (BeneficiaryExtraFieldsEmbeddedEntity) other;
        return Intrinsics.f(this.legalName, beneficiaryExtraFieldsEmbeddedEntity.legalName) && Intrinsics.f(this.dob, beneficiaryExtraFieldsEmbeddedEntity.dob) && Intrinsics.f(this.reason, beneficiaryExtraFieldsEmbeddedEntity.reason) && Intrinsics.f(this.companyDo, beneficiaryExtraFieldsEmbeddedEntity.companyDo);
    }

    public final String getCompanyDo() {
        return this.companyDo;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.legalName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.companyDo;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
