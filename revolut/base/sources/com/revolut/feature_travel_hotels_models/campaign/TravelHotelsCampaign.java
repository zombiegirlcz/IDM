package com.revolut.feature_travel_hotels_models.campaign;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/campaign/TravelHotelsCampaign;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCampaign implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCampaign> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f97894c;
    public final DateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f97895g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsCampaign(parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCampaign[i];
        }
    }

    public TravelHotelsCampaign(String id10, String image, DateTime startDate, DateTime endDate, String name, String discount, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.f97892a = id10;
        this.f97893b = image;
        this.f97894c = startDate;
        this.d = endDate;
        this.e = name;
        this.f = discount;
        this.f97895g = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCampaign)) {
            return false;
        }
        TravelHotelsCampaign travelHotelsCampaign = (TravelHotelsCampaign) obj2;
        return Intrinsics.f(this.f97892a, travelHotelsCampaign.f97892a) && Intrinsics.f(this.f97893b, travelHotelsCampaign.f97893b) && Intrinsics.f(this.f97894c, travelHotelsCampaign.f97894c) && Intrinsics.f(this.d, travelHotelsCampaign.d) && Intrinsics.f(this.e, travelHotelsCampaign.e) && Intrinsics.f(this.f, travelHotelsCampaign.f) && this.f97895g == travelHotelsCampaign.f97895g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97895g) + p.a.c(p.a.c(b.f(this.d, b.f(this.f97894c, p.a.c(this.f97892a.hashCode() * 31, 31, this.f97893b), 31), 31), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97892a);
        dest.writeString(this.f97893b);
        dest.writeSerializable(this.f97894c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f97895g);
    }
}
