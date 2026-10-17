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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyGuestsReviews;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyGuestsReviews implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyGuestsReviews> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f98035c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyGuestReviewScore.CREATOR, parcel, arrayList2, iA2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyGuestReview.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            return new HotelsPropertyGuestsReviews(arrayList2, i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyGuestsReviews[i];
        }
    }

    public HotelsPropertyGuestsReviews(List scores, int i, List list) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        this.f98033a = i;
        this.f98034b = scores;
        this.f98035c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyGuestsReviews)) {
            return false;
        }
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews = (HotelsPropertyGuestsReviews) obj2;
        return this.f98033a == hotelsPropertyGuestsReviews.f98033a && Intrinsics.f(this.f98034b, hotelsPropertyGuestsReviews.f98034b) && Intrinsics.f(this.f98035c, hotelsPropertyGuestsReviews.f98035c);
    }

    public final int hashCode() {
        int iD = p.a.d(Integer.hashCode(this.f98033a) * 31, 31, this.f98034b);
        List list = this.f98035c;
        return iD + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98033a);
        Iterator itV = p.a.v(this.f98034b, dest);
        while (itV.hasNext()) {
            ((HotelsPropertyGuestReviewScore) itV.next()).writeToParcel(dest, i);
        }
        List list = this.f98035c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((HotelsPropertyGuestReview) itQ.next()).writeToParcel(dest, i);
        }
    }
}
