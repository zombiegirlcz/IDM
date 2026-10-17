package com.revolut.feature.defi.exchange.impl.ui.exchange_amount;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/exchange_amount/DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell", "", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell implements DeFiExchangeAmountContract$ModalStep {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f71762b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell[i];
        }
    }

    public DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell(String str, Set excludedAssetExternalIds) {
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        this.f71761a = str;
        this.f71762b = excludedAssetExternalIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell)) {
            return false;
        }
        DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell = (DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell) obj2;
        return Intrinsics.f(this.f71761a, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell.f71761a) && Intrinsics.f(this.f71762b, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell.f71762b);
    }

    public final int hashCode() {
        String str = this.f71761a;
        return this.f71762b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71761a);
        Iterator itV = n.v(this.f71762b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
