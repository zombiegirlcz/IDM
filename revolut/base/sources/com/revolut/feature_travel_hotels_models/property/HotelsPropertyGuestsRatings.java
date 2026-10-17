package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyGuestsRatings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyGuestsRatings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyGuestsRatings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98032b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyGuestReviewScore.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsPropertyGuestsRatings(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyGuestsRatings[i];
        }
    }

    public HotelsPropertyGuestsRatings(int i, List scores) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        this.f98031a = i;
        this.f98032b = scores;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyGuestsRatings)) {
            return false;
        }
        HotelsPropertyGuestsRatings hotelsPropertyGuestsRatings = (HotelsPropertyGuestsRatings) obj2;
        return this.f98031a == hotelsPropertyGuestsRatings.f98031a && Intrinsics.f(this.f98032b, hotelsPropertyGuestsRatings.f98032b);
    }

    public final int hashCode() {
        return this.f98032b.hashCode() + (Integer.hashCode(this.f98031a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98031a);
        Iterator itV = p.a.v(this.f98032b, dest);
        while (itV.hasNext()) {
            ((HotelsPropertyGuestReviewScore) itV.next()).writeToParcel(dest, i);
        }
    }
}
