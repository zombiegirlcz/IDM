package com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/birth_place/screen/city/BirthCityScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BirthCityScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BirthCityScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f67179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BirthCity f67180b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BirthCityScreenContract$InputData((b) parcel.readSerializable(), (BirthCity) parcel.readParcelable(BirthCityScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BirthCityScreenContract$InputData[i];
        }
    }

    public BirthCityScreenContract$InputData(b countryCode, BirthCity preselectedCity) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(preselectedCity, "preselectedCity");
        this.f67179a = countryCode;
        this.f67180b = preselectedCity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BirthCityScreenContract$InputData)) {
            return false;
        }
        BirthCityScreenContract$InputData birthCityScreenContract$InputData = (BirthCityScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67179a, birthCityScreenContract$InputData.f67179a) && Intrinsics.f(this.f67180b, birthCityScreenContract$InputData.f67180b);
    }

    public final int hashCode() {
        return this.f67180b.hashCode() + (this.f67179a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67179a);
        dest.writeParcelable(this.f67180b, i);
    }
}
