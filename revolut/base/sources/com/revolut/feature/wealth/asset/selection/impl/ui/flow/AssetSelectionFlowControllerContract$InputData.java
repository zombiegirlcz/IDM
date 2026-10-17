package com.revolut.feature.wealth.asset.selection.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.database.models.openbanking.d;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetSelectionFlowControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AssetSelectionFlowControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f95390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f95391c;
    public final Set d;
    public final Set e;
    public final AssetSelectionCategory f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", AssetSelectionFlowControllerContract$InputData.class);
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = d.e(AssetSelectionFlowControllerContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = o.a(parcel, linkedHashSet2, iA2, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet3, iA, 1);
            }
            return new AssetSelectionFlowControllerContract$InputData(clause, eVarValueOf, linkedHashSet, linkedHashSet2, linkedHashSet3, (AssetSelectionCategory) parcel.readParcelable(AssetSelectionFlowControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetSelectionFlowControllerContract$InputData[i];
        }
    }

    public AssetSelectionFlowControllerContract$InputData(Clause clause, e selectionType, Set selectionCategories, Set preSelectedIds, Set excludedIds, AssetSelectionCategory assetSelectionCategory) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(selectionCategories, "selectionCategories");
        Intrinsics.checkNotNullParameter(preSelectedIds, "preSelectedIds");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        this.f95389a = clause;
        this.f95390b = selectionType;
        this.f95391c = selectionCategories;
        this.d = preSelectedIds;
        this.e = excludedIds;
        this.f = assetSelectionCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetSelectionFlowControllerContract$InputData)) {
            return false;
        }
        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = (AssetSelectionFlowControllerContract$InputData) obj2;
        return Intrinsics.f(this.f95389a, assetSelectionFlowControllerContract$InputData.f95389a) && this.f95390b == assetSelectionFlowControllerContract$InputData.f95390b && Intrinsics.f(this.f95391c, assetSelectionFlowControllerContract$InputData.f95391c) && Intrinsics.f(this.d, assetSelectionFlowControllerContract$InputData.d) && Intrinsics.f(this.e, assetSelectionFlowControllerContract$InputData.e) && Intrinsics.f(this.f, assetSelectionFlowControllerContract$InputData.f);
    }

    public final int hashCode() {
        Clause clause = this.f95389a;
        int iF = p.a.f(p.a.f(p.a.f((this.f95390b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31, 31, this.f95391c), 31, this.d), 31, this.e);
        AssetSelectionCategory assetSelectionCategory = this.f;
        return iF + (assetSelectionCategory != null ? assetSelectionCategory.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95389a, i);
        dest.writeString(this.f95390b.name());
        Iterator itV = n.v(this.f95391c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = n.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        dest.writeParcelable(this.f, i);
    }
}
