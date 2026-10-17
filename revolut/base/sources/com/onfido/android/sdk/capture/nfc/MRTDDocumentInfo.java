package com.onfido.android.sdk.capture.nfc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;", "", "documentCode", "", "countryCode", "documentNumber", "birthDate", "expiryDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()Ljava/lang/String;", "getCountryCode", "getDocumentCode", "getDocumentNumber", "getExpiryDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MRTDDocumentInfo {

    @NotNull
    private final String birthDate;

    @NotNull
    private final String countryCode;

    @NotNull
    private final String documentCode;

    @NotNull
    private final String documentNumber;

    @NotNull
    private final String expiryDate;

    public MRTDDocumentInfo(@NotNull String documentCode, @NotNull String countryCode, @NotNull String documentNumber, @NotNull String birthDate, @NotNull String expiryDate) {
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.documentCode = documentCode;
        this.countryCode = countryCode;
        this.documentNumber = documentNumber;
        this.birthDate = birthDate;
        this.expiryDate = expiryDate;
    }

    public static /* synthetic */ MRTDDocumentInfo copy$default(MRTDDocumentInfo mRTDDocumentInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mRTDDocumentInfo.documentCode;
        }
        if ((i & 2) != 0) {
            str2 = mRTDDocumentInfo.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = mRTDDocumentInfo.documentNumber;
        }
        if ((i & 8) != 0) {
            str4 = mRTDDocumentInfo.birthDate;
        }
        if ((i & 16) != 0) {
            str5 = mRTDDocumentInfo.expiryDate;
        }
        String str6 = str5;
        String str7 = str3;
        return mRTDDocumentInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentCode() {
        return this.documentCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final MRTDDocumentInfo copy(@NotNull String documentCode, @NotNull String countryCode, @NotNull String documentNumber, @NotNull String birthDate, @NotNull String expiryDate) {
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        return new MRTDDocumentInfo(documentCode, countryCode, documentNumber, birthDate, expiryDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MRTDDocumentInfo)) {
            return false;
        }
        MRTDDocumentInfo mRTDDocumentInfo = (MRTDDocumentInfo) other;
        return Intrinsics.f(this.documentCode, mRTDDocumentInfo.documentCode) && Intrinsics.f(this.countryCode, mRTDDocumentInfo.countryCode) && Intrinsics.f(this.documentNumber, mRTDDocumentInfo.documentNumber) && Intrinsics.f(this.birthDate, mRTDDocumentInfo.birthDate) && Intrinsics.f(this.expiryDate, mRTDDocumentInfo.expiryDate);
    }

    @NotNull
    public final String getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getDocumentCode() {
        return this.documentCode;
    }

    @NotNull
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public int hashCode() {
        return this.expiryDate.hashCode() + a.c(a.c(a.c(this.documentCode.hashCode() * 31, 31, this.countryCode), 31, this.documentNumber), 31, this.birthDate);
    }

    @NotNull
    public String toString() {
        String str = this.documentCode;
        String str2 = this.countryCode;
        String str3 = this.documentNumber;
        String str4 = this.birthDate;
        String str5 = this.expiryDate;
        StringBuilder sbM = v0.a.m("MRTDDocumentInfo(documentCode=", str, ", countryCode=", str2, ", documentNumber=");
        j6.a.D(sbM, str3, ", birthDate=", str4, ", expiryDate=");
        return v0.a.i(sbM, str5, ")");
    }
}
