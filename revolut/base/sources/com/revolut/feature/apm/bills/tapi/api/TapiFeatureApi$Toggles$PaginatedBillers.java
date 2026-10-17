package com.revolut.feature.apm.bills.tapi.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/apm/bills/tapi/api/TapiFeatureApi$Toggles$PaginatedBillers", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_apm_bills_tapi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TapiFeatureApi$Toggles$PaginatedBillers extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TapiFeatureApi$Toggles$PaginatedBillers f61530c = new TapiFeatureApi$Toggles$PaginatedBillers();

    @NotNull
    public static final Parcelable.Creator<TapiFeatureApi$Toggles$PaginatedBillers> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return TapiFeatureApi$Toggles$PaginatedBillers.f61530c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TapiFeatureApi$Toggles$PaginatedBillers[i];
        }
    }

    private TapiFeatureApi$Toggles$PaginatedBillers() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("tapiPaginatedBillers");
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
