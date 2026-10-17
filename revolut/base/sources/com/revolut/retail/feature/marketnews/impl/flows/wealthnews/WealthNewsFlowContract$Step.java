package com.revolut.retail.feature.marketnews.impl.flows.wealthnews;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Overview", "Reader", "DailyNews", "AllNews", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$AllNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$DailyNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$Reader;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthNewsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$AllNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllNews implements WealthNewsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllNews> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthNewsFilter f101837a;

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
            this.f101837a = filter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllNews) && Intrinsics.f(this.f101837a, ((AllNews) obj2).f101837a);
        }

        public final int hashCode() {
            return this.f101837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101837a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$DailyNews;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DailyNews implements WealthNewsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DailyNews> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f101838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthNewsCategory f101839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101840c;

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
            this.f101838a = date;
            this.f101839b = category;
            this.f101840c = z;
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
            return Intrinsics.f(this.f101838a, dailyNews.f101838a) && Intrinsics.f(this.f101839b, dailyNews.f101839b) && this.f101840c == dailyNews.f101840c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101840c) + ((this.f101839b.hashCode() + (this.f101838a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101838a);
            dest.writeParcelable(this.f101839b, i);
            dest.writeInt(this.f101840c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements WealthNewsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tzj.a f101841a;

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
            this.f101841a = section;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Overview) && this.f101841a == ((Overview) obj2).f101841a;
        }

        public final int hashCode() {
            return this.f101841a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101841a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step$Reader;", "Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/WealthNewsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reader implements WealthNewsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Reader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthNewsArticle f101842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101843b;

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
            this.f101842a = article;
            this.f101843b = z;
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
            return Intrinsics.f(this.f101842a, reader.f101842a) && this.f101843b == reader.f101843b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101843b) + (this.f101842a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101842a, i);
            dest.writeInt(this.f101843b ? 1 : 0);
        }
    }
}
