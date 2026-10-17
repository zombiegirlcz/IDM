package com.revolut.feature_travel_hotels_models.booking.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/request/HotelsPropertyBookingTokenizedOrder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyBookingTokenizedOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyBookingTokenizedOrder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97891b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyBookingTokenizedOrder(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyBookingTokenizedOrder[i];
        }
    }

    public HotelsPropertyBookingTokenizedOrder(String id10, String token) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f97890a = id10;
        this.f97891b = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyBookingTokenizedOrder)) {
            return false;
        }
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder = (HotelsPropertyBookingTokenizedOrder) obj2;
        return Intrinsics.f(this.f97890a, hotelsPropertyBookingTokenizedOrder.f97890a) && Intrinsics.f(this.f97891b, hotelsPropertyBookingTokenizedOrder.f97891b);
    }

    public final int hashCode() {
        return this.f97891b.hashCode() + (this.f97890a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97890a);
        dest.writeString(this.f97891b);
    }
}
