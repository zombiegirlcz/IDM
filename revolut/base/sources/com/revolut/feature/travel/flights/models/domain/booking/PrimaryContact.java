package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/PrimaryContact;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrimaryContact implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PrimaryContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhoneNumber f93467c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrimaryContact(parcel.readString(), parcel.readString(), PhoneNumber.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrimaryContact[i];
        }
    }

    public PrimaryContact(String travellerReference, String email, PhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(travellerReference, "travellerReference");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f93465a = travellerReference;
        this.f93466b = email;
        this.f93467c = phoneNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PrimaryContact)) {
            return false;
        }
        PrimaryContact primaryContact = (PrimaryContact) obj2;
        return Intrinsics.f(this.f93465a, primaryContact.f93465a) && Intrinsics.f(this.f93466b, primaryContact.f93466b) && Intrinsics.f(this.f93467c, primaryContact.f93467c);
    }

    public final int hashCode() {
        return this.f93467c.hashCode() + p.a.c(this.f93465a.hashCode() * 31, 31, this.f93466b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93465a);
        dest.writeString(this.f93466b);
        this.f93467c.writeToParcel(dest, i);
    }
}
