package com.revolut.feature.security_hub.impl.ui.transactions_limits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import fwc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsLimitsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionsLimitsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsLimitsScreenContract$LimitFlowType f85734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f85735b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsLimitsScreenContract$InputData((TransactionsLimitsScreenContract$LimitFlowType) parcel.readParcelable(TransactionsLimitsScreenContract$InputData.class.getClassLoader()), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsLimitsScreenContract$InputData[i];
        }
    }

    public TransactionsLimitsScreenContract$InputData(TransactionsLimitsScreenContract$LimitFlowType limitFlowType, n accountType) {
        Intrinsics.checkNotNullParameter(limitFlowType, "limitFlowType");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f85734a = limitFlowType;
        this.f85735b = accountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsLimitsScreenContract$InputData)) {
            return false;
        }
        TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = (TransactionsLimitsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85734a, transactionsLimitsScreenContract$InputData.f85734a) && this.f85735b == transactionsLimitsScreenContract$InputData.f85735b;
    }

    public final int hashCode() {
        return this.f85735b.hashCode() + (this.f85734a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85734a, i);
        dest.writeString(this.f85735b.name());
    }
}
