package com.revolut.feature.shared.asset.trade.actions.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/shared/asset/trade/actions/ui/api/SwipeAssetTradeActionsApi$Toggles$SwipeActions", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_shared_asset_trade_actions_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeAssetTradeActionsApi$Toggles$SwipeActions extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SwipeAssetTradeActionsApi$Toggles$SwipeActions f86033c = new SwipeAssetTradeActionsApi$Toggles$SwipeActions();

    @NotNull
    public static final Parcelable.Creator<SwipeAssetTradeActionsApi$Toggles$SwipeActions> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SwipeAssetTradeActionsApi$Toggles$SwipeActions[i];
        }
    }

    private SwipeAssetTradeActionsApi$Toggles$SwipeActions() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("investSwipeActions");
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
