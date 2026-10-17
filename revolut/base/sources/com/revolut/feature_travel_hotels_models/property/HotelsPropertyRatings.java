package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyRatings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyRatings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyRatings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f98044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsPropertyGuestsReviews f98045b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyRatings(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), HotelsPropertyGuestsReviews.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyRatings[i];
        }
    }

    public HotelsPropertyRatings(Double d, HotelsPropertyGuestsReviews guestReviews) {
        Intrinsics.checkNotNullParameter(guestReviews, "guestReviews");
        this.f98044a = d;
        this.f98045b = guestReviews;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyRatings)) {
            return false;
        }
        HotelsPropertyRatings hotelsPropertyRatings = (HotelsPropertyRatings) obj2;
        return Intrinsics.f(this.f98044a, hotelsPropertyRatings.f98044a) && Intrinsics.f(this.f98045b, hotelsPropertyRatings.f98045b);
    }

    public final int hashCode() {
        Double d = this.f98044a;
        return this.f98045b.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Double d = this.f98044a;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        this.f98045b.writeToParcel(dest, i);
    }
}
