package com.revolut.data.network.models.threedstransactions.mapper;

import com.revolut.data.network.models.threedstransactions.InsufficientFundsDto;
import com.revolut.data.network.models.threedstransactions.ThreeDSTransactionDto;
import com.revolut.domain.models.transactions.CardholderType;
import com.revolut.domain.models.transactions.DeclineReason;
import com.revolut.domain.models.transactions.DeclineReasonSeverity;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.PaymentSystem;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mo3.a;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00070\u0005\u001a\n\u0010\u0004\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\u0004\u001a\u00020\b*\u00020\tH\u0002\u001a\f\u0010\u0004\u001a\u00020\n*\u00020\u000bH\u0002\u001a\f\u0010\u0004\u001a\u00020\f*\u00020\rH\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"cardholderTypeMap", "", "", "Lcom/revolut/domain/models/transactions/CardholderType;", "toDomain", "", "Lcom/revolut/domain/models/transactions/ThreeDSTransaction;", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto;", "Lcom/revolut/domain/models/transactions/InsufficientFunds;", "Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;", "Lcom/revolut/domain/models/transactions/DeclineReason;", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReason;", "Lcom/revolut/domain/models/transactions/DeclineReasonSeverity;", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReasonSeverity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ThreeDSTransactionMapperKt {

    @NotNull
    private static final Map<String, CardholderType> cardholderTypeMap = r0.k(new Pair("PERSONAL", CardholderType.PERSONAL), new Pair("YOUTH", CardholderType.JUNIOR));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThreeDSTransactionDto.DeclineReasonSeverity.values().length];
            try {
                iArr[ThreeDSTransactionDto.DeclineReasonSeverity.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThreeDSTransactionDto.DeclineReasonSeverity.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<ThreeDSTransaction> toDomain(@NotNull List<ThreeDSTransactionDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ThreeDSTransactionDto> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((ThreeDSTransactionDto) it8.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final ThreeDSTransaction toDomain(@NotNull ThreeDSTransactionDto threeDSTransactionDto) {
        CardholderType cardholderType;
        List arrayList;
        Intrinsics.checkNotNullParameter(threeDSTransactionDto, "<this>");
        String id10 = threeDSTransactionDto.getId();
        long amount = threeDSTransactionDto.getAmount();
        String currency = threeDSTransactionDto.getCurrency();
        long date = threeDSTransactionDto.getDate();
        long expires_in = threeDSTransactionDto.getExpires_in();
        long expiration_period = threeDSTransactionDto.getExpiration_period();
        PaymentSystem paymentSystem = PaymentSystem.values()[threeDSTransactionDto.getPayment_system().ordinal()];
        String logo = threeDSTransactionDto.getMerchant().getLogo();
        String mcc2 = threeDSTransactionDto.getMerchant().getMcc();
        String name = threeDSTransactionDto.getMerchant().getName();
        String category = threeDSTransactionDto.getMerchant().getCategory();
        String cardholderId = threeDSTransactionDto.getCardholderId();
        String cardId = threeDSTransactionDto.getCardId();
        CardholderType cardholderType2 = (CardholderType) u1.t(threeDSTransactionDto.getCardholderType(), CardholderType.PERSONAL, cardholderTypeMap);
        InsufficientFundsDto insufficientFunds = threeDSTransactionDto.getInsufficientFunds();
        InsufficientFunds domain = insufficientFunds != null ? toDomain(insufficientFunds) : null;
        String merchantAppUrl = threeDSTransactionDto.getMerchantAppUrl();
        List<ThreeDSTransactionDto.DeclineReason> declineReasons = threeDSTransactionDto.getDeclineReasons();
        if (declineReasons != null) {
            List<ThreeDSTransactionDto.DeclineReason> list = declineReasons;
            cardholderType = cardholderType2;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((ThreeDSTransactionDto.DeclineReason) it8.next()));
            }
        } else {
            cardholderType = cardholderType2;
            arrayList = f0.f322471a;
        }
        return new ThreeDSTransaction(id10, date, expires_in, expiration_period, paymentSystem, amount, currency, logo, mcc2, category, name, cardholderId, cardId, cardholderType, domain, merchantAppUrl, arrayList, threeDSTransactionDto.getConfirmationCta(), threeDSTransactionDto.getMultipleDeclineReasonsHeader());
    }

    private static final InsufficientFunds toDomain(InsufficientFundsDto insufficientFundsDto) {
        return new InsufficientFunds(a.o(insufficientFundsDto.getTopupAmount()), a.o(insufficientFundsDto.getCurrentBalance()), insufficientFundsDto.getPocketId());
    }

    private static final DeclineReason toDomain(ThreeDSTransactionDto.DeclineReason declineReason) {
        DeclineReasonSeverity domain;
        String title = declineReason.getTitle();
        String description = declineReason.getDescription();
        ThreeDSTransactionDto.DeclineReasonSeverity severity = declineReason.getSeverity();
        if (severity == null || (domain = toDomain(severity)) == null) {
            domain = DeclineReasonSeverity.WARNING;
        }
        return new DeclineReason(title, description, domain, declineReason.getType());
    }

    private static final DeclineReasonSeverity toDomain(ThreeDSTransactionDto.DeclineReasonSeverity declineReasonSeverity) {
        int i = WhenMappings.$EnumSwitchMapping$0[declineReasonSeverity.ordinal()];
        if (i == 1) {
            return DeclineReasonSeverity.WARNING;
        }
        if (i == 2) {
            return DeclineReasonSeverity.CRITICAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
