package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import ufi.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyGuestReviewScore;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyGuestReviewScore implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyGuestReviewScore> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f98025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f98026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98027c;
    public final String d;
    public final c e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyGuestReviewScore(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyGuestReviewScore[i];
        }
    }

    public HotelsPropertyGuestReviewScore(double d, double d5, String str, String name, c category) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f98025a = d;
        this.f98026b = d5;
        this.f98027c = str;
        this.d = name;
        this.e = category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyGuestReviewScore)) {
            return false;
        }
        HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScore = (HotelsPropertyGuestReviewScore) obj2;
        return Double.compare(this.f98025a, hotelsPropertyGuestReviewScore.f98025a) == 0 && Double.compare(this.f98026b, hotelsPropertyGuestReviewScore.f98026b) == 0 && Intrinsics.f(this.f98027c, hotelsPropertyGuestReviewScore.f98027c) && Intrinsics.f(this.d, hotelsPropertyGuestReviewScore.d) && this.e == hotelsPropertyGuestReviewScore.e;
    }

    public final int hashCode() {
        int iC = b.c(Double.hashCode(this.f98025a) * 31, this.f98026b, 31);
        String str = this.f98027c;
        return this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f98025a);
        dest.writeDouble(this.f98026b);
        dest.writeString(this.f98027c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
    }
}
