package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/modals/disclaimer_acceptance/AirportLoungesDisclaimerAcceptanceContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesDisclaimerAcceptanceContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesDisclaimerAcceptanceContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesDisclaimer f99133a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesDisclaimerAcceptanceContract$InputData((AirportLoungesDisclaimer) parcel.readParcelable(AirportLoungesDisclaimerAcceptanceContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesDisclaimerAcceptanceContract$InputData[i];
        }
    }

    public AirportLoungesDisclaimerAcceptanceContract$InputData(AirportLoungesDisclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f99133a = disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AirportLoungesDisclaimerAcceptanceContract$InputData) && Intrinsics.f(this.f99133a, ((AirportLoungesDisclaimerAcceptanceContract$InputData) obj2).f99133a);
    }

    public final int hashCode() {
        return this.f99133a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99133a, i);
    }
}
