package com.revolut.data.database.models.externalcard;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import so3.c;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\b\u0080\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u0010.J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u0010+J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010.J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b:\u00108J\u0010\u0010;\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b;\u00108J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010.J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010$J\u0012\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0098\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bF\u0010+J\u001a\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u0002*\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bN\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bO\u0010$R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bP\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bQ\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bS\u0010+R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bT\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bW\u0010$R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bX\u0010$R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bY\u0010.R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bZ\u0010.R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\b[\u0010+R\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\b\\\u0010.R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\b]\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\b^\u0010$R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\b`\u00108R\u001a\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010_\u001a\u0004\ba\u00108R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010_\u001a\u0004\bb\u00108R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\bc\u00108R\u001a\u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bd\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bf\u0010>R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010g\u001a\u0004\bh\u0010@R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bi\u0010$R\u001c\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010j\u001a\u0004\bk\u0010C¨\u0006l"}, d2 = {"Lcom/revolut/data/database/models/externalcard/ExternalCardEntity;", "", "", "id", "ownerId", "cardToken", "lastFour", "brand", "", "expiryMonth", "expiryYear", "", "expired", "postcode", "currency", "requireCvvCheck", "confirmed", "confirmationAttempts", "confirmationRequired", "autoTopupType", "label", "", "updateDate", "lastUsedDate", "topUpLimit", "currentTopUp", "creditRepayment", "Lso3/c;", "address", "Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "issuer", "cardholderVerificationStatus", "shouldAskForCvv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;ZZIZLjava/lang/String;Ljava/lang/String;JJJJZLso3/c;Lcom/revolut/data/database/models/externalcard/IssuerEntity;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()J", "component18", "component19", "component20", "component21", "component22", "()Lso3/c;", "component23", "()Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "component24", "component25", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;ZZIZLjava/lang/String;Ljava/lang/String;JJJJZLso3/c;Lcom/revolut/data/database/models/externalcard/IssuerEntity;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revolut/data/database/models/externalcard/ExternalCardEntity;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toStableDebugString", "(Lcom/revolut/data/database/models/externalcard/IssuerEntity;)Ljava/lang/String;", "Ljava/lang/String;", "getId", "getOwnerId", "getCardToken", "getLastFour", "getBrand", "I", "getExpiryMonth", "getExpiryYear", "Z", "getExpired", "getPostcode", "getCurrency", "getRequireCvvCheck", "getConfirmed", "getConfirmationAttempts", "getConfirmationRequired", "getAutoTopupType", "getLabel", "J", "getUpdateDate", "getLastUsedDate", "getTopUpLimit", "getCurrentTopUp", "getCreditRepayment", "Lso3/c;", "getAddress", "Lcom/revolut/data/database/models/externalcard/IssuerEntity;", "getIssuer", "getCardholderVerificationStatus", "Ljava/lang/Boolean;", "getShouldAskForCvv", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCardEntity {

    @b("address")
    private final c address;

    @b("autoTopupType")
    @NotNull
    private final String autoTopupType;

    @b("brand")
    @NotNull
    private final String brand;

    @b("cardToken")
    private final String cardToken;

    @b("cardholderVerificationStatus")
    private final String cardholderVerificationStatus;

    @b("confirmationAttempts")
    private final int confirmationAttempts;

    @b("confirmationRequired")
    private final boolean confirmationRequired;

    @b("confirmed")
    private final boolean confirmed;

    @b("creditRepayment")
    private final boolean creditRepayment;

    @b("currency")
    @NotNull
    private final String currency;

    @b("currentTopUp")
    private final long currentTopUp;

    @b("expired")
    private final boolean expired;

    @b("expiryMonth")
    private final int expiryMonth;

    @b("expiryYear")
    private final int expiryYear;

    @b("id")
    @NotNull
    private final String id;

    @b("issuer")
    private final IssuerEntity issuer;

    @b("label")
    private final String label;

    @b("lastFour")
    @NotNull
    private final String lastFour;

    @b("lastUsedDate")
    private final long lastUsedDate;

    @b("ownerId")
    @NotNull
    private final String ownerId;

    @b("postcode")
    private final String postcode;

    @b("requireCvvCheck")
    private final boolean requireCvvCheck;

    @b("shouldAskForCvv")
    private final Boolean shouldAskForCvv;

    @b("topUpLimit")
    private final long topUpLimit;

    @b("updateDate")
    private final long updateDate;

    public ExternalCardEntity(@NotNull String id10, @NotNull String ownerId, String str, @NotNull String lastFour, @NotNull String brand, int i, int i2, boolean z, String str2, @NotNull String currency, boolean z3, boolean z4, int i3, boolean z6, @NotNull String autoTopupType, String str3, long j2, long j3, long j5, long j16, boolean z11, c cVar, IssuerEntity issuerEntity, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoTopupType, "autoTopupType");
        this.id = id10;
        this.ownerId = ownerId;
        this.cardToken = str;
        this.lastFour = lastFour;
        this.brand = brand;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.expired = z;
        this.postcode = str2;
        this.currency = currency;
        this.requireCvvCheck = z3;
        this.confirmed = z4;
        this.confirmationAttempts = i3;
        this.confirmationRequired = z6;
        this.autoTopupType = autoTopupType;
        this.label = str3;
        this.updateDate = j2;
        this.lastUsedDate = j3;
        this.topUpLimit = j5;
        this.currentTopUp = j16;
        this.creditRepayment = z11;
        this.address = cVar;
        this.issuer = issuerEntity;
        this.cardholderVerificationStatus = str4;
        this.shouldAskForCvv = bool;
    }

    public static /* synthetic */ ExternalCardEntity copy$default(ExternalCardEntity externalCardEntity, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, String str6, String str7, boolean z3, boolean z4, int i3, boolean z6, String str8, String str9, long j2, long j3, long j5, long j16, boolean z11, c cVar, IssuerEntity issuerEntity, String str10, Boolean bool, int i5, Object obj2) {
        Boolean bool2;
        String str11;
        String str12 = (i5 & 1) != 0 ? externalCardEntity.id : str;
        String str13 = (i5 & 2) != 0 ? externalCardEntity.ownerId : str2;
        String str14 = (i5 & 4) != 0 ? externalCardEntity.cardToken : str3;
        String str15 = (i5 & 8) != 0 ? externalCardEntity.lastFour : str4;
        String str16 = (i5 & 16) != 0 ? externalCardEntity.brand : str5;
        int i6 = (i5 & 32) != 0 ? externalCardEntity.expiryMonth : i;
        int i21 = (i5 & 64) != 0 ? externalCardEntity.expiryYear : i2;
        boolean z12 = (i5 & 128) != 0 ? externalCardEntity.expired : z;
        String str17 = (i5 & 256) != 0 ? externalCardEntity.postcode : str6;
        String str18 = (i5 & 512) != 0 ? externalCardEntity.currency : str7;
        boolean z29 = (i5 & 1024) != 0 ? externalCardEntity.requireCvvCheck : z3;
        boolean z31 = (i5 & 2048) != 0 ? externalCardEntity.confirmed : z4;
        int i22 = (i5 & 4096) != 0 ? externalCardEntity.confirmationAttempts : i3;
        boolean z41 = (i5 & 8192) != 0 ? externalCardEntity.confirmationRequired : z6;
        String str19 = str12;
        String str20 = (i5 & 16384) != 0 ? externalCardEntity.autoTopupType : str8;
        String str21 = (i5 & 32768) != 0 ? externalCardEntity.label : str9;
        String str22 = str20;
        long j22 = (i5 & 65536) != 0 ? externalCardEntity.updateDate : j2;
        long j42 = (i5 & 131072) != 0 ? externalCardEntity.lastUsedDate : j3;
        long j46 = (i5 & 262144) != 0 ? externalCardEntity.topUpLimit : j5;
        long j47 = (i5 & 524288) != 0 ? externalCardEntity.currentTopUp : j16;
        boolean z49 = (i5 & PKIFailureInfo.badCertTemplate) != 0 ? externalCardEntity.creditRepayment : z11;
        c cVar2 = (i5 & PKIFailureInfo.badSenderNonce) != 0 ? externalCardEntity.address : cVar;
        boolean z54 = z49;
        IssuerEntity issuerEntity2 = (i5 & 4194304) != 0 ? externalCardEntity.issuer : issuerEntity;
        String str23 = (i5 & 8388608) != 0 ? externalCardEntity.cardholderVerificationStatus : str10;
        if ((i5 & 16777216) != 0) {
            str11 = str23;
            bool2 = externalCardEntity.shouldAskForCvv;
        } else {
            bool2 = bool;
            str11 = str23;
        }
        return externalCardEntity.copy(str19, str13, str14, str15, str16, i6, i21, z12, str17, str18, z29, z31, i22, z41, str22, str21, j22, j42, j46, j47, z54, cVar2, issuerEntity2, str11, bool2);
    }

    private final String toStableDebugString(IssuerEntity issuerEntity) {
        if (issuerEntity == null) {
            return "null";
        }
        String bin = issuerEntity.getBin();
        String name = issuerEntity.getName();
        String logoUrl = issuerEntity.getLogoUrl();
        String colour = issuerEntity.getColour();
        String bgColour = issuerEntity.getBgColour();
        String cardType = issuerEntity.getCardType();
        String cardBrand = issuerEntity.getCardBrand();
        String currency = issuerEntity.getCurrency();
        String country = issuerEntity.getCountry();
        boolean supported = issuerEntity.getSupported();
        float fee2 = issuerEntity.getFee();
        Long errorCode = issuerEntity.getErrorCode();
        boolean postcodeRequired = issuerEntity.getPostcodeRequired();
        String cardSubtype = issuerEntity.getCardSubtype();
        String feeDisclosure = issuerEntity.getFeeDisclosure();
        String binId = issuerEntity.getBinId();
        StringBuilder sbM = a.m("IssuerEntity(bin=", bin, ", name=", name, ", logoUrl=");
        j6.a.D(sbM, logoUrl, ", colour=", colour, ", bgColour=");
        j6.a.D(sbM, bgColour, ", cardType=", cardType, ", cardBrand=");
        j6.a.D(sbM, cardBrand, ", currency=", currency, ", country=");
        sbM.append(country);
        sbM.append(", supported=");
        sbM.append(supported);
        sbM.append(", fee=");
        sbM.append(fee2);
        sbM.append(", errorCode=");
        sbM.append(errorCode);
        sbM.append(", postcodeRequired=");
        sbM.append(postcodeRequired);
        sbM.append(", cardSubtype=");
        sbM.append(cardSubtype);
        sbM.append(", feeDisclosure=");
        return j6.a.w(sbM, feeDisclosure, ", binId=", binId, ")");
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRequireCvvCheck() {
        return this.requireCvvCheck;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getConfirmationAttempts() {
        return this.confirmationAttempts;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAutoTopupType() {
        return this.autoTopupType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getUpdateDate() {
        return this.updateDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getLastUsedDate() {
        return this.lastUsedDate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getTopUpLimit() {
        return this.topUpLimit;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getCurrentTopUp() {
        return this.currentTopUp;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getCreditRepayment() {
        return this.creditRepayment;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final c getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final IssuerEntity getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getCardholderVerificationStatus() {
        return this.cardholderVerificationStatus;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getShouldAskForCvv() {
        return this.shouldAskForCvv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardToken() {
        return this.cardToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    public final ExternalCardEntity copy(@NotNull String id10, @NotNull String ownerId, String cardToken, @NotNull String lastFour, @NotNull String brand, int expiryMonth, int expiryYear, boolean expired, String postcode, @NotNull String currency, boolean requireCvvCheck, boolean confirmed, int confirmationAttempts, boolean confirmationRequired, @NotNull String autoTopupType, String label, long updateDate, long lastUsedDate, long topUpLimit, long currentTopUp, boolean creditRepayment, c address, IssuerEntity issuer, String cardholderVerificationStatus, Boolean shouldAskForCvv) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoTopupType, "autoTopupType");
        return new ExternalCardEntity(id10, ownerId, cardToken, lastFour, brand, expiryMonth, expiryYear, expired, postcode, currency, requireCvvCheck, confirmed, confirmationAttempts, confirmationRequired, autoTopupType, label, updateDate, lastUsedDate, topUpLimit, currentTopUp, creditRepayment, address, issuer, cardholderVerificationStatus, shouldAskForCvv);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalCardEntity)) {
            return false;
        }
        ExternalCardEntity externalCardEntity = (ExternalCardEntity) other;
        return Intrinsics.f(this.id, externalCardEntity.id) && Intrinsics.f(this.ownerId, externalCardEntity.ownerId) && Intrinsics.f(this.cardToken, externalCardEntity.cardToken) && Intrinsics.f(this.lastFour, externalCardEntity.lastFour) && Intrinsics.f(this.brand, externalCardEntity.brand) && this.expiryMonth == externalCardEntity.expiryMonth && this.expiryYear == externalCardEntity.expiryYear && this.expired == externalCardEntity.expired && Intrinsics.f(this.postcode, externalCardEntity.postcode) && Intrinsics.f(this.currency, externalCardEntity.currency) && this.requireCvvCheck == externalCardEntity.requireCvvCheck && this.confirmed == externalCardEntity.confirmed && this.confirmationAttempts == externalCardEntity.confirmationAttempts && this.confirmationRequired == externalCardEntity.confirmationRequired && Intrinsics.f(this.autoTopupType, externalCardEntity.autoTopupType) && Intrinsics.f(this.label, externalCardEntity.label) && this.updateDate == externalCardEntity.updateDate && this.lastUsedDate == externalCardEntity.lastUsedDate && this.topUpLimit == externalCardEntity.topUpLimit && this.currentTopUp == externalCardEntity.currentTopUp && this.creditRepayment == externalCardEntity.creditRepayment && Intrinsics.f(this.address, externalCardEntity.address) && Intrinsics.f(this.issuer, externalCardEntity.issuer) && Intrinsics.f(this.cardholderVerificationStatus, externalCardEntity.cardholderVerificationStatus) && Intrinsics.f(this.shouldAskForCvv, externalCardEntity.shouldAskForCvv);
    }

    public final c getAddress() {
        return this.address;
    }

    @NotNull
    public final String getAutoTopupType() {
        return this.autoTopupType;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final String getCardholderVerificationStatus() {
        return this.cardholderVerificationStatus;
    }

    public final int getConfirmationAttempts() {
        return this.confirmationAttempts;
    }

    public final boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final boolean getCreditRepayment() {
        return this.creditRepayment;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final long getCurrentTopUp() {
        return this.currentTopUp;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final IssuerEntity getIssuer() {
        return this.issuer;
    }

    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getLastFour() {
        return this.lastFour;
    }

    public final long getLastUsedDate() {
        return this.lastUsedDate;
    }

    @NotNull
    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean getRequireCvvCheck() {
        return this.requireCvvCheck;
    }

    public final Boolean getShouldAskForCvv() {
        return this.shouldAskForCvv;
    }

    public final long getTopUpLimit() {
        return this.topUpLimit;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.ownerId);
        String str = this.cardToken;
        int iC2 = j6.a.c(j6.a.b(this.expiryYear, j6.a.b(this.expiryMonth, p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.lastFour), 31, this.brand), 31), 31), 31, this.expired);
        String str2 = this.postcode;
        int iC3 = p.a.c(j6.a.c(j6.a.b(this.confirmationAttempts, j6.a.c(j6.a.c(p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.currency), 31, this.requireCvvCheck), 31, this.confirmed), 31), 31, this.confirmationRequired), 31, this.autoTopupType);
        String str3 = this.label;
        int iC4 = j6.a.c(d.c(d.c(d.c(d.c((iC3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.updateDate), 31, this.lastUsedDate), 31, this.topUpLimit), 31, this.currentTopUp), 31, this.creditRepayment);
        c cVar = this.address;
        int iHashCode = (iC4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        IssuerEntity issuerEntity = this.issuer;
        int iHashCode2 = (iHashCode + (issuerEntity == null ? 0 : issuerEntity.hashCode())) * 31;
        String str4 = this.cardholderVerificationStatus;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.shouldAskForCvv;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ExternalCardEntity(");
        a10.b.z(sb6, "id=", this.id, ", ");
        a10.b.z(sb6, "ownerId=", this.ownerId, ", ");
        sb6.append("cardToken=" + this.cardToken + ", ");
        sb6.append("lastFour=****, ");
        sb6.append("brand=" + this.brand + ", ");
        sb6.append("expiryMonth=**, expiryYear=**, ");
        sb6.append("expired=" + this.expired + ", ");
        a10.b.z(sb6, "postcode=", this.postcode, ", ");
        a10.b.z(sb6, "currency=", this.currency, ", ");
        sb6.append("requireCvvCheck=" + this.requireCvvCheck + ", ");
        sb6.append("confirmed=" + this.confirmed + ", ");
        sb6.append("confirmationAttempts=" + this.confirmationAttempts + ", ");
        sb6.append("confirmationRequired=" + this.confirmationRequired + ", ");
        a10.b.z(sb6, "autoTopupType=", this.autoTopupType, ", ");
        a10.b.z(sb6, "label=", this.label, ", ");
        sb6.append("updateDate=" + this.updateDate + ", ");
        sb6.append("lastUsedDate=" + this.lastUsedDate + ", ");
        sb6.append("topUpLimit=" + this.topUpLimit + ", ");
        sb6.append("currentTopUp=" + this.currentTopUp + ", ");
        sb6.append("creditRepayment=" + this.creditRepayment + ", ");
        a10.b.z(sb6, "addressType=", this.address != null ? c.class.getSimpleName() : null, ", ");
        a10.b.z(sb6, "issuer=", toStableDebugString(this.issuer), ", ");
        a10.b.z(sb6, "cardholderVerificationStatus=", this.cardholderVerificationStatus, ", ");
        sb6.append("shouldAskForCvv=" + this.shouldAskForCvv);
        sb6.append(")");
        return sb6.toString();
    }

    public /* synthetic */ ExternalCardEntity(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, String str6, String str7, boolean z3, boolean z4, int i3, boolean z6, String str8, String str9, long j2, long j3, long j5, long j16, boolean z11, c cVar, IssuerEntity issuerEntity, String str10, Boolean bool, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i, i2, z, str6, str7, z3, z4, i3, z6, str8, str9, j2, j3, j5, j16, z11, (i5 & PKIFailureInfo.badSenderNonce) != 0 ? null : cVar, (i5 & 4194304) != 0 ? null : issuerEntity, str10, (i5 & 16777216) != 0 ? null : bool);
    }
}
