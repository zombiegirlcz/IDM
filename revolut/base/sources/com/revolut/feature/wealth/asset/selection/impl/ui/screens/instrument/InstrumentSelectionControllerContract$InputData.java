package com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.kompot.common.IOData$Input;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/asset/selection/impl/ui/screens/instrument/InstrumentSelectionControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentSelectionControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InstrumentSelectionControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f95404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetSelectionCategory f95405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f95406c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            AssetSelectionCategory assetSelectionCategory = (AssetSelectionCategory) parcel.readParcelable(InstrumentSelectionControllerContract$InputData.class.getClassLoader());
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
            return new InstrumentSelectionControllerContract$InputData(eVarValueOf, assetSelectionCategory, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentSelectionControllerContract$InputData[i];
        }
    }

    public InstrumentSelectionControllerContract$InputData(e selectionType, AssetSelectionCategory assetSelectionCategory, Set preSelectedIds, Set excludedIds) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
        Intrinsics.checkNotNullParameter(preSelectedIds, "preSelectedIds");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        this.f95404a = selectionType;
        this.f95405b = assetSelectionCategory;
        this.f95406c = preSelectedIds;
        this.d = excludedIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentSelectionControllerContract$InputData)) {
            return false;
        }
        InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = (InstrumentSelectionControllerContract$InputData) obj2;
        return this.f95404a == instrumentSelectionControllerContract$InputData.f95404a && Intrinsics.f(this.f95405b, instrumentSelectionControllerContract$InputData.f95405b) && Intrinsics.f(this.f95406c, instrumentSelectionControllerContract$InputData.f95406c) && Intrinsics.f(this.d, instrumentSelectionControllerContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.f((this.f95405b.hashCode() + (this.f95404a.hashCode() * 31)) * 31, 31, this.f95406c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95404a.name());
        dest.writeParcelable(this.f95405b, i);
        Iterator itV = n.v(this.f95406c, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
