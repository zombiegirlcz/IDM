package com.revolut.feature.address.common.api.navigation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/api/navigation/FindAddressControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FindAddressControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FindAddressControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f60958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f60959c;
    public final AddressFormat d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FindAddressControllerDescriptor$InputData(parcel.readString(), (AnalyticsProduct) parcel.readParcelable(FindAddressControllerDescriptor$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(FindAddressControllerDescriptor$InputData.class.getClassLoader()), AddressFormat.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FindAddressControllerDescriptor$InputData[i];
        }
    }

    public FindAddressControllerDescriptor$InputData(String country, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, AddressFormat addressFormat) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(addressFormat, "addressFormat");
        this.f60957a = country;
        this.f60958b = analyticsProduct;
        this.f60959c = analyticsContext;
        this.d = addressFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FindAddressControllerDescriptor$InputData)) {
            return false;
        }
        FindAddressControllerDescriptor$InputData findAddressControllerDescriptor$InputData = (FindAddressControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f60957a, findAddressControllerDescriptor$InputData.f60957a) && Intrinsics.f(this.f60958b, findAddressControllerDescriptor$InputData.f60958b) && Intrinsics.f(this.f60959c, findAddressControllerDescriptor$InputData.f60959c) && this.d == findAddressControllerDescriptor$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f60957a.hashCode() * 31;
        AnalyticsProduct analyticsProduct = this.f60958b;
        int iHashCode2 = (iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f60959c;
        return this.d.hashCode() + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60957a);
        dest.writeParcelable(this.f60958b, i);
        dest.writeParcelable(this.f60959c, i);
        dest.writeString(this.d.name());
    }

    public /* synthetic */ FindAddressControllerDescriptor$InputData(String str, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, int i) {
        this(str, analyticsProduct, (i & 4) != 0 ? null : analyticsContext, AddressFormat.INTERNATIONAL);
    }
}
