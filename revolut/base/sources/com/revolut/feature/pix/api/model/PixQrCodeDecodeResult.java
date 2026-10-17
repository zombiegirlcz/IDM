package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDecodeResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeDecodeResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDecodeResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeStatus f80460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80461c;
    public final String d;
    public final PixQrCodeDecodeFailureReason e;
    public final PixQrCodeDecodeData f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeDecodeResult(parcel.readString(), PixQrCodeDecodeStatus.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PixQrCodeDecodeFailureReason.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PixQrCodeDecodeData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDecodeResult[i];
        }
    }

    public PixQrCodeDecodeResult(String id10, PixQrCodeDecodeStatus status, String paymentDate, String encodedValue, PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason, PixQrCodeDecodeData pixQrCodeDecodeData) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        this.f80459a = id10;
        this.f80460b = status;
        this.f80461c = paymentDate;
        this.d = encodedValue;
        this.e = pixQrCodeDecodeFailureReason;
        this.f = pixQrCodeDecodeData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeDecodeResult)) {
            return false;
        }
        PixQrCodeDecodeResult pixQrCodeDecodeResult = (PixQrCodeDecodeResult) obj2;
        return Intrinsics.f(this.f80459a, pixQrCodeDecodeResult.f80459a) && this.f80460b == pixQrCodeDecodeResult.f80460b && Intrinsics.f(this.f80461c, pixQrCodeDecodeResult.f80461c) && Intrinsics.f(this.d, pixQrCodeDecodeResult.d) && this.e == pixQrCodeDecodeResult.e && Intrinsics.f(this.f, pixQrCodeDecodeResult.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f80460b.hashCode() + (this.f80459a.hashCode() * 31)) * 31, 31, this.f80461c), 31, this.d);
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason = this.e;
        int iHashCode = (iC + (pixQrCodeDecodeFailureReason == null ? 0 : pixQrCodeDecodeFailureReason.hashCode())) * 31;
        PixQrCodeDecodeData pixQrCodeDecodeData = this.f;
        return iHashCode + (pixQrCodeDecodeData != null ? pixQrCodeDecodeData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80459a);
        this.f80460b.writeToParcel(dest, i);
        dest.writeString(this.f80461c);
        dest.writeString(this.d);
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason = this.e;
        if (pixQrCodeDecodeFailureReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDecodeFailureReason.writeToParcel(dest, i);
        }
        PixQrCodeDecodeData pixQrCodeDecodeData = this.f;
        if (pixQrCodeDecodeData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDecodeData.writeToParcel(dest, i);
        }
    }
}
