package com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/travel_status/impl/ui/screens/enrollment/TravelStatusEnrollmentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelStatusEnrollmentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelStatusEnrollmentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelStatusLinkAccountInfo f104315b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelStatusEnrollmentScreenContract$InputData(parcel.readString(), TravelStatusLinkAccountInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelStatusEnrollmentScreenContract$InputData[i];
        }
    }

    public TravelStatusEnrollmentScreenContract$InputData(String partnerId, TravelStatusLinkAccountInfo linkAccountInfo) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        this.f104314a = partnerId;
        this.f104315b = linkAccountInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelStatusEnrollmentScreenContract$InputData)) {
            return false;
        }
        TravelStatusEnrollmentScreenContract$InputData travelStatusEnrollmentScreenContract$InputData = (TravelStatusEnrollmentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f104314a, travelStatusEnrollmentScreenContract$InputData.f104314a) && Intrinsics.f(this.f104315b, travelStatusEnrollmentScreenContract$InputData.f104315b);
    }

    public final int hashCode() {
        return this.f104315b.hashCode() + (this.f104314a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104314a);
        this.f104315b.writeToParcel(dest, i);
    }
}
