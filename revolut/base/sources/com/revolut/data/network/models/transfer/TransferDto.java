package com.revolut.data.network.models.transfer;

import gsf.r;
import ibl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto;", "", "<init>", "()V", "amount", "", "getAmount", "()J", "currency", "", "getCurrency", "()Ljava/lang/String;", "TransferDtoId", "TransferDtoPhone", "TransferDtoCode", "TransferDtoRecipientId", "FundingSourceDto", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoCode;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoId;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoPhone;", "Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoRecipientId;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferDto {

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "", "pocketId", "", "portfolioId", "savingsAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPocketId", "()Ljava/lang/String;", "getPortfolioId", "getSavingsAccountId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FundingSourceDto {

        @b("pocketId")
        private final String pocketId;

        @b("portfolioId")
        private final String portfolioId;

        @b("savingsAccountId")
        private final String savingsAccountId;

        public FundingSourceDto() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ FundingSourceDto copy$default(FundingSourceDto fundingSourceDto, String str, String str2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = fundingSourceDto.pocketId;
            }
            if ((i & 2) != 0) {
                str2 = fundingSourceDto.portfolioId;
            }
            if ((i & 4) != 0) {
                str3 = fundingSourceDto.savingsAccountId;
            }
            return fundingSourceDto.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPocketId() {
            return this.pocketId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPortfolioId() {
            return this.portfolioId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        @NotNull
        public final FundingSourceDto copy(String pocketId, String portfolioId, String savingsAccountId) {
            return new FundingSourceDto(pocketId, portfolioId, savingsAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FundingSourceDto)) {
                return false;
            }
            FundingSourceDto fundingSourceDto = (FundingSourceDto) other;
            return Intrinsics.f(this.pocketId, fundingSourceDto.pocketId) && Intrinsics.f(this.portfolioId, fundingSourceDto.portfolioId) && Intrinsics.f(this.savingsAccountId, fundingSourceDto.savingsAccountId);
        }

        public final String getPocketId() {
            return this.pocketId;
        }

        public final String getPortfolioId() {
            return this.portfolioId;
        }

        public final String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        public int hashCode() {
            String str = this.pocketId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.portfolioId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.savingsAccountId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public FundingSourceDto(String str, String str2, String str3) {
            this.pocketId = str;
            this.portfolioId = str2;
            this.savingsAccountId = str3;
        }

        public /* synthetic */ FundingSourceDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoRecipientId;", "Lcom/revolut/data/network/models/transfer/TransferDto;", "amount", "", "currency", "", "fundingSource", "Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "recipientId", "<init>", "(JLjava/lang/String;Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;Ljava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getFundingSource", "()Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "getRecipientId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferDtoRecipientId extends TransferDto {

        @b("amount")
        private final long amount;

        @b("currency")
        @NotNull
        private final String currency;

        @b("fundingSource")
        private final FundingSourceDto fundingSource;

        @b("recipientId")
        @NotNull
        private final String recipientId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferDtoRecipientId(long j2, @NotNull String currency, FundingSourceDto fundingSourceDto, @NotNull String recipientId) {
            super(null);
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(recipientId, "recipientId");
            this.amount = j2;
            this.currency = currency;
            this.fundingSource = fundingSourceDto;
            this.recipientId = recipientId;
        }

        public static /* synthetic */ TransferDtoRecipientId copy$default(TransferDtoRecipientId transferDtoRecipientId, long j2, String str, FundingSourceDto fundingSourceDto, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                j2 = transferDtoRecipientId.amount;
            }
            long j3 = j2;
            if ((i & 2) != 0) {
                str = transferDtoRecipientId.currency;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                fundingSourceDto = transferDtoRecipientId.fundingSource;
            }
            FundingSourceDto fundingSourceDto2 = fundingSourceDto;
            if ((i & 8) != 0) {
                str2 = transferDtoRecipientId.recipientId;
            }
            return transferDtoRecipientId.copy(j3, str3, fundingSourceDto2, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRecipientId() {
            return this.recipientId;
        }

        @NotNull
        public final TransferDtoRecipientId copy(long amount, @NotNull String currency, FundingSourceDto fundingSource, @NotNull String recipientId) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(recipientId, "recipientId");
            return new TransferDtoRecipientId(amount, currency, fundingSource, recipientId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferDtoRecipientId)) {
                return false;
            }
            TransferDtoRecipientId transferDtoRecipientId = (TransferDtoRecipientId) other;
            return this.amount == transferDtoRecipientId.amount && Intrinsics.f(this.currency, transferDtoRecipientId.currency) && Intrinsics.f(this.fundingSource, transferDtoRecipientId.fundingSource) && Intrinsics.f(this.recipientId, transferDtoRecipientId.recipientId);
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        public long getAmount() {
            return this.amount;
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        @NotNull
        public String getCurrency() {
            return this.currency;
        }

        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        @NotNull
        public final String getRecipientId() {
            return this.recipientId;
        }

        public int hashCode() {
            int iC = a.c(Long.hashCode(this.amount) * 31, 31, this.currency);
            FundingSourceDto fundingSourceDto = this.fundingSource;
            return this.recipientId.hashCode() + ((iC + (fundingSourceDto == null ? 0 : fundingSourceDto.hashCode())) * 31);
        }
    }

    public /* synthetic */ TransferDto(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getAmount();

    @NotNull
    public abstract String getCurrency();

    private TransferDto() {
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJr\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001d¨\u00066"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoId;", "Lcom/revolut/data/network/models/transfer/TransferDto;", "", "recipientId", "", "amount", "currency", "comment", "gif", "transferAppSource", "paymentWidgetId", "Libl/d;", "transferReasonEmbedded", "Lgsf/r;", "reasons", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "()Libl/d;", "component9", "()Lgsf/r;", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;)Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoId;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getRecipientId", "J", "getAmount", "getCurrency", "getComment", "getGif", "getTransferAppSource", "getPaymentWidgetId", "Libl/d;", "getTransferReasonEmbedded", "Lgsf/r;", "getReasons", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferDtoId extends TransferDto {

        @b("amount")
        private final long amount;

        @b("userComments")
        @NotNull
        private final String comment;

        @b("currency")
        @NotNull
        private final String currency;

        @b("gif")
        private final String gif;

        @b("paymentWidgetId")
        private final String paymentWidgetId;

        @b("reasons")
        private final r reasons;

        @b("recipient_id")
        @NotNull
        private final String recipientId;

        @b("transferAppSource")
        @NotNull
        private final String transferAppSource;

        @b("reason")
        private final d transferReasonEmbedded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferDtoId(@NotNull String recipientId, long j2, @NotNull String currency, @NotNull String comment, String str, @NotNull String transferAppSource, String str2, d dVar, r rVar) {
            super(null);
            Intrinsics.checkNotNullParameter(recipientId, "recipientId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.recipientId = recipientId;
            this.amount = j2;
            this.currency = currency;
            this.comment = comment;
            this.gif = str;
            this.transferAppSource = transferAppSource;
            this.paymentWidgetId = str2;
            this.transferReasonEmbedded = dVar;
            this.reasons = rVar;
        }

        public static /* synthetic */ TransferDtoId copy$default(TransferDtoId transferDtoId, String str, long j2, String str2, String str3, String str4, String str5, String str6, d dVar, r rVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = transferDtoId.recipientId;
            }
            if ((i & 2) != 0) {
                j2 = transferDtoId.amount;
            }
            if ((i & 4) != 0) {
                str2 = transferDtoId.currency;
            }
            if ((i & 8) != 0) {
                str3 = transferDtoId.comment;
            }
            if ((i & 16) != 0) {
                str4 = transferDtoId.gif;
            }
            if ((i & 32) != 0) {
                str5 = transferDtoId.transferAppSource;
            }
            if ((i & 64) != 0) {
                str6 = transferDtoId.paymentWidgetId;
            }
            if ((i & 128) != 0) {
                dVar = transferDtoId.transferReasonEmbedded;
            }
            if ((i & 256) != 0) {
                rVar = transferDtoId.reasons;
            }
            d dVar2 = dVar;
            r rVar2 = rVar;
            String str7 = str6;
            String str8 = str4;
            String str9 = str2;
            return transferDtoId.copy(str, j2, str9, str3, str8, str5, str7, dVar2, rVar2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRecipientId() {
            return this.recipientId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getGif() {
            return this.gif;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final r getReasons() {
            return this.reasons;
        }

        @NotNull
        public final TransferDtoId copy(@NotNull String recipientId, long amount, @NotNull String currency, @NotNull String comment, String gif2, @NotNull String transferAppSource, String paymentWidgetId, d transferReasonEmbedded, r reasons) {
            Intrinsics.checkNotNullParameter(recipientId, "recipientId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            return new TransferDtoId(recipientId, amount, currency, comment, gif2, transferAppSource, paymentWidgetId, transferReasonEmbedded, reasons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferDtoId)) {
                return false;
            }
            TransferDtoId transferDtoId = (TransferDtoId) other;
            return Intrinsics.f(this.recipientId, transferDtoId.recipientId) && this.amount == transferDtoId.amount && Intrinsics.f(this.currency, transferDtoId.currency) && Intrinsics.f(this.comment, transferDtoId.comment) && Intrinsics.f(this.gif, transferDtoId.gif) && Intrinsics.f(this.transferAppSource, transferDtoId.transferAppSource) && Intrinsics.f(this.paymentWidgetId, transferDtoId.paymentWidgetId) && Intrinsics.f(this.transferReasonEmbedded, transferDtoId.transferReasonEmbedded) && Intrinsics.f(this.reasons, transferDtoId.reasons);
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        public long getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        @NotNull
        public String getCurrency() {
            return this.currency;
        }

        public final String getGif() {
            return this.gif;
        }

        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        public final r getReasons() {
            return this.reasons;
        }

        @NotNull
        public final String getRecipientId() {
            return this.recipientId;
        }

        @NotNull
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        public int hashCode() {
            int iC = a.c(a.c(a0.d.c(this.recipientId.hashCode() * 31, 31, this.amount), 31, this.currency), 31, this.comment);
            String str = this.gif;
            int iC2 = a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.transferAppSource);
            String str2 = this.paymentWidgetId;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            d dVar = this.transferReasonEmbedded;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            r rVar = this.reasons;
            return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
        }

        public /* synthetic */ TransferDtoId(String str, long j2, String str2, String str3, String str4, String str5, String str6, d dVar, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, str2, str3, str4, str5, (i & 64) != 0 ? null : str6, dVar, rVar);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J¢\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bB\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010)¨\u0006G"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoPhone;", "Lcom/revolut/data/network/models/transfer/TransferDto;", "", "recipient", "recipientName", "", "amount", "currency", "comment", "gif", "transferAppSource", "paymentWidgetId", "Libl/d;", "transferReasonEmbedded", "Lgsf/r;", "reasons", "sourceCurrency", "Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "fundingSource", "", "numberOfInstalments", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;Ljava/lang/String;Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "component7", "component8", "component9", "()Libl/d;", "component10", "()Lgsf/r;", "component11", "component12", "()Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "component13", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;Ljava/lang/String;Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;Ljava/lang/Integer;)Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoPhone;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getRecipient", "getRecipientName", "J", "getAmount", "getCurrency", "getComment", "getGif", "getTransferAppSource", "getPaymentWidgetId", "Libl/d;", "getTransferReasonEmbedded", "Lgsf/r;", "getReasons", "getSourceCurrency", "Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "getFundingSource", "Ljava/lang/Integer;", "getNumberOfInstalments", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferDtoPhone extends TransferDto {

        @b("amount")
        private final long amount;

        @b("userComments")
        @NotNull
        private final String comment;

        @b("currency")
        @NotNull
        private final String currency;

        @b("fundingSource")
        private final FundingSourceDto fundingSource;

        @b("gif")
        private final String gif;

        @b("numberOfInstalments")
        private final Integer numberOfInstalments;

        @b("paymentWidgetId")
        private final String paymentWidgetId;

        @b("reasons")
        private final r reasons;

        @b("recipient")
        @NotNull
        private final String recipient;

        @b("recipientName")
        private final String recipientName;

        @b("sourceCurrency")
        private final String sourceCurrency;

        @b("transferAppSource")
        @NotNull
        private final String transferAppSource;

        @b("reason")
        private final d transferReasonEmbedded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferDtoPhone(@NotNull String recipient, String str, long j2, @NotNull String currency, @NotNull String comment, String str2, @NotNull String transferAppSource, String str3, d dVar, r rVar, String str4, FundingSourceDto fundingSourceDto, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.recipient = recipient;
            this.recipientName = str;
            this.amount = j2;
            this.currency = currency;
            this.comment = comment;
            this.gif = str2;
            this.transferAppSource = transferAppSource;
            this.paymentWidgetId = str3;
            this.transferReasonEmbedded = dVar;
            this.reasons = rVar;
            this.sourceCurrency = str4;
            this.fundingSource = fundingSourceDto;
            this.numberOfInstalments = num;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRecipient() {
            return this.recipient;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final r getReasons() {
            return this.reasons;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getSourceCurrency() {
            return this.sourceCurrency;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getNumberOfInstalments() {
            return this.numberOfInstalments;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRecipientName() {
            return this.recipientName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getGif() {
            return this.gif;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        @NotNull
        public final TransferDtoPhone copy(@NotNull String recipient, String recipientName, long amount, @NotNull String currency, @NotNull String comment, String gif2, @NotNull String transferAppSource, String paymentWidgetId, d transferReasonEmbedded, r reasons, String sourceCurrency, FundingSourceDto fundingSource, Integer numberOfInstalments) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            return new TransferDtoPhone(recipient, recipientName, amount, currency, comment, gif2, transferAppSource, paymentWidgetId, transferReasonEmbedded, reasons, sourceCurrency, fundingSource, numberOfInstalments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferDtoPhone)) {
                return false;
            }
            TransferDtoPhone transferDtoPhone = (TransferDtoPhone) other;
            return Intrinsics.f(this.recipient, transferDtoPhone.recipient) && Intrinsics.f(this.recipientName, transferDtoPhone.recipientName) && this.amount == transferDtoPhone.amount && Intrinsics.f(this.currency, transferDtoPhone.currency) && Intrinsics.f(this.comment, transferDtoPhone.comment) && Intrinsics.f(this.gif, transferDtoPhone.gif) && Intrinsics.f(this.transferAppSource, transferDtoPhone.transferAppSource) && Intrinsics.f(this.paymentWidgetId, transferDtoPhone.paymentWidgetId) && Intrinsics.f(this.transferReasonEmbedded, transferDtoPhone.transferReasonEmbedded) && Intrinsics.f(this.reasons, transferDtoPhone.reasons) && Intrinsics.f(this.sourceCurrency, transferDtoPhone.sourceCurrency) && Intrinsics.f(this.fundingSource, transferDtoPhone.fundingSource) && Intrinsics.f(this.numberOfInstalments, transferDtoPhone.numberOfInstalments);
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        public long getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        @NotNull
        public String getCurrency() {
            return this.currency;
        }

        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        public final String getGif() {
            return this.gif;
        }

        public final Integer getNumberOfInstalments() {
            return this.numberOfInstalments;
        }

        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        public final r getReasons() {
            return this.reasons;
        }

        @NotNull
        public final String getRecipient() {
            return this.recipient;
        }

        public final String getRecipientName() {
            return this.recipientName;
        }

        public final String getSourceCurrency() {
            return this.sourceCurrency;
        }

        @NotNull
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        public int hashCode() {
            int iHashCode = this.recipient.hashCode() * 31;
            String str = this.recipientName;
            int iC = a.c(a.c(a0.d.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount), 31, this.currency), 31, this.comment);
            String str2 = this.gif;
            int iC2 = a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.transferAppSource);
            String str3 = this.paymentWidgetId;
            int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            d dVar = this.transferReasonEmbedded;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            r rVar = this.reasons;
            int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            String str4 = this.sourceCurrency;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            FundingSourceDto fundingSourceDto = this.fundingSource;
            int iHashCode6 = (iHashCode5 + (fundingSourceDto == null ? 0 : fundingSourceDto.hashCode())) * 31;
            Integer num = this.numberOfInstalments;
            return iHashCode6 + (num != null ? num.hashCode() : 0);
        }

        public /* synthetic */ TransferDtoPhone(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, d dVar, r rVar, String str8, FundingSourceDto fundingSourceDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j2, str3, str4, str5, str6, (i & 128) != 0 ? null : str7, dVar, rVar, str8, fundingSourceDto, num);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019J®\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\bF\u0010\u0019R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bI\u0010\u0019¨\u0006J"}, d2 = {"Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoCode;", "Lcom/revolut/data/network/models/transfer/TransferDto;", "", "code", "", "amount", "currency", "comment", "gif", "transferAppSource", "paymentWidgetId", "Libl/d;", "transferReasonEmbedded", "Lgsf/r;", "reasons", "sourceCurrency", "Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "fundingSource", "paymentLinkId", "", "numberOfInstalments", "personalisationId", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;Ljava/lang/String;Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "()Libl/d;", "component9", "()Lgsf/r;", "component10", "component11", "()Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "component12", "component13", "()Ljava/lang/Integer;", "component14", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Lgsf/r;Ljava/lang/String;Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/revolut/data/network/models/transfer/TransferDto$TransferDtoCode;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getCode", "J", "getAmount", "getCurrency", "getComment", "getGif", "getTransferAppSource", "getPaymentWidgetId", "Libl/d;", "getTransferReasonEmbedded", "Lgsf/r;", "getReasons", "getSourceCurrency", "Lcom/revolut/data/network/models/transfer/TransferDto$FundingSourceDto;", "getFundingSource", "getPaymentLinkId", "Ljava/lang/Integer;", "getNumberOfInstalments", "getPersonalisationId", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferDtoCode extends TransferDto {

        @b("amount")
        private final long amount;

        @b("code")
        @NotNull
        private final String code;

        @b("userComments")
        @NotNull
        private final String comment;

        @b("currency")
        @NotNull
        private final String currency;

        @b("fundingSource")
        private final FundingSourceDto fundingSource;

        @b("gif")
        private final String gif;

        @b("numberOfInstalments")
        private final Integer numberOfInstalments;

        @b("paymentLinkId")
        private final String paymentLinkId;

        @b("paymentWidgetId")
        private final String paymentWidgetId;

        @b("p2pPersonalisationBundleId")
        private final String personalisationId;

        @b("reasons")
        private final r reasons;

        @b("sourceCurrency")
        private final String sourceCurrency;

        @b("transferAppSource")
        @NotNull
        private final String transferAppSource;

        @b("reason")
        private final d transferReasonEmbedded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferDtoCode(@NotNull String code, long j2, @NotNull String currency, @NotNull String comment, String str, @NotNull String transferAppSource, String str2, d dVar, r rVar, String str3, FundingSourceDto fundingSourceDto, String str4, Integer num, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.code = code;
            this.amount = j2;
            this.currency = currency;
            this.comment = comment;
            this.gif = str;
            this.transferAppSource = transferAppSource;
            this.paymentWidgetId = str2;
            this.transferReasonEmbedded = dVar;
            this.reasons = rVar;
            this.sourceCurrency = str3;
            this.fundingSource = fundingSourceDto;
            this.paymentLinkId = str4;
            this.numberOfInstalments = num;
            this.personalisationId = str5;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getSourceCurrency() {
            return this.sourceCurrency;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getPaymentLinkId() {
            return this.paymentLinkId;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getNumberOfInstalments() {
            return this.numberOfInstalments;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getPersonalisationId() {
            return this.personalisationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getGif() {
            return this.gif;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final r getReasons() {
            return this.reasons;
        }

        @NotNull
        public final TransferDtoCode copy(@NotNull String code, long amount, @NotNull String currency, @NotNull String comment, String gif2, @NotNull String transferAppSource, String paymentWidgetId, d transferReasonEmbedded, r reasons, String sourceCurrency, FundingSourceDto fundingSource, String paymentLinkId, Integer numberOfInstalments, String personalisationId) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            return new TransferDtoCode(code, amount, currency, comment, gif2, transferAppSource, paymentWidgetId, transferReasonEmbedded, reasons, sourceCurrency, fundingSource, paymentLinkId, numberOfInstalments, personalisationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferDtoCode)) {
                return false;
            }
            TransferDtoCode transferDtoCode = (TransferDtoCode) other;
            return Intrinsics.f(this.code, transferDtoCode.code) && this.amount == transferDtoCode.amount && Intrinsics.f(this.currency, transferDtoCode.currency) && Intrinsics.f(this.comment, transferDtoCode.comment) && Intrinsics.f(this.gif, transferDtoCode.gif) && Intrinsics.f(this.transferAppSource, transferDtoCode.transferAppSource) && Intrinsics.f(this.paymentWidgetId, transferDtoCode.paymentWidgetId) && Intrinsics.f(this.transferReasonEmbedded, transferDtoCode.transferReasonEmbedded) && Intrinsics.f(this.reasons, transferDtoCode.reasons) && Intrinsics.f(this.sourceCurrency, transferDtoCode.sourceCurrency) && Intrinsics.f(this.fundingSource, transferDtoCode.fundingSource) && Intrinsics.f(this.paymentLinkId, transferDtoCode.paymentLinkId) && Intrinsics.f(this.numberOfInstalments, transferDtoCode.numberOfInstalments) && Intrinsics.f(this.personalisationId, transferDtoCode.personalisationId);
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        public long getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        @Override // com.revolut.data.network.models.transfer.TransferDto
        @NotNull
        public String getCurrency() {
            return this.currency;
        }

        public final FundingSourceDto getFundingSource() {
            return this.fundingSource;
        }

        public final String getGif() {
            return this.gif;
        }

        public final Integer getNumberOfInstalments() {
            return this.numberOfInstalments;
        }

        public final String getPaymentLinkId() {
            return this.paymentLinkId;
        }

        public final String getPaymentWidgetId() {
            return this.paymentWidgetId;
        }

        public final String getPersonalisationId() {
            return this.personalisationId;
        }

        public final r getReasons() {
            return this.reasons;
        }

        public final String getSourceCurrency() {
            return this.sourceCurrency;
        }

        @NotNull
        public final String getTransferAppSource() {
            return this.transferAppSource;
        }

        public final d getTransferReasonEmbedded() {
            return this.transferReasonEmbedded;
        }

        public int hashCode() {
            int iC = a.c(a.c(a0.d.c(this.code.hashCode() * 31, 31, this.amount), 31, this.currency), 31, this.comment);
            String str = this.gif;
            int iC2 = a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.transferAppSource);
            String str2 = this.paymentWidgetId;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            d dVar = this.transferReasonEmbedded;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            r rVar = this.reasons;
            int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            String str3 = this.sourceCurrency;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            FundingSourceDto fundingSourceDto = this.fundingSource;
            int iHashCode5 = (iHashCode4 + (fundingSourceDto == null ? 0 : fundingSourceDto.hashCode())) * 31;
            String str4 = this.paymentLinkId;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.numberOfInstalments;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.personalisationId;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public /* synthetic */ TransferDtoCode(String str, long j2, String str2, String str3, String str4, String str5, String str6, d dVar, r rVar, String str7, FundingSourceDto fundingSourceDto, String str8, Integer num, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j2, str2, str3, str4, str5, (i & 64) != 0 ? null : str6, dVar, rVar, str7, fundingSourceDto, str8, num, str9);
        }
    }
}
