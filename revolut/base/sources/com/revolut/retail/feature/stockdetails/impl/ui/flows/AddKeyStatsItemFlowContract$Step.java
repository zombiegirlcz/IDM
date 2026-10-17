package com.revolut.retail.feature.stockdetails.impl.ui.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ViewGroupList", "ViewGroupItems", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step$ViewGroupItems;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step$ViewGroupList;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddKeyStatsItemFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step$ViewGroupItems;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewGroupItems implements AddKeyStatsItemFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ViewGroupItems> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetStatsGroup f103819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f103820b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                AssetStatsGroup assetStatsGroup = (AssetStatsGroup) j6.a.f(parcel, "parcel", ViewGroupItems.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(ViewGroupItems.class, parcel, linkedHashSet, iE, 1);
                }
                return new ViewGroupItems(assetStatsGroup, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewGroupItems[i];
            }
        }

        public ViewGroupItems(AssetStatsGroup assetStatsGroup, Set preselectedAssetStatsIdSet) {
            Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
            Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
            this.f103819a = assetStatsGroup;
            this.f103820b = preselectedAssetStatsIdSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ViewGroupItems)) {
                return false;
            }
            ViewGroupItems viewGroupItems = (ViewGroupItems) obj2;
            return Intrinsics.f(this.f103819a, viewGroupItems.f103819a) && Intrinsics.f(this.f103820b, viewGroupItems.f103820b);
        }

        public final int hashCode() {
            return this.f103820b.hashCode() + (this.f103819a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103819a, i);
            Iterator itV = n.v(this.f103820b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step$ViewGroupList;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewGroupList implements AddKeyStatsItemFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ViewGroupList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f103821a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(ViewGroupList.class, parcel, linkedHashSet, iE, 1);
                }
                return new ViewGroupList(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewGroupList[i];
            }
        }

        public ViewGroupList(Set preselectedAssetStatsIdSet) {
            Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
            this.f103821a = preselectedAssetStatsIdSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewGroupList) && Intrinsics.f(this.f103821a, ((ViewGroupList) obj2).f103821a);
        }

        public final int hashCode() {
            return this.f103821a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f103821a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
