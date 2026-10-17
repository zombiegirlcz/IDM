package com.onfido.api.client.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.v1;
import v0.a;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B}\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B}\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006:"}, d2 = {"Lcom/onfido/api/client/data/MRZDocument;", "", "seen1", "", "documentType", "", "countryCode", "name", "surname", "documentNumber", "nationality", "dateOfBirth", "dateOfIssue", "dateOfExpire", "sex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getDateOfBirth", "getDateOfExpire", "getDateOfIssue", "getDocumentNumber", "getDocumentType", "isValid", "", "()Z", "getName", "getNationality", "getSex", "getSurname", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class MRZDocument {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String countryCode;
    private final String dateOfBirth;
    private final String dateOfExpire;
    private final String dateOfIssue;
    private final String documentNumber;
    private final String documentType;
    private final String name;
    private final String nationality;
    private final String sex;
    private final String surname;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/MRZDocument$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/MRZDocument;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MRZDocument$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MRZDocument() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MRZDocument copy$default(MRZDocument mRZDocument, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mRZDocument.documentType;
        }
        if ((i & 2) != 0) {
            str2 = mRZDocument.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = mRZDocument.name;
        }
        if ((i & 8) != 0) {
            str4 = mRZDocument.surname;
        }
        if ((i & 16) != 0) {
            str5 = mRZDocument.documentNumber;
        }
        if ((i & 32) != 0) {
            str6 = mRZDocument.nationality;
        }
        if ((i & 64) != 0) {
            str7 = mRZDocument.dateOfBirth;
        }
        if ((i & 128) != 0) {
            str8 = mRZDocument.dateOfIssue;
        }
        if ((i & 256) != 0) {
            str9 = mRZDocument.dateOfExpire;
        }
        if ((i & 512) != 0) {
            str10 = mRZDocument.sex;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return mRZDocument.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(MRZDocument self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.documentType != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, v1.f247718a, self.documentType);
        }
        if (output.d(serialDesc) || self.countryCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.countryCode);
        }
        if (output.d(serialDesc) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, v1.f247718a, self.name);
        }
        if (output.d(serialDesc) || self.surname != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, v1.f247718a, self.surname);
        }
        if (output.d(serialDesc) || self.documentNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, v1.f247718a, self.documentNumber);
        }
        if (output.d(serialDesc) || self.nationality != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, v1.f247718a, self.nationality);
        }
        if (output.d(serialDesc) || self.dateOfBirth != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, v1.f247718a, self.dateOfBirth);
        }
        if (output.d(serialDesc) || self.dateOfIssue != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, v1.f247718a, self.dateOfIssue);
        }
        if (output.d(serialDesc) || self.dateOfExpire != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, v1.f247718a, self.dateOfExpire);
        }
        if (!output.d(serialDesc) && self.sex == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, v1.f247718a, self.sex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentType() {
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
    public final MRZDocument copy(String documentType, String countryCode, String name, String surname, String documentNumber, String nationality, String dateOfBirth, String dateOfIssue, String dateOfExpire, String sex) {
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
        return Intrinsics.f(this.documentType, mRZDocument.documentType) && Intrinsics.f(this.countryCode, mRZDocument.countryCode) && Intrinsics.f(this.name, mRZDocument.name) && Intrinsics.f(this.surname, mRZDocument.surname) && Intrinsics.f(this.documentNumber, mRZDocument.documentNumber) && Intrinsics.f(this.nationality, mRZDocument.nationality) && Intrinsics.f(this.dateOfBirth, mRZDocument.dateOfBirth) && Intrinsics.f(this.dateOfIssue, mRZDocument.dateOfIssue) && Intrinsics.f(this.dateOfExpire, mRZDocument.dateOfExpire) && Intrinsics.f(this.sex, mRZDocument.sex);
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

    public final String getDocumentType() {
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
        String str = this.documentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.surname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nationality;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dateOfBirth;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dateOfIssue;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dateOfExpire;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sex;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean isValid() {
        return (this.documentNumber == null || this.dateOfBirth == null || this.dateOfExpire == null) ? false : true;
    }

    @NotNull
    public String toString() {
        String str = this.documentType;
        String str2 = this.countryCode;
        String str3 = this.name;
        String str4 = this.surname;
        String str5 = this.documentNumber;
        String str6 = this.nationality;
        String str7 = this.dateOfBirth;
        String str8 = this.dateOfIssue;
        String str9 = this.dateOfExpire;
        String str10 = this.sex;
        StringBuilder sbM = a.m("MRZDocument(documentType=", str, ", countryCode=", str2, ", name=");
        j6.a.D(sbM, str3, ", surname=", str4, ", documentNumber=");
        j6.a.D(sbM, str5, ", nationality=", str6, ", dateOfBirth=");
        j6.a.D(sbM, str7, ", dateOfIssue=", str8, ", dateOfExpire=");
        return j6.a.w(sbM, str9, ", sex=", str10, ")");
    }

    @d
    public /* synthetic */ MRZDocument(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.documentType = null;
        } else {
            this.documentType = str;
        }
        if ((i & 2) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.surname = null;
        } else {
            this.surname = str4;
        }
        if ((i & 16) == 0) {
            this.documentNumber = null;
        } else {
            this.documentNumber = str5;
        }
        if ((i & 32) == 0) {
            this.nationality = null;
        } else {
            this.nationality = str6;
        }
        if ((i & 64) == 0) {
            this.dateOfBirth = null;
        } else {
            this.dateOfBirth = str7;
        }
        if ((i & 128) == 0) {
            this.dateOfIssue = null;
        } else {
            this.dateOfIssue = str8;
        }
        if ((i & 256) == 0) {
            this.dateOfExpire = null;
        } else {
            this.dateOfExpire = str9;
        }
        if ((i & 512) == 0) {
            this.sex = null;
        } else {
            this.sex = str10;
        }
    }

    public MRZDocument(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.documentType = str;
        this.countryCode = str2;
        this.name = str3;
        this.surname = str4;
        this.documentNumber = str5;
        this.nationality = str6;
        this.dateOfBirth = str7;
        this.dateOfIssue = str8;
        this.dateOfExpire = str9;
        this.sex = str10;
    }

    public /* synthetic */ MRZDocument(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
