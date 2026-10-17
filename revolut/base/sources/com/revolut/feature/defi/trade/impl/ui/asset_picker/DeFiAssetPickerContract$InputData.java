package com.revolut.feature.defi.trade.impl.ui.asset_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/trade/impl/ui/asset_picker/DeFiAssetPickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_trade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAssetPickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiAssetPickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f71881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f71882c;
    public final Clause d;

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
            return new DeFiAssetPickerContract$InputData(string, linkedHashSet, parcel.readInt() == 0 ? null : wk5.a.valueOf(parcel.readString()), (Clause) parcel.readParcelable(DeFiAssetPickerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetPickerContract$InputData[i];
        }
    }

    public DeFiAssetPickerContract$InputData(String str, Set excludedAssetExternalIds, wk5.a aVar, Clause clause) {
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        this.f71880a = str;
        this.f71881b = excludedAssetExternalIds;
        this.f71882c = aVar;
        this.d = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAssetPickerContract$InputData)) {
            return false;
        }
        DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData = (DeFiAssetPickerContract$InputData) obj2;
        return Intrinsics.f(this.f71880a, deFiAssetPickerContract$InputData.f71880a) && Intrinsics.f(this.f71881b, deFiAssetPickerContract$InputData.f71881b) && this.f71882c == deFiAssetPickerContract$InputData.f71882c && Intrinsics.f(this.d, deFiAssetPickerContract$InputData.d);
    }

    public final int hashCode() {
        String str = this.f71880a;
        int iF = p.a.f((str == null ? 0 : str.hashCode()) * 31, 31, this.f71881b);
        wk5.a aVar = this.f71882c;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71880a);
        Iterator itV = n.v(this.f71881b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        wk5.a aVar = this.f71882c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.d, i);
    }
}
