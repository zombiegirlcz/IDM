package com.revolut.feature.wealth.asset.selection.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import y1h.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/api/navigation/WealthAssetSelectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthAssetSelectionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthAssetSelectionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f95384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f95385c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;
    public final AssetSelectionCategory f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", WealthAssetSelectionDestination.class);
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = d.e(WealthAssetSelectionDestination.class, parcel, linkedHashSet, iE, 1);
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
            return new WealthAssetSelectionDestination(clause, eVarValueOf, linkedHashSet, linkedHashSet2, linkedHashSet3, (AssetSelectionCategory) parcel.readParcelable(WealthAssetSelectionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthAssetSelectionDestination[i];
        }
    }

    public WealthAssetSelectionDestination(Clause clause, e selectionType, LinkedHashSet selectionCategories, LinkedHashSet preSelectedIds, LinkedHashSet excludedIds, AssetSelectionCategory assetSelectionCategory) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(selectionCategories, "selectionCategories");
        Intrinsics.checkNotNullParameter(preSelectedIds, "preSelectedIds");
        Intrinsics.checkNotNullParameter(excludedIds, "excludedIds");
        this.f95383a = clause;
        this.f95384b = selectionType;
        this.f95385c = selectionCategories;
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
        if (!(obj2 instanceof WealthAssetSelectionDestination)) {
            return false;
        }
        WealthAssetSelectionDestination wealthAssetSelectionDestination = (WealthAssetSelectionDestination) obj2;
        return Intrinsics.f(this.f95383a, wealthAssetSelectionDestination.f95383a) && this.f95384b == wealthAssetSelectionDestination.f95384b && this.f95385c.equals(wealthAssetSelectionDestination.f95385c) && this.d.equals(wealthAssetSelectionDestination.d) && this.e.equals(wealthAssetSelectionDestination.e) && Intrinsics.f(this.f, wealthAssetSelectionDestination.f);
    }

    public final int hashCode() {
        Clause clause = this.f95383a;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f95385c.hashCode() + ((this.f95384b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        AssetSelectionCategory assetSelectionCategory = this.f;
        return iHashCode + (assetSelectionCategory != null ? assetSelectionCategory.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95383a, i);
        dest.writeString(this.f95384b.name());
        LinkedHashSet linkedHashSet = this.f95385c;
        dest.writeInt(linkedHashSet.size());
        Iterator it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            dest.writeParcelable((Parcelable) it8.next(), i);
        }
        LinkedHashSet linkedHashSet2 = this.d;
        dest.writeInt(linkedHashSet2.size());
        Iterator it9 = linkedHashSet2.iterator();
        while (it9.hasNext()) {
            dest.writeString((String) it9.next());
        }
        LinkedHashSet linkedHashSet3 = this.e;
        dest.writeInt(linkedHashSet3.size());
        Iterator it10 = linkedHashSet3.iterator();
        while (it10.hasNext()) {
            dest.writeString((String) it10.next());
        }
        dest.writeParcelable(this.f, i);
    }
}
