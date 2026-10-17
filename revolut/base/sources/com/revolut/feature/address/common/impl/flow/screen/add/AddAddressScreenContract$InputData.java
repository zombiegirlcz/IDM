package com.revolut.feature.address.common.impl.flow.screen.add;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.address.common.api.flow.AddressFlowUseCase;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qh1.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddAddressScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddAddressScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f60978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60980c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f60981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f60982h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FieldMode f60983j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f60984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f60985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f60986n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnalyticsProduct f60987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsContext f60988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f60990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AddressFlowUseCase f60991t;
    public final AddressValidationMode u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Address address = (Address) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            Clause clause = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            Clause clause4 = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            Clause clause5 = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            Clause clause6 = (Clause) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            FieldMode fieldMode = (FieldMode) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z6 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            return new AddAddressScreenContract$InputData((AnalyticsContext) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader()), clause, clause2, clause3, clause4, clause5, clause6, (AddressFlowUseCase) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader()), (AddressValidationMode) parcel.readParcelable(AddAddressScreenContract$InputData.class.getClassLoader()), fieldMode, address, bVarValueOf, z, z3, z4, z6, z11, z12, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddAddressScreenContract$InputData[i];
        }
    }

    public AddAddressScreenContract$InputData(AnalyticsContext analyticsContext, AnalyticsProduct analyticsProduct, Clause title, Clause clause, Clause clause2, Clause clause3, Clause clause4, Clause clause5, AddressFlowUseCase useCase, AddressValidationMode addressValidationMode, FieldMode countryMode, Address address, b backNavigationType, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(addressValidationMode, "addressValidationMode");
        this.f60978a = address;
        this.f60979b = z;
        this.f60980c = title;
        this.d = clause;
        this.e = clause2;
        this.f = z3;
        this.f60981g = clause3;
        this.f60982h = clause4;
        this.i = clause5;
        this.f60983j = countryMode;
        this.k = z4;
        this.f60984l = backNavigationType;
        this.f60985m = z6;
        this.f60986n = z11;
        this.o = z12;
        this.f60987p = analyticsProduct;
        this.f60988q = analyticsContext;
        this.f60989r = z29;
        this.f60990s = z31;
        this.f60991t = useCase;
        this.u = addressValidationMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddAddressScreenContract$InputData)) {
            return false;
        }
        AddAddressScreenContract$InputData addAddressScreenContract$InputData = (AddAddressScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60978a, addAddressScreenContract$InputData.f60978a) && this.f60979b == addAddressScreenContract$InputData.f60979b && Intrinsics.f(this.f60980c, addAddressScreenContract$InputData.f60980c) && Intrinsics.f(this.d, addAddressScreenContract$InputData.d) && Intrinsics.f(this.e, addAddressScreenContract$InputData.e) && this.f == addAddressScreenContract$InputData.f && Intrinsics.f(this.f60981g, addAddressScreenContract$InputData.f60981g) && Intrinsics.f(this.f60982h, addAddressScreenContract$InputData.f60982h) && Intrinsics.f(this.i, addAddressScreenContract$InputData.i) && Intrinsics.f(this.f60983j, addAddressScreenContract$InputData.f60983j) && this.k == addAddressScreenContract$InputData.k && this.f60984l == addAddressScreenContract$InputData.f60984l && this.f60985m == addAddressScreenContract$InputData.f60985m && this.f60986n == addAddressScreenContract$InputData.f60986n && this.o == addAddressScreenContract$InputData.o && Intrinsics.f(this.f60987p, addAddressScreenContract$InputData.f60987p) && Intrinsics.f(this.f60988q, addAddressScreenContract$InputData.f60988q) && this.f60989r == addAddressScreenContract$InputData.f60989r && this.f60990s == addAddressScreenContract$InputData.f60990s && Intrinsics.f(this.f60991t, addAddressScreenContract$InputData.f60991t) && Intrinsics.f(this.u, addAddressScreenContract$InputData.u);
    }

    public final int hashCode() {
        int iA = p.a.a(j6.a.c(this.f60978a.hashCode() * 31, 31, this.f60979b), 31, this.f60980c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iC = j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f);
        Clause clause3 = this.f60981g;
        int iHashCode2 = (iC + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f60982h;
        int iHashCode3 = (iHashCode2 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.i;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((this.f60984l.hashCode() + j6.a.c((this.f60983j.hashCode() + ((iHashCode3 + (clause5 == null ? 0 : clause5.hashCode())) * 31)) * 31, 31, this.k)) * 31, 31, this.f60985m), 31, this.f60986n), 31, this.o);
        AnalyticsProduct analyticsProduct = this.f60987p;
        int iHashCode4 = (iC2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f60988q;
        return this.u.hashCode() + ((this.f60991t.hashCode() + j6.a.c(j6.a.c((iHashCode4 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31, 31, this.f60989r), 31, this.f60990s)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60978a, i);
        dest.writeInt(this.f60979b ? 1 : 0);
        dest.writeParcelable(this.f60980c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f60981g, i);
        dest.writeParcelable(this.f60982h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f60983j, i);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeString(this.f60984l.name());
        dest.writeInt(this.f60985m ? 1 : 0);
        dest.writeInt(this.f60986n ? 1 : 0);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeParcelable(this.f60987p, i);
        dest.writeParcelable(this.f60988q, i);
        dest.writeInt(this.f60989r ? 1 : 0);
        dest.writeInt(this.f60990s ? 1 : 0);
        dest.writeParcelable(this.f60991t, i);
        dest.writeParcelable(this.u, i);
    }
}
