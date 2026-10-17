package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f80476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80477c;
    public final String d;
    public final d e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeTransferData((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeTransferData[i];
        }
    }

    public PixQrCodeTransferData(d amount, d dVar, String str, String decodedQrCodeId, d dVar2, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(decodedQrCodeId, "decodedQrCodeId");
        this.f80475a = amount;
        this.f80476b = dVar;
        this.f80477c = str;
        this.d = decodedQrCodeId;
        this.e = dVar2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeTransferData)) {
            return false;
        }
        PixQrCodeTransferData pixQrCodeTransferData = (PixQrCodeTransferData) obj2;
        return Intrinsics.f(this.f80475a, pixQrCodeTransferData.f80475a) && Intrinsics.f(this.f80476b, pixQrCodeTransferData.f80476b) && Intrinsics.f(this.f80477c, pixQrCodeTransferData.f80477c) && Intrinsics.f(this.d, pixQrCodeTransferData.d) && Intrinsics.f(this.e, pixQrCodeTransferData.e) && this.f == pixQrCodeTransferData.f;
    }

    public final int hashCode() {
        int iHashCode = this.f80475a.hashCode() * 31;
        d dVar = this.f80476b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f80477c;
        int iC = p.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        d dVar2 = this.e;
        return Boolean.hashCode(this.f) + ((iC + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80475a);
        dest.writeSerializable(this.f80476b);
        dest.writeString(this.f80477c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
