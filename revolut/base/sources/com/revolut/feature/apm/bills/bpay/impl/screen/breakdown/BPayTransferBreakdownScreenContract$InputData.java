package com.revolut.feature.apm.bills.bpay.impl.screen.breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/bpay/impl/screen/breakdown/BPayTransferBreakdownScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayTransferBreakdownScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPayTransferBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f61222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61223c;
    public final ApmQuoteCharges d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayTransferBreakdownScreenContract$InputData((d) parcel.readSerializable(), (n9l.a) parcel.readSerializable(), (d) parcel.readSerializable(), (ApmQuoteCharges) parcel.readParcelable(BPayTransferBreakdownScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayTransferBreakdownScreenContract$InputData[i];
        }
    }

    public BPayTransferBreakdownScreenContract$InputData(d dVar, n9l.a exchangeRate, d dVar2, ApmQuoteCharges apmQuoteCharges) {
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f61221a = dVar;
        this.f61222b = exchangeRate;
        this.f61223c = dVar2;
        this.d = apmQuoteCharges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayTransferBreakdownScreenContract$InputData)) {
            return false;
        }
        BPayTransferBreakdownScreenContract$InputData bPayTransferBreakdownScreenContract$InputData = (BPayTransferBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f61221a, bPayTransferBreakdownScreenContract$InputData.f61221a) && Intrinsics.f(this.f61222b, bPayTransferBreakdownScreenContract$InputData.f61222b) && Intrinsics.f(this.f61223c, bPayTransferBreakdownScreenContract$InputData.f61223c) && Intrinsics.f(this.d, bPayTransferBreakdownScreenContract$InputData.d);
    }

    public final int hashCode() {
        d dVar = this.f61221a;
        int iHashCode = (this.f61222b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31;
        d dVar2 = this.f61223c;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        ApmQuoteCharges apmQuoteCharges = this.d;
        return iHashCode2 + (apmQuoteCharges != null ? apmQuoteCharges.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f61221a);
        dest.writeSerializable(this.f61222b);
        dest.writeSerializable(this.f61223c);
        dest.writeParcelable(this.d, i);
    }
}
