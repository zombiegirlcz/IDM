package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation;", "Landroid/os/Parcelable;", "DtcTransferUserAccountInformation", "AcatTransferUserAccountInformation", "TaaTransferUserAccountInformation", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$AcatTransferUserAccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$DtcTransferUserAccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$TaaTransferUserAccountInformation;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferUserAccountInformation extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$AcatTransferUserAccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcatTransferUserAccountInformation implements TransferUserAccountInformation {

        @NotNull
        public static final Parcelable.Creator<AcatTransferUserAccountInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f91532b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcatTransferUserAccountInformation(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcatTransferUserAccountInformation[i];
            }
        }

        public AcatTransferUserAccountInformation(String accountNumber, b brokerCountry) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerCountry, "brokerCountry");
            this.f91531a = accountNumber;
            this.f91532b = brokerCountry;
        }

        @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getF91536a() {
            return this.f91531a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcatTransferUserAccountInformation)) {
                return false;
            }
            AcatTransferUserAccountInformation acatTransferUserAccountInformation = (AcatTransferUserAccountInformation) obj2;
            return Intrinsics.f(this.f91531a, acatTransferUserAccountInformation.f91531a) && Intrinsics.f(this.f91532b, acatTransferUserAccountInformation.f91532b);
        }

        public final int hashCode() {
            return this.f91532b.f297794a.hashCode() + (this.f91531a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91531a);
            dest.writeSerializable(this.f91532b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$DtcTransferUserAccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DtcTransferUserAccountInformation implements TransferUserAccountInformation {

        @NotNull
        public static final Parcelable.Creator<DtcTransferUserAccountInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f91535c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DtcTransferUserAccountInformation(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DtcTransferUserAccountInformation[i];
            }
        }

        public DtcTransferUserAccountInformation(String accountNumber, String accountHolderName, b brokerCountry) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountHolderName, "accountHolderName");
            Intrinsics.checkNotNullParameter(brokerCountry, "brokerCountry");
            this.f91533a = accountNumber;
            this.f91534b = accountHolderName;
            this.f91535c = brokerCountry;
        }

        @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getF91536a() {
            return this.f91533a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DtcTransferUserAccountInformation)) {
                return false;
            }
            DtcTransferUserAccountInformation dtcTransferUserAccountInformation = (DtcTransferUserAccountInformation) obj2;
            return Intrinsics.f(this.f91533a, dtcTransferUserAccountInformation.f91533a) && Intrinsics.f(this.f91534b, dtcTransferUserAccountInformation.f91534b) && Intrinsics.f(this.f91535c, dtcTransferUserAccountInformation.f91535c);
        }

        public final int hashCode() {
            return this.f91535c.f297794a.hashCode() + p.a.c(this.f91533a.hashCode() * 31, 31, this.f91534b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91533a);
            dest.writeString(this.f91534b);
            dest.writeSerializable(this.f91535c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation$TaaTransferUserAccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferUserAccountInformation;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaaTransferUserAccountInformation implements TransferUserAccountInformation {

        @NotNull
        public static final Parcelable.Creator<TaaTransferUserAccountInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91536a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaaTransferUserAccountInformation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaaTransferUserAccountInformation[i];
            }
        }

        public TaaTransferUserAccountInformation(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.f91536a = accountNumber;
        }

        @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getF91536a() {
            return this.f91536a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaaTransferUserAccountInformation) && Intrinsics.f(this.f91536a, ((TaaTransferUserAccountInformation) obj2).f91536a);
        }

        public final int hashCode() {
            return this.f91536a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91536a);
        }
    }

    /* JADX INFO: renamed from: E */
    String getF91536a();
}
