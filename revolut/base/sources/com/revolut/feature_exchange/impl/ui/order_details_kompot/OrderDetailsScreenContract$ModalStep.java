package com.revolut.feature_exchange.impl.ui.order_details_kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FeeAlert", "CancelConfirmation", "Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep$CancelConfirmation;", "Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep$FeeAlert;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OrderDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep$CancelConfirmation;", "Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelConfirmation extends OrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f96969a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelConfirmation(h.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelConfirmation[i];
            }
        }

        public CancelConfirmation(h orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f96969a = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelConfirmation) && this.f96969a == ((CancelConfirmation) obj2).f96969a;
        }

        public final int hashCode() {
            return this.f96969a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96969a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep$FeeAlert;", "Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeAlert extends OrderDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FeeAlert> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f96971b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeAlert((Clause) parcel.readParcelable(FeeAlert.class.getClassLoader()), (Clause) parcel.readParcelable(FeeAlert.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeAlert[i];
            }
        }

        public FeeAlert(Clause limitClause, Clause feeClause) {
            Intrinsics.checkNotNullParameter(limitClause, "limitClause");
            Intrinsics.checkNotNullParameter(feeClause, "feeClause");
            this.f96970a = limitClause;
            this.f96971b = feeClause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeAlert)) {
                return false;
            }
            FeeAlert feeAlert = (FeeAlert) obj2;
            return Intrinsics.f(this.f96970a, feeAlert.f96970a) && Intrinsics.f(this.f96971b, feeAlert.f96971b);
        }

        public final int hashCode() {
            return this.f96971b.hashCode() + (this.f96970a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96970a, i);
            dest.writeParcelable(this.f96971b, i);
        }
    }

    private OrderDetailsScreenContract$ModalStep() {
    }
}
