package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import ehe.n;
import hel.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/add_key_stats_view_items/AddKeyStatsViewItemsScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddKeyStatsViewItemsScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddKeyStatsViewItemsScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trk.a f104024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetStatsGroup f104025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f104026c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            trk.a aVarValueOf = trk.a.valueOf(parcel.readString());
            AssetStatsGroup assetStatsGroup = (AssetStatsGroup) parcel.readParcelable(AddKeyStatsViewItemsScreenContract$Input.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(AddKeyStatsViewItemsScreenContract$Input.class, parcel, linkedHashSet, iE, 1);
            }
            return new AddKeyStatsViewItemsScreenContract$Input(aVarValueOf, assetStatsGroup, linkedHashSet, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddKeyStatsViewItemsScreenContract$Input[i];
        }
    }

    public AddKeyStatsViewItemsScreenContract$Input(trk.a assetType, AssetStatsGroup assetStatsGroup, Set preselectedAssetStatsIdSet, b bVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
        Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
        this.f104024a = assetType;
        this.f104025b = assetStatsGroup;
        this.f104026c = preselectedAssetStatsIdSet;
        this.d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddKeyStatsViewItemsScreenContract$Input)) {
            return false;
        }
        AddKeyStatsViewItemsScreenContract$Input addKeyStatsViewItemsScreenContract$Input = (AddKeyStatsViewItemsScreenContract$Input) obj2;
        return this.f104024a == addKeyStatsViewItemsScreenContract$Input.f104024a && Intrinsics.f(this.f104025b, addKeyStatsViewItemsScreenContract$Input.f104025b) && Intrinsics.f(this.f104026c, addKeyStatsViewItemsScreenContract$Input.f104026c) && this.d == addKeyStatsViewItemsScreenContract$Input.d;
    }

    public final int hashCode() {
        int iF = p.a.f((this.f104025b.hashCode() + (this.f104024a.hashCode() * 31)) * 31, 31, this.f104026c);
        b bVar = this.d;
        return iF + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104024a.name());
        dest.writeParcelable(this.f104025b, i);
        Iterator itV = n.v(this.f104026c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
    }
}
