package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import dej.e3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimRefundScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimRefundScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimRefundFlowContract$EsimSubscriptionsToRefund f101443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f101444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101445c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimRefundScreenContract$InputData((EsimRefundFlowContract$EsimSubscriptionsToRefund) parcel.readParcelable(EsimRefundScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : e3.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimRefundScreenContract$InputData[i];
        }
    }

    public EsimRefundScreenContract$InputData(EsimRefundFlowContract$EsimSubscriptionsToRefund subscriptionsToRefund, e3 e3Var, String str) {
        Intrinsics.checkNotNullParameter(subscriptionsToRefund, "subscriptionsToRefund");
        this.f101443a = subscriptionsToRefund;
        this.f101444b = e3Var;
        this.f101445c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimRefundScreenContract$InputData)) {
            return false;
        }
        EsimRefundScreenContract$InputData esimRefundScreenContract$InputData = (EsimRefundScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101443a, esimRefundScreenContract$InputData.f101443a) && this.f101444b == esimRefundScreenContract$InputData.f101444b && Intrinsics.f(this.f101445c, esimRefundScreenContract$InputData.f101445c);
    }

    public final int hashCode() {
        int iHashCode = this.f101443a.hashCode() * 31;
        e3 e3Var = this.f101444b;
        int iHashCode2 = (iHashCode + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        String str = this.f101445c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101443a, i);
        e3 e3Var = this.f101444b;
        if (e3Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(e3Var.name());
        }
        dest.writeString(this.f101445c);
    }
}
