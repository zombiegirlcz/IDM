package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001JB«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010>\u001a\u00020\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0017HÆ\u0003JÔ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0016\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006K"}, d2 = {"Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "", "bin", "", "name", "logoUrl", "colour", "bgColour", "cardType", "cardBrand", "currency", "country", "supported", "", "fee", "", "errorCode", "", "postcodeRequired", "cardSubtype", "feeDisclosure", "binId", "outage", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;)V", "getBin", "()Ljava/lang/String;", "getName", "getLogoUrl", "getColour", "getBgColour", "getCardType", "getCardBrand", "getCurrency", "getCountry", "getSupported", "()Z", "getFee", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getErrorCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPostcodeRequired", "getCardSubtype", "getFeeDisclosure", "getBinId", "getOutage", "()Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;)Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "equals", "other", "hashCode", "", "toString", "OutageDto", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IssuerInfoDto {

    @b("bgColour")
    private final String bgColour;

    @b("bin")
    @NotNull
    private final String bin;

    @b("binId")
    private final String binId;

    @b("cardBrand")
    private final String cardBrand;

    @b("cardSubType")
    private final String cardSubtype;

    @b("cardType")
    private final String cardType;

    @b("colour")
    private final String colour;

    @b("country")
    private final String country;

    @b("currency")
    private final String currency;

    @b("errorCode")
    private final Long errorCode;

    @b("fee")
    private final Float fee;

    @b("feeDisclosure")
    private final String feeDisclosure;

    @b("logoUrl")
    private final String logoUrl;

    @b("name")
    private final String name;

    @b("outage")
    private final OutageDto outage;

    @b("postcodeRequired")
    private final boolean postcodeRequired;

    @b("supported")
    private final boolean supported;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;", "", "title", "", "message", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutageDto {

        @b("message")
        @NotNull
        private final String message;

        @b("summary")
        @NotNull
        private final String summary;

        @b("title")
        @NotNull
        private final String title;

        public OutageDto(@NotNull String title, @NotNull String message, @NotNull String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.title = title;
            this.message = message;
            this.summary = summary;
        }

        public static /* synthetic */ OutageDto copy$default(OutageDto outageDto, String str, String str2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = outageDto.title;
            }
            if ((i & 2) != 0) {
                str2 = outageDto.message;
            }
            if ((i & 4) != 0) {
                str3 = outageDto.summary;
            }
            return outageDto.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        @NotNull
        public final OutageDto copy(@NotNull String title, @NotNull String message, @NotNull String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new OutageDto(title, message, summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutageDto)) {
                return false;
            }
            OutageDto outageDto = (OutageDto) other;
            return Intrinsics.f(this.title, outageDto.title) && Intrinsics.f(this.message, outageDto.message) && Intrinsics.f(this.summary, outageDto.summary);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getSummary() {
            return this.summary;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.summary.hashCode() + a.c(this.title.hashCode() * 31, 31, this.message);
        }
    }

    public IssuerInfoDto(@NotNull String bin, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, Float f, Long l2, boolean z3, String str9, String str10, String str11, OutageDto outageDto) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        this.bin = bin;
        this.name = str;
        this.logoUrl = str2;
        this.colour = str3;
        this.bgColour = str4;
        this.cardType = str5;
        this.cardBrand = str6;
        this.currency = str7;
        this.country = str8;
        this.supported = z;
        this.fee = f;
        this.errorCode = l2;
        this.postcodeRequired = z3;
        this.cardSubtype = str9;
        this.feeDisclosure = str10;
        this.binId = str11;
        this.outage = outageDto;
    }

    public static /* synthetic */ IssuerInfoDto copy$default(IssuerInfoDto issuerInfoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, Float f, Long l2, boolean z3, String str10, String str11, String str12, OutageDto outageDto, int i, Object obj2) {
        OutageDto outageDto2;
        String str13;
        String str14;
        IssuerInfoDto issuerInfoDto2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        boolean z4;
        Float f4;
        Long l3;
        boolean z6;
        String str24;
        String str25 = (i & 1) != 0 ? issuerInfoDto.bin : str;
        String str26 = (i & 2) != 0 ? issuerInfoDto.name : str2;
        String str27 = (i & 4) != 0 ? issuerInfoDto.logoUrl : str3;
        String str28 = (i & 8) != 0 ? issuerInfoDto.colour : str4;
        String str29 = (i & 16) != 0 ? issuerInfoDto.bgColour : str5;
        String str30 = (i & 32) != 0 ? issuerInfoDto.cardType : str6;
        String str31 = (i & 64) != 0 ? issuerInfoDto.cardBrand : str7;
        String str32 = (i & 128) != 0 ? issuerInfoDto.currency : str8;
        String str33 = (i & 256) != 0 ? issuerInfoDto.country : str9;
        boolean z11 = (i & 512) != 0 ? issuerInfoDto.supported : z;
        Float f5 = (i & 1024) != 0 ? issuerInfoDto.fee : f;
        Long l4 = (i & 2048) != 0 ? issuerInfoDto.errorCode : l2;
        boolean z12 = (i & 4096) != 0 ? issuerInfoDto.postcodeRequired : z3;
        String str34 = (i & 8192) != 0 ? issuerInfoDto.cardSubtype : str10;
        String str35 = str25;
        String str36 = (i & 16384) != 0 ? issuerInfoDto.feeDisclosure : str11;
        String str37 = (i & 32768) != 0 ? issuerInfoDto.binId : str12;
        if ((i & 65536) != 0) {
            str13 = str37;
            outageDto2 = issuerInfoDto.outage;
            str15 = str36;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            z4 = z11;
            f4 = f5;
            l3 = l4;
            z6 = z12;
            str24 = str34;
            str14 = str35;
            issuerInfoDto2 = issuerInfoDto;
        } else {
            outageDto2 = outageDto;
            str13 = str37;
            str14 = str35;
            issuerInfoDto2 = issuerInfoDto;
            str15 = str36;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            z4 = z11;
            f4 = f5;
            l3 = l4;
            z6 = z12;
            str24 = str34;
        }
        return issuerInfoDto2.copy(str14, str16, str17, str18, str19, str20, str21, str22, str23, z4, f4, l3, z6, str24, str15, str13, outageDto2);
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
    public final Float getFee() {
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

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final OutageDto getOutage() {
        return this.outage;
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

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final IssuerInfoDto copy(@NotNull String bin, String name, String logoUrl, String colour, String bgColour, String cardType, String cardBrand, String currency, String country, boolean supported, Float fee2, Long errorCode, boolean postcodeRequired, String cardSubtype, String feeDisclosure, String binId, OutageDto outage) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        return new IssuerInfoDto(bin, name, logoUrl, colour, bgColour, cardType, cardBrand, currency, country, supported, fee2, errorCode, postcodeRequired, cardSubtype, feeDisclosure, binId, outage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuerInfoDto)) {
            return false;
        }
        IssuerInfoDto issuerInfoDto = (IssuerInfoDto) other;
        return Intrinsics.f(this.bin, issuerInfoDto.bin) && Intrinsics.f(this.name, issuerInfoDto.name) && Intrinsics.f(this.logoUrl, issuerInfoDto.logoUrl) && Intrinsics.f(this.colour, issuerInfoDto.colour) && Intrinsics.f(this.bgColour, issuerInfoDto.bgColour) && Intrinsics.f(this.cardType, issuerInfoDto.cardType) && Intrinsics.f(this.cardBrand, issuerInfoDto.cardBrand) && Intrinsics.f(this.currency, issuerInfoDto.currency) && Intrinsics.f(this.country, issuerInfoDto.country) && this.supported == issuerInfoDto.supported && Intrinsics.f(this.fee, issuerInfoDto.fee) && Intrinsics.f(this.errorCode, issuerInfoDto.errorCode) && this.postcodeRequired == issuerInfoDto.postcodeRequired && Intrinsics.f(this.cardSubtype, issuerInfoDto.cardSubtype) && Intrinsics.f(this.feeDisclosure, issuerInfoDto.feeDisclosure) && Intrinsics.f(this.binId, issuerInfoDto.binId) && Intrinsics.f(this.outage, issuerInfoDto.outage);
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

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getErrorCode() {
        return this.errorCode;
    }

    public final Float getFee() {
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

    public final OutageDto getOutage() {
        return this.outage;
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
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int iC = j6.a.c((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.supported);
        Float f = this.fee;
        int iHashCode9 = (iC + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.errorCode;
        int iC2 = j6.a.c((iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.postcodeRequired);
        String str9 = this.cardSubtype;
        int iHashCode10 = (iC2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.feeDisclosure;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.binId;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        OutageDto outageDto = this.outage;
        return iHashCode12 + (outageDto != null ? outageDto.hashCode() : 0);
    }
}
