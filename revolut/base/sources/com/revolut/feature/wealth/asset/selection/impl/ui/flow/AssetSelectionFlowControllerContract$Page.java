package com.revolut.feature.wealth.asset.selection.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "Cash", "Stock", "Etp", "Bond", "Cfd", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Bond;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Cash;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Cfd;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Etp;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Stock;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetSelectionFlowControllerContract$Page extends PagerItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Bond;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bond implements AssetSelectionFlowControllerContract$Page {

        @NotNull
        public static final Parcelable.Creator<Bond> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetSelectionCategory.Bond f95392a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bond((AssetSelectionCategory.Bond) parcel.readParcelable(Bond.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bond[i];
            }
        }

        public Bond(AssetSelectionCategory.Bond assetSelectionCategory) {
            Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
            this.f95392a = assetSelectionCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bond) && Intrinsics.f(this.f95392a, ((Bond) obj2).f95392a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "bond";
        }

        public final int hashCode() {
            return this.f95392a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95392a, i);
        }

        @Override // com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page
        public final AssetSelectionCategory x1() {
            return this.f95392a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Cash;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cash implements AssetSelectionFlowControllerContract$Page {

        @NotNull
        public static final Parcelable.Creator<Cash> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetSelectionCategory.Cash f95393a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cash((AssetSelectionCategory.Cash) parcel.readParcelable(Cash.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cash[i];
            }
        }

        public Cash(AssetSelectionCategory.Cash assetSelectionCategory) {
            Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
            this.f95393a = assetSelectionCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cash) && Intrinsics.f(this.f95393a, ((Cash) obj2).f95393a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "cash";
        }

        public final int hashCode() {
            return this.f95393a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95393a, i);
        }

        @Override // com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page
        public final AssetSelectionCategory x1() {
            return this.f95393a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Cfd;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cfd implements AssetSelectionFlowControllerContract$Page {

        @NotNull
        public static final Parcelable.Creator<Cfd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetSelectionCategory.Cfd f95394a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cfd((AssetSelectionCategory.Cfd) parcel.readParcelable(Cfd.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cfd[i];
            }
        }

        public Cfd(AssetSelectionCategory.Cfd assetSelectionCategory) {
            Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
            this.f95394a = assetSelectionCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cfd) && Intrinsics.f(this.f95394a, ((Cfd) obj2).f95394a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "cfd";
        }

        public final int hashCode() {
            return this.f95394a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95394a, i);
        }

        @Override // com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page
        public final AssetSelectionCategory x1() {
            return this.f95394a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Etp;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Etp implements AssetSelectionFlowControllerContract$Page {

        @NotNull
        public static final Parcelable.Creator<Etp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetSelectionCategory.Etp f95395a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Etp((AssetSelectionCategory.Etp) parcel.readParcelable(Etp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Etp[i];
            }
        }

        public Etp(AssetSelectionCategory.Etp assetSelectionCategory) {
            Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
            this.f95395a = assetSelectionCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Etp) && Intrinsics.f(this.f95395a, ((Etp) obj2).f95395a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "etp";
        }

        public final int hashCode() {
            return this.f95395a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95395a, i);
        }

        @Override // com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page
        public final AssetSelectionCategory x1() {
            return this.f95395a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page$Stock;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stock implements AssetSelectionFlowControllerContract$Page {

        @NotNull
        public static final Parcelable.Creator<Stock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetSelectionCategory.Stock f95396a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stock((AssetSelectionCategory.Stock) parcel.readParcelable(Stock.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stock[i];
            }
        }

        public Stock(AssetSelectionCategory.Stock assetSelectionCategory) {
            Intrinsics.checkNotNullParameter(assetSelectionCategory, "assetSelectionCategory");
            this.f95396a = assetSelectionCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stock) && Intrinsics.f(this.f95396a, ((Stock) obj2).f95396a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "stock";
        }

        public final int hashCode() {
            return this.f95396a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95396a, i);
        }

        @Override // com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page
        public final AssetSelectionCategory x1() {
            return this.f95396a;
        }
    }

    AssetSelectionCategory x1();
}
