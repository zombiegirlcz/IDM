package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/marketnews/impl/ui/wealthnews/all_news/WealthAllNewsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddToWatchlist", "Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/all_news/WealthAllNewsContract$ModalStep$AddToWatchlist;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthAllNewsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/all_news/WealthAllNewsContract$ModalStep$AddToWatchlist;", "Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/all_news/WealthAllNewsContract$ModalStep;", "<init>", "()V", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddToWatchlist implements WealthAllNewsContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddToWatchlist f101860a = new AddToWatchlist();

        @NotNull
        public static final Parcelable.Creator<AddToWatchlist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddToWatchlist.f101860a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToWatchlist[i];
            }
        }

        private AddToWatchlist() {
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
}
