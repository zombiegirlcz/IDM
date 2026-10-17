package com.revolut.feature.address.common.api.flow;

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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import qh1.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/api/flow/AddressFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f60926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f60927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60928c;
    public final Clause d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f60929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FieldMode f60930h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f60931j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f60932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f60933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f60934n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnalyticsProduct f60935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsContext f60936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f60938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AddressFlowUseCase f60939t;
    public final AddressValidationMode u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Address address = (Address) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            Clause clause = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            Clause clause4 = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            FieldMode fieldMode = (FieldMode) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            Clause clause5 = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            Clause clause6 = (Clause) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z6 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            return new AddressFlowContract$InputData((AnalyticsContext) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader()), clause, clause2, clause3, clause4, clause5, clause6, (AddressFlowUseCase) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader()), (AddressValidationMode) parcel.readParcelable(AddressFlowContract$InputData.class.getClassLoader()), fieldMode, address, bVarValueOf, z, z3, z4, z6, z11, z12, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressFlowContract$InputData[i];
        }
    }

    public AddressFlowContract$InputData(AnalyticsContext analyticsContext, AnalyticsProduct analyticsProduct, Clause title, Clause clause, Clause clause2, Clause clause3, Clause clause4, Clause clause5, AddressFlowUseCase useCase, AddressValidationMode addressValidationMode, FieldMode countryMode, Address address, b backNavigationType, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(addressValidationMode, "addressValidationMode");
        this.f60926a = address;
        this.f60927b = title;
        this.f60928c = clause;
        this.d = clause2;
        this.e = z;
        this.f = z3;
        this.f60929g = clause3;
        this.f60930h = countryMode;
        this.i = clause4;
        this.f60931j = clause5;
        this.k = z4;
        this.f60932l = backNavigationType;
        this.f60933m = z6;
        this.f60934n = z11;
        this.o = z12;
        this.f60935p = analyticsProduct;
        this.f60936q = analyticsContext;
        this.f60937r = z29;
        this.f60938s = z31;
        this.f60939t = useCase;
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
        if (!(obj2 instanceof AddressFlowContract$InputData)) {
            return false;
        }
        AddressFlowContract$InputData addressFlowContract$InputData = (AddressFlowContract$InputData) obj2;
        return Intrinsics.f(this.f60926a, addressFlowContract$InputData.f60926a) && Intrinsics.f(this.f60927b, addressFlowContract$InputData.f60927b) && Intrinsics.f(this.f60928c, addressFlowContract$InputData.f60928c) && Intrinsics.f(this.d, addressFlowContract$InputData.d) && this.e == addressFlowContract$InputData.e && this.f == addressFlowContract$InputData.f && Intrinsics.f(this.f60929g, addressFlowContract$InputData.f60929g) && Intrinsics.f(this.f60930h, addressFlowContract$InputData.f60930h) && Intrinsics.f(this.i, addressFlowContract$InputData.i) && Intrinsics.f(this.f60931j, addressFlowContract$InputData.f60931j) && this.k == addressFlowContract$InputData.k && this.f60932l == addressFlowContract$InputData.f60932l && this.f60933m == addressFlowContract$InputData.f60933m && this.f60934n == addressFlowContract$InputData.f60934n && this.o == addressFlowContract$InputData.o && Intrinsics.f(this.f60935p, addressFlowContract$InputData.f60935p) && Intrinsics.f(this.f60936q, addressFlowContract$InputData.f60936q) && this.f60937r == addressFlowContract$InputData.f60937r && this.f60938s == addressFlowContract$InputData.f60938s && Intrinsics.f(this.f60939t, addressFlowContract$InputData.f60939t) && Intrinsics.f(this.u, addressFlowContract$InputData.u);
    }

    public final int hashCode() {
        Address address = this.f60926a;
        int iA = p.a.a((address == null ? 0 : address.hashCode()) * 31, 31, this.f60927b);
        Clause clause = this.f60928c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.e), 31, this.f);
        Clause clause3 = this.f60929g;
        int iHashCode2 = (this.f60930h.hashCode() + ((iC + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31;
        Clause clause4 = this.i;
        int iHashCode3 = (iHashCode2 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.f60931j;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((this.f60932l.hashCode() + j6.a.c((iHashCode3 + (clause5 == null ? 0 : clause5.hashCode())) * 31, 31, this.k)) * 31, 31, this.f60933m), 31, this.f60934n), 31, this.o);
        AnalyticsProduct analyticsProduct = this.f60935p;
        int iHashCode4 = (iC2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f60936q;
        return this.u.hashCode() + ((this.f60939t.hashCode() + j6.a.c(j6.a.c((iHashCode4 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31, 31, this.f60937r), 31, this.f60938s)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60926a, i);
        dest.writeParcelable(this.f60927b, i);
        dest.writeParcelable(this.f60928c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f60929g, i);
        dest.writeParcelable(this.f60930h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f60931j, i);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeString(this.f60932l.name());
        dest.writeInt(this.f60933m ? 1 : 0);
        dest.writeInt(this.f60934n ? 1 : 0);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeParcelable(this.f60935p, i);
        dest.writeParcelable(this.f60936q, i);
        dest.writeInt(this.f60937r ? 1 : 0);
        dest.writeInt(this.f60938s ? 1 : 0);
        dest.writeParcelable(this.f60939t, i);
        dest.writeParcelable(this.u, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressFlowContract$InputData(Address address, Clause clause, Clause clause2, boolean z, Clause clause3, FieldMode fieldMode, b bVar, AnalyticsProduct analyticsProduct, boolean z3, AddressValidationMode addressValidationMode, int i) {
        AddressFlowUseCase addressFlowUseCase;
        Address address2 = (i & 1) != 0 ? null : address;
        Clause clause4 = (i & 8) != 0 ? null : clause2;
        boolean z4 = (i & 16) == 0;
        boolean z6 = (i & 32) != 0 ? false : z;
        Clause clause5 = (i & 64) != 0 ? null : clause3;
        FieldMode editable = (i & 128) != 0 ? new FieldMode.Editable(true) : fieldMode;
        b bVar2 = (i & 2048) != 0 ? b.BACK : bVar;
        boolean z11 = (i & 16384) == 0;
        AnalyticsProduct analyticsProduct2 = (32768 & i) != 0 ? null : analyticsProduct;
        boolean z12 = (131072 & i) != 0 ? false : z3;
        boolean z29 = (262144 & i) == 0;
        if ((524288 & i) != 0) {
            addressFlowUseCase = AddressFlowUseCase.Default.f60949a;
        } else {
            addressFlowUseCase = AddressFlowUseCase.RetailExclusiveStoreCheckout.f60950a;
        }
        this(null, analyticsProduct2, clause, null, clause4, clause5, null, null, addressFlowUseCase, (i & PKIFailureInfo.badCertTemplate) != 0 ? AddressValidationMode.Validation.f60951a : addressValidationMode, editable, address2, bVar2, z4, z6, false, false, false, z11, z12, z29);
    }
}
