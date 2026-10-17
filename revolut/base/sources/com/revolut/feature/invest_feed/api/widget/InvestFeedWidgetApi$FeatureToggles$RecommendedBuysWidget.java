package com.revolut.feature.invest_feed.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/invest_feed/api/widget/InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_invest_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget f76455c = new InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget();

    @NotNull
    public static final Parcelable.Creator<InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget.f76455c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget[i];
        }
    }

    private InvestFeedWidgetApi$FeatureToggles$RecommendedBuysWidget() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("investRecommendedBuysWidget");
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
