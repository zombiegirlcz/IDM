package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason", "Landroid/os/Parcelable;", "<init>", "()V", "UpperLimitError", "LowerLimitError", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason$LowerLimitError;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason$UpperLimitError;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HintDialogMapper$HintDialogReason implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason$LowerLimitError;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LowerLimitError extends HintDialogMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<LowerLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f99868a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LowerLimitError((Amount) parcel.readParcelable(LowerLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LowerLimitError[i];
            }
        }

        public LowerLimitError(Amount lowerLimit) {
            Intrinsics.checkNotNullParameter(lowerLimit, "lowerLimit");
            this.f99868a = lowerLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LowerLimitError) && Intrinsics.f(this.f99868a, ((LowerLimitError) obj2).f99868a);
        }

        public final int hashCode() {
            return this.f99868a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99868a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason$UpperLimitError;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/limits/HintDialogMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpperLimitError extends HintDialogMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<UpperLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f99869a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpperLimitError((Amount) parcel.readParcelable(UpperLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpperLimitError[i];
            }
        }

        public UpperLimitError(Amount upperLimit) {
            Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
            this.f99869a = upperLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpperLimitError) && Intrinsics.f(this.f99869a, ((UpperLimitError) obj2).f99869a);
        }

        public final int hashCode() {
            return this.f99869a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99869a, i);
        }
    }

    private HintDialogMapper$HintDialogReason() {
    }
}
