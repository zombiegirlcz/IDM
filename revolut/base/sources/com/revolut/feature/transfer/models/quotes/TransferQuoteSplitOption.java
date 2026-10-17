package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/TransferQuoteSplitOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferQuoteSplitOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferQuoteSplitOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f92289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92290c;
    public final d d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f92291g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferQuoteSplitOption((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferQuoteSplitOption[i];
        }
    }

    public TransferQuoteSplitOption(d amount, d totalAmountWithInterest, int i, d dVar, LocalDate localDate, LocalDate localDate2, Double d) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(totalAmountWithInterest, "totalAmountWithInterest");
        this.f92288a = amount;
        this.f92289b = totalAmountWithInterest;
        this.f92290c = i;
        this.d = dVar;
        this.e = localDate;
        this.f = localDate2;
        this.f92291g = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferQuoteSplitOption)) {
            return false;
        }
        TransferQuoteSplitOption transferQuoteSplitOption = (TransferQuoteSplitOption) obj2;
        return Intrinsics.f(this.f92288a, transferQuoteSplitOption.f92288a) && Intrinsics.f(this.f92289b, transferQuoteSplitOption.f92289b) && this.f92290c == transferQuoteSplitOption.f92290c && Intrinsics.f(this.d, transferQuoteSplitOption.d) && Intrinsics.f(this.e, transferQuoteSplitOption.e) && Intrinsics.f(this.f, transferQuoteSplitOption.f) && Intrinsics.f(this.f92291g, transferQuoteSplitOption.f92291g);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f92290c, v7.c(this.f92288a.hashCode() * 31, 31, this.f92289b), 31);
        d dVar = this.d;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Double d = this.f92291g;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92288a);
        dest.writeSerializable(this.f92289b);
        dest.writeInt(this.f92290c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        Double d = this.f92291g;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
    }
}
