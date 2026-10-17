package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/StreetModeMinimumAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetModeMinimumAmount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StreetModeMinimumAmount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f85427b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StreetModeMinimumAmount(parcel.readLong(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreetModeMinimumAmount[i];
        }
    }

    public StreetModeMinimumAmount(long j2, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f85426a = j2;
        this.f85427b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StreetModeMinimumAmount)) {
            return false;
        }
        StreetModeMinimumAmount streetModeMinimumAmount = (StreetModeMinimumAmount) obj2;
        return this.f85426a == streetModeMinimumAmount.f85426a && Intrinsics.f(this.f85427b, streetModeMinimumAmount.f85427b);
    }

    public final int hashCode() {
        return this.f85427b.hashCode() + (Long.hashCode(this.f85426a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f85426a);
        dest.writeSerializable(this.f85427b);
    }
}
