package com.revolut.retail.feature.payments.bank_transfer.api.india_withdrawal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/india_withdrawal/IndiaWithdrawalDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/india_withdrawal/IndiaWithdrawalInput;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndiaWithdrawalDestination extends InternalDestination<IndiaWithdrawalInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<IndiaWithdrawalDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101920b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndiaWithdrawalDestination((d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndiaWithdrawalDestination[i];
        }
    }

    public IndiaWithdrawalDestination(d dVar) {
        super(new IndiaWithdrawalInput(dVar));
        this.f101920b = dVar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getF101920b() {
        return this.f101920b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IndiaWithdrawalDestination) && Intrinsics.f(this.f101920b, ((IndiaWithdrawalDestination) obj2).f101920b);
    }

    public final int hashCode() {
        d dVar = this.f101920b;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101920b);
    }
}
