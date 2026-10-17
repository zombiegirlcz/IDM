package com.revolut.feature.global_markets.impl.ui.flow.index_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "OverviewItem", "NewsItem", "Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem$NewsItem;", "Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem$OverviewItem;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndexDetailsFlowContract$PagerItem implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem$NewsItem;", "Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem;", "<init>", "()V", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewsItem extends IndexDetailsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewsItem f74584a = new NewsItem();

        @NotNull
        public static final Parcelable.Creator<NewsItem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewsItem.f74584a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewsItem[i];
            }
        }

        private NewsItem() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem$OverviewItem;", "Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem;", "<init>", "()V", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OverviewItem extends IndexDetailsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OverviewItem f74585a = new OverviewItem();

        @NotNull
        public static final Parcelable.Creator<OverviewItem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OverviewItem.f74585a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverviewItem[i];
            }
        }

        private OverviewItem() {
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

    private IndexDetailsFlowContract$PagerItem() {
    }
}
