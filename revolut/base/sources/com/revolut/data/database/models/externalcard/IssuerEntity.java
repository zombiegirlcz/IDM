package com.revolut.data.database.models.externalcard;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\t\u00109\u001a\u00020\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÂ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0016\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006D"}, d2 = {"Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "", "bin", "", "name", "logoUrl", "colour", "bgColour", "cardType", "cardBrand", "currency", "country", "supported", "", "fee", "", "errorCode", "", "postcodeRequired", "cardSubtype", "feeDisclosure", "binId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBin", "()Ljava/lang/String;", "getName", "getLogoUrl", "getColour", "getBgColour", "getCardType", "getCardBrand", "getCurrency", "getCountry", "getSupported", "()Z", "getFee", "()F", "getErrorCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPostcodeRequired", "getCardSubtype", "getFeeDisclosure", "getBinId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "equals", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IssuerEntity {

    @b("bgColour")
    private final String bgColour;

    @b("bin")
    @NotNull
    private final String bin;

    @b("binId")
    private final String binId;

    @b("cardBrand")
    private final String cardBrand;

    @b("cardSubtype")
    private final String cardSubtype;

    @b("cardType")
    private final String cardType;

    @b("colour")
    private final String colour;

    @b("country")
    @NotNull
    private final String country;

    @b("currency")
    @NotNull
    private final String currency;

    @b("errorCode")
    private final Long errorCode;

    @b("fee")
    private final float fee;

    @b("feeDisclosure")
    private final String feeDisclosure;

    @b("logoUrl")
    private final String logoUrl;

    @b("name")
    private final String name;

    @b("postcodeRequired")
    private final boolean postcodeRequired;

    @b("supported")
    private final boolean supported;

    public IssuerEntity(@NotNull String bin, String str, String str2, String str3, String str4, String str5, String str6, @NotNull String currency, @NotNull String country, boolean z, float f, Long l2, boolean z3, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        this.bin = bin;
        this.name = str;
        this.logoUrl = str2;
        this.colour = str3;
        this.bgColour = str4;
        this.cardType = str5;
        this.cardBrand = str6;
        this.currency = currency;
        this.country = country;
        this.supported = z;
        this.fee = f;
        this.errorCode = l2;
        this.postcodeRequired = z3;
        this.cardSubtype = str7;
        this.feeDisclosure = str8;
        this.binId = str9;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSupported() {
        return this.supported;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPostcodeRequired() {
        return this.postcodeRequired;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCardSubtype() {
        return this.cardSubtype;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFeeDisclosure() {
        return this.feeDisclosure;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBinId() {
        return this.binId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColour() {
        return this.colour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBgColour() {
        return this.bgColour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardBrand() {
        return this.cardBrand;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final IssuerEntity copy(@NotNull String bin, String name, String logoUrl, String colour, String bgColour, String cardType, String cardBrand, @NotNull String currency, @NotNull String country, boolean supported, float fee2, Long errorCode, boolean postcodeRequired, String cardSubtype, String feeDisclosure, String binId) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        return new IssuerEntity(bin, name, logoUrl, colour, bgColour, cardType, cardBrand, currency, country, supported, fee2, errorCode, postcodeRequired, cardSubtype, feeDisclosure, binId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuerEntity)) {
            return false;
        }
        IssuerEntity issuerEntity = (IssuerEntity) other;
        return Intrinsics.f(this.bin, issuerEntity.bin) && Intrinsics.f(this.name, issuerEntity.name) && Intrinsics.f(this.logoUrl, issuerEntity.logoUrl) && Intrinsics.f(this.colour, issuerEntity.colour) && Intrinsics.f(this.bgColour, issuerEntity.bgColour) && Intrinsics.f(this.cardType, issuerEntity.cardType) && Intrinsics.f(this.cardBrand, issuerEntity.cardBrand) && Intrinsics.f(this.currency, issuerEntity.currency) && Intrinsics.f(this.country, issuerEntity.country) && this.supported == issuerEntity.supported && Float.compare(this.fee, issuerEntity.fee) == 0 && Intrinsics.f(this.errorCode, issuerEntity.errorCode) && this.postcodeRequired == issuerEntity.postcodeRequired && Intrinsics.f(this.cardSubtype, issuerEntity.cardSubtype) && Intrinsics.f(this.feeDisclosure, issuerEntity.feeDisclosure) && Intrinsics.f(this.binId, issuerEntity.binId);
    }

    public final String getBgColour() {
        return this.bgColour;
    }

    @NotNull
    public final String getBin() {
        return this.bin;
    }

    public final String getBinId() {
        return this.binId;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardSubtype() {
        return this.cardSubtype;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getColour() {
        return this.colour;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final Long getErrorCode() {
        return this.errorCode;
    }

    public final float getFee() {
        return this.fee;
    }

    public final String getFeeDisclosure() {
        return this.feeDisclosure;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPostcodeRequired() {
        return this.postcodeRequired;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        int iHashCode = this.bin.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.colour;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bgColour;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardBrand;
        int iB = m72.b.b(this.fee, a.c(p.a.c(p.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.currency), 31, this.country), 31, this.supported), 31);
        Long l2 = this.errorCode;
        int iC = a.c((iB + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.postcodeRequired);
        String str7 = this.cardSubtype;
        int iHashCode7 = (iC + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.feeDisclosure;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.binId;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }
}
