package com.revolut.data.network.models.moneyrequest;

import ibl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0098\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b7\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b8\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010#¨\u0006="}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;", "", "", "beneficiaryName", "", "amount", "currency", "sourceCurrency", "comment", "phone", "senderPocketId", "email", "gifUrl", "transferAppSource", "Libl/d;", "transferReasonEmbedded", "", "numberOfInstalments", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Libl/d;", "component12", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Libl/d;Ljava/lang/Integer;)Lcom/revolut/data/network/models/moneyrequest/TransferLinkRequestDto;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getBeneficiaryName", "J", "getAmount", "getCurrency", "getSourceCurrency", "getComment", "getPhone", "getSenderPocketId", "getEmail", "getGifUrl", "getTransferAppSource", "Libl/d;", "getTransferReasonEmbedded", "Ljava/lang/Integer;", "getNumberOfInstalments", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLinkRequestDto {

    @b("amount")
    private final long amount;

    @b("beneficiaryName")
    private final String beneficiaryName;

    @b("userComments")
    @NotNull
    private final String comment;

    @b("currency")
    @NotNull
    private final String currency;

    @b("email")
    private final String email;

    @b("gif")
    private final String gifUrl;

    @b("numberOfInstalments")
    private final Integer numberOfInstalments;

    @b("phone")
    private final String phone;

    @b("senderPocketId")
    private final String senderPocketId;

    @b("sourceCurrency")
    private final String sourceCurrency;

    @b("transferAppSource")
    @NotNull
    private final String transferAppSource;

    @b("reason")
    private final d transferReasonEmbedded;

    public TransferLinkRequestDto(String str, long j2, @NotNull String currency, String str2, @NotNull String comment, String str3, String str4, String str5, String str6, @NotNull String transferAppSource, d dVar, Integer num) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        this.beneficiaryName = str;
        this.amount = j2;
        this.currency = currency;
        this.sourceCurrency = str2;
        this.comment = comment;
        this.phone = str3;
        this.senderPocketId = str4;
        this.email = str5;
        this.gifUrl = str6;
        this.transferAppSource = transferAppSource;
        this.transferReasonEmbedded = dVar;
        this.numberOfInstalments = num;
    }

    public static /* synthetic */ TransferLinkRequestDto copy$default(TransferLinkRequestDto transferLinkRequestDto, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, d dVar, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transferLinkRequestDto.beneficiaryName;
        }
        return transferLinkRequestDto.copy(str, (i & 2) != 0 ? transferLinkRequestDto.amount : j2, (i & 4) != 0 ? transferLinkRequestDto.currency : str2, (i & 8) != 0 ? transferLinkRequestDto.sourceCurrency : str3, (i & 16) != 0 ? transferLinkRequestDto.comment : str4, (i & 32) != 0 ? transferLinkRequestDto.phone : str5, (i & 64) != 0 ? transferLinkRequestDto.senderPocketId : str6, (i & 128) != 0 ? transferLinkRequestDto.email : str7, (i & 256) != 0 ? transferLinkRequestDto.gifUrl : str8, (i & 512) != 0 ? transferLinkRequestDto.transferAppSource : str9, (i & 1024) != 0 ? transferLinkRequestDto.transferReasonEmbedded : dVar, (i & 2048) != 0 ? transferLinkRequestDto.numberOfInstalments : num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTransferAppSource() {
        return this.transferAppSource;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final d getTransferReasonEmbedded() {
        return this.transferReasonEmbedded;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getNumberOfInstalments() {
        return this.numberOfInstalments;
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSenderPocketId() {
        return this.senderPocketId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGifUrl() {
        return this.gifUrl;
    }

    @NotNull
    public final TransferLinkRequestDto copy(String beneficiaryName, long amount, @NotNull String currency, String sourceCurrency, @NotNull String comment, String phone, String senderPocketId, String email, String gifUrl, @NotNull String transferAppSource, d transferReasonEmbedded, Integer numberOfInstalments) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
        return new TransferLinkRequestDto(beneficiaryName, amount, currency, sourceCurrency, comment, phone, senderPocketId, email, gifUrl, transferAppSource, transferReasonEmbedded, numberOfInstalments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferLinkRequestDto)) {
            return false;
        }
        TransferLinkRequestDto transferLinkRequestDto = (TransferLinkRequestDto) other;
        return Intrinsics.f(this.beneficiaryName, transferLinkRequestDto.beneficiaryName) && this.amount == transferLinkRequestDto.amount && Intrinsics.f(this.currency, transferLinkRequestDto.currency) && Intrinsics.f(this.sourceCurrency, transferLinkRequestDto.sourceCurrency) && Intrinsics.f(this.comment, transferLinkRequestDto.comment) && Intrinsics.f(this.phone, transferLinkRequestDto.phone) && Intrinsics.f(this.senderPocketId, transferLinkRequestDto.senderPocketId) && Intrinsics.f(this.email, transferLinkRequestDto.email) && Intrinsics.f(this.gifUrl, transferLinkRequestDto.gifUrl) && Intrinsics.f(this.transferAppSource, transferLinkRequestDto.transferAppSource) && Intrinsics.f(this.transferReasonEmbedded, transferLinkRequestDto.transferReasonEmbedded) && Intrinsics.f(this.numberOfInstalments, transferLinkRequestDto.numberOfInstalments);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGifUrl() {
        return this.gifUrl;
    }

    public final Integer getNumberOfInstalments() {
        return this.numberOfInstalments;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getSenderPocketId() {
        return this.senderPocketId;
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
        String str = this.beneficiaryName;
        int iC = a.c(a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.amount), 31, this.currency);
        String str2 = this.sourceCurrency;
        int iC2 = a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.comment);
        String str3 = this.phone;
        int iHashCode = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.senderPocketId;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.gifUrl;
        int iC3 = a.c((iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.transferAppSource);
        d dVar = this.transferReasonEmbedded;
        int iHashCode4 = (iC3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.numberOfInstalments;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ TransferLinkRequestDto(String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, d dVar, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, j2, str2, (i & 8) != 0 ? null : str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, str9, dVar, num);
    }
}
