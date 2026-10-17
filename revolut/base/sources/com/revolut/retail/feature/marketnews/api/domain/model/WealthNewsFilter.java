package com.revolut.retail.feature.marketnews.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.global_markets.domain.Market;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter;", "Landroid/os/Parcelable;", "ByAssetFilter", "ByRef", "ByMarket", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByAssetFilter;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByMarket;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByRef;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthNewsFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByAssetFilter;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByAssetFilter implements WealthNewsFilter {

        @NotNull
        public static final Parcelable.Creator<ByAssetFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f101809a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(tdh.a.valueOf(parcel.readString()));
                }
                return new ByAssetFilter(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByAssetFilter[i];
            }
        }

        public ByAssetFilter(Set selectedFilters) {
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f101809a = selectedFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByAssetFilter) && Intrinsics.f(this.f101809a, ((ByAssetFilter) obj2).f101809a);
        }

        public final int hashCode() {
            return this.f101809a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f101809a, dest);
            while (itV.hasNext()) {
                dest.writeString(((tdh.a) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByMarket;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByMarket implements WealthNewsFilter {

        @NotNull
        public static final Parcelable.Creator<ByMarket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Market f101810a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByMarket((Market) parcel.readParcelable(ByMarket.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByMarket[i];
            }
        }

        public ByMarket(Market market) {
            this.f101810a = market;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByMarket) && this.f101810a == ((ByMarket) obj2).f101810a;
        }

        public final int hashCode() {
            Market market = this.f101810a;
            if (market == null) {
                return 0;
            }
            return market.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101810a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter$ByRef;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsFilter;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByRef implements WealthNewsFilter {

        @NotNull
        public static final Parcelable.Creator<ByRef> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101811a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByRef(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByRef[i];
            }
        }

        public ByRef(String instrumentRef) {
            Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
            this.f101811a = instrumentRef;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByRef) && Intrinsics.f(this.f101811a, ((ByRef) obj2).f101811a);
        }

        public final int hashCode() {
            return this.f101811a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101811a);
        }
    }
}
