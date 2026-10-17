package com.revolut.feature.pockets.impl.ui.pockets_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.impl.ui.pockets_list.model.CurrencyCountryKey;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketsListContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PocketsListContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketListType f80905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyCountryKey f80906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PocketsListContract$UICustomization f80907c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketsListContract$InputData((PocketListType) parcel.readParcelable(PocketsListContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : CurrencyCountryKey.CREATOR.createFromParcel(parcel), PocketsListContract$UICustomization.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketsListContract$InputData[i];
        }
    }

    public PocketsListContract$InputData(PocketListType pocketListType, CurrencyCountryKey currencyCountryKey, PocketsListContract$UICustomization uiCustomization, boolean z) {
        Intrinsics.checkNotNullParameter(pocketListType, "pocketListType");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.f80905a = pocketListType;
        this.f80906b = currencyCountryKey;
        this.f80907c = uiCustomization;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketsListContract$InputData)) {
            return false;
        }
        PocketsListContract$InputData pocketsListContract$InputData = (PocketsListContract$InputData) obj2;
        return Intrinsics.f(this.f80905a, pocketsListContract$InputData.f80905a) && Intrinsics.f(this.f80906b, pocketsListContract$InputData.f80906b) && Intrinsics.f(this.f80907c, pocketsListContract$InputData.f80907c) && this.d == pocketsListContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f80905a.hashCode() * 31;
        CurrencyCountryKey currencyCountryKey = this.f80906b;
        return Boolean.hashCode(this.d) + ((this.f80907c.hashCode() + ((iHashCode + (currencyCountryKey == null ? 0 : currencyCountryKey.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80905a, i);
        CurrencyCountryKey currencyCountryKey = this.f80906b;
        if (currencyCountryKey == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currencyCountryKey.writeToParcel(dest, i);
        }
        this.f80907c.writeToParcel(dest, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
