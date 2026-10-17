package com.revolut.feature.address.common.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/api/navigation/SelectAddressControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAddressControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectAddressControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f60962c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAddressControllerDescriptor$InputData(parcel.readString(), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(SelectAddressControllerDescriptor$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(SelectAddressControllerDescriptor$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAddressControllerDescriptor$InputData[i];
        }
    }

    public SelectAddressControllerDescriptor$InputData(String country, String postalCode, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        this.f60960a = country;
        this.f60961b = postalCode;
        this.f60962c = analyticsProduct;
        this.d = analyticsContext;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF60960a() {
        return this.f60960a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAddressControllerDescriptor$InputData)) {
            return false;
        }
        SelectAddressControllerDescriptor$InputData selectAddressControllerDescriptor$InputData = (SelectAddressControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f60960a, selectAddressControllerDescriptor$InputData.f60960a) && Intrinsics.f(this.f60961b, selectAddressControllerDescriptor$InputData.f60961b) && Intrinsics.f(this.f60962c, selectAddressControllerDescriptor$InputData.f60962c) && Intrinsics.f(this.d, selectAddressControllerDescriptor$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60960a.hashCode() * 31, 31, this.f60961b);
        AnalyticsProduct analyticsProduct = this.f60962c;
        int iHashCode = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60960a);
        dest.writeString(this.f60961b);
        dest.writeParcelable(this.f60962c, i);
        dest.writeParcelable(this.d, i);
    }
}
