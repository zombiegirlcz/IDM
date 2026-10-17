package com.revolut.feature.travel.flights.models.domain.extra_products;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o7g.b;
import o7g.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/extra_products/TravelFlightsExtraProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "o7g/b", "o7g/d", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsExtraProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsExtraProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f93503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93505c;
    public final String d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            d dVarValueOf = d.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsExtraProductOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelFlightsExtraProduct(bVarValueOf, dVarValueOf, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsExtraProduct[i];
        }
    }

    public TravelFlightsExtraProduct(b category, d subType, String name, String description, ArrayList options) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f93503a = category;
        this.f93504b = subType;
        this.f93505c = name;
        this.d = description;
        this.e = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsExtraProduct)) {
            return false;
        }
        TravelFlightsExtraProduct travelFlightsExtraProduct = (TravelFlightsExtraProduct) obj2;
        return this.f93503a == travelFlightsExtraProduct.f93503a && this.f93504b == travelFlightsExtraProduct.f93504b && Intrinsics.f(this.f93505c, travelFlightsExtraProduct.f93505c) && Intrinsics.f(this.d, travelFlightsExtraProduct.d) && this.e.equals(travelFlightsExtraProduct.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c((this.f93504b.hashCode() + (this.f93503a.hashCode() * 31)) * 31, 31, this.f93505c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93503a.name());
        dest.writeString(this.f93504b.name());
        dest.writeString(this.f93505c);
        dest.writeString(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((TravelFlightsExtraProductOption) itY.next()).writeToParcel(dest, i);
        }
    }
}
