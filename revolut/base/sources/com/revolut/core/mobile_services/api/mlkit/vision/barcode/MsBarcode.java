package com.revolut.core.mobile_services.api.mlkit.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/mobile_services/api/mlkit/vision/barcode/MsBarcode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "mobile_services_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MsBarcode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MsBarcode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MsBarcodeType f51392c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MsBarcode(parcel.readString(), parcel.readString(), MsBarcodeType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsBarcode[i];
        }
    }

    public MsBarcode(String str, String str2, MsBarcodeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f51390a = str;
        this.f51391b = str2;
        this.f51392c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MsBarcode)) {
            return false;
        }
        MsBarcode msBarcode = (MsBarcode) obj2;
        return Intrinsics.f(this.f51390a, msBarcode.f51390a) && Intrinsics.f(this.f51391b, msBarcode.f51391b) && this.f51392c == msBarcode.f51392c;
    }

    public final int hashCode() {
        String str = this.f51390a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51391b;
        return this.f51392c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51390a);
        dest.writeString(this.f51391b);
        this.f51392c.writeToParcel(dest, i);
    }
}
