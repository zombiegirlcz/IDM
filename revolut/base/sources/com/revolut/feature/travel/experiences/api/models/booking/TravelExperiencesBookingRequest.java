package com.revolut.feature.travel.experiences.api.models.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/booking/TravelExperiencesBookingRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesBookingRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesBookingRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesBookingContactDetails f92766c;
    public final TravelExperienceSelectedLanguage d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesBookingQuestionAnswer.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelExperiencesBookingRequest(string, arrayList, TravelExperiencesBookingContactDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelExperienceSelectedLanguage.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesBookingRequest[i];
        }
    }

    public TravelExperiencesBookingRequest(String bookingToken, List answers, TravelExperiencesBookingContactDetails contactDetails, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, String str, String str2) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        this.f92764a = bookingToken;
        this.f92765b = answers;
        this.f92766c = contactDetails;
        this.d = travelExperienceSelectedLanguage;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesBookingRequest)) {
            return false;
        }
        TravelExperiencesBookingRequest travelExperiencesBookingRequest = (TravelExperiencesBookingRequest) obj2;
        return Intrinsics.f(this.f92764a, travelExperiencesBookingRequest.f92764a) && Intrinsics.f(this.f92765b, travelExperiencesBookingRequest.f92765b) && Intrinsics.f(this.f92766c, travelExperiencesBookingRequest.f92766c) && Intrinsics.f(this.d, travelExperiencesBookingRequest.d) && Intrinsics.f(this.e, travelExperiencesBookingRequest.e) && Intrinsics.f(this.f, travelExperiencesBookingRequest.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f92766c.hashCode() + p.a.d(this.f92764a.hashCode() * 31, 31, this.f92765b)) * 31;
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.d;
        int iHashCode2 = (iHashCode + (travelExperienceSelectedLanguage == null ? 0 : travelExperienceSelectedLanguage.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92764a);
        Iterator itV = p.a.v(this.f92765b, dest);
        while (itV.hasNext()) {
            ((TravelExperiencesBookingQuestionAnswer) itV.next()).writeToParcel(dest, i);
        }
        this.f92766c.writeToParcel(dest, i);
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.d;
        if (travelExperienceSelectedLanguage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceSelectedLanguage.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
