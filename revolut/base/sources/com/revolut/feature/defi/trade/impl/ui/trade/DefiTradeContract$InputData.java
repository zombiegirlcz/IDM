package com.revolut.feature.defi.trade.impl.ui.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/trade/impl/ui/trade/DefiTradeContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_trade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefiTradeContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DefiTradeContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f71883a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new DefiTradeContract$InputData(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DefiTradeContract$InputData[i];
        }
    }

    public DefiTradeContract$InputData(Set userBalanceExternalAssetIds) {
        Intrinsics.checkNotNullParameter(userBalanceExternalAssetIds, "userBalanceExternalAssetIds");
        this.f71883a = userBalanceExternalAssetIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DefiTradeContract$InputData) && Intrinsics.f(this.f71883a, ((DefiTradeContract$InputData) obj2).f71883a);
    }

    public final int hashCode() {
        return this.f71883a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f71883a, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
