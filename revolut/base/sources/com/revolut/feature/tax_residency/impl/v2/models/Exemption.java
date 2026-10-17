package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Exemption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Exemption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Exemption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExemptionReason f90164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Popup f90165b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Exemption(ExemptionReason.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Exemption[i];
        }
    }

    public Exemption(ExemptionReason reason, Popup popup) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f90164a = reason;
        this.f90165b = popup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Exemption)) {
            return false;
        }
        Exemption exemption = (Exemption) obj2;
        return this.f90164a == exemption.f90164a && Intrinsics.f(this.f90165b, exemption.f90165b);
    }

    public final int hashCode() {
        int iHashCode = this.f90164a.hashCode() * 31;
        Popup popup = this.f90165b;
        return iHashCode + (popup == null ? 0 : popup.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f90164a.writeToParcel(dest, i);
        Popup popup = this.f90165b;
        if (popup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            popup.writeToParcel(dest, i);
        }
    }
}
