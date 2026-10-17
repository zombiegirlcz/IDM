package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/BankTransferReviewDescriptor;", "Laii/e;", "Ld2k/f;", "Landroid/os/Parcelable;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferReviewDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<BankTransferReviewDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferFlowInputData.ReviewOnly f101962a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankTransferReviewDescriptor(BankTransferFlowInputData.ReviewOnly.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferReviewDescriptor[i];
        }
    }

    public BankTransferReviewDescriptor(BankTransferFlowInputData.ReviewOnly inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101962a = inputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BankTransferFlowInputData.ReviewOnly getF101962a() {
        return this.f101962a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f101962a.writeToParcel(dest, i);
    }
}
