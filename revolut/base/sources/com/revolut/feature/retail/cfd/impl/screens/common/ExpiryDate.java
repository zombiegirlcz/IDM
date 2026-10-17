package com.revolut.feature.retail.cfd.impl.screens.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/common/ExpiryDate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpiryDate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpiryDate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3b.a f82206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f82207b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiryDate(l3b.a.valueOf(parcel.readString()), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpiryDate[i];
        }
    }

    public ExpiryDate(l3b.a type, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f82206a = type;
        this.f82207b = zonedDateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpiryDate)) {
            return false;
        }
        ExpiryDate expiryDate = (ExpiryDate) obj2;
        return this.f82206a == expiryDate.f82206a && Intrinsics.f(this.f82207b, expiryDate.f82207b);
    }

    public final int hashCode() {
        int iHashCode = this.f82206a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f82207b;
        return iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82206a.name());
        dest.writeSerializable(this.f82207b);
    }
}
