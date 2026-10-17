package com.revolut.data.network.models.threedstransactions;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002HIB\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¹\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001c¨\u0006J"}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto;", "", "id", "", "date", "", "expires_in", "expiration_period", "payment_system", "Lcom/revolut/data/network/models/threedstransactions/PaymentSystem;", "amount", "currency", "merchant", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSMerchantDto;", "cardholderId", "cardId", "cardholderType", "insufficientFunds", "Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;", "merchantAppUrl", "declineReasons", "", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReason;", "confirmationCta", "multipleDeclineReasonsHeader", "<init>", "(Ljava/lang/String;JJJLcom/revolut/data/network/models/threedstransactions/PaymentSystem;JLjava/lang/String;Lcom/revolut/data/network/models/threedstransactions/ThreeDSMerchantDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDate", "()J", "getExpires_in", "getExpiration_period", "getPayment_system", "()Lcom/revolut/data/network/models/threedstransactions/PaymentSystem;", "getAmount", "getCurrency", "getMerchant", "()Lcom/revolut/data/network/models/threedstransactions/ThreeDSMerchantDto;", "getCardholderId", "getCardId", "getCardholderType", "getInsufficientFunds", "()Lcom/revolut/data/network/models/threedstransactions/InsufficientFundsDto;", "getMerchantAppUrl", "getDeclineReasons", "()Ljava/util/List;", "getConfirmationCta", "getMultipleDeclineReasonsHeader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "DeclineReason", "DeclineReasonSeverity", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDSTransactionDto {

    @b("amount")
    private final long amount;

    @b("card_id")
    @NotNull
    private final String cardId;

    @b("cardholder_id")
    @NotNull
    private final String cardholderId;

    @b("type")
    @NotNull
    private final String cardholderType;

    @b("confirmationCta")
    private final String confirmationCta;

    @b("currency")
    @NotNull
    private final String currency;

    @b("date")
    private final long date;

    @b("declineReasons")
    private final List<DeclineReason> declineReasons;

    @b("expiration_period")
    private final long expiration_period;

    @b("expires_in")
    private final long expires_in;

    @b("id")
    @NotNull
    private final String id;

    @b("insufficientFunds")
    private final InsufficientFundsDto insufficientFunds;

    @b("merchant")
    @NotNull
    private final ThreeDSMerchantDto merchant;

    @b("merchantAppUrl")
    private final String merchantAppUrl;

    @b("multipleDeclineReasonsHeader")
    private final String multipleDeclineReasonsHeader;

    @b("payment_system")
    @NotNull
    private final PaymentSystem payment_system;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReason;", "", "title", "", "description", "severity", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReasonSeverity;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReasonSeverity;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSeverity", "()Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReasonSeverity;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclineReason {

        @b("description")
        @NotNull
        private final String description;

        @b("severity")
        private final DeclineReasonSeverity severity;

        @b("title")
        @NotNull
        private final String title;

        @b("type")
        @NotNull
        private final String type;

        public DeclineReason(@NotNull String title, @NotNull String description, DeclineReasonSeverity declineReasonSeverity, @NotNull String type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.description = description;
            this.severity = declineReasonSeverity;
            this.type = type;
        }

        public static /* synthetic */ DeclineReason copy$default(DeclineReason declineReason, String str, String str2, DeclineReasonSeverity declineReasonSeverity, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = declineReason.title;
            }
            if ((i & 2) != 0) {
                str2 = declineReason.description;
            }
            if ((i & 4) != 0) {
                declineReasonSeverity = declineReason.severity;
            }
            if ((i & 8) != 0) {
                str3 = declineReason.type;
            }
            return declineReason.copy(str, str2, declineReasonSeverity, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DeclineReasonSeverity getSeverity() {
            return this.severity;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final DeclineReason copy(@NotNull String title, @NotNull String description, DeclineReasonSeverity severity, @NotNull String type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(type, "type");
            return new DeclineReason(title, description, severity, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeclineReason)) {
                return false;
            }
            DeclineReason declineReason = (DeclineReason) other;
            return Intrinsics.f(this.title, declineReason.title) && Intrinsics.f(this.description, declineReason.description) && this.severity == declineReason.severity && Intrinsics.f(this.type, declineReason.type);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final DeclineReasonSeverity getSeverity() {
            return this.severity;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iC = a.c(this.title.hashCode() * 31, 31, this.description);
            DeclineReasonSeverity declineReasonSeverity = this.severity;
            return this.type.hashCode() + ((iC + (declineReasonSeverity == null ? 0 : declineReasonSeverity.hashCode())) * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto$DeclineReasonSeverity;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "CRITICAL", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeclineReasonSeverity {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeclineReasonSeverity[] $VALUES;

        @b("WARNING")
        public static final DeclineReasonSeverity WARNING = new DeclineReasonSeverity("WARNING", 0);

        @b("CRITICAL")
        public static final DeclineReasonSeverity CRITICAL = new DeclineReasonSeverity("CRITICAL", 1);

        private static final /* synthetic */ DeclineReasonSeverity[] $values() {
            return new DeclineReasonSeverity[]{WARNING, CRITICAL};
        }

        static {
            DeclineReasonSeverity[] declineReasonSeverityArr$values = $values();
            $VALUES = declineReasonSeverityArr$values;
            $ENTRIES = s.n(declineReasonSeverityArr$values);
        }

        private DeclineReasonSeverity(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static DeclineReasonSeverity valueOf(String str) {
            return (DeclineReasonSeverity) Enum.valueOf(DeclineReasonSeverity.class, str);
        }

        public static DeclineReasonSeverity[] values() {
            return (DeclineReasonSeverity[]) $VALUES.clone();
        }
    }

    public ThreeDSTransactionDto(@NotNull String id10, long j2, long j3, long j5, @NotNull PaymentSystem payment_system, long j16, @NotNull String currency, @NotNull ThreeDSMerchantDto merchant, @NotNull String cardholderId, @NotNull String cardId, @NotNull String cardholderType, InsufficientFundsDto insufficientFundsDto, String str, List<DeclineReason> list, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(payment_system, "payment_system");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardholderType, "cardholderType");
        this.id = id10;
        this.date = j2;
        this.expires_in = j3;
        this.expiration_period = j5;
        this.payment_system = payment_system;
        this.amount = j16;
        this.currency = currency;
        this.merchant = merchant;
        this.cardholderId = cardholderId;
        this.cardId = cardId;
        this.cardholderType = cardholderType;
        this.insufficientFunds = insufficientFundsDto;
        this.merchantAppUrl = str;
        this.declineReasons = list;
        this.confirmationCta = str2;
        this.multipleDeclineReasonsHeader = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCardholderType() {
        return this.cardholderType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InsufficientFundsDto getInsufficientFunds() {
        return this.insufficientFunds;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMerchantAppUrl() {
        return this.merchantAppUrl;
    }

    public final List<DeclineReason> component14() {
        return this.declineReasons;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getConfirmationCta() {
        return this.confirmationCta;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMultipleDeclineReasonsHeader() {
        return this.multipleDeclineReasonsHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpires_in() {
        return this.expires_in;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpiration_period() {
        return this.expiration_period;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentSystem getPayment_system() {
        return this.payment_system;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ThreeDSMerchantDto getMerchant() {
        return this.merchant;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCardholderId() {
        return this.cardholderId;
    }

    @NotNull
    public final ThreeDSTransactionDto copy(@NotNull String id10, long date, long expires_in, long expiration_period, @NotNull PaymentSystem payment_system, long amount, @NotNull String currency, @NotNull ThreeDSMerchantDto merchant, @NotNull String cardholderId, @NotNull String cardId, @NotNull String cardholderType, InsufficientFundsDto insufficientFunds, String merchantAppUrl, List<DeclineReason> declineReasons, String confirmationCta, String multipleDeclineReasonsHeader) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(payment_system, "payment_system");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardholderType, "cardholderType");
        return new ThreeDSTransactionDto(id10, date, expires_in, expiration_period, payment_system, amount, currency, merchant, cardholderId, cardId, cardholderType, insufficientFunds, merchantAppUrl, declineReasons, confirmationCta, multipleDeclineReasonsHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreeDSTransactionDto)) {
            return false;
        }
        ThreeDSTransactionDto threeDSTransactionDto = (ThreeDSTransactionDto) other;
        return Intrinsics.f(this.id, threeDSTransactionDto.id) && this.date == threeDSTransactionDto.date && this.expires_in == threeDSTransactionDto.expires_in && this.expiration_period == threeDSTransactionDto.expiration_period && this.payment_system == threeDSTransactionDto.payment_system && this.amount == threeDSTransactionDto.amount && Intrinsics.f(this.currency, threeDSTransactionDto.currency) && Intrinsics.f(this.merchant, threeDSTransactionDto.merchant) && Intrinsics.f(this.cardholderId, threeDSTransactionDto.cardholderId) && Intrinsics.f(this.cardId, threeDSTransactionDto.cardId) && Intrinsics.f(this.cardholderType, threeDSTransactionDto.cardholderType) && Intrinsics.f(this.insufficientFunds, threeDSTransactionDto.insufficientFunds) && Intrinsics.f(this.merchantAppUrl, threeDSTransactionDto.merchantAppUrl) && Intrinsics.f(this.declineReasons, threeDSTransactionDto.declineReasons) && Intrinsics.f(this.confirmationCta, threeDSTransactionDto.confirmationCta) && Intrinsics.f(this.multipleDeclineReasonsHeader, threeDSTransactionDto.multipleDeclineReasonsHeader);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getCardholderId() {
        return this.cardholderId;
    }

    @NotNull
    public final String getCardholderType() {
        return this.cardholderType;
    }

    public final String getConfirmationCta() {
        return this.confirmationCta;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final long getDate() {
        return this.date;
    }

    public final List<DeclineReason> getDeclineReasons() {
        return this.declineReasons;
    }

    public final long getExpiration_period() {
        return this.expiration_period;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final InsufficientFundsDto getInsufficientFunds() {
        return this.insufficientFunds;
    }

    @NotNull
    public final ThreeDSMerchantDto getMerchant() {
        return this.merchant;
    }

    public final String getMerchantAppUrl() {
        return this.merchantAppUrl;
    }

    public final String getMultipleDeclineReasonsHeader() {
        return this.multipleDeclineReasonsHeader;
    }

    @NotNull
    public final PaymentSystem getPayment_system() {
        return this.payment_system;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c((this.merchant.hashCode() + a.c(d.c((this.payment_system.hashCode() + d.c(d.c(d.c(this.id.hashCode() * 31, 31, this.date), 31, this.expires_in), 31, this.expiration_period)) * 31, 31, this.amount), 31, this.currency)) * 31, 31, this.cardholderId), 31, this.cardId), 31, this.cardholderType);
        InsufficientFundsDto insufficientFundsDto = this.insufficientFunds;
        int iHashCode = (iC + (insufficientFundsDto == null ? 0 : insufficientFundsDto.hashCode())) * 31;
        String str = this.merchantAppUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DeclineReason> list = this.declineReasons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.confirmationCta;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.multipleDeclineReasonsHeader;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
