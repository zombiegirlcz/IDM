package com.revolut.data.network.models.externalcards.mapper;

import com.revolut.data.database.models.externalcard.mapping.ExternalCardEntityTypeMappingKt;
import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import com.revolut.data.network.models.externalcards.VerificationMethodDto;
import com.revolut.domain.models.externalcards.AutoTopUpType;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.externalcards.CrossProfileStatus;
import com.revolut.feature.address.models.Address;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import no3.b;
import oo3.a;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import t61.f;
import t61.g;
import t61.j;
import t61.l;
import t61.m;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExternalCardDto;", "Lt61/g;", "toDomain", "(Lcom/revolut/data/network/models/externalcards/ExternalCardDto;)Lt61/g;", "Lcom/revolut/data/network/models/externalcards/VerificationMethodDto;", "Lt61/m;", "(Lcom/revolut/data/network/models/externalcards/VerificationMethodDto;)Lt61/m;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardDtoMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodDto.Companion.VerificationMethodName.values().length];
            try {
                iArr[VerificationMethodDto.Companion.VerificationMethodName.TRANSACTION_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final g toDomain(@NotNull ExternalCardDto externalCardDto) {
        AutoTopUpType autoTopUpType;
        Long topupLimit;
        CardholderVerificationStatus cardholderVerificationStatusValueOf;
        CardholderVerificationStatus cardholderVerificationStatus;
        CrossProfileStatus crossProfileStatusValueOf;
        CrossProfileStatus crossProfileStatus;
        Intrinsics.checkNotNullParameter(externalCardDto, "<this>");
        String id10 = externalCardDto.getId();
        String str = id10 == null ? "" : id10;
        String ownerId = externalCardDto.getOwnerId();
        String str2 = ownerId == null ? "" : ownerId;
        String cardToken = externalCardDto.getCardToken();
        String lastFour = externalCardDto.getLastFour();
        String str3 = lastFour == null ? "" : lastFour;
        String brand = externalCardDto.getBrand();
        String str4 = brand == null ? "" : brand;
        ExpiryMonthYearDto expiryDate = externalCardDto.getExpiryDate();
        int month = expiryDate != null ? expiryDate.getMonth() : 0;
        ExpiryMonthYearDto expiryDate2 = externalCardDto.getExpiryDate();
        int year = expiryDate2 != null ? expiryDate2.getYear() : 0;
        boolean expired = externalCardDto.getExpired();
        boolean blocked = externalCardDto.getBlocked();
        String currency = externalCardDto.getCurrency();
        String str5 = currency == null ? "" : currency;
        IssuerInfoDto issuer = externalCardDto.getIssuer();
        j domain = issuer != null ? IssuerInfoDtoMapperKt.toDomain(issuer) : null;
        b address = externalCardDto.getAddress();
        Address addressA = address != null ? a.a(address) : o51.a.f222306a;
        String postcode = externalCardDto.getPostcode();
        boolean requireCvvCheck = externalCardDto.getRequireCvvCheck();
        boolean confirmed = externalCardDto.getConfirmed();
        int confirmationAttempts = externalCardDto.getConfirmationAttempts();
        String autoTopUpType2 = externalCardDto.getAutoTopUpType();
        if (autoTopUpType2 == null || (autoTopUpType = (AutoTopUpType) u1.v(autoTopUpType2, ExternalCardEntityTypeMappingKt.getAutoTopUpMapping())) == null) {
            autoTopUpType = AutoTopUpType.UNKNOWN;
        }
        AutoTopUpType autoTopUpType3 = autoTopUpType;
        String label = externalCardDto.getLabel();
        long updatedDate = externalCardDto.getUpdatedDate();
        long lastUsedDate = externalCardDto.getLastUsedDate();
        Long topupLimit2 = externalCardDto.getTopupLimit();
        long jLongValue = -1;
        if ((topupLimit2 == null || topupLimit2.longValue() != -1) && (topupLimit = externalCardDto.getTopupLimit()) != null) {
            jLongValue = topupLimit.longValue();
        }
        long currentTopup = externalCardDto.getCurrentTopup();
        boolean creditRepayment = externalCardDto.getCreditRepayment();
        String cardholderVerificationStatus2 = externalCardDto.getCardholderVerificationStatus();
        if (cardholderVerificationStatus2 != null) {
            try {
                cardholderVerificationStatusValueOf = CardholderVerificationStatus.valueOf(cardholderVerificationStatus2);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
                cardholderVerificationStatusValueOf = null;
            }
            cardholderVerificationStatus = cardholderVerificationStatusValueOf;
        } else {
            cardholderVerificationStatus = null;
        }
        ExternalCardDto.RestrictionsDto restrictions = externalCardDto.getRestrictions();
        f fVar = restrictions != null ? new f(restrictions.getStatusTitle(), restrictions.getSummary(), restrictions.getMessage()) : null;
        String crossProfileStatus2 = externalCardDto.getCrossProfileStatus();
        if (crossProfileStatus2 != null) {
            try {
                crossProfileStatusValueOf = CrossProfileStatus.valueOf(crossProfileStatus2);
            } catch (Exception e2) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(c.ERROR, null, null, e2, h0Var2);
                crossProfileStatusValueOf = null;
            }
            crossProfileStatus = crossProfileStatusValueOf;
        } else {
            crossProfileStatus = null;
        }
        return new g(str, str2, cardToken, str3, str4, month, year, expired, blocked, domain, addressA, postcode, str5, requireCvvCheck, confirmed, confirmationAttempts, autoTopUpType3, label, updatedDate, lastUsedDate, jLongValue, currentTopup, creditRepayment, cardholderVerificationStatus, externalCardDto.getShouldAskForCvv(), fVar, crossProfileStatus);
    }

    @NotNull
    public static final m toDomain(@NotNull VerificationMethodDto verificationMethodDto) {
        Intrinsics.checkNotNullParameter(verificationMethodDto, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[verificationMethodDto.getName().ordinal()] == 1) {
            return new l(verificationMethodDto.getPreferred());
        }
        throw new NoWhenBranchMatchedException();
    }
}
