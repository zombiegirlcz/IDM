package com.revolut.feature.instruments.trend.collections.impl.ui.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "HighRiskWarningStep", "RecommendedBuysLearnMore", "Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep$HighRiskWarningStep;", "Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep$RecommendedBuysLearnMore;", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsTrendCollectionControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep$HighRiskWarningStep;", "Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep;", "<init>", "()V", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HighRiskWarningStep implements InstrumentsTrendCollectionControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HighRiskWarningStep f74908a = new HighRiskWarningStep();

        @NotNull
        public static final Parcelable.Creator<HighRiskWarningStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HighRiskWarningStep.f74908a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HighRiskWarningStep[i];
            }
        }

        private HighRiskWarningStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep$RecommendedBuysLearnMore;", "Lcom/revolut/feature/instruments/trend/collections/impl/ui/collection/InstrumentsTrendCollectionControllerContract$ModalStep;", "<init>", "()V", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecommendedBuysLearnMore implements InstrumentsTrendCollectionControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecommendedBuysLearnMore f74909a = new RecommendedBuysLearnMore();

        @NotNull
        public static final Parcelable.Creator<RecommendedBuysLearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecommendedBuysLearnMore.f74909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendedBuysLearnMore[i];
            }
        }

        private RecommendedBuysLearnMore() {
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
