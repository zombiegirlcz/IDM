package com.revolut.data.network.models.externalcards;

import a0.d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:\u0001|B¯\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010)J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010)J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010)J\u0010\u0010;\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010)J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010)J\u0010\u0010?\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b?\u00102J\u0010\u0010@\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010)J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010)J\u0010\u0010D\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bG\u0010<J\u0010\u0010H\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bH\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010)J\u0012\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010)JÎ\u0002\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bQ\u0010AJ\u001a\u0010T\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bX\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bY\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bZ\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\b[\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b]\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\b_\u00102R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\b`\u00102R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\ba\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bc\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bd\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010e\u001a\u0004\bf\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bg\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\bi\u0010<R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bj\u0010)R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bk\u0010)R\u001a\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\bl\u00102R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010m\u001a\u0004\bn\u0010AR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010V\u001a\u0004\bo\u0010)R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010V\u001a\u0004\bp\u0010)R\u001a\u0010\u001d\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010h\u001a\u0004\bq\u0010<R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010r\u001a\u0004\bs\u0010FR\u001a\u0010\u001f\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010h\u001a\u0004\bt\u0010<R\u001a\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\bu\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010V\u001a\u0004\bv\u0010)R\u001c\u0010\"\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010w\u001a\u0004\bx\u0010KR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010y\u001a\u0004\bz\u0010MR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010V\u001a\u0004\b{\u0010)¨\u0006}"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExternalCardDto;", "Ljava/io/Serializable;", "", "id", "ownerId", "cardToken", "lastFour", "brand", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "expiryDate", "", "expired", "blocked", "requireCvvCheck", "Lno3/b;", "address", "postcode", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "issuer", "issuerLogo", "", "updatedDate", "issuerName", "currency", "confirmed", "", "confirmationAttempts", "autoTopUpType", "label", "lastUsedDate", "topupLimit", "currentTopup", "creditRepayment", "cardholderVerificationStatus", "shouldAskForCvv", "Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;", "restrictions", "crossProfileStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;ZZZLno3/b;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;JZLjava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "component7", "()Z", "component8", "component9", "component10", "()Lno3/b;", "component11", "component12", "()Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "component13", "component14", "()J", "component15", "component16", "component17", "component18", "()I", "component19", "component20", "component21", "component22", "()Ljava/lang/Long;", "component23", "component24", "component25", "component26", "()Ljava/lang/Boolean;", "component27", "()Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;ZZZLno3/b;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;JZLjava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;Ljava/lang/String;)Lcom/revolut/data/network/models/externalcards/ExternalCardDto;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getOwnerId", "getCardToken", "getLastFour", "getBrand", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "getExpiryDate", "Z", "getExpired", "getBlocked", "getRequireCvvCheck", "Lno3/b;", "getAddress", "getPostcode", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "getIssuer", "getIssuerLogo", "J", "getUpdatedDate", "getIssuerName", "getCurrency", "getConfirmed", "I", "getConfirmationAttempts", "getAutoTopUpType", "getLabel", "getLastUsedDate", "Ljava/lang/Long;", "getTopupLimit", "getCurrentTopup", "getCreditRepayment", "getCardholderVerificationStatus", "Ljava/lang/Boolean;", "getShouldAskForCvv", "Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;", "getRestrictions", "getCrossProfileStatus", "RestrictionsDto", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCardDto implements Serializable {

    @b("address")
    private final no3.b address;

    @b("autoTopup")
    private final String autoTopUpType;

    @b("blocked")
    private final boolean blocked;

    @b("brand")
    private final String brand;

    @b("cardToken")
    private final String cardToken;

    @b("cardholderVerificationStatus")
    private final String cardholderVerificationStatus;

    @b("confirmationAttempts")
    private final int confirmationAttempts;

    @b("confirmed")
    private final boolean confirmed;

    @b("creditRepayment")
    private final boolean creditRepayment;

    @b("crossProfileStatus")
    private final String crossProfileStatus;

    @b("currency")
    private final String currency;

    @b("currentTopup")
    private final long currentTopup;

    @b("expired")
    private final boolean expired;

    @b("expiryDate")
    private final ExpiryMonthYearDto expiryDate;

    @b("id")
    private final String id;

    @b("issuer")
    private final IssuerInfoDto issuer;

    @b("issuerLogo")
    private final String issuerLogo;

    @b("issuerName")
    private final String issuerName;

    @b("label")
    private final String label;

    @b("lastFour")
    private final String lastFour;

    @b("lastUsedDate")
    private final long lastUsedDate;

    @b("ownerId")
    private final String ownerId;

    @b("postcode")
    private final String postcode;

    @b("requireCvvCheck")
    private final boolean requireCvvCheck;

    @b("restrictions")
    private final RestrictionsDto restrictions;

    @b("shouldAskForCvv")
    private final Boolean shouldAskForCvv;

    @b("topupLimit")
    private final Long topupLimit;

    @b("updatedDate")
    private final long updatedDate;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;", "Ljava/io/Serializable;", "statusTitle", "", "summary", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatusTitle", "()Ljava/lang/String;", "getSummary", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictionsDto implements Serializable {

        @b("cardMessage")
        @NotNull
        private final String message;

        @b("title")
        @NotNull
        private final String statusTitle;

        @b("cardSummary")
        @NotNull
        private final String summary;

        public RestrictionsDto(@NotNull String statusTitle, @NotNull String summary, @NotNull String message) {
            Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(message, "message");
            this.statusTitle = statusTitle;
            this.summary = summary;
            this.message = message;
        }

        public static /* synthetic */ RestrictionsDto copy$default(RestrictionsDto restrictionsDto, String str, String str2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = restrictionsDto.statusTitle;
            }
            if ((i & 2) != 0) {
                str2 = restrictionsDto.summary;
            }
            if ((i & 4) != 0) {
                str3 = restrictionsDto.message;
            }
            return restrictionsDto.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatusTitle() {
            return this.statusTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final RestrictionsDto copy(@NotNull String statusTitle, @NotNull String summary, @NotNull String message) {
            Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(message, "message");
            return new RestrictionsDto(statusTitle, summary, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestrictionsDto)) {
                return false;
            }
            RestrictionsDto restrictionsDto = (RestrictionsDto) other;
            return Intrinsics.f(this.statusTitle, restrictionsDto.statusTitle) && Intrinsics.f(this.summary, restrictionsDto.summary) && Intrinsics.f(this.message, restrictionsDto.message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getStatusTitle() {
            return this.statusTitle;
        }

        @NotNull
        public final String getSummary() {
            return this.summary;
        }

        public int hashCode() {
            return this.message.hashCode() + a.c(this.statusTitle.hashCode() * 31, 31, this.summary);
        }
    }

    public ExternalCardDto(String str, String str2, String str3, String str4, String str5, ExpiryMonthYearDto expiryMonthYearDto, boolean z, boolean z3, boolean z4, no3.b bVar, String str6, IssuerInfoDto issuerInfoDto, String str7, long j2, String str8, String str9, boolean z6, int i, String str10, String str11, long j3, Long l2, long j5, boolean z11, String str12, Boolean bool, RestrictionsDto restrictionsDto, String str13) {
        this.id = str;
        this.ownerId = str2;
        this.cardToken = str3;
        this.lastFour = str4;
        this.brand = str5;
        this.expiryDate = expiryMonthYearDto;
        this.expired = z;
        this.blocked = z3;
        this.requireCvvCheck = z4;
        this.address = bVar;
        this.postcode = str6;
        this.issuer = issuerInfoDto;
        this.issuerLogo = str7;
        this.updatedDate = j2;
        this.issuerName = str8;
        this.currency = str9;
        this.confirmed = z6;
        this.confirmationAttempts = i;
        this.autoTopUpType = str10;
        this.label = str11;
        this.lastUsedDate = j3;
        this.topupLimit = l2;
        this.currentTopup = j5;
        this.creditRepayment = z11;
        this.cardholderVerificationStatus = str12;
        this.shouldAskForCvv = bool;
        this.restrictions = restrictionsDto;
        this.crossProfileStatus = str13;
    }

    public static /* synthetic */ ExternalCardDto copy$default(ExternalCardDto externalCardDto, String str, String str2, String str3, String str4, String str5, ExpiryMonthYearDto expiryMonthYearDto, boolean z, boolean z3, boolean z4, no3.b bVar, String str6, IssuerInfoDto issuerInfoDto, String str7, long j2, String str8, String str9, boolean z6, int i, String str10, String str11, long j3, Long l2, long j5, boolean z11, String str12, Boolean bool, RestrictionsDto restrictionsDto, String str13, int i2, Object obj2) {
        String str14;
        RestrictionsDto restrictionsDto2;
        String str15 = (i2 & 1) != 0 ? externalCardDto.id : str;
        String str16 = (i2 & 2) != 0 ? externalCardDto.ownerId : str2;
        String str17 = (i2 & 4) != 0 ? externalCardDto.cardToken : str3;
        String str18 = (i2 & 8) != 0 ? externalCardDto.lastFour : str4;
        String str19 = (i2 & 16) != 0 ? externalCardDto.brand : str5;
        ExpiryMonthYearDto expiryMonthYearDto2 = (i2 & 32) != 0 ? externalCardDto.expiryDate : expiryMonthYearDto;
        boolean z12 = (i2 & 64) != 0 ? externalCardDto.expired : z;
        boolean z29 = (i2 & 128) != 0 ? externalCardDto.blocked : z3;
        boolean z31 = (i2 & 256) != 0 ? externalCardDto.requireCvvCheck : z4;
        no3.b bVar2 = (i2 & 512) != 0 ? externalCardDto.address : bVar;
        String str20 = (i2 & 1024) != 0 ? externalCardDto.postcode : str6;
        IssuerInfoDto issuerInfoDto2 = (i2 & 2048) != 0 ? externalCardDto.issuer : issuerInfoDto;
        String str21 = (i2 & 4096) != 0 ? externalCardDto.issuerLogo : str7;
        String str22 = str15;
        String str23 = str16;
        long j16 = (i2 & 8192) != 0 ? externalCardDto.updatedDate : j2;
        String str24 = (i2 & 16384) != 0 ? externalCardDto.issuerName : str8;
        String str25 = (i2 & 32768) != 0 ? externalCardDto.currency : str9;
        boolean z41 = (i2 & 65536) != 0 ? externalCardDto.confirmed : z6;
        int i3 = (i2 & 131072) != 0 ? externalCardDto.confirmationAttempts : i;
        String str26 = (i2 & 262144) != 0 ? externalCardDto.autoTopUpType : str10;
        String str27 = (i2 & 524288) != 0 ? externalCardDto.label : str11;
        long j22 = j16;
        long j42 = (i2 & PKIFailureInfo.badCertTemplate) != 0 ? externalCardDto.lastUsedDate : j3;
        Long l3 = (i2 & PKIFailureInfo.badSenderNonce) != 0 ? externalCardDto.topupLimit : l2;
        long j46 = j42;
        long j47 = (i2 & 4194304) != 0 ? externalCardDto.currentTopup : j5;
        boolean z49 = (i2 & 8388608) != 0 ? externalCardDto.creditRepayment : z11;
        String str28 = (i2 & 16777216) != 0 ? externalCardDto.cardholderVerificationStatus : str12;
        boolean z54 = z49;
        Boolean bool2 = (i2 & 33554432) != 0 ? externalCardDto.shouldAskForCvv : bool;
        RestrictionsDto restrictionsDto3 = (i2 & 67108864) != 0 ? externalCardDto.restrictions : restrictionsDto;
        if ((i2 & 134217728) != 0) {
            restrictionsDto2 = restrictionsDto3;
            str14 = externalCardDto.crossProfileStatus;
        } else {
            str14 = str13;
            restrictionsDto2 = restrictionsDto3;
        }
        return externalCardDto.copy(str22, str23, str17, str18, str19, expiryMonthYearDto2, z12, z29, z31, bVar2, str20, issuerInfoDto2, str21, j22, str24, str25, z41, i3, str26, str27, j46, l3, j47, z54, str28, bool2, restrictionsDto2, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final no3.b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final IssuerInfoDto getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIssuerLogo() {
        return this.issuerLogo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getConfirmationAttempts() {
        return this.confirmationAttempts;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAutoTopUpType() {
        return this.autoTopUpType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getLastUsedDate() {
        return this.lastUsedDate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getTopupLimit() {
        return this.topupLimit;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getCurrentTopup() {
        return this.currentTopup;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getCreditRepayment() {
        return this.creditRepayment;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getCardholderVerificationStatus() {
        return this.cardholderVerificationStatus;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getShouldAskForCvv() {
        return this.shouldAskForCvv;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final RestrictionsDto getRestrictions() {
        return this.restrictions;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getCrossProfileStatus() {
        return this.crossProfileStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardToken() {
        return this.cardToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExpiryMonthYearDto getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRequireCvvCheck() {
        return this.requireCvvCheck;
    }

    @NotNull
    public final ExternalCardDto copy(String id10, String ownerId, String cardToken, String lastFour, String brand, ExpiryMonthYearDto expiryDate, boolean expired, boolean blocked, boolean requireCvvCheck, no3.b address, String postcode, IssuerInfoDto issuer, String issuerLogo, long updatedDate, String issuerName, String currency, boolean confirmed, int confirmationAttempts, String autoTopUpType, String label, long lastUsedDate, Long topupLimit, long currentTopup, boolean creditRepayment, String cardholderVerificationStatus, Boolean shouldAskForCvv, RestrictionsDto restrictions, String crossProfileStatus) {
        return new ExternalCardDto(id10, ownerId, cardToken, lastFour, brand, expiryDate, expired, blocked, requireCvvCheck, address, postcode, issuer, issuerLogo, updatedDate, issuerName, currency, confirmed, confirmationAttempts, autoTopUpType, label, lastUsedDate, topupLimit, currentTopup, creditRepayment, cardholderVerificationStatus, shouldAskForCvv, restrictions, crossProfileStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalCardDto)) {
            return false;
        }
        ExternalCardDto externalCardDto = (ExternalCardDto) other;
        return Intrinsics.f(this.id, externalCardDto.id) && Intrinsics.f(this.ownerId, externalCardDto.ownerId) && Intrinsics.f(this.cardToken, externalCardDto.cardToken) && Intrinsics.f(this.lastFour, externalCardDto.lastFour) && Intrinsics.f(this.brand, externalCardDto.brand) && Intrinsics.f(this.expiryDate, externalCardDto.expiryDate) && this.expired == externalCardDto.expired && this.blocked == externalCardDto.blocked && this.requireCvvCheck == externalCardDto.requireCvvCheck && Intrinsics.f(this.address, externalCardDto.address) && Intrinsics.f(this.postcode, externalCardDto.postcode) && Intrinsics.f(this.issuer, externalCardDto.issuer) && Intrinsics.f(this.issuerLogo, externalCardDto.issuerLogo) && this.updatedDate == externalCardDto.updatedDate && Intrinsics.f(this.issuerName, externalCardDto.issuerName) && Intrinsics.f(this.currency, externalCardDto.currency) && this.confirmed == externalCardDto.confirmed && this.confirmationAttempts == externalCardDto.confirmationAttempts && Intrinsics.f(this.autoTopUpType, externalCardDto.autoTopUpType) && Intrinsics.f(this.label, externalCardDto.label) && this.lastUsedDate == externalCardDto.lastUsedDate && Intrinsics.f(this.topupLimit, externalCardDto.topupLimit) && this.currentTopup == externalCardDto.currentTopup && this.creditRepayment == externalCardDto.creditRepayment && Intrinsics.f(this.cardholderVerificationStatus, externalCardDto.cardholderVerificationStatus) && Intrinsics.f(this.shouldAskForCvv, externalCardDto.shouldAskForCvv) && Intrinsics.f(this.restrictions, externalCardDto.restrictions) && Intrinsics.f(this.crossProfileStatus, externalCardDto.crossProfileStatus);
    }

    public final no3.b getAddress() {
        return this.address;
    }

    public final String getAutoTopUpType() {
        return this.autoTopUpType;
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

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

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final boolean getCreditRepayment() {
        return this.creditRepayment;
    }

    public final String getCrossProfileStatus() {
        return this.crossProfileStatus;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getCurrentTopup() {
        return this.currentTopup;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    public final ExpiryMonthYearDto getExpiryDate() {
        return this.expiryDate;
    }

    public final String getId() {
        return this.id;
    }

    public final IssuerInfoDto getIssuer() {
        return this.issuer;
    }

    public final String getIssuerLogo() {
        return this.issuerLogo;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final long getLastUsedDate() {
        return this.lastUsedDate;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean getRequireCvvCheck() {
        return this.requireCvvCheck;
    }

    public final RestrictionsDto getRestrictions() {
        return this.restrictions;
    }

    public final Boolean getShouldAskForCvv() {
        return this.shouldAskForCvv;
    }

    public final Long getTopupLimit() {
        return this.topupLimit;
    }

    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastFour;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.brand;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ExpiryMonthYearDto expiryMonthYearDto = this.expiryDate;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode5 + (expiryMonthYearDto == null ? 0 : expiryMonthYearDto.hashCode())) * 31, 31, this.expired), 31, this.blocked), 31, this.requireCvvCheck);
        no3.b bVar = this.address;
        int iHashCode6 = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str6 = this.postcode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        IssuerInfoDto issuerInfoDto = this.issuer;
        int iHashCode8 = (iHashCode7 + (issuerInfoDto == null ? 0 : issuerInfoDto.hashCode())) * 31;
        String str7 = this.issuerLogo;
        int iC2 = d.c((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.updatedDate);
        String str8 = this.issuerName;
        int iHashCode9 = (iC2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currency;
        int iB = j6.a.b(this.confirmationAttempts, j6.a.c((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.confirmed), 31);
        String str10 = this.autoTopUpType;
        int iHashCode10 = (iB + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.label;
        int iC3 = d.c((iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.lastUsedDate);
        Long l2 = this.topupLimit;
        int iC4 = j6.a.c(d.c((iC3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.currentTopup), 31, this.creditRepayment);
        String str12 = this.cardholderVerificationStatus;
        int iHashCode11 = (iC4 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.shouldAskForCvv;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        RestrictionsDto restrictionsDto = this.restrictions;
        int iHashCode13 = (iHashCode12 + (restrictionsDto == null ? 0 : restrictionsDto.hashCode())) * 31;
        String str13 = this.crossProfileStatus;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ExternalCardDto(");
        a10.b.z(sb6, "id=", this.id, ", ");
        a10.b.z(sb6, "ownerId=", this.ownerId, ", ");
        a10.b.z(sb6, "cardToken=", this.cardToken, ", ");
        if (this.lastFour != null) {
            sb6.append("lastFour=****, ");
        }
        a10.b.z(sb6, "brand=", this.brand, ", ");
        if (this.expiryDate != null) {
            sb6.append("expiryDate=**, ");
        }
        sb6.append("expired=" + this.expired + ", ");
        sb6.append("blocked=" + this.blocked + ", ");
        sb6.append("requireCvvCheck=" + this.requireCvvCheck + ", ");
        a10.b.z(sb6, "address=", ExternalCardDtoKt.toDebugString(this.address), ", ");
        a10.b.z(sb6, "postcode=", this.postcode, ", ");
        a10.b.z(sb6, "issuer=", ExternalCardDtoKt.toDebugString(this.issuer), ", ");
        a10.b.z(sb6, "issuerLogo=", this.issuerLogo, ", ");
        sb6.append("updatedDate=" + this.updatedDate + ", ");
        a10.b.z(sb6, "issuerName=", this.issuerName, ", ");
        a10.b.z(sb6, "currency=", this.currency, ", ");
        sb6.append("confirmed=" + this.confirmed + ", ");
        sb6.append("confirmationAttempts=" + this.confirmationAttempts + ", ");
        a10.b.z(sb6, "autoTopUpType=", this.autoTopUpType, ", ");
        a10.b.z(sb6, "label=", this.label, ", ");
        sb6.append("lastUsedDate=" + this.lastUsedDate + ", ");
        sb6.append("topupLimit=" + this.topupLimit + ", ");
        sb6.append("currentTopup=" + this.currentTopup + ", ");
        sb6.append("creditRepayment=" + this.creditRepayment + ", ");
        a10.b.z(sb6, "cardholderVerificationStatus=", this.cardholderVerificationStatus, ", ");
        sb6.append("shouldAskForCvv=" + this.shouldAskForCvv + ", ");
        sb6.append("restrictions=" + ExternalCardDtoKt.toDebugString(this.restrictions));
        sb6.append(")");
        return sb6.toString();
    }

    public /* synthetic */ ExternalCardDto(String str, String str2, String str3, String str4, String str5, ExpiryMonthYearDto expiryMonthYearDto, boolean z, boolean z3, boolean z4, no3.b bVar, String str6, IssuerInfoDto issuerInfoDto, String str7, long j2, String str8, String str9, boolean z6, int i, String str10, String str11, long j3, Long l2, long j5, boolean z11, String str12, Boolean bool, RestrictionsDto restrictionsDto, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : expiryMonthYearDto, z, z3, z4, (i2 & 512) != 0 ? null : bVar, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : issuerInfoDto, (i2 & 4096) != 0 ? null : str7, j2, (i2 & 16384) != 0 ? null : str8, (32768 & i2) != 0 ? null : str9, z6, i, (262144 & i2) != 0 ? null : str10, (524288 & i2) != 0 ? null : str11, j3, (2097152 & i2) != 0 ? null : l2, j5, z11, str12, (33554432 & i2) != 0 ? null : bool, restrictionsDto, (i2 & 134217728) != 0 ? null : str13);
    }
}
