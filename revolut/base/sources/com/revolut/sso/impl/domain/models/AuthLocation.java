package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f106066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f106067b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthLocation(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthLocation[i];
        }
    }

    public AuthLocation(double d, double d5) {
        this.f106066a = d;
        this.f106067b = d5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AuthLocation)) {
            return false;
        }
        AuthLocation authLocation = (AuthLocation) obj2;
        return Double.compare(this.f106066a, authLocation.f106066a) == 0 && Double.compare(this.f106067b, authLocation.f106067b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f106067b) + (Double.hashCode(this.f106066a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f106066a);
        dest.writeDouble(this.f106067b);
    }
}
