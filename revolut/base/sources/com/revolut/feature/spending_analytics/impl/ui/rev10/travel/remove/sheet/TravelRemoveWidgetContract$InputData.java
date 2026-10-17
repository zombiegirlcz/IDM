package com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/sheet/TravelRemoveWidgetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelRemoveWidgetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelRemoveWidgetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f88054b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelRemoveWidgetContract$InputData((WidgetContext) parcel.readParcelable(TravelRemoveWidgetContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelRemoveWidgetContract$InputData[i];
        }
    }

    public TravelRemoveWidgetContract$InputData(WidgetContext widgetContext, String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        this.f88053a = widgetListId;
        this.f88054b = widgetContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelRemoveWidgetContract$InputData)) {
            return false;
        }
        TravelRemoveWidgetContract$InputData travelRemoveWidgetContract$InputData = (TravelRemoveWidgetContract$InputData) obj2;
        return Intrinsics.f(this.f88053a, travelRemoveWidgetContract$InputData.f88053a) && Intrinsics.f(this.f88054b, travelRemoveWidgetContract$InputData.f88054b);
    }

    public final int hashCode() {
        return this.f88054b.hashCode() + (this.f88053a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88053a);
        dest.writeParcelable(this.f88054b, i);
    }
}
