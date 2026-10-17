package com.revolut.feature.apm.bills.boleto.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/boleto/impl/flow/BoletoTransferFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BoletoTransferFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BoletoTransferFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillSearchBoletoResult f61177a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BoletoTransferFlowContract$State((BillSearchBoletoResult) parcel.readParcelable(BoletoTransferFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BoletoTransferFlowContract$State[i];
        }
    }

    public BoletoTransferFlowContract$State(BillSearchBoletoResult decodeResult) {
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        this.f61177a = decodeResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BoletoTransferFlowContract$State) && Intrinsics.f(this.f61177a, ((BoletoTransferFlowContract$State) obj2).f61177a);
    }

    public final int hashCode() {
        return this.f61177a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61177a, i);
    }
}
