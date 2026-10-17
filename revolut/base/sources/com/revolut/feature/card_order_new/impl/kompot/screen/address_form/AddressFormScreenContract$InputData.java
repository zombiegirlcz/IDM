package com.revolut.feature.card_order_new.impl.kompot.screen.address_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/address_form/AddressFormScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressFormScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressFormScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f65117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f65119c;
    public final Clause d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f65120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FieldMode f65121h;
    public final qh1.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f65122j;
    public final AnalyticsProduct k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnalyticsContext f65123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f65124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f65125n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f65126p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Address address = (Address) j6.a.f(parcel, "parcel", AddressFormScreenContract$InputData.class);
            boolean z = parcel.readInt() != 0;
            Clause clause = (Clause) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            FieldMode fieldMode = (FieldMode) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            qh1.b bVarValueOf = qh1.b.valueOf(parcel.readString());
            boolean z3 = parcel.readInt() != 0;
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(AddressFormScreenContract$InputData.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z12 = z;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new AddressFormScreenContract$InputData(address, z12, clause, clause2, clause3, image, clause4, fieldMode, bVarValueOf, z3, analyticsProduct, analyticsContext, z4, z6, z11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressFormScreenContract$InputData[i];
        }
    }

    public AddressFormScreenContract$InputData(Address address, boolean z, Clause title, Clause clause, Clause clause2, Image image, Clause clause3, FieldMode countryMode, qh1.b backNavigationType, boolean z3, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z4, boolean z6, boolean z11, List allowedCardDeliveryCountries) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(allowedCardDeliveryCountries, "allowedCardDeliveryCountries");
        this.f65117a = address;
        this.f65118b = z;
        this.f65119c = title;
        this.d = clause;
        this.e = clause2;
        this.f = image;
        this.f65120g = clause3;
        this.f65121h = countryMode;
        this.i = backNavigationType;
        this.f65122j = z3;
        this.k = analyticsProduct;
        this.f65123l = analyticsContext;
        this.f65124m = z4;
        this.f65125n = z6;
        this.o = z11;
        this.f65126p = allowedCardDeliveryCountries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressFormScreenContract$InputData)) {
            return false;
        }
        AddressFormScreenContract$InputData addressFormScreenContract$InputData = (AddressFormScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65117a, addressFormScreenContract$InputData.f65117a) && this.f65118b == addressFormScreenContract$InputData.f65118b && Intrinsics.f(this.f65119c, addressFormScreenContract$InputData.f65119c) && Intrinsics.f(this.d, addressFormScreenContract$InputData.d) && Intrinsics.f(this.e, addressFormScreenContract$InputData.e) && Intrinsics.f(this.f, addressFormScreenContract$InputData.f) && Intrinsics.f(this.f65120g, addressFormScreenContract$InputData.f65120g) && Intrinsics.f(this.f65121h, addressFormScreenContract$InputData.f65121h) && this.i == addressFormScreenContract$InputData.i && this.f65122j == addressFormScreenContract$InputData.f65122j && Intrinsics.f(this.k, addressFormScreenContract$InputData.k) && Intrinsics.f(this.f65123l, addressFormScreenContract$InputData.f65123l) && this.f65124m == addressFormScreenContract$InputData.f65124m && this.f65125n == addressFormScreenContract$InputData.f65125n && this.o == addressFormScreenContract$InputData.o && Intrinsics.f(this.f65126p, addressFormScreenContract$InputData.f65126p);
    }

    public final int hashCode() {
        int iA = p.a.a(j6.a.c(this.f65117a.hashCode() * 31, 31, this.f65118b), 31, this.f65119c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause3 = this.f65120g;
        int iC = j6.a.c((this.i.hashCode() + ((this.f65121h.hashCode() + ((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31)) * 31, 31, this.f65122j);
        AnalyticsProduct analyticsProduct = this.k;
        int iHashCode4 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f65123l;
        return this.f65126p.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31, 31, this.f65124m), 31, this.f65125n), 31, this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65117a, i);
        dest.writeInt(this.f65118b ? 1 : 0);
        dest.writeParcelable(this.f65119c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f65120g, i);
        dest.writeParcelable(this.f65121h, i);
        dest.writeString(this.i.name());
        dest.writeInt(this.f65122j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f65123l, i);
        dest.writeInt(this.f65124m ? 1 : 0);
        dest.writeInt(this.f65125n ? 1 : 0);
        dest.writeInt(this.o ? 1 : 0);
        Iterator itV = p.a.v(this.f65126p, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }

    public /* synthetic */ AddressFormScreenContract$InputData(Address address, boolean z, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, FieldMode fieldMode, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z3, List list, int i) {
        this(address, z, textLocalisedClause, null, null, null, (i & 64) != 0 ? null : textLocalisedClause2, fieldMode, qh1.b.BACK, true, analyticsProduct, (i & 2048) != 0 ? null : analyticsContext, false, (i & 8192) == 0, (i & 16384) != 0 ? false : z3, list);
    }
}
