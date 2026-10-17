package com.revolut.feature.revolut_shop.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import d3c.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/domain/model/FiscalProfileDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiscalProfileDetails implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f84192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f84193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f84194c;

    @NotNull
    public static final Parcelable.Creator<FiscalProfileDetails> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiscalProfileDetails((Address) parcel.readParcelable(FiscalProfileDetails.class.getClassLoader()), m0.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiscalProfileDetails[i];
        }
    }

    public FiscalProfileDetails(Address address, m0 vatType, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        this.f84192a = address;
        this.f84193b = vatType;
        this.f84194c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiscalProfileDetails)) {
            return false;
        }
        FiscalProfileDetails fiscalProfileDetails = (FiscalProfileDetails) obj2;
        return Intrinsics.f(this.f84192a, fiscalProfileDetails.f84192a) && this.f84193b == fiscalProfileDetails.f84193b && Intrinsics.f(this.f84194c, fiscalProfileDetails.f84194c);
    }

    public final int hashCode() {
        Address address = this.f84192a;
        int iHashCode = (this.f84193b.hashCode() + ((address == null ? 0 : address.hashCode()) * 31)) * 31;
        wi0.b bVar = this.f84194c;
        return iHashCode + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84192a, i);
        dest.writeString(this.f84193b.name());
        dest.writeSerializable(this.f84194c);
    }
}
