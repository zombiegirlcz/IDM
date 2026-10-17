package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/flow/CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f71523c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState.class, parcel, arrayList, iE, 1);
            }
            return new CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState(dVar, dVar2, dVar3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState[i];
        }
    }

    public CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState(d amount, d amountAfterFee, d fee2, List feeBreakdowns) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountAfterFee, "amountAfterFee");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(feeBreakdowns, "feeBreakdowns");
        this.f71521a = amount;
        this.f71522b = amountAfterFee;
        this.f71523c = fee2;
        this.d = feeBreakdowns;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState)) {
            return false;
        }
        CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState cryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState = (CryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState) obj2;
        return Intrinsics.f(this.f71521a, cryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState.f71521a) && Intrinsics.f(this.f71522b, cryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState.f71522b) && Intrinsics.f(this.f71523c, cryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState.f71523c) && Intrinsics.f(this.d, cryptoCommodityBuyCollectionFlowContract$CryptoCommodityBuyCollectionDialogDisplayer$CryptoCommodityBuyCollectionDialogDisplayerState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f71521a.hashCode() * 31, 31, this.f71522b), 31, this.f71523c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71521a);
        dest.writeSerializable(this.f71522b);
        dest.writeSerializable(this.f71523c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
