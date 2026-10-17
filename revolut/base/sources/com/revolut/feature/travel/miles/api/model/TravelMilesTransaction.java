package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import hfg.q0;
import hfg.r0;
import hfg.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "hfg/s0", "hfg/q0", "hfg/r0", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f94146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f94147c;
    public final r0 d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesTransaction(parcel.readString(), s0.valueOf(parcel.readString()), q0.valueOf(parcel.readString()), r0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesTransaction[i];
        }
    }

    public TravelMilesTransaction(String id10, s0 type, q0 idType, r0 source) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f94145a = id10;
        this.f94146b = type;
        this.f94147c = idType;
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
        if (!(obj2 instanceof TravelMilesTransaction)) {
            return false;
        }
        TravelMilesTransaction travelMilesTransaction = (TravelMilesTransaction) obj2;
        return Intrinsics.f(this.f94145a, travelMilesTransaction.f94145a) && this.f94146b == travelMilesTransaction.f94146b && this.f94147c == travelMilesTransaction.f94147c && this.d == travelMilesTransaction.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f94147c.hashCode() + ((this.f94146b.hashCode() + (this.f94145a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94145a);
        dest.writeString(this.f94146b.name());
        dest.writeString(this.f94147c.name());
        dest.writeString(this.d.name());
    }
}
