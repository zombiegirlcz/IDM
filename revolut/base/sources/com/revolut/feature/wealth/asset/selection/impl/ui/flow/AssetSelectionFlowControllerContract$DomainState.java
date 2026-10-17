package com.revolut.feature.wealth.asset.selection.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$DomainState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Loki/a;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetSelectionFlowControllerContract$DomainState implements States$PersistentDomain, oki.a {

    @NotNull
    public static final Parcelable.Creator<AssetSelectionFlowControllerContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f95388c;
    public final String d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Clause clause = (Clause) j6.a.f(parcel, "parcel", AssetSelectionFlowControllerContract$DomainState.class);
            int iE = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iA = 0;
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, i);
            }
            String string = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            while (iE != i3) {
                iE = j6.a.e(AssetSelectionFlowControllerContract$DomainState.class, parcel, arrayList, iE, i);
            }
            return new AssetSelectionFlowControllerContract$DomainState(clause, z, linkedHashSet, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetSelectionFlowControllerContract$DomainState[i];
        }
    }

    public AssetSelectionFlowControllerContract$DomainState(Clause clause, boolean z, Set selectedIds, String str, ArrayList pagerItems) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f95386a = clause;
        this.f95387b = z;
        this.f95388c = selectedIds;
        this.d = str;
        this.e = pagerItems;
    }

    public static AssetSelectionFlowControllerContract$DomainState a(AssetSelectionFlowControllerContract$DomainState assetSelectionFlowControllerContract$DomainState, boolean z, Set set, String str, int i) {
        Clause clause = assetSelectionFlowControllerContract$DomainState.f95386a;
        if ((i & 2) != 0) {
            z = assetSelectionFlowControllerContract$DomainState.f95387b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            set = assetSelectionFlowControllerContract$DomainState.f95388c;
        }
        Set selectedIds = set;
        if ((i & 8) != 0) {
            str = assetSelectionFlowControllerContract$DomainState.d;
        }
        ArrayList pagerItems = assetSelectionFlowControllerContract$DomainState.e;
        assetSelectionFlowControllerContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new AssetSelectionFlowControllerContract$DomainState(clause, z3, selectedIds, str, pagerItems);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF79628a() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetSelectionFlowControllerContract$DomainState)) {
            return false;
        }
        AssetSelectionFlowControllerContract$DomainState assetSelectionFlowControllerContract$DomainState = (AssetSelectionFlowControllerContract$DomainState) obj2;
        return Intrinsics.f(this.f95386a, assetSelectionFlowControllerContract$DomainState.f95386a) && this.f95387b == assetSelectionFlowControllerContract$DomainState.f95387b && Intrinsics.f(this.f95388c, assetSelectionFlowControllerContract$DomainState.f95388c) && Intrinsics.f(this.d, assetSelectionFlowControllerContract$DomainState.d) && this.e.equals(assetSelectionFlowControllerContract$DomainState.e);
    }

    public final int hashCode() {
        Clause clause = this.f95386a;
        int iF = p.a.f(j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f95387b), 31, this.f95388c);
        String str = this.d;
        return this.e.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95386a, i);
        dest.writeInt(this.f95387b ? 1 : 0);
        Iterator itV = n.v(this.f95388c, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeString(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
