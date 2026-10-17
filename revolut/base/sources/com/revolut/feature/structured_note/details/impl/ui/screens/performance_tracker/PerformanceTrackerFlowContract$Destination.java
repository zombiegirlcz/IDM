package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/PerformanceTrackerFlowContract$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerformanceTrackerFlowContract$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PerformanceTrackerFlowContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerformanceTrackerFlowContract$InputData f88904a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerformanceTrackerFlowContract$Destination(PerformanceTrackerFlowContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerformanceTrackerFlowContract$Destination[i];
        }
    }

    public PerformanceTrackerFlowContract$Destination(PerformanceTrackerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f88904a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PerformanceTrackerFlowContract$Destination) && Intrinsics.f(this.f88904a, ((PerformanceTrackerFlowContract$Destination) obj2).f88904a);
    }

    public final int hashCode() {
        return this.f88904a.f88905a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88904a.writeToParcel(dest, i);
    }
}
