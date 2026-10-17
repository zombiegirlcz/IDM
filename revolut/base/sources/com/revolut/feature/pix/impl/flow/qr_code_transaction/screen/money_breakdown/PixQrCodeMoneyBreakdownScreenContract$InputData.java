package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_code_transaction/screen/money_breakdown/PixQrCodeMoneyBreakdownScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeMoneyBreakdownScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeMoneyBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f80707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80708c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeMoneyBreakdownScreenContract$InputData((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeMoneyBreakdownScreenContract$InputData[i];
        }
    }

    public PixQrCodeMoneyBreakdownScreenContract$InputData(d dVar, d dVar2, d dVar3, d dVar4) {
        this.f80706a = dVar;
        this.f80707b = dVar2;
        this.f80708c = dVar3;
        this.d = dVar4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeMoneyBreakdownScreenContract$InputData)) {
            return false;
        }
        PixQrCodeMoneyBreakdownScreenContract$InputData pixQrCodeMoneyBreakdownScreenContract$InputData = (PixQrCodeMoneyBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80706a, pixQrCodeMoneyBreakdownScreenContract$InputData.f80706a) && Intrinsics.f(this.f80707b, pixQrCodeMoneyBreakdownScreenContract$InputData.f80707b) && Intrinsics.f(this.f80708c, pixQrCodeMoneyBreakdownScreenContract$InputData.f80708c) && Intrinsics.f(this.d, pixQrCodeMoneyBreakdownScreenContract$InputData.d);
    }

    public final int hashCode() {
        d dVar = this.f80706a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f80707b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f80708c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.d;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80706a);
        dest.writeSerializable(this.f80707b);
        dest.writeSerializable(this.f80708c);
        dest.writeSerializable(this.d);
    }
}
