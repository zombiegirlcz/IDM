package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_code_transaction/screen/amount/PixQrCodeTransactionAmountScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeTransactionAmountScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeTransactionAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80704c;
    public final String d;
    public final LocalDate e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeTransactionAmountScreenContract$InputData((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeTransactionAmountScreenContract$InputData[i];
        }
    }

    public PixQrCodeTransactionAmountScreenContract$InputData(d amount, String beneficiaryName, String beneficiarySubtitle, String str, LocalDate localDate, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(beneficiarySubtitle, "beneficiarySubtitle");
        this.f80702a = amount;
        this.f80703b = beneficiaryName;
        this.f80704c = beneficiarySubtitle;
        this.d = str;
        this.e = localDate;
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
        if (!(obj2 instanceof PixQrCodeTransactionAmountScreenContract$InputData)) {
            return false;
        }
        PixQrCodeTransactionAmountScreenContract$InputData pixQrCodeTransactionAmountScreenContract$InputData = (PixQrCodeTransactionAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80702a, pixQrCodeTransactionAmountScreenContract$InputData.f80702a) && Intrinsics.f(this.f80703b, pixQrCodeTransactionAmountScreenContract$InputData.f80703b) && Intrinsics.f(this.f80704c, pixQrCodeTransactionAmountScreenContract$InputData.f80704c) && Intrinsics.f(this.d, pixQrCodeTransactionAmountScreenContract$InputData.d) && Intrinsics.f(this.e, pixQrCodeTransactionAmountScreenContract$InputData.e) && this.f == pixQrCodeTransactionAmountScreenContract$InputData.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f80702a.hashCode() * 31, 31, this.f80703b), 31, this.f80704c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80702a);
        dest.writeString(this.f80703b);
        dest.writeString(this.f80704c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
