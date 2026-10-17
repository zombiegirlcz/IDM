package com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/mta/view_driver/ViewDriverScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewDriverScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ViewDriverScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDriver f75541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MtaAvailabilityContainer f75542b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ViewDriverScreenContract$InputData(AdditionalDriver.CREATOR.createFromParcel(parcel), MtaAvailabilityContainer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViewDriverScreenContract$InputData[i];
        }
    }

    public ViewDriverScreenContract$InputData(AdditionalDriver driver, MtaAvailabilityContainer mtaAvailability) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        this.f75541a = driver;
        this.f75542b = mtaAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ViewDriverScreenContract$InputData)) {
            return false;
        }
        ViewDriverScreenContract$InputData viewDriverScreenContract$InputData = (ViewDriverScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75541a, viewDriverScreenContract$InputData.f75541a) && Intrinsics.f(this.f75542b, viewDriverScreenContract$InputData.f75542b);
    }

    public final int hashCode() {
        return this.f75542b.hashCode() + (this.f75541a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75541a.writeToParcel(dest, i);
        this.f75542b.writeToParcel(dest, i);
    }
}
