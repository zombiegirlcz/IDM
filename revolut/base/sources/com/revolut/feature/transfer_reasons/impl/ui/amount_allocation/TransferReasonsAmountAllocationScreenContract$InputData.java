package com.revolut.feature.transfer_reasons.impl.ui.amount_allocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/amount_allocation/TransferReasonsAmountAllocationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsAmountAllocationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsAmountAllocationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92389c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(TransferReasonsAmountAllocationScreenContract$InputData.class, parcel, arrayList, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(TransferReasonsAmountAllocationScreenContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new TransferReasonsAmountAllocationScreenContract$InputData(dVar, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsAmountAllocationScreenContract$InputData[i];
        }
    }

    public TransferReasonsAmountAllocationScreenContract$InputData(d amount, List reasons, List allocations) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        this.f92387a = amount;
        this.f92388b = reasons;
        this.f92389c = allocations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsAmountAllocationScreenContract$InputData)) {
            return false;
        }
        TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = (TransferReasonsAmountAllocationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92387a, transferReasonsAmountAllocationScreenContract$InputData.f92387a) && Intrinsics.f(this.f92388b, transferReasonsAmountAllocationScreenContract$InputData.f92388b) && Intrinsics.f(this.f92389c, transferReasonsAmountAllocationScreenContract$InputData.f92389c);
    }

    public final int hashCode() {
        return this.f92389c.hashCode() + p.a.d(this.f92387a.hashCode() * 31, 31, this.f92388b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92387a);
        Iterator itV = p.a.v(this.f92388b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f92389c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
