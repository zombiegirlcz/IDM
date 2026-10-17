package com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.invest.smart_notifications.api.domain.InsightPublicationPriceDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddToWatchlist", "PublicationPrice", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep$AddToWatchlist;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep$PublicationPrice;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SmartFeedScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep$AddToWatchlist;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep;", "<init>", "()V", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddToWatchlist implements SmartFeedScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddToWatchlist f76440a = new AddToWatchlist();

        @NotNull
        public static final Parcelable.Creator<AddToWatchlist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddToWatchlist.f76440a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep$PublicationPrice;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PublicationPrice implements SmartFeedScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PublicationPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InsightPublicationPriceDescriptor f76441a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PublicationPrice((InsightPublicationPriceDescriptor) parcel.readParcelable(PublicationPrice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PublicationPrice[i];
            }
        }

        public PublicationPrice(InsightPublicationPriceDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f76441a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PublicationPrice) && Intrinsics.f(this.f76441a, ((PublicationPrice) obj2).f76441a);
        }

        public final int hashCode() {
            return this.f76441a.f76421a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76441a, i);
        }
    }
}
