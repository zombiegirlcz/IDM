package com.revolut.feature.payments.who_to_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.flow.FlowExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType;", "Landroid/os/Parcelable;", "Default", "Transfer", "Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType$Default;", "Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType$Transfer;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecipientSelectionType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType$Default;", "Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements RecipientSelectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f80020a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f80020a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType$Transfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/payments/who_to_transfer/api/navigation/a", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements RecipientSelectionType {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferFlowType f80021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.payments.who_to_transfer.api.navigation.a f80022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f80023c;
        public final FlowExtras d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((TransferFlowType) parcel.readParcelable(Transfer.class.getClassLoader()), com.revolut.feature.payments.who_to_transfer.api.navigation.a.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(Transfer.class.getClassLoader()), (FlowExtras) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(TransferFlowType flowType, com.revolut.feature.payments.who_to_transfer.api.navigation.a transferType, TransferMoneyPocket moneyPocket, FlowExtras flowExtras) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            this.f80021a = flowType;
            this.f80022b = transferType;
            this.f80023c = moneyPocket;
            this.d = flowExtras;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f80021a, transfer.f80021a) && this.f80022b == transfer.f80022b && Intrinsics.f(this.f80023c, transfer.f80023c) && Intrinsics.f(this.d, transfer.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f80023c.hashCode() + ((this.f80022b.hashCode() + (this.f80021a.hashCode() * 31)) * 31)) * 31;
            FlowExtras flowExtras = this.d;
            return iHashCode + (flowExtras == null ? 0 : flowExtras.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80021a, i);
            dest.writeString(this.f80022b.name());
            dest.writeParcelable(this.f80023c, i);
            dest.writeParcelable(this.d, i);
        }
    }
}
