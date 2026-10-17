package com.revolut.feature.global_markets.impl.ui.redesign.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.global_markets.domain.Market;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "GlobalItem", "MarketItem", "Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem$GlobalItem;", "Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem$MarketItem;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GlobalMarketsRedesignFlowContract$PagerItem implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem$GlobalItem;", "Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem;", "<init>", "()V", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GlobalItem extends GlobalMarketsRedesignFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GlobalItem f74595a = new GlobalItem();

        @NotNull
        public static final Parcelable.Creator<GlobalItem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GlobalItem.f74595a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlobalItem[i];
            }
        }

        private GlobalItem() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem$MarketItem;", "Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketItem extends GlobalMarketsRedesignFlowContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<MarketItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Market f74596a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketItem((Market) parcel.readParcelable(MarketItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketItem[i];
            }
        }

        public MarketItem(Market market) {
            Intrinsics.checkNotNullParameter(market, "market");
            this.f74596a = market;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketItem) && this.f74596a == ((MarketItem) obj2).f74596a;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getD() {
            return j6.a.q("MarketItem", this.f74596a.name());
        }

        public final int hashCode() {
            return this.f74596a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74596a, i);
        }
    }

    private GlobalMarketsRedesignFlowContract$PagerItem() {
    }
}
