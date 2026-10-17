package com.revolut.retail.feature.marketnews.impl.flows.wealthnews;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Overview", "Reader", "DailyNews", "AllNews", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$AllNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$DailyNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$Overview;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$Reader;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthNewsFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$AllNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllNews implements WealthNewsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AllNews> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthNewsFilter f101829a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllNews((WealthNewsFilter) parcel.readParcelable(AllNews.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllNews[i];
            }
        }

        public AllNews(WealthNewsFilter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f101829a = filter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllNews) && Intrinsics.f(this.f101829a, ((AllNews) obj2).f101829a);
        }

        public final int hashCode() {
            return this.f101829a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101829a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$DailyNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DailyNews implements WealthNewsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DailyNews> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f101830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthNewsCategory f101831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101832c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DailyNews((DateTime) parcel.readSerializable(), (WealthNewsCategory) parcel.readParcelable(DailyNews.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DailyNews[i];
            }
        }

        public DailyNews(DateTime date, WealthNewsCategory category, boolean z) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(category, "category");
            this.f101830a = date;
            this.f101831b = category;
            this.f101832c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DailyNews)) {
                return false;
            }
            DailyNews dailyNews = (DailyNews) obj2;
            return Intrinsics.f(this.f101830a, dailyNews.f101830a) && Intrinsics.f(this.f101831b, dailyNews.f101831b) && this.f101832c == dailyNews.f101832c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101832c) + ((this.f101831b.hashCode() + (this.f101830a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101830a);
            dest.writeParcelable(this.f101831b, i);
            dest.writeInt(this.f101832c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$Overview;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements WealthNewsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tzj.a f101833a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview(tzj.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview(tzj.a section) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f101833a = section;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Overview) && this.f101833a == ((Overview) obj2).f101833a;
        }

        public final int hashCode() {
            return this.f101833a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101833a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData$Reader;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reader implements WealthNewsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Reader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthNewsArticle f101834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101835b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reader((WealthNewsArticle) parcel.readParcelable(Reader.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reader[i];
            }
        }

        public Reader(WealthNewsArticle article, boolean z) {
            Intrinsics.checkNotNullParameter(article, "article");
            this.f101834a = article;
            this.f101835b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reader)) {
                return false;
            }
            Reader reader = (Reader) obj2;
            return Intrinsics.f(this.f101834a, reader.f101834a) && this.f101835b == reader.f101835b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101835b) + (this.f101834a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101834a, i);
            dest.writeInt(this.f101835b ? 1 : 0);
        }
    }
}
