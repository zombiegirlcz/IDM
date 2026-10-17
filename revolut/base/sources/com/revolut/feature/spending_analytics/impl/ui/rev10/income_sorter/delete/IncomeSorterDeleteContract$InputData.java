package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/delete/IncomeSorterDeleteContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDeleteContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDeleteContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorter f87715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f87716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorterExecution f87717c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            IncomeSorter incomeSorter = (IncomeSorter) j6.a.f(parcel, "parcel", IncomeSorterDeleteContract$InputData.class);
            a3 a3Var = (a3) parcel.readSerializable();
            IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) parcel.readParcelable(IncomeSorterDeleteContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new IncomeSorterDeleteContract$InputData(incomeSorter, incomeSorterExecution, arrayList, a3Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDeleteContract$InputData[i];
        }
    }

    public IncomeSorterDeleteContract$InputData(IncomeSorter incomeSorter, IncomeSorterExecution incomeSorterExecution, List rates, a3 transaction) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f87715a = incomeSorter;
        this.f87716b = transaction;
        this.f87717c = incomeSorterExecution;
        this.d = rates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterDeleteContract$InputData)) {
            return false;
        }
        IncomeSorterDeleteContract$InputData incomeSorterDeleteContract$InputData = (IncomeSorterDeleteContract$InputData) obj2;
        return Intrinsics.f(this.f87715a, incomeSorterDeleteContract$InputData.f87715a) && Intrinsics.f(this.f87716b, incomeSorterDeleteContract$InputData.f87716b) && Intrinsics.f(this.f87717c, incomeSorterDeleteContract$InputData.f87717c) && Intrinsics.f(this.d, incomeSorterDeleteContract$InputData.d);
    }

    public final int hashCode() {
        int iF = y.f(this.f87716b, this.f87715a.hashCode() * 31, 31);
        IncomeSorterExecution incomeSorterExecution = this.f87717c;
        return this.d.hashCode() + ((iF + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87715a, i);
        dest.writeSerializable(this.f87716b);
        dest.writeParcelable(this.f87717c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
