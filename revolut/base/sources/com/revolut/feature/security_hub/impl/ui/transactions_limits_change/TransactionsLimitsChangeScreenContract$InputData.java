package com.revolut.feature.security_hub.impl.ui.transactions_limits_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsLimitsChangeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionsLimitsChangeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f85758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitType f85759b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsLimitsChangeScreenContract$InputData(OutboundTransactionLimit.CREATOR.createFromParcel(parcel), (LimitType) parcel.readParcelable(TransactionsLimitsChangeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsLimitsChangeScreenContract$InputData[i];
        }
    }

    public TransactionsLimitsChangeScreenContract$InputData(OutboundTransactionLimit limit, LimitType limitType) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f85758a = limit;
        this.f85759b = limitType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsLimitsChangeScreenContract$InputData)) {
            return false;
        }
        TransactionsLimitsChangeScreenContract$InputData transactionsLimitsChangeScreenContract$InputData = (TransactionsLimitsChangeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85758a, transactionsLimitsChangeScreenContract$InputData.f85758a) && Intrinsics.f(this.f85759b, transactionsLimitsChangeScreenContract$InputData.f85759b);
    }

    public final int hashCode() {
        return this.f85759b.hashCode() + (this.f85758a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f85758a.writeToParcel(dest, i);
        dest.writeParcelable(this.f85759b, i);
    }
}
