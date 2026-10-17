package com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rzj.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab;", "Landroid/os/Parcelable;", "TopStories", "Stocks", "Crypto", "Commodities", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Commodities;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Crypto;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Stocks;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$TopStories;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthNewsOverviewTab implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f101851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101852c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Commodities;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab;", "<init>", "()V", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities extends WealthNewsOverviewTab {
        public static final Commodities d = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
            super(R$string.wealth_news_tab_commodities, g.COMMODITIES, false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Crypto;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab;", "<init>", "()V", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Crypto extends WealthNewsOverviewTab {
        public static final Crypto d = new Crypto();

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Crypto.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        private Crypto() {
            super(R$string.wealth_news_tab_crypto, g.CRYPTO, false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$Stocks;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab;", "<init>", "()V", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stocks extends WealthNewsOverviewTab {
        public static final Stocks d = new Stocks();

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stocks.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        private Stocks() {
            super(R$string.wealth_news_tab_stocks, g.STOCKS, false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab$TopStories;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnewsoverview/WealthNewsOverviewTab;", "<init>", "()V", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TopStories extends WealthNewsOverviewTab {
        public static final TopStories d = new TopStories();

        @NotNull
        public static final Parcelable.Creator<TopStories> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TopStories.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopStories[i];
            }
        }

        private TopStories() {
            super(R$string.wealth_news_tab_top_stories, g.STOCKS, true);
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

    public WealthNewsOverviewTab(int i, g gVar, boolean z) {
        this.f101850a = i;
        this.f101851b = gVar;
        this.f101852c = z;
    }
}
