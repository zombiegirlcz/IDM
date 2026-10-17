package com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.invest.smart_notifications.api.domain.InsightPublicationPriceDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddToWatchlist", "PublicationPrice", "ShowInsight", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$AddToWatchlist;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$PublicationPrice;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$ShowInsight;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AllInsightsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$AddToWatchlist;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep;", "<init>", "()V", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddToWatchlist implements AllInsightsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddToWatchlist f76428a = new AddToWatchlist();

        @NotNull
        public static final Parcelable.Creator<AddToWatchlist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddToWatchlist.f76428a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$PublicationPrice;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PublicationPrice implements AllInsightsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PublicationPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InsightPublicationPriceDescriptor f76429a;

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
            this.f76429a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PublicationPrice) && Intrinsics.f(this.f76429a, ((PublicationPrice) obj2).f76429a);
        }

        public final int hashCode() {
            return this.f76429a.f76421a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76429a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep$ShowInsight;", "Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInsight implements AllInsightsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowInsight> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstrumentTicker f76430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f76431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f76432c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInsight((InstrumentTicker) parcel.readParcelable(ShowInsight.class.getClassLoader()), (Clause) parcel.readParcelable(ShowInsight.class.getClassLoader()), (Clause) parcel.readParcelable(ShowInsight.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowInsight[i];
            }
        }

        public ShowInsight(InstrumentTicker instrumentTicker, Clause title, Clause description) {
            Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f76430a = instrumentTicker;
            this.f76431b = title;
            this.f76432c = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowInsight)) {
                return false;
            }
            ShowInsight showInsight = (ShowInsight) obj2;
            return Intrinsics.f(this.f76430a, showInsight.f76430a) && Intrinsics.f(this.f76431b, showInsight.f76431b) && Intrinsics.f(this.f76432c, showInsight.f76432c);
        }

        public final int hashCode() {
            return this.f76432c.hashCode() + p.a.a(this.f76430a.hashCode() * 31, 31, this.f76431b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76430a, i);
            dest.writeParcelable(this.f76431b, i);
            dest.writeParcelable(this.f76432c, i);
        }
    }
}
