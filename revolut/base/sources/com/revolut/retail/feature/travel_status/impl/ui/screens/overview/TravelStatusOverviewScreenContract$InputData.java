package com.revolut.retail.feature.travel_status.impl.ui.screens.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/travel_status/impl/ui/screens/overview/TravelStatusOverviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelStatusOverviewScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TravelStatusOverviewScreenContract$InputData f104316a = new TravelStatusOverviewScreenContract$InputData();

    @NotNull
    public static final Parcelable.Creator<TravelStatusOverviewScreenContract$InputData> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return TravelStatusOverviewScreenContract$InputData.f104316a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelStatusOverviewScreenContract$InputData[i];
        }
    }

    private TravelStatusOverviewScreenContract$InputData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof TravelStatusOverviewScreenContract$InputData);
    }

    public final int hashCode() {
        return -1258760403;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
