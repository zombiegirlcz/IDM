package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeAmount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeAmount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f80425b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PixQrCodeAmount(dVar, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeAmount[i];
        }
    }

    public PixQrCodeAmount(d dVar, Boolean bool) {
        this.f80424a = dVar;
        this.f80425b = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeAmount)) {
            return false;
        }
        PixQrCodeAmount pixQrCodeAmount = (PixQrCodeAmount) obj2;
        return Intrinsics.f(this.f80424a, pixQrCodeAmount.f80424a) && Intrinsics.f(this.f80425b, pixQrCodeAmount.f80425b);
    }

    public final int hashCode() {
        d dVar = this.f80424a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Boolean bool = this.f80425b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80424a);
        Boolean bool = this.f80425b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
