package com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import y1h.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/asset/selection/impl/ui/screens/cash/CashSelectionControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashSelectionControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashSelectionControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f95401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f95402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f95403c;
    public final TradingAccountType d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = o.a(parcel, linkedHashSet, iA2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            return new CashSelectionControllerContract$InputData(eVarValueOf, linkedHashSet, linkedHashSet2, (TradingAccountType) parcel.readParcelable(CashSelectionControllerContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashSelectionControllerContract$InputData[i];
        }
    }

    public CashSelectionControllerContract$InputData(e selectionType, Set preSelectedIds, Set excludedIds, TradingAccountType tradingAccountType, String str) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(preSelectedIds, "preSelectedIds");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        Intrinsics.checkNotNullParameter(tradingAccountType, "tradingAccountType");
        this.f95401a = selectionType;
        this.f95402b = preSelectedIds;
        this.f95403c = excludedIds;
        this.d = tradingAccountType;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashSelectionControllerContract$InputData)) {
            return false;
        }
        CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = (CashSelectionControllerContract$InputData) obj2;
        return this.f95401a == cashSelectionControllerContract$InputData.f95401a && Intrinsics.f(this.f95402b, cashSelectionControllerContract$InputData.f95402b) && Intrinsics.f(this.f95403c, cashSelectionControllerContract$InputData.f95403c) && Intrinsics.f(this.d, cashSelectionControllerContract$InputData.d) && Intrinsics.f(this.e, cashSelectionControllerContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.f(p.a.f(this.f95401a.hashCode() * 31, 31, this.f95402b), 31, this.f95403c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95401a.name());
        Iterator itV = n.v(this.f95402b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itV2 = n.v(this.f95403c, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }
}
