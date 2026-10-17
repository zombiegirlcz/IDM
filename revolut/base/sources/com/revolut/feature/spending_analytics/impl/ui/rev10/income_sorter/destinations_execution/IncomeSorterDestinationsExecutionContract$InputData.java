package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations_execution/IncomeSorterDestinationsExecutionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDestinationsExecutionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDestinationsExecutionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f87739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterHomeContract$DestinationValue f87740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f87741c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterHomeContract$DestinationValue.CREATOR, parcel, arrayList, iA, 1);
            }
            IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValueCreateFromParcel = parcel.readInt() == 0 ? null : IncomeSorterHomeContract$DestinationValue.CREATOR.createFromParcel(parcel);
            d dVar = (d) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            return new IncomeSorterDestinationsExecutionContract$InputData(arrayList, incomeSorterHomeContract$DestinationValueCreateFromParcel, dVar, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDestinationsExecutionContract$InputData[i];
        }
    }

    public IncomeSorterDestinationsExecutionContract$InputData(ArrayList destinations, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, d transactionAmount, List rates) {
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f87739a = destinations;
        this.f87740b = incomeSorterHomeContract$DestinationValue;
        this.f87741c = transactionAmount;
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
        if (!(obj2 instanceof IncomeSorterDestinationsExecutionContract$InputData)) {
            return false;
        }
        IncomeSorterDestinationsExecutionContract$InputData incomeSorterDestinationsExecutionContract$InputData = (IncomeSorterDestinationsExecutionContract$InputData) obj2;
        return this.f87739a.equals(incomeSorterDestinationsExecutionContract$InputData.f87739a) && Intrinsics.f(this.f87740b, incomeSorterDestinationsExecutionContract$InputData.f87740b) && Intrinsics.f(this.f87741c, incomeSorterDestinationsExecutionContract$InputData.f87741c) && Intrinsics.f(this.d, incomeSorterDestinationsExecutionContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f87739a.hashCode() * 31;
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f87740b;
        return this.d.hashCode() + v7.c((iHashCode + (incomeSorterHomeContract$DestinationValue == null ? 0 : incomeSorterHomeContract$DestinationValue.hashCode())) * 31, 31, this.f87741c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f87739a, dest);
        while (itY.hasNext()) {
            ((IncomeSorterHomeContract$DestinationValue) itY.next()).writeToParcel(dest, i);
        }
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f87740b;
        if (incomeSorterHomeContract$DestinationValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            incomeSorterHomeContract$DestinationValue.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f87741c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
