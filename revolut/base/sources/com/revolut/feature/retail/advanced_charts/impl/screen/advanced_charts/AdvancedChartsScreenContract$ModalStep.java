package com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChartIndicatorSelector", "SymbolSearcher", "SymbolComparator", "ChartIntervalSelector", "ChartStyleSelector", "ChartDrawingSelector", "ChartAdd", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartAdd;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartDrawingSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartIndicatorSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartIntervalSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartStyleSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$SymbolComparator;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$SymbolSearcher;", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdvancedChartsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartAdd;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartAdd extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartAdd f82071a = new ChartAdd();

        @NotNull
        public static final Parcelable.Creator<ChartAdd> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartAdd.f82071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartAdd[i];
            }
        }

        private ChartAdd() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartDrawingSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartDrawingSelector extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartDrawingSelector f82072a = new ChartDrawingSelector();

        @NotNull
        public static final Parcelable.Creator<ChartDrawingSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartDrawingSelector.f82072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartDrawingSelector[i];
            }
        }

        private ChartDrawingSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartIndicatorSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartIndicatorSelector extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartIndicatorSelector f82073a = new ChartIndicatorSelector();

        @NotNull
        public static final Parcelable.Creator<ChartIndicatorSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartIndicatorSelector.f82073a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartIndicatorSelector[i];
            }
        }

        private ChartIndicatorSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartIntervalSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartIntervalSelector extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartIntervalSelector f82074a = new ChartIntervalSelector();

        @NotNull
        public static final Parcelable.Creator<ChartIntervalSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartIntervalSelector.f82074a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartIntervalSelector[i];
            }
        }

        private ChartIntervalSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$ChartStyleSelector;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartStyleSelector extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChartStyleSelector f82075a = new ChartStyleSelector();

        @NotNull
        public static final Parcelable.Creator<ChartStyleSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartStyleSelector.f82075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartStyleSelector[i];
            }
        }

        private ChartStyleSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$SymbolComparator;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SymbolComparator extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SymbolComparator f82076a = new SymbolComparator();

        @NotNull
        public static final Parcelable.Creator<SymbolComparator> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SymbolComparator.f82076a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SymbolComparator[i];
            }
        }

        private SymbolComparator() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep$SymbolSearcher;", "Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SymbolSearcher extends AdvancedChartsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SymbolSearcher f82077a = new SymbolSearcher();

        @NotNull
        public static final Parcelable.Creator<SymbolSearcher> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SymbolSearcher.f82077a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SymbolSearcher[i];
            }
        }

        private SymbolSearcher() {
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

    private AdvancedChartsScreenContract$ModalStep() {
    }
}
