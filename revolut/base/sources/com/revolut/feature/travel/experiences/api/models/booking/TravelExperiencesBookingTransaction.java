package com.revolut.feature.travel.experiences.api.models.booking;

import android.os.Parcel;
import android.os.Parcelable;
import iyf.e;
import iyf.f;
import iyf.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/booking/TravelExperiencesBookingTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "iyf/g", "iyf/e", "iyf/f", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesBookingTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesBookingTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f92768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f92769c;
    public final f d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesBookingTransaction(parcel.readString(), g.valueOf(parcel.readString()), e.valueOf(parcel.readString()), f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesBookingTransaction[i];
        }
    }

    public TravelExperiencesBookingTransaction(String groupId, g type, e idType, f source) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f92767a = groupId;
        this.f92768b = type;
        this.f92769c = idType;
        this.d = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesBookingTransaction)) {
            return false;
        }
        TravelExperiencesBookingTransaction travelExperiencesBookingTransaction = (TravelExperiencesBookingTransaction) obj2;
        return Intrinsics.f(this.f92767a, travelExperiencesBookingTransaction.f92767a) && this.f92768b == travelExperiencesBookingTransaction.f92768b && this.f92769c == travelExperiencesBookingTransaction.f92769c && this.d == travelExperiencesBookingTransaction.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f92769c.hashCode() + ((this.f92768b.hashCode() + (this.f92767a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92767a);
        dest.writeString(this.f92768b.name());
        dest.writeString(this.f92769c.name());
        dest.writeString(this.d.name());
    }
}
