package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeParty;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeParty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeParty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeIdentification f80469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f80470c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeParty(parcel.readString(), parcel.readInt() == 0 ? null : PixQrCodeIdentification.CREATOR.createFromParcel(parcel), (Address) parcel.readParcelable(PixQrCodeParty.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeParty[i];
        }
    }

    public PixQrCodeParty(String str, PixQrCodeIdentification pixQrCodeIdentification, Address address) {
        this.f80468a = str;
        this.f80469b = pixQrCodeIdentification;
        this.f80470c = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeParty)) {
            return false;
        }
        PixQrCodeParty pixQrCodeParty = (PixQrCodeParty) obj2;
        return Intrinsics.f(this.f80468a, pixQrCodeParty.f80468a) && Intrinsics.f(this.f80469b, pixQrCodeParty.f80469b) && Intrinsics.f(this.f80470c, pixQrCodeParty.f80470c);
    }

    public final int hashCode() {
        String str = this.f80468a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PixQrCodeIdentification pixQrCodeIdentification = this.f80469b;
        int iHashCode2 = (iHashCode + (pixQrCodeIdentification == null ? 0 : pixQrCodeIdentification.hashCode())) * 31;
        Address address = this.f80470c;
        return iHashCode2 + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80468a);
        PixQrCodeIdentification pixQrCodeIdentification = this.f80469b;
        if (pixQrCodeIdentification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeIdentification.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f80470c, i);
    }
}
