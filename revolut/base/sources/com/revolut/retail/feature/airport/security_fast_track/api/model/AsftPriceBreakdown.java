package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPointsOptions f98735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f98736c;
    public final AsftPointsOptions d;
    public final String e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftPriceBreakdown((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : AsftPointsOptions.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readInt() != 0 ? AsftPointsOptions.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPriceBreakdown[i];
        }
    }

    public AsftPriceBreakdown(d pricePerPassenger, AsftPointsOptions asftPointsOptions, d dVar, AsftPointsOptions asftPointsOptions2, String str, d dVar2) {
        Intrinsics.checkNotNullParameter(pricePerPassenger, "pricePerPassenger");
        this.f98734a = pricePerPassenger;
        this.f98735b = asftPointsOptions;
        this.f98736c = dVar;
        this.d = asftPointsOptions2;
        this.e = str;
        this.f = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPriceBreakdown)) {
            return false;
        }
        AsftPriceBreakdown asftPriceBreakdown = (AsftPriceBreakdown) obj2;
        return Intrinsics.f(this.f98734a, asftPriceBreakdown.f98734a) && Intrinsics.f(this.f98735b, asftPriceBreakdown.f98735b) && Intrinsics.f(this.f98736c, asftPriceBreakdown.f98736c) && Intrinsics.f(this.d, asftPriceBreakdown.d) && Intrinsics.f(this.e, asftPriceBreakdown.e) && Intrinsics.f(this.f, asftPriceBreakdown.f);
    }

    public final int hashCode() {
        int iHashCode = this.f98734a.hashCode() * 31;
        AsftPointsOptions asftPointsOptions = this.f98735b;
        int iHashCode2 = (iHashCode + (asftPointsOptions == null ? 0 : asftPointsOptions.hashCode())) * 31;
        d dVar = this.f98736c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        AsftPointsOptions asftPointsOptions2 = this.d;
        int iHashCode4 = (iHashCode3 + (asftPointsOptions2 == null ? 0 : asftPointsOptions2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar2 = this.f;
        return iHashCode5 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98734a);
        AsftPointsOptions asftPointsOptions = this.f98735b;
        if (asftPointsOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            asftPointsOptions.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f98736c);
        AsftPointsOptions asftPointsOptions2 = this.d;
        if (asftPointsOptions2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            asftPointsOptions2.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
