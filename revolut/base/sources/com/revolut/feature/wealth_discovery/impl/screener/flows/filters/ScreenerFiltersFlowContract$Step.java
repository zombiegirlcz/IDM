package com.revolut.feature.wealth_discovery.impl.screener.flows.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductPicker", "AllFilters", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step$AllFilters;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step$ProductPicker;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreenerFiltersFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step$AllFilters;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllFilters extends ScreenerFiltersFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllFilters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f96175a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllFilters(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllFilters[i];
            }
        }

        public AllFilters(f instrumentGroup) {
            Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
            this.f96175a = instrumentGroup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllFilters) && this.f96175a == ((AllFilters) obj2).f96175a;
        }

        public final int hashCode() {
            return this.f96175a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96175a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step$ProductPicker;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlowContract$Step;", "<init>", "()V", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductPicker extends ScreenerFiltersFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductPicker f96176a = new ProductPicker();

        @NotNull
        public static final Parcelable.Creator<ProductPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductPicker.f96176a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductPicker[i];
            }
        }

        private ProductPicker() {
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

    private ScreenerFiltersFlowContract$Step() {
    }
}
