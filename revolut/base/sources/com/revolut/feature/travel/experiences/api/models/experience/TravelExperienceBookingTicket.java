package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.g;
import myf.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingTicket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/h", "myf/g", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceBookingTicket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceBookingTicket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f92802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f92803c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceBookingTicket(parcel.readString(), h.valueOf(parcel.readString()), g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceBookingTicket[i];
        }
    }

    public TravelExperienceBookingTicket(String url2, h type, g grouping) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(grouping, "grouping");
        this.f92801a = url2;
        this.f92802b = type;
        this.f92803c = grouping;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceBookingTicket)) {
            return false;
        }
        TravelExperienceBookingTicket travelExperienceBookingTicket = (TravelExperienceBookingTicket) obj2;
        return Intrinsics.f(this.f92801a, travelExperienceBookingTicket.f92801a) && this.f92802b == travelExperienceBookingTicket.f92802b && this.f92803c == travelExperienceBookingTicket.f92803c;
    }

    public final int hashCode() {
        return this.f92803c.hashCode() + ((this.f92802b.hashCode() + (this.f92801a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92801a);
        dest.writeString(this.f92802b.name());
        dest.writeString(this.f92803c.name());
    }
}
