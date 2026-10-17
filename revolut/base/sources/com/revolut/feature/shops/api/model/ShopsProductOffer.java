package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsProductOffer;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsProductOffer implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f87064c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsProductOffer(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsProductOffer[i];
        }
    }

    public ShopsProductOffer(String id10, String str, Double d, String carouselId, String analyticsRef) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f87062a = id10;
        this.f87063b = str;
        this.f87064c = d;
        this.d = carouselId;
        this.e = analyticsRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsProductOffer)) {
            return false;
        }
        ShopsProductOffer shopsProductOffer = (ShopsProductOffer) obj2;
        return Intrinsics.f(this.f87062a, shopsProductOffer.f87062a) && Intrinsics.f(this.f87063b, shopsProductOffer.f87063b) && Intrinsics.f(this.f87064c, shopsProductOffer.f87064c) && Intrinsics.f(this.d, shopsProductOffer.d) && Intrinsics.f(this.e, shopsProductOffer.e);
    }

    public final int hashCode() {
        int iHashCode = this.f87062a.hashCode() * 31;
        String str = this.f87063b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f87064c;
        return this.e.hashCode() + p.a.c((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87062a);
        dest.writeString(this.f87063b);
        Double d = this.f87064c;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
