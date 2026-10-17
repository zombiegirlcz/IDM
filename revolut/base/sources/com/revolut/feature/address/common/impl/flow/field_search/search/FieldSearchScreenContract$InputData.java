package com.revolut.feature.address.common.impl.flow.field_search.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import ei1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/impl/flow/field_search/search/FieldSearchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FieldSearchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FieldSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f60974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f60975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f60976c;
    public final boolean d;
    public final String e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f60977g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FieldSearchScreenContract$InputData((b) parcel.readSerializable(), (Clause) parcel.readParcelable(FieldSearchScreenContract$InputData.class.getClassLoader()), n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (AnalyticsProduct) parcel.readParcelable(FieldSearchScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(FieldSearchScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FieldSearchScreenContract$InputData[i];
        }
    }

    public FieldSearchScreenContract$InputData(b country, Clause fieldName, n searchType, boolean z, String str, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        this.f60974a = country;
        this.f60975b = fieldName;
        this.f60976c = searchType;
        this.d = z;
        this.e = str;
        this.f = analyticsProduct;
        this.f60977g = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FieldSearchScreenContract$InputData)) {
            return false;
        }
        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = (FieldSearchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60974a, fieldSearchScreenContract$InputData.f60974a) && Intrinsics.f(this.f60975b, fieldSearchScreenContract$InputData.f60975b) && this.f60976c == fieldSearchScreenContract$InputData.f60976c && this.d == fieldSearchScreenContract$InputData.d && Intrinsics.f(this.e, fieldSearchScreenContract$InputData.e) && Intrinsics.f(this.f, fieldSearchScreenContract$InputData.f) && Intrinsics.f(this.f60977g, fieldSearchScreenContract$InputData.f60977g);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f60976c.hashCode() + p.a.a(this.f60974a.f297794a.hashCode() * 31, 31, this.f60975b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.f;
        int iHashCode2 = (iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f60977g;
        return iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f60974a);
        dest.writeParcelable(this.f60975b, i);
        dest.writeString(this.f60976c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f60977g, i);
    }
}
