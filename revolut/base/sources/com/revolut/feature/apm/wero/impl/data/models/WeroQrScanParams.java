package com.revolut.feature.apm.wero.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/models/WeroQrScanParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WeroQrScanParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WeroQrScanParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f63046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63047b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeroQrScanParams((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WeroQrScanParams[i];
        }
    }

    public WeroQrScanParams(d dVar, String str) {
        this.f63046a = dVar;
        this.f63047b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WeroQrScanParams)) {
            return false;
        }
        WeroQrScanParams weroQrScanParams = (WeroQrScanParams) obj2;
        return Intrinsics.f(this.f63046a, weroQrScanParams.f63046a) && Intrinsics.f(this.f63047b, weroQrScanParams.f63047b);
    }

    public final int hashCode() {
        d dVar = this.f63046a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f63047b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f63046a);
        dest.writeString(this.f63047b);
    }
}
