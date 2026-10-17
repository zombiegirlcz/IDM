package com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/TransactionFilterFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionFilterFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionFilterFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71431b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransactionFilterFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TransactionFilterFlowContract$InputData(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionFilterFlowContract$InputData[i];
        }
    }

    public TransactionFilterFlowContract$InputData(List filters, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f71430a = filters;
        this.f71431b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionFilterFlowContract$InputData)) {
            return false;
        }
        TransactionFilterFlowContract$InputData transactionFilterFlowContract$InputData = (TransactionFilterFlowContract$InputData) obj2;
        return Intrinsics.f(this.f71430a, transactionFilterFlowContract$InputData.f71430a) && this.f71431b == transactionFilterFlowContract$InputData.f71431b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71431b) + (this.f71430a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f71430a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f71431b ? 1 : 0);
    }
}
