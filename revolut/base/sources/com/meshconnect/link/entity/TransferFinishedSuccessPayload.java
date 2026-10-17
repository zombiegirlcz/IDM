package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u0006="}, d2 = {"Lcom/meshconnect/link/entity/TransferFinishedSuccessPayload;", "Lcom/meshconnect/link/entity/TransferFinishedPayload;", "txId", "", "fromAddress", "toAddress", "symbol", "amount", "", "networkId", "amountInFiat", "totalAmountInFiat", "networkName", "txHash", "transferId", "refundAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTxId", "()Ljava/lang/String;", "getFromAddress", "getToAddress", "getSymbol", "getAmount", "()D", "getNetworkId", "getAmountInFiat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTotalAmountInFiat", "getNetworkName", "getTxHash", "getTransferId", "getRefundAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meshconnect/link/entity/TransferFinishedSuccessPayload;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferFinishedSuccessPayload implements TransferFinishedPayload {

    @NotNull
    public static final Parcelable.Creator<TransferFinishedSuccessPayload> CREATOR = new Creator();
    private final double amount;
    private final Double amountInFiat;

    @NotNull
    private final String fromAddress;

    @NotNull
    private final String networkId;
    private final String networkName;
    private final String refundAddress;

    @NotNull
    private final String symbol;

    @NotNull
    private final String toAddress;
    private final Double totalAmountInFiat;
    private final String transferId;
    private final String txHash;

    @NotNull
    private final String txId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferFinishedSuccessPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFinishedSuccessPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferFinishedSuccessPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferFinishedSuccessPayload[] newArray(int i) {
            return new TransferFinishedSuccessPayload[i];
        }
    }

    public TransferFinishedSuccessPayload(@NotNull String txId, @NotNull String fromAddress, @NotNull String toAddress, @NotNull String symbol, double d, @NotNull String networkId, Double d5, Double d6, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(txId, "txId");
        Intrinsics.checkNotNullParameter(fromAddress, "fromAddress");
        Intrinsics.checkNotNullParameter(toAddress, "toAddress");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        this.txId = txId;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.symbol = symbol;
        this.amount = d;
        this.networkId = networkId;
        this.amountInFiat = d5;
        this.totalAmountInFiat = d6;
        this.networkName = str;
        this.txHash = str2;
        this.transferId = str3;
        this.refundAddress = str4;
    }

    public static /* synthetic */ TransferFinishedSuccessPayload copy$default(TransferFinishedSuccessPayload transferFinishedSuccessPayload, String str, String str2, String str3, String str4, double d, String str5, Double d5, Double d6, String str6, String str7, String str8, String str9, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transferFinishedSuccessPayload.txId;
        }
        return transferFinishedSuccessPayload.copy(str, (i & 2) != 0 ? transferFinishedSuccessPayload.fromAddress : str2, (i & 4) != 0 ? transferFinishedSuccessPayload.toAddress : str3, (i & 8) != 0 ? transferFinishedSuccessPayload.symbol : str4, (i & 16) != 0 ? transferFinishedSuccessPayload.amount : d, (i & 32) != 0 ? transferFinishedSuccessPayload.networkId : str5, (i & 64) != 0 ? transferFinishedSuccessPayload.amountInFiat : d5, (i & 128) != 0 ? transferFinishedSuccessPayload.totalAmountInFiat : d6, (i & 256) != 0 ? transferFinishedSuccessPayload.networkName : str6, (i & 512) != 0 ? transferFinishedSuccessPayload.txHash : str7, (i & 1024) != 0 ? transferFinishedSuccessPayload.transferId : str8, (i & 2048) != 0 ? transferFinishedSuccessPayload.refundAddress : str9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRefundAddress() {
        return this.refundAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToAddress() {
        return this.toAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNetworkId() {
        return this.networkId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getAmountInFiat() {
        return this.amountInFiat;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getTotalAmountInFiat() {
        return this.totalAmountInFiat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @NotNull
    public final TransferFinishedSuccessPayload copy(@NotNull String txId, @NotNull String fromAddress, @NotNull String toAddress, @NotNull String symbol, double amount, @NotNull String networkId, Double amountInFiat, Double totalAmountInFiat, String networkName, String txHash, String transferId, String refundAddress) {
        Intrinsics.checkNotNullParameter(txId, "txId");
        Intrinsics.checkNotNullParameter(fromAddress, "fromAddress");
        Intrinsics.checkNotNullParameter(toAddress, "toAddress");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        return new TransferFinishedSuccessPayload(txId, fromAddress, toAddress, symbol, amount, networkId, amountInFiat, totalAmountInFiat, networkName, txHash, transferId, refundAddress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferFinishedSuccessPayload)) {
            return false;
        }
        TransferFinishedSuccessPayload transferFinishedSuccessPayload = (TransferFinishedSuccessPayload) other;
        return Intrinsics.f(this.txId, transferFinishedSuccessPayload.txId) && Intrinsics.f(this.fromAddress, transferFinishedSuccessPayload.fromAddress) && Intrinsics.f(this.toAddress, transferFinishedSuccessPayload.toAddress) && Intrinsics.f(this.symbol, transferFinishedSuccessPayload.symbol) && Double.compare(this.amount, transferFinishedSuccessPayload.amount) == 0 && Intrinsics.f(this.networkId, transferFinishedSuccessPayload.networkId) && Intrinsics.f(this.amountInFiat, transferFinishedSuccessPayload.amountInFiat) && Intrinsics.f(this.totalAmountInFiat, transferFinishedSuccessPayload.totalAmountInFiat) && Intrinsics.f(this.networkName, transferFinishedSuccessPayload.networkName) && Intrinsics.f(this.txHash, transferFinishedSuccessPayload.txHash) && Intrinsics.f(this.transferId, transferFinishedSuccessPayload.transferId) && Intrinsics.f(this.refundAddress, transferFinishedSuccessPayload.refundAddress);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Double getAmountInFiat() {
        return this.amountInFiat;
    }

    @NotNull
    public final String getFromAddress() {
        return this.fromAddress;
    }

    @NotNull
    public final String getNetworkId() {
        return this.networkId;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getRefundAddress() {
        return this.refundAddress;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getToAddress() {
        return this.toAddress;
    }

    public final Double getTotalAmountInFiat() {
        return this.totalAmountInFiat;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getTxHash() {
        return this.txHash;
    }

    @NotNull
    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        int iC = a.c(b.c(a.c(a.c(a.c(this.txId.hashCode() * 31, 31, this.fromAddress), 31, this.toAddress), 31, this.symbol), this.amount, 31), 31, this.networkId);
        Double d = this.amountInFiat;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.totalAmountInFiat;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.networkName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.txHash;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transferId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refundAddress;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("TransferFinishedSuccessPayload(txId=");
        sb6.append(this.txId);
        sb6.append(", fromAddress=");
        sb6.append(this.fromAddress);
        sb6.append(", toAddress=");
        sb6.append(this.toAddress);
        sb6.append(", symbol=");
        sb6.append(this.symbol);
        sb6.append(", amount=");
        sb6.append(this.amount);
        sb6.append(", networkId=");
        sb6.append(this.networkId);
        sb6.append(", amountInFiat=");
        sb6.append(this.amountInFiat);
        sb6.append(", totalAmountInFiat=");
        sb6.append(this.totalAmountInFiat);
        sb6.append(", networkName=");
        sb6.append(this.networkName);
        sb6.append(", txHash=");
        sb6.append(this.txHash);
        sb6.append(", transferId=");
        sb6.append(this.transferId);
        sb6.append(", refundAddress=");
        return j6.a.u(sb6, this.refundAddress, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.txId);
        dest.writeString(this.fromAddress);
        dest.writeString(this.toAddress);
        dest.writeString(this.symbol);
        dest.writeDouble(this.amount);
        dest.writeString(this.networkId);
        Double d = this.amountInFiat;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        Double d5 = this.totalAmountInFiat;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
        }
        dest.writeString(this.networkName);
        dest.writeString(this.txHash);
        dest.writeString(this.transferId);
        dest.writeString(this.refundAddress);
    }
}
