package com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.scroller.FixedIdScrollerStep;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/scroller/FixedIdScrollerStep;", "TopStories", "Stocks", "Crypto", "Commodities", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Commodities;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Crypto;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Stocks;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$TopStories;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthNewsOverviewFlowContract$Step extends FixedIdScrollerStep {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthNewsCategory f101848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101849c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Commodities;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Commodities extends WealthNewsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Commodities(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        public Commodities() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Commodities) && Intrinsics.f(this.d, ((Commodities) obj2).d);
        }

        @Override // com.revolut.kompot.navigable.flow.scroller.FixedIdScrollerStep, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
        }

        public /* synthetic */ Commodities(int i) {
            this(b.a(WealthNewsOverviewTab.Commodities.d));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Commodities(String id10) {
            super(WealthNewsCategory.Commodities.f101804b, false);
            Intrinsics.checkNotNullParameter(id10, "id");
            this.d = id10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Crypto;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crypto extends WealthNewsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public Crypto() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Crypto) && Intrinsics.f(this.d, ((Crypto) obj2).d);
        }

        @Override // com.revolut.kompot.navigable.flow.scroller.FixedIdScrollerStep, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
        }

        public /* synthetic */ Crypto(int i) {
            this(b.a(WealthNewsOverviewTab.Crypto.d));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(String id10) {
            super(WealthNewsCategory.Crypto.f101805b, false);
            Intrinsics.checkNotNullParameter(id10, "id");
            this.d = id10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$Stocks;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stocks extends WealthNewsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stocks(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        public Stocks() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stocks) && Intrinsics.f(this.d, ((Stocks) obj2).d);
        }

        @Override // com.revolut.kompot.navigable.flow.scroller.FixedIdScrollerStep, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
        }

        public /* synthetic */ Stocks(int i) {
            this(b.a(WealthNewsOverviewTab.Stocks.d));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stocks(String id10) {
            super(WealthNewsCategory.Stocks.f101808b, false);
            Intrinsics.checkNotNullParameter(id10, "id");
            this.d = id10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step$TopStories;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopStories extends WealthNewsOverviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopStories> CREATOR = new a();
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopStories(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopStories[i];
            }
        }

        public TopStories() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TopStories) && Intrinsics.f(this.d, ((TopStories) obj2).d);
        }

        @Override // com.revolut.kompot.navigable.flow.scroller.FixedIdScrollerStep, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
        }

        public /* synthetic */ TopStories(int i) {
            this(b.a(WealthNewsOverviewTab.TopStories.d));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopStories(String id10) {
            super(WealthNewsCategory.Stocks.f101808b, true);
            Intrinsics.checkNotNullParameter(id10, "id");
            this.d = id10;
        }
    }

    public WealthNewsOverviewFlowContract$Step(WealthNewsCategory wealthNewsCategory, boolean z) {
        this.f101848b = wealthNewsCategory;
        this.f101849c = z;
    }
}
