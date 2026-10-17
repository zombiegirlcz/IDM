package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsWaitlistOffer;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsWaitlistOffer implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsWaitlistOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87078b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsWaitlistOffer(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsWaitlistOffer[i];
        }
    }

    public ShopsWaitlistOffer(String carouselId, String analyticsRef) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f87077a = carouselId;
        this.f87078b = analyticsRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsWaitlistOffer)) {
            return false;
        }
        ShopsWaitlistOffer shopsWaitlistOffer = (ShopsWaitlistOffer) obj2;
        return Intrinsics.f(this.f87077a, shopsWaitlistOffer.f87077a) && Intrinsics.f(this.f87078b, shopsWaitlistOffer.f87078b);
    }

    public final int hashCode() {
        return this.f87078b.hashCode() + (this.f87077a.hashCode() * 31);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getF87078b() {
        return this.f87078b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87077a);
        dest.writeString(this.f87078b);
    }
}
