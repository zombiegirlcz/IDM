package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0086\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;", "", "", "allName", "lastName", "firstName", "previousLastName", "aliasName", "gender", "dateOfBirth", "address", "expireDate", "nameImage", "addressImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentIndividualNumberCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107442c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f107443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f107444h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f107445j;
    public final String k;

    public ICChipReaderJapanCTDocumentIndividualNumberCard(@i(name = "all_name") @NotNull String allName, @i(name = "last_name") String str, @i(name = "first_name") String str2, @i(name = "previous_last_name") String str3, @i(name = "alias_name") String str4, @i(name = "gender") @NotNull String gender, @i(name = "date_of_birth") @NotNull String dateOfBirth, @i(name = "address") @NotNull String address, @i(name = "expire_date") @NotNull String expireDate, @i(name = "name_image") @NotNull String nameImage, @i(name = "address_image") @NotNull String addressImage) {
        Intrinsics.checkNotNullParameter(allName, "allName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(nameImage, "nameImage");
        Intrinsics.checkNotNullParameter(addressImage, "addressImage");
        this.f107440a = allName;
        this.f107441b = str;
        this.f107442c = str2;
        this.d = str3;
        this.e = str4;
        this.f = gender;
        this.f107443g = dateOfBirth;
        this.f107444h = address;
        this.i = expireDate;
        this.f107445j = nameImage;
        this.k = addressImage;
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentIndividualNumberCard copy(@i(name = "all_name") @NotNull String allName, @i(name = "last_name") String lastName, @i(name = "first_name") String firstName, @i(name = "previous_last_name") String previousLastName, @i(name = "alias_name") String aliasName, @i(name = "gender") @NotNull String gender, @i(name = "date_of_birth") @NotNull String dateOfBirth, @i(name = "address") @NotNull String address, @i(name = "expire_date") @NotNull String expireDate, @i(name = "name_image") @NotNull String nameImage, @i(name = "address_image") @NotNull String addressImage) {
        Intrinsics.checkNotNullParameter(allName, "allName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(nameImage, "nameImage");
        Intrinsics.checkNotNullParameter(addressImage, "addressImage");
        return new ICChipReaderJapanCTDocumentIndividualNumberCard(allName, lastName, firstName, previousLastName, aliasName, gender, dateOfBirth, address, expireDate, nameImage, addressImage);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentIndividualNumberCard)) {
            return false;
        }
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard = (ICChipReaderJapanCTDocumentIndividualNumberCard) obj2;
        return Intrinsics.f(this.f107440a, iCChipReaderJapanCTDocumentIndividualNumberCard.f107440a) && Intrinsics.f(this.f107441b, iCChipReaderJapanCTDocumentIndividualNumberCard.f107441b) && Intrinsics.f(this.f107442c, iCChipReaderJapanCTDocumentIndividualNumberCard.f107442c) && Intrinsics.f(this.d, iCChipReaderJapanCTDocumentIndividualNumberCard.d) && Intrinsics.f(this.e, iCChipReaderJapanCTDocumentIndividualNumberCard.e) && Intrinsics.f(this.f, iCChipReaderJapanCTDocumentIndividualNumberCard.f) && Intrinsics.f(this.f107443g, iCChipReaderJapanCTDocumentIndividualNumberCard.f107443g) && Intrinsics.f(this.f107444h, iCChipReaderJapanCTDocumentIndividualNumberCard.f107444h) && Intrinsics.f(this.i, iCChipReaderJapanCTDocumentIndividualNumberCard.i) && Intrinsics.f(this.f107445j, iCChipReaderJapanCTDocumentIndividualNumberCard.f107445j) && Intrinsics.f(this.k, iCChipReaderJapanCTDocumentIndividualNumberCard.k);
    }

    public final int hashCode() {
        int iHashCode = this.f107440a.hashCode() * 31;
        String str = this.f107441b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107442c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.k.hashCode() + w0.a(this.f107445j, w0.a(this.i, w0.a(this.f107444h, w0.a(this.f107443g, w0.a(this.f, (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)))));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDocumentIndividualNumberCard(allName=");
        sb6.append(this.f107440a);
        sb6.append(", lastName=");
        sb6.append(this.f107441b);
        sb6.append(", firstName=");
        sb6.append(this.f107442c);
        sb6.append(", previousLastName=");
        sb6.append(this.d);
        sb6.append(", aliasName=");
        sb6.append(this.e);
        sb6.append(", gender=");
        sb6.append(this.f);
        sb6.append(", dateOfBirth=");
        sb6.append(this.f107443g);
        sb6.append(", address=");
        sb6.append(this.f107444h);
        sb6.append(", expireDate=");
        sb6.append(this.i);
        sb6.append(", nameImage=");
        sb6.append(this.f107445j);
        sb6.append(", addressImage=");
        return a.u(sb6, this.k, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
