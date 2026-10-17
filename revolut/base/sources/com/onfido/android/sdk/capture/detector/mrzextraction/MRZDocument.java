package com.onfido.android.sdk.capture.detector.mrzextraction;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0081\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010¨\u0006."}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "", "name", "surname", "documentNumber", "nationality", "dateOfBirth", "dateOfIssue", "dateOfExpire", "sex", "(Lcom/onfido/android/sdk/capture/DocumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getDateOfBirth", "getDateOfExpire", "getDateOfIssue", "getDocumentNumber", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "isValid", "", "()Z", "getName", "getNationality", "getSex", "getSurname", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MRZDocument {
    private final String countryCode;
    private final String dateOfBirth;
    private final String dateOfExpire;
    private final String dateOfIssue;
    private final String documentNumber;
    private final DocumentType documentType;
    private final String name;
    private final String nationality;
    private final String sex;
    private final String surname;

    public MRZDocument() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ MRZDocument copy$default(MRZDocument mRZDocument, DocumentType documentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentType = mRZDocument.documentType;
        }
        if ((i & 2) != 0) {
            str = mRZDocument.countryCode;
        }
        if ((i & 4) != 0) {
            str2 = mRZDocument.name;
        }
        if ((i & 8) != 0) {
            str3 = mRZDocument.surname;
        }
        if ((i & 16) != 0) {
            str4 = mRZDocument.documentNumber;
        }
        if ((i & 32) != 0) {
            str5 = mRZDocument.nationality;
        }
        if ((i & 64) != 0) {
            str6 = mRZDocument.dateOfBirth;
        }
        if ((i & 128) != 0) {
            str7 = mRZDocument.dateOfIssue;
        }
        if ((i & 256) != 0) {
            str8 = mRZDocument.dateOfExpire;
        }
        if ((i & 512) != 0) {
            str9 = mRZDocument.sex;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return mRZDocument.copy(documentType, str, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDateOfExpire() {
        return this.dateOfExpire;
    }

    @NotNull
    public final MRZDocument copy(DocumentType documentType, String countryCode, String name, String surname, String documentNumber, String nationality, String dateOfBirth, String dateOfIssue, String dateOfExpire, String sex) {
        return new MRZDocument(documentType, countryCode, name, surname, documentNumber, nationality, dateOfBirth, dateOfIssue, dateOfExpire, sex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MRZDocument)) {
            return false;
        }
        MRZDocument mRZDocument = (MRZDocument) other;
        return this.documentType == mRZDocument.documentType && Intrinsics.f(this.countryCode, mRZDocument.countryCode) && Intrinsics.f(this.name, mRZDocument.name) && Intrinsics.f(this.surname, mRZDocument.surname) && Intrinsics.f(this.documentNumber, mRZDocument.documentNumber) && Intrinsics.f(this.nationality, mRZDocument.nationality) && Intrinsics.f(this.dateOfBirth, mRZDocument.dateOfBirth) && Intrinsics.f(this.dateOfIssue, mRZDocument.dateOfIssue) && Intrinsics.f(this.dateOfExpire, mRZDocument.dateOfExpire) && Intrinsics.f(this.sex, mRZDocument.sex);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getDateOfExpire() {
        return this.dateOfExpire;
    }

    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getSex() {
        return this.sex;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        DocumentType documentType = this.documentType;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        String str = this.countryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dateOfBirth;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dateOfIssue;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dateOfExpire;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sex;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isValid() {
        return (this.documentNumber == null || this.dateOfBirth == null || this.dateOfExpire == null) ? false : true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("MRZDocument(documentType=");
        sb6.append(this.documentType);
        sb6.append(", countryCode=");
        sb6.append(this.countryCode);
        sb6.append(", name=");
        sb6.append(this.name);
        sb6.append(", surname=");
        sb6.append(this.surname);
        sb6.append(", documentNumber=");
        sb6.append(this.documentNumber);
        sb6.append(", nationality=");
        sb6.append(this.nationality);
        sb6.append(", dateOfBirth=");
        sb6.append(this.dateOfBirth);
        sb6.append(", dateOfIssue=");
        sb6.append(this.dateOfIssue);
        sb6.append(", dateOfExpire=");
        sb6.append(this.dateOfExpire);
        sb6.append(", sex=");
        return a.u(sb6, this.sex, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public MRZDocument(DocumentType documentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.documentType = documentType;
        this.countryCode = str;
        this.name = str2;
        this.surname = str3;
        this.documentNumber = str4;
        this.nationality = str5;
        this.dateOfBirth = str6;
        this.dateOfIssue = str7;
        this.dateOfExpire = str8;
        this.sex = str9;
    }

    public /* synthetic */ MRZDocument(DocumentType documentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : documentType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }
}
