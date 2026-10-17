package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LowestAmountPicker", "HighestAmountPicker", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep$HighestAmountPicker;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep$LowestAmountPicker;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChartLimitPickerControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep$HighestAmountPicker;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HighestAmountPicker extends ChartLimitPickerControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HighestAmountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChartLimitPickerControllerContract$Limit f96991a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HighestAmountPicker(ChartLimitPickerControllerContract$Limit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HighestAmountPicker[i];
            }
        }

        public HighestAmountPicker(ChartLimitPickerControllerContract$Limit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f96991a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HighestAmountPicker) && Intrinsics.f(this.f96991a, ((HighestAmountPicker) obj2).f96991a);
        }

        public final int hashCode() {
            return this.f96991a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96991a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep$LowestAmountPicker;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LowestAmountPicker extends ChartLimitPickerControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LowestAmountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChartLimitPickerControllerContract$Limit f96992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LowestAmountPicker(ChartLimitPickerControllerContract$Limit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LowestAmountPicker[i];
            }
        }

        public LowestAmountPicker(ChartLimitPickerControllerContract$Limit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f96992a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LowestAmountPicker) && Intrinsics.f(this.f96992a, ((LowestAmountPicker) obj2).f96992a);
        }

        public final int hashCode() {
            return this.f96992a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96992a.writeToParcel(dest, i);
        }
    }

    private ChartLimitPickerControllerContract$ModalStep() {
    }
}
