package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankTransferReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankTransferReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f102122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f102123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankTransferEntryPoint f102124c;
    public final BankTransferData d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankTransferReviewScreenContract$InputData((f5j.a) parcel.readSerializable(), (TransferFlowType) parcel.readParcelable(BankTransferReviewScreenContract$InputData.class.getClassLoader()), (BankTransferEntryPoint) parcel.readParcelable(BankTransferReviewScreenContract$InputData.class.getClassLoader()), (BankTransferData) parcel.readParcelable(BankTransferReviewScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferReviewScreenContract$InputData[i];
        }
    }

    public BankTransferReviewScreenContract$InputData(f5j.a beneficiary, TransferFlowType flowType, BankTransferEntryPoint entryPoint, BankTransferData transferData, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f102122a = beneficiary;
        this.f102123b = flowType;
        this.f102124c = entryPoint;
        this.d = transferData;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankTransferReviewScreenContract$InputData)) {
            return false;
        }
        BankTransferReviewScreenContract$InputData bankTransferReviewScreenContract$InputData = (BankTransferReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f102122a, bankTransferReviewScreenContract$InputData.f102122a) && Intrinsics.f(this.f102123b, bankTransferReviewScreenContract$InputData.f102123b) && this.f102124c == bankTransferReviewScreenContract$InputData.f102124c && Intrinsics.f(this.d, bankTransferReviewScreenContract$InputData.d) && this.e == bankTransferReviewScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f102124c.hashCode() + d.c(this.f102123b, this.f102122a.hashCode() * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f102122a);
        dest.writeParcelable(this.f102123b, i);
        dest.writeParcelable(this.f102124c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
