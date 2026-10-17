package com.revolut.feature.retail.advanced_charts.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType;", "Landroid/os/Parcelable;", "BasedOnInterval", "BasedOnTradingViewLogic", "Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType$BasedOnInterval;", "Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType$BasedOnTradingViewLogic;", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChartTimeFrameDisplayType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType$BasedOnInterval;", "Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType;", "<init>", "()V", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BasedOnInterval implements ChartTimeFrameDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BasedOnInterval f82085a = new BasedOnInterval();

        @NotNull
        public static final Parcelable.Creator<BasedOnInterval> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BasedOnInterval.f82085a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BasedOnInterval[i];
            }
        }

        private BasedOnInterval() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType$BasedOnTradingViewLogic;", "Lcom/revolut/feature/retail/advanced_charts/models/ChartTimeFrameDisplayType;", "<init>", "()V", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BasedOnTradingViewLogic implements ChartTimeFrameDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BasedOnTradingViewLogic f82086a = new BasedOnTradingViewLogic();

        @NotNull
        public static final Parcelable.Creator<BasedOnTradingViewLogic> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BasedOnTradingViewLogic.f82086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BasedOnTradingViewLogic[i];
            }
        }

        private BasedOnTradingViewLogic() {
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
}
