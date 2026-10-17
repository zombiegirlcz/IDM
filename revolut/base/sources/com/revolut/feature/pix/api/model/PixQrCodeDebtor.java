package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDebtor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeDebtor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDebtor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeIdentification f80444b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeDebtor(parcel.readString(), parcel.readInt() == 0 ? null : PixQrCodeIdentification.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDebtor[i];
        }
    }

    public PixQrCodeDebtor(String str, PixQrCodeIdentification pixQrCodeIdentification) {
        this.f80443a = str;
        this.f80444b = pixQrCodeIdentification;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeDebtor)) {
            return false;
        }
        PixQrCodeDebtor pixQrCodeDebtor = (PixQrCodeDebtor) obj2;
        return Intrinsics.f(this.f80443a, pixQrCodeDebtor.f80443a) && Intrinsics.f(this.f80444b, pixQrCodeDebtor.f80444b);
    }

    public final int hashCode() {
        String str = this.f80443a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PixQrCodeIdentification pixQrCodeIdentification = this.f80444b;
        return iHashCode + (pixQrCodeIdentification != null ? pixQrCodeIdentification.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80443a);
        PixQrCodeIdentification pixQrCodeIdentification = this.f80444b;
        if (pixQrCodeIdentification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeIdentification.writeToParcel(dest, i);
        }
    }
}
