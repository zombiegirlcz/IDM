package com.revolut.feature.travel.experiences.api.models.booking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m70.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/booking/TravelExperiencesBookingContactDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesBookingContactDetails implements Parcelable {
    public static final TravelExperiencesBookingContactDetails e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92760c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesBookingContactDetails> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesBookingContactDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesBookingContactDetails[i];
        }
    }

    static {
        t0 t0Var = t0.f186434a;
        a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        e = new TravelExperiencesBookingContactDetails("", "", "", "");
    }

    public TravelExperiencesBookingContactDetails(String firstName, String lastName, String userPhone, String userEmail) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(userPhone, "userPhone");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        this.f92758a = firstName;
        this.f92759b = lastName;
        this.f92760c = userPhone;
        this.d = userEmail;
    }

    public static TravelExperiencesBookingContactDetails a(TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails, String firstName, String lastName, String userPhone, String userEmail, int i) {
        if ((i & 1) != 0) {
            firstName = travelExperiencesBookingContactDetails.f92758a;
        }
        if ((i & 2) != 0) {
            lastName = travelExperiencesBookingContactDetails.f92759b;
        }
        if ((i & 4) != 0) {
            userPhone = travelExperiencesBookingContactDetails.f92760c;
        }
        if ((i & 8) != 0) {
            userEmail = travelExperiencesBookingContactDetails.d;
        }
        travelExperiencesBookingContactDetails.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(userPhone, "userPhone");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return new TravelExperiencesBookingContactDetails(firstName, lastName, userPhone, userEmail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesBookingContactDetails)) {
            return false;
        }
        TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = (TravelExperiencesBookingContactDetails) obj2;
        return Intrinsics.f(this.f92758a, travelExperiencesBookingContactDetails.f92758a) && Intrinsics.f(this.f92759b, travelExperiencesBookingContactDetails.f92759b) && Intrinsics.f(this.f92760c, travelExperiencesBookingContactDetails.f92760c) && Intrinsics.f(this.d, travelExperiencesBookingContactDetails.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f92758a.hashCode() * 31, 31, this.f92759b), 31, this.f92760c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92758a);
        dest.writeString(this.f92759b);
        dest.writeString(this.f92760c);
        dest.writeString(this.d);
    }
}
