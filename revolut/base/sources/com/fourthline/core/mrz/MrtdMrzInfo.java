package com.fourthline.core.mrz;

import com.fourthline.core.Gender;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0014\u0010\u001d\u001a\u00060\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0014\u0010$\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bHÆ\u0003¢\u0006\u0004\b)\u0010!J´\u0001\u0010*\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\f\b\u0002\u0010\b\u001a\u00060\u0002j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\t2\f\b\u0002\u0010\u0011\u001a\u00060\u0002j\u0002`\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001bR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u001bR\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001fR!\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\f0\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!R!\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u000e0\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bC\u0010!R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010\u001fR\u001b\u0010\u0011\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u0010\u001bR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010!¨\u0006Q"}, d2 = {"Lcom/fourthline/core/mrz/MrtdMrzInfo;", "Lcom/fourthline/core/mrz/MrzInfo;", "", "Lcom/fourthline/core/mrz/DocumentCode;", "documentCode", "Lcom/fourthline/core/mrz/Country;", "issuingCountry", "Lcom/fourthline/core/mrz/DocumentNumber;", "documentNumber", "Ljava/util/Date;", "expirationDate", "", "Lcom/fourthline/core/mrz/FirstName;", "firstNames", "Lcom/fourthline/core/mrz/LastName;", "lastNames", "birthDate", "nationality", "Lcom/fourthline/core/Gender;", "gender", "optionalData", "rawMrz", "Lcom/fourthline/core/mrz/MrtdMrzInfoValidationError;", "validationErrors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Date;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "()Lcom/fourthline/core/Gender;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/fourthline/core/mrz/MrtdMrzInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "getDocumentCode", "d", "getIssuingCountry", "e", "getDocumentNumber", "f", "Ljava/util/Date;", "getExpirationDate", "g", "Ljava/util/List;", "getFirstNames", "h", "getLastNames", "i", "getBirthDate", "j", "getNationality", "k", "Lcom/fourthline/core/Gender;", "getGender", "l", "getOptionalData", "m", "getRawMrz", "n", "getValidationErrors", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MrtdMrzInfo extends MrzInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String documentCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String issuingCountry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String documentNumber;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Date expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List firstNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List lastNames;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Date birthDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String nationality;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Gender gender;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String optionalData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String rawMrz;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List validationErrors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtdMrzInfo(@NotNull String documentCode, @NotNull String issuingCountry, @NotNull String documentNumber, @NotNull Date expirationDate, @NotNull List<String> firstNames, @NotNull List<String> lastNames, @NotNull Date birthDate, @NotNull String nationality, @NotNull Gender gender, String str, @NotNull String rawMrz, @NotNull List<? extends MrtdMrzInfoValidationError> validationErrors) {
        super(rawMrz, validationErrors, null);
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(firstNames, "firstNames");
        Intrinsics.checkNotNullParameter(lastNames, "lastNames");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(rawMrz, "rawMrz");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        this.documentCode = documentCode;
        this.issuingCountry = issuingCountry;
        this.documentNumber = documentNumber;
        this.expirationDate = expirationDate;
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.gender = gender;
        this.optionalData = str;
        this.rawMrz = rawMrz;
        this.validationErrors = validationErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrtdMrzInfo copy$default(MrtdMrzInfo mrtdMrzInfo, String str, String str2, String str3, Date date, List list, List list2, Date date2, String str4, Gender gender, String str5, String str6, List list3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mrtdMrzInfo.documentCode;
        }
        if ((i & 2) != 0) {
            str2 = mrtdMrzInfo.issuingCountry;
        }
        if ((i & 4) != 0) {
            str3 = mrtdMrzInfo.documentNumber;
        }
        if ((i & 8) != 0) {
            date = mrtdMrzInfo.expirationDate;
        }
        if ((i & 16) != 0) {
            list = mrtdMrzInfo.firstNames;
        }
        if ((i & 32) != 0) {
            list2 = mrtdMrzInfo.lastNames;
        }
        if ((i & 64) != 0) {
            date2 = mrtdMrzInfo.birthDate;
        }
        if ((i & 128) != 0) {
            str4 = mrtdMrzInfo.nationality;
        }
        if ((i & 256) != 0) {
            gender = mrtdMrzInfo.gender;
        }
        if ((i & 512) != 0) {
            str5 = mrtdMrzInfo.optionalData;
        }
        if ((i & 1024) != 0) {
            str6 = mrtdMrzInfo.rawMrz;
        }
        if ((i & 2048) != 0) {
            list3 = mrtdMrzInfo.validationErrors;
        }
        String str7 = str6;
        List list4 = list3;
        Gender gender2 = gender;
        String str8 = str5;
        Date date3 = date2;
        String str9 = str4;
        List list5 = list;
        List list6 = list2;
        return mrtdMrzInfo.copy(str, str2, str3, date, list5, list6, date3, str9, gender2, str8, str7, list4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentCode() {
        return this.documentCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOptionalData() {
        return this.optionalData;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRawMrz() {
        return this.rawMrz;
    }

    @NotNull
    public final List<MrtdMrzInfoValidationError> component12() {
        return this.validationErrors;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final List<String> component5() {
        return this.firstNames;
    }

    @NotNull
    public final List<String> component6() {
        return this.lastNames;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @NotNull
    public final MrtdMrzInfo copy(@NotNull String documentCode, @NotNull String issuingCountry, @NotNull String documentNumber, @NotNull Date expirationDate, @NotNull List<String> firstNames, @NotNull List<String> lastNames, @NotNull Date birthDate, @NotNull String nationality, @NotNull Gender gender, String optionalData, @NotNull String rawMrz, @NotNull List<? extends MrtdMrzInfoValidationError> validationErrors) {
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(firstNames, "firstNames");
        Intrinsics.checkNotNullParameter(lastNames, "lastNames");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(rawMrz, "rawMrz");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        return new MrtdMrzInfo(documentCode, issuingCountry, documentNumber, expirationDate, firstNames, lastNames, birthDate, nationality, gender, optionalData, rawMrz, validationErrors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrtdMrzInfo)) {
            return false;
        }
        MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) other;
        return Intrinsics.f(this.documentCode, mrtdMrzInfo.documentCode) && Intrinsics.f(this.issuingCountry, mrtdMrzInfo.issuingCountry) && Intrinsics.f(this.documentNumber, mrtdMrzInfo.documentNumber) && Intrinsics.f(this.expirationDate, mrtdMrzInfo.expirationDate) && Intrinsics.f(this.firstNames, mrtdMrzInfo.firstNames) && Intrinsics.f(this.lastNames, mrtdMrzInfo.lastNames) && Intrinsics.f(this.birthDate, mrtdMrzInfo.birthDate) && Intrinsics.f(this.nationality, mrtdMrzInfo.nationality) && this.gender == mrtdMrzInfo.gender && Intrinsics.f(this.optionalData, mrtdMrzInfo.optionalData) && Intrinsics.f(this.rawMrz, mrtdMrzInfo.rawMrz) && Intrinsics.f(this.validationErrors, mrtdMrzInfo.validationErrors);
    }

    @NotNull
    public final Date getBirthDate() {
        return this.birthDate;
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
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final List<String> getFirstNames() {
        return this.firstNames;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    @NotNull
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final List<String> getLastNames() {
        return this.lastNames;
    }

    @NotNull
    public final String getNationality() {
        return this.nationality;
    }

    public final String getOptionalData() {
        return this.optionalData;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    @NotNull
    public String getRawMrz() {
        return this.rawMrz;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    @NotNull
    public List<MrtdMrzInfoValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.documentCode.hashCode() * 31) + this.issuingCountry.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.firstNames.hashCode()) * 31) + this.lastNames.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.gender.hashCode()) * 31;
        String str = this.optionalData;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.rawMrz.hashCode()) * 31) + this.validationErrors.hashCode();
    }

    @NotNull
    public String toString() {
        return "MrtdMrzInfo(documentCode=" + this.documentCode + ", issuingCountry=" + this.issuingCountry + ", documentNumber=" + this.documentNumber + ", expirationDate=" + this.expirationDate + ", firstNames=" + this.firstNames + ", lastNames=" + this.lastNames + ", birthDate=" + this.birthDate + ", nationality=" + this.nationality + ", gender=" + this.gender + ", optionalData=" + this.optionalData + ", rawMrz=" + this.rawMrz + ", validationErrors=" + this.validationErrors + ")";
    }
}
