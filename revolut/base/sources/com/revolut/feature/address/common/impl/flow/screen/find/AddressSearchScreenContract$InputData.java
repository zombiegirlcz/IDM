package com.revolut.feature.address.common.impl.flow.screen.find;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/impl/flow/screen/find/AddressSearchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSearchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f61010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f61011c;
    public final AddressFormat d;
    public final AddressSearchScreenContract$LocationSearchMode e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressSearchScreenContract$InputData(parcel.readString(), (AnalyticsProduct) parcel.readParcelable(AddressSearchScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(AddressSearchScreenContract$InputData.class.getClassLoader()), AddressFormat.valueOf(parcel.readString()), (AddressSearchScreenContract$LocationSearchMode) parcel.readParcelable(AddressSearchScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressSearchScreenContract$InputData[i];
        }
    }

    public AddressSearchScreenContract$InputData(String country, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, AddressFormat addressFormat, AddressSearchScreenContract$LocationSearchMode locationSearchMode) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(addressFormat, "addressFormat");
        Intrinsics.checkNotNullParameter(locationSearchMode, "locationSearchMode");
        this.f61009a = country;
        this.f61010b = analyticsProduct;
        this.f61011c = analyticsContext;
        this.d = addressFormat;
        this.e = locationSearchMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressSearchScreenContract$InputData)) {
            return false;
        }
        AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = (AddressSearchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f61009a, addressSearchScreenContract$InputData.f61009a) && Intrinsics.f(this.f61010b, addressSearchScreenContract$InputData.f61010b) && Intrinsics.f(this.f61011c, addressSearchScreenContract$InputData.f61011c) && this.d == addressSearchScreenContract$InputData.d && Intrinsics.f(this.e, addressSearchScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f61009a.hashCode() * 31;
        AnalyticsProduct analyticsProduct = this.f61010b;
        int iHashCode2 = (iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f61011c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61009a);
        dest.writeParcelable(this.f61010b, i);
        dest.writeParcelable(this.f61011c, i);
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
    }
}
