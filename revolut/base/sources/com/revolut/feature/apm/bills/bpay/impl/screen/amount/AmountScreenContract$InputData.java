package com.revolut.feature.apm.bills.bpay.impl.screen.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/bpay/impl/screen/amount/AmountScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayBillerData f61218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f61220c;
    public final ScreenConfiguration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountScreenContract$InputData(BPayBillerData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (p) parcel.readSerializable(), ScreenConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountScreenContract$InputData[i];
        }
    }

    public AmountScreenContract$InputData(BPayBillerData billerData, boolean z, p pVar, ScreenConfiguration screenConfiguration) {
        Intrinsics.checkNotNullParameter(billerData, "billerData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f61218a = billerData;
        this.f61219b = z;
        this.f61220c = pVar;
        this.d = screenConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountScreenContract$InputData)) {
            return false;
        }
        AmountScreenContract$InputData amountScreenContract$InputData = (AmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f61218a, amountScreenContract$InputData.f61218a) && this.f61219b == amountScreenContract$InputData.f61219b && Intrinsics.f(this.f61220c, amountScreenContract$InputData.f61220c) && Intrinsics.f(this.d, amountScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f61218a.hashCode() * 31, 31, this.f61219b);
        p pVar = this.f61220c;
        return this.d.hashCode() + ((iC + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61218a.writeToParcel(dest, i);
        dest.writeInt(this.f61219b ? 1 : 0);
        dest.writeSerializable(this.f61220c);
        this.d.writeToParcel(dest, i);
    }
}
