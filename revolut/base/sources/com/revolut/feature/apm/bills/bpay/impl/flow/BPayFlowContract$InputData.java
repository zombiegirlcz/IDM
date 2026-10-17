package com.revolut.feature.apm.bills.bpay.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BPayFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn1.a f61192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentCounterpartyInfo f61193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f61194c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayFlowContract$InputData(pn1.a.valueOf(parcel.readString()), (PaymentCounterpartyInfo) parcel.readParcelable(BPayFlowContract$InputData.class.getClassLoader()), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayFlowContract$InputData[i];
        }
    }

    public BPayFlowContract$InputData(pn1.a entryPoint, PaymentCounterpartyInfo paymentCounterpartyInfo, p pVar) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f61192a = entryPoint;
        this.f61193b = paymentCounterpartyInfo;
        this.f61194c = pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayFlowContract$InputData)) {
            return false;
        }
        BPayFlowContract$InputData bPayFlowContract$InputData = (BPayFlowContract$InputData) obj2;
        return this.f61192a == bPayFlowContract$InputData.f61192a && Intrinsics.f(this.f61193b, bPayFlowContract$InputData.f61193b) && Intrinsics.f(this.f61194c, bPayFlowContract$InputData.f61194c);
    }

    public final int hashCode() {
        int iHashCode = this.f61192a.hashCode() * 31;
        PaymentCounterpartyInfo paymentCounterpartyInfo = this.f61193b;
        int iHashCode2 = (iHashCode + (paymentCounterpartyInfo == null ? 0 : paymentCounterpartyInfo.hashCode())) * 31;
        p pVar = this.f61194c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61192a.name());
        dest.writeParcelable(this.f61193b, i);
        dest.writeSerializable(this.f61194c);
    }
}
