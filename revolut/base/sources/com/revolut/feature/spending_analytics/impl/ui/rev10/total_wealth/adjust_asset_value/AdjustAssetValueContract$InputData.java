package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData", "Landroid/os/Parcelable;", "<init>", "()V", "CurrentValue", "HistoricalValue", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData$CurrentValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData$HistoricalValue;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdjustAssetValueContract$InputData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData$CurrentValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrentValue extends AdjustAssetValueContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CurrentValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f87939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f87940c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrentValue((d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentValue[i];
            }
        }

        public CurrentValue(d currentValue, String assetId, boolean z) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(currentValue, "currentValue");
            this.f87938a = assetId;
            this.f87939b = currentValue;
            this.f87940c = z;
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF87939b() {
            return this.f87939b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrentValue)) {
                return false;
            }
            CurrentValue currentValue = (CurrentValue) obj2;
            return Intrinsics.f(this.f87938a, currentValue.f87938a) && Intrinsics.f(this.f87939b, currentValue.f87939b) && this.f87940c == currentValue.f87940c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87940c) + v7.c(this.f87938a.hashCode() * 31, 31, this.f87939b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87938a);
            dest.writeSerializable(this.f87939b);
            dest.writeInt(this.f87940c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData$HistoricalValue;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HistoricalValue extends AdjustAssetValueContract$InputData {

        @NotNull
        public static final Parcelable.Creator<HistoricalValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueHistoryEntry f87942b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HistoricalValue(parcel.readString(), (ValueHistoryEntry) parcel.readParcelable(HistoricalValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HistoricalValue[i];
            }
        }

        public HistoricalValue(String assetId, ValueHistoryEntry entry) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f87941a = assetId;
            this.f87942b = entry;
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData
        /* JADX INFO: renamed from: a */
        public final d getF87939b() {
            return this.f87942b.f99234b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HistoricalValue)) {
                return false;
            }
            HistoricalValue historicalValue = (HistoricalValue) obj2;
            return Intrinsics.f(this.f87941a, historicalValue.f87941a) && Intrinsics.f(this.f87942b, historicalValue.f87942b);
        }

        public final int hashCode() {
            return this.f87942b.hashCode() + (this.f87941a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87941a);
            dest.writeParcelable(this.f87942b, i);
        }
    }

    private AdjustAssetValueContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract d getF87939b();
}
