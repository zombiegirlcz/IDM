package com.revolut.feature.travel.experiences.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/cancellation/TravelExperienceCancellationRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceCancellationRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceCancellationRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92774b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceCancellationRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceCancellationRequest[i];
        }
    }

    public TravelExperienceCancellationRequest(String bookingId, String token) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f92773a = bookingId;
        this.f92774b = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceCancellationRequest)) {
            return false;
        }
        TravelExperienceCancellationRequest travelExperienceCancellationRequest = (TravelExperienceCancellationRequest) obj2;
        return Intrinsics.f(this.f92773a, travelExperienceCancellationRequest.f92773a) && Intrinsics.f(this.f92774b, travelExperienceCancellationRequest.f92774b);
    }

    public final int hashCode() {
        return this.f92774b.hashCode() + (this.f92773a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92773a);
        dest.writeString(this.f92774b);
    }
}
