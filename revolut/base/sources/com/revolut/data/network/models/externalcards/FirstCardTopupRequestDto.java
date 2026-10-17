package com.revolut.data.network.models.externalcards;

import com.revolut.data.network.models.topup.ContextDto;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001d¨\u00064"}, d2 = {"Lcom/revolut/data/network/models/externalcards/FirstCardTopupRequestDto;", "", "Ljo3/a;", "amount", "Lcom/revolut/data/network/models/externalcards/CardDetailsDto;", "cardDetails", "", "postcode", "pocketType", "walletId", "Lcom/revolut/data/network/models/topup/ContextDto;", "context", "expiredCardId", "", "saveCardConsent", "<init>", "(Ljo3/a;Lcom/revolut/data/network/models/externalcards/CardDetailsDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/topup/ContextDto;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljo3/a;", "component2", "()Lcom/revolut/data/network/models/externalcards/CardDetailsDto;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/revolut/data/network/models/topup/ContextDto;", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljo3/a;Lcom/revolut/data/network/models/externalcards/CardDetailsDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/topup/ContextDto;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revolut/data/network/models/externalcards/FirstCardTopupRequestDto;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getAmount", "Lcom/revolut/data/network/models/externalcards/CardDetailsDto;", "getCardDetails", "Ljava/lang/String;", "getPostcode", "getPocketType", "getWalletId", "Lcom/revolut/data/network/models/topup/ContextDto;", "getContext", "getExpiredCardId", "Ljava/lang/Boolean;", "getSaveCardConsent", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FirstCardTopupRequestDto {

    @b("amount")
    @NotNull
    private final a amount;

    @b("cardDetails")
    @NotNull
    private final CardDetailsDto cardDetails;

    @b("context")
    private final ContextDto context;

    @b("expiredCardId")
    private final String expiredCardId;

    @b("pocketType")
    @NotNull
    private final String pocketType;

    @b("postcode")
    private final String postcode;

    @b("saveCardForSubsequent")
    private final Boolean saveCardConsent;

    @b("walletId")
    private final String walletId;

    public FirstCardTopupRequestDto(@NotNull a amount, @NotNull CardDetailsDto cardDetails, String str, @NotNull String pocketType, String str2, ContextDto contextDto, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.amount = amount;
        this.cardDetails = cardDetails;
        this.postcode = str;
        this.pocketType = pocketType;
        this.walletId = str2;
        this.context = contextDto;
        this.expiredCardId = str3;
        this.saveCardConsent = bool;
    }

    public static /* synthetic */ FirstCardTopupRequestDto copy$default(FirstCardTopupRequestDto firstCardTopupRequestDto, a aVar, CardDetailsDto cardDetailsDto, String str, String str2, String str3, ContextDto contextDto, String str4, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = firstCardTopupRequestDto.amount;
        }
        if ((i & 2) != 0) {
            cardDetailsDto = firstCardTopupRequestDto.cardDetails;
        }
        if ((i & 4) != 0) {
            str = firstCardTopupRequestDto.postcode;
        }
        if ((i & 8) != 0) {
            str2 = firstCardTopupRequestDto.pocketType;
        }
        if ((i & 16) != 0) {
            str3 = firstCardTopupRequestDto.walletId;
        }
        if ((i & 32) != 0) {
            contextDto = firstCardTopupRequestDto.context;
        }
        if ((i & 64) != 0) {
            str4 = firstCardTopupRequestDto.expiredCardId;
        }
        if ((i & 128) != 0) {
            bool = firstCardTopupRequestDto.saveCardConsent;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        String str6 = str3;
        ContextDto contextDto2 = contextDto;
        return firstCardTopupRequestDto.copy(aVar, cardDetailsDto, str, str2, str6, contextDto2, str5, bool2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardDetailsDto getCardDetails() {
        return this.cardDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPocketType() {
        return this.pocketType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ContextDto getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpiredCardId() {
        return this.expiredCardId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getSaveCardConsent() {
        return this.saveCardConsent;
    }

    @NotNull
    public final FirstCardTopupRequestDto copy(@NotNull a amount, @NotNull CardDetailsDto cardDetails, String postcode, @NotNull String pocketType, String walletId, ContextDto context, String expiredCardId, Boolean saveCardConsent) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return new FirstCardTopupRequestDto(amount, cardDetails, postcode, pocketType, walletId, context, expiredCardId, saveCardConsent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstCardTopupRequestDto)) {
            return false;
        }
        FirstCardTopupRequestDto firstCardTopupRequestDto = (FirstCardTopupRequestDto) other;
        return Intrinsics.f(this.amount, firstCardTopupRequestDto.amount) && Intrinsics.f(this.cardDetails, firstCardTopupRequestDto.cardDetails) && Intrinsics.f(this.postcode, firstCardTopupRequestDto.postcode) && Intrinsics.f(this.pocketType, firstCardTopupRequestDto.pocketType) && Intrinsics.f(this.walletId, firstCardTopupRequestDto.walletId) && Intrinsics.f(this.context, firstCardTopupRequestDto.context) && Intrinsics.f(this.expiredCardId, firstCardTopupRequestDto.expiredCardId) && Intrinsics.f(this.saveCardConsent, firstCardTopupRequestDto.saveCardConsent);
    }

    @NotNull
    public final a getAmount() {
        return this.amount;
    }

    @NotNull
    public final CardDetailsDto getCardDetails() {
        return this.cardDetails;
    }

    public final ContextDto getContext() {
        return this.context;
    }

    public final String getExpiredCardId() {
        return this.expiredCardId;
    }

    @NotNull
    public final String getPocketType() {
        return this.pocketType;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final Boolean getSaveCardConsent() {
        return this.saveCardConsent;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iHashCode = (this.cardDetails.hashCode() + (this.amount.hashCode() * 31)) * 31;
        String str = this.postcode;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.pocketType);
        String str2 = this.walletId;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContextDto contextDto = this.context;
        int iHashCode3 = (iHashCode2 + (contextDto == null ? 0 : contextDto.hashCode())) * 31;
        String str3 = this.expiredCardId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.saveCardConsent;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
