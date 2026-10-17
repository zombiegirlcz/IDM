package com.revolut.feature.address.common.impl.flow.field_search.manual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/impl/flow/field_search/manual/AddManuallyScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddManuallyScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddManuallyScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f60971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f60973c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddManuallyScreenContract$InputData((Clause) parcel.readParcelable(AddManuallyScreenContract$InputData.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(AddManuallyScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(AddManuallyScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddManuallyScreenContract$InputData[i];
        }
    }

    public AddManuallyScreenContract$InputData(Clause fieldName, String str, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        this.f60971a = fieldName;
        this.f60972b = str;
        this.f60973c = analyticsProduct;
        this.d = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddManuallyScreenContract$InputData)) {
            return false;
        }
        AddManuallyScreenContract$InputData addManuallyScreenContract$InputData = (AddManuallyScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60971a, addManuallyScreenContract$InputData.f60971a) && Intrinsics.f(this.f60972b, addManuallyScreenContract$InputData.f60972b) && Intrinsics.f(this.f60973c, addManuallyScreenContract$InputData.f60973c) && Intrinsics.f(this.d, addManuallyScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60971a.hashCode() * 31;
        String str = this.f60972b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.f60973c;
        int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60971a, i);
        dest.writeString(this.f60972b);
        dest.writeParcelable(this.f60973c, i);
        dest.writeParcelable(this.d, i);
    }
}
