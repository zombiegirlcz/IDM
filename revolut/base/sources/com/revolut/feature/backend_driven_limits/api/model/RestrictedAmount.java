package com.revolut.feature.backend_driven_limits.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/api/model/RestrictedAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_backend_driven_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictedAmount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RestrictedAmount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63197b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RestrictedAmount(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestrictedAmount[i];
        }
    }

    public RestrictedAmount(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f63196a = j2;
        this.f63197b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RestrictedAmount)) {
            return false;
        }
        RestrictedAmount restrictedAmount = (RestrictedAmount) obj2;
        return this.f63196a == restrictedAmount.f63196a && Intrinsics.f(this.f63197b, restrictedAmount.f63197b);
    }

    public final int hashCode() {
        return this.f63197b.hashCode() + (Long.hashCode(this.f63196a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f63196a);
        dest.writeString(this.f63197b);
    }
}
