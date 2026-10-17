package com.revolut.data.network.models.moneyrequest;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransferLinkResponseDto;", "", "id", "", "code", "receiveUrl", "gifUrl", "expiryDate", "", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCode", "getReceiveUrl", "getGifUrl", "getExpiryDate", "()J", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLinkResponseDto {

    @b("code")
    private final String code;

    @b("expiryDate")
    private final long expiryDate;

    @b("gifUrl")
    private final String gifUrl;

    @b("id")
    @NotNull
    private final String id;

    @b("receiveUrl")
    private final String receiveUrl;

    @b("transactionId")
    private final String transactionId;

    public TransferLinkResponseDto(@NotNull String id10, String str, String str2, String str3, long j2, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.code = str;
        this.receiveUrl = str2;
        this.gifUrl = str3;
        this.expiryDate = j2;
        this.transactionId = str4;
    }

    public static /* synthetic */ TransferLinkResponseDto copy$default(TransferLinkResponseDto transferLinkResponseDto, String str, String str2, String str3, String str4, long j2, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transferLinkResponseDto.id;
        }
        if ((i & 2) != 0) {
            str2 = transferLinkResponseDto.code;
        }
        if ((i & 4) != 0) {
            str3 = transferLinkResponseDto.receiveUrl;
        }
        if ((i & 8) != 0) {
            str4 = transferLinkResponseDto.gifUrl;
        }
        if ((i & 16) != 0) {
            j2 = transferLinkResponseDto.expiryDate;
        }
        if ((i & 32) != 0) {
            str5 = transferLinkResponseDto.transactionId;
        }
        String str6 = str5;
        long j3 = j2;
        return transferLinkResponseDto.copy(str, str2, str3, str4, j3, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReceiveUrl() {
        return this.receiveUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGifUrl() {
        return this.gifUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final TransferLinkResponseDto copy(@NotNull String id10, String code, String receiveUrl, String gifUrl, long expiryDate, String transactionId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new TransferLinkResponseDto(id10, code, receiveUrl, gifUrl, expiryDate, transactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferLinkResponseDto)) {
            return false;
        }
        TransferLinkResponseDto transferLinkResponseDto = (TransferLinkResponseDto) other;
        return Intrinsics.f(this.id, transferLinkResponseDto.id) && Intrinsics.f(this.code, transferLinkResponseDto.code) && Intrinsics.f(this.receiveUrl, transferLinkResponseDto.receiveUrl) && Intrinsics.f(this.gifUrl, transferLinkResponseDto.gifUrl) && this.expiryDate == transferLinkResponseDto.expiryDate && Intrinsics.f(this.transactionId, transferLinkResponseDto.transactionId);
    }

    public final String getCode() {
        return this.code;
    }

    public final long getExpiryDate() {
        return this.expiryDate;
    }

    public final String getGifUrl() {
        return this.gifUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getReceiveUrl() {
        return this.receiveUrl;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.receiveUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gifUrl;
        int iC = d.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.expiryDate);
        String str4 = this.transactionId;
        return iC + (str4 != null ? str4.hashCode() : 0);
    }
}
