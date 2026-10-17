package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeleteReceipt", "Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsContract$ModalStep$DeleteReceipt;", "feature_payments_money_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoneyRequestDetailsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsContract$ModalStep$DeleteReceipt;", "Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/details/MoneyRequestDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteReceipt implements MoneyRequestDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteReceipt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ItemizationReceiptDeletionData.SplitBill f102151a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteReceipt((ItemizationReceiptDeletionData.SplitBill) parcel.readParcelable(DeleteReceipt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteReceipt[i];
            }
        }

        public DeleteReceipt(ItemizationReceiptDeletionData.SplitBill deletionData) {
            Intrinsics.checkNotNullParameter(deletionData, "deletionData");
            this.f102151a = deletionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteReceipt) && Intrinsics.f(this.f102151a, ((DeleteReceipt) obj2).f102151a);
        }

        public final int hashCode() {
            return this.f102151a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102151a, i);
        }
    }
}
