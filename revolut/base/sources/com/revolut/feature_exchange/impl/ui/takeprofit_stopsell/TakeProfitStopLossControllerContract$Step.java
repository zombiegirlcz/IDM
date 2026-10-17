package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0i.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChartLimit", "LimitChange", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step$ChartLimit;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step$LimitChange;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TakeProfitStopLossControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step$ChartLimit;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartLimit implements TakeProfitStopLossControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartLimit f96984a = new ChartLimit();

        @NotNull
        public static final Parcelable.Creator<ChartLimit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartLimit.f96984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartLimit[i];
            }
        }

        private ChartLimit() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step$LimitChange;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitChange implements TakeProfitStopLossControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f96986b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitChange(b.valueOf(parcel.readString()), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitChange[i];
            }
        }

        public LimitChange(b limitType, float f) {
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            this.f96985a = limitType;
            this.f96986b = f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitChange)) {
                return false;
            }
            LimitChange limitChange = (LimitChange) obj2;
            return this.f96985a == limitChange.f96985a && Float.compare(this.f96986b, limitChange.f96986b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f96986b) + (this.f96985a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96985a.name());
            dest.writeFloat(this.f96986b);
        }
    }
}
