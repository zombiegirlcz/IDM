package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsDeeplinkOffer;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsDeeplinkOffer implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsDeeplinkOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87044c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsDeeplinkOffer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsDeeplinkOffer[i];
        }
    }

    public ShopsDeeplinkOffer(String deeplink, String str, String carouselId, int i) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f87042a = deeplink;
        this.f87043b = str;
        this.f87044c = carouselId;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsDeeplinkOffer)) {
            return false;
        }
        ShopsDeeplinkOffer shopsDeeplinkOffer = (ShopsDeeplinkOffer) obj2;
        return Intrinsics.f(this.f87042a, shopsDeeplinkOffer.f87042a) && Intrinsics.f(this.f87043b, shopsDeeplinkOffer.f87043b) && Intrinsics.f(this.f87044c, shopsDeeplinkOffer.f87044c) && this.d == shopsDeeplinkOffer.d;
    }

    public final int hashCode() {
        int iHashCode = this.f87042a.hashCode() * 31;
        String str = this.f87043b;
        return Integer.hashCode(this.d) + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f87044c);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getF87043b() {
        return this.f87043b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87042a);
        dest.writeString(this.f87043b);
        dest.writeString(this.f87044c);
        dest.writeInt(this.d);
    }
}
