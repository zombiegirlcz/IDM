package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftPassRefundBreakdown;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPassRefundBreakdown implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<AsftPassRefundBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98731b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftPassRefundBreakdown((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPassRefundBreakdown[i];
        }
    }

    public AsftPassRefundBreakdown(d refundAmount, String str) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f98730a = str;
        this.f98731b = refundAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPassRefundBreakdown)) {
            return false;
        }
        AsftPassRefundBreakdown asftPassRefundBreakdown = (AsftPassRefundBreakdown) obj2;
        return Intrinsics.f(this.f98730a, asftPassRefundBreakdown.f98730a) && Intrinsics.f(this.f98731b, asftPassRefundBreakdown.f98731b);
    }

    public final int hashCode() {
        String str = this.f98730a;
        return this.f98731b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98730a);
        dest.writeSerializable(this.f98731b);
    }
}
