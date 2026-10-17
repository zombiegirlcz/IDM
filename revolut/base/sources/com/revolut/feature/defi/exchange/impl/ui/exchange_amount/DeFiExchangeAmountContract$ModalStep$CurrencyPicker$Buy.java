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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/exchange_amount/DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy", "", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy implements DeFiExchangeAmountContract$ModalStep {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f71760b;

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
            return new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy[i];
        }
    }

    public DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy(String str, Set excludedAssetExternalIds) {
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        this.f71759a = str;
        this.f71760b = excludedAssetExternalIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy)) {
            return false;
        }
        DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy = (DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy) obj2;
        return Intrinsics.f(this.f71759a, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy.f71759a) && Intrinsics.f(this.f71760b, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy.f71760b);
    }

    public final int hashCode() {
        String str = this.f71759a;
        return this.f71760b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71759a);
        Iterator itV = n.v(this.f71760b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
