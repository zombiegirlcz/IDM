package com.revolut.feature_travel_hotels_models.property;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyGuestReview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyGuestReview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyGuestReview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f98023c;
    public final String d;
    public final HotelsPropertyGuestReviewSource e;
    public final HotelsPropertyGuestReviewContent f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            long j2 = parcel.readLong();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPropertyGuestReviewScore.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsPropertyGuestReview(i, j2, arrayList, parcel.readString(), HotelsPropertyGuestReviewSource.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HotelsPropertyGuestReviewContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyGuestReview[i];
        }
    }

    public HotelsPropertyGuestReview(int i, long j2, ArrayList scores, String displayName, HotelsPropertyGuestReviewSource source, HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f98021a = i;
        this.f98022b = j2;
        this.f98023c = scores;
        this.d = displayName;
        this.e = source;
        this.f = hotelsPropertyGuestReviewContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyGuestReview)) {
            return false;
        }
        HotelsPropertyGuestReview hotelsPropertyGuestReview = (HotelsPropertyGuestReview) obj2;
        return this.f98021a == hotelsPropertyGuestReview.f98021a && this.f98022b == hotelsPropertyGuestReview.f98022b && this.f98023c.equals(hotelsPropertyGuestReview.f98023c) && Intrinsics.f(this.d, hotelsPropertyGuestReview.d) && Intrinsics.f(this.e, hotelsPropertyGuestReview.e) && Intrinsics.f(this.f, hotelsPropertyGuestReview.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f98023c, d.c(Integer.hashCode(this.f98021a) * 31, 31, this.f98022b), 31), 31, this.d)) * 31;
        HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent = this.f;
        return iHashCode + (hotelsPropertyGuestReviewContent == null ? 0 : hotelsPropertyGuestReviewContent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98021a);
        dest.writeLong(this.f98022b);
        Iterator itY = j6.a.y(this.f98023c, dest);
        while (itY.hasNext()) {
            ((HotelsPropertyGuestReviewScore) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        this.e.writeToParcel(dest, i);
        HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent = this.f;
        if (hotelsPropertyGuestReviewContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyGuestReviewContent.writeToParcel(dest, i);
        }
    }
}
