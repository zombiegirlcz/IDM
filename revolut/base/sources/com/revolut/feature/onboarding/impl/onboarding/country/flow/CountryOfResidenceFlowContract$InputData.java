package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryOfResidenceFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CountryOfResidenceFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f78401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t89.a f78402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rbl.a f78403c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryOfResidenceFlowContract$InputData((wi0.b) parcel.readSerializable(), t89.a.valueOf(parcel.readString()), rbl.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryOfResidenceFlowContract$InputData[i];
        }
    }

    public CountryOfResidenceFlowContract$InputData(wi0.b countryCode, t89.a countryTerms, rbl.a backNavigationType, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f78401a = countryCode;
        this.f78402b = countryTerms;
        this.f78403c = backNavigationType;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountryOfResidenceFlowContract$InputData)) {
            return false;
        }
        CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = (CountryOfResidenceFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78401a, countryOfResidenceFlowContract$InputData.f78401a) && this.f78402b == countryOfResidenceFlowContract$InputData.f78402b && this.f78403c == countryOfResidenceFlowContract$InputData.f78403c && this.d == countryOfResidenceFlowContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f78403c.hashCode() + ((this.f78402b.hashCode() + (this.f78401a.f297794a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78401a);
        dest.writeString(this.f78402b.name());
        dest.writeString(this.f78403c.name());
        dest.writeInt(this.d ? 1 : 0);
    }
}
