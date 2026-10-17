package com.revolut.feature.instruments.trend.collections.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/instruments/trend/collections/api/InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked f74892c = new InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked();

    @NotNull
    public static final Parcelable.Creator<InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked.f74892c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked[i];
        }
    }

    private InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("investRecommendedBuysLocked");
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
