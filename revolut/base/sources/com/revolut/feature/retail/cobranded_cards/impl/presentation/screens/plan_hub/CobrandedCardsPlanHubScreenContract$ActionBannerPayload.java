package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionSuccess;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload", "Landroid/os/Parcelable;", "Subscribe", "Url", "CancelCardTermination", "OrderCard", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$CancelCardTermination;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$OrderCard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$Url;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlanHubScreenContract$ActionBannerPayload extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$CancelCardTermination;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelCardTermination implements CobrandedCardsPlanHubScreenContract$ActionBannerPayload {

        @NotNull
        public static final Parcelable.Creator<CancelCardTermination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerAction f82569a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelCardTermination((CobrandedCardsPlanHubInfoBannerAction) parcel.readParcelable(CancelCardTermination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelCardTermination[i];
            }
        }

        public CancelCardTermination(CobrandedCardsPlanHubInfoBannerAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f82569a = action;
        }

        @Override // com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload
        /* JADX INFO: renamed from: B, reason: from getter */
        public final CobrandedCardsPlanHubInfoBannerAction getF82576b() {
            return this.f82569a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelCardTermination) && Intrinsics.f(this.f82569a, ((CancelCardTermination) obj2).f82569a);
        }

        public final int hashCode() {
            return this.f82569a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82569a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$OrderCard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderCard implements CobrandedCardsPlanHubScreenContract$ActionBannerPayload {

        @NotNull
        public static final Parcelable.Creator<OrderCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerAction f82570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsPlanHubPlan f82571b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderCard((CobrandedCardsPlanHubInfoBannerAction) parcel.readParcelable(OrderCard.class.getClassLoader()), (CobrandedCardsPlanHubPlan) parcel.readParcelable(OrderCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderCard[i];
            }
        }

        public OrderCard(CobrandedCardsPlanHubInfoBannerAction action, CobrandedCardsPlanHubPlan currentPlan) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
            this.f82570a = action;
            this.f82571b = currentPlan;
        }

        @Override // com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload
        /* JADX INFO: renamed from: B, reason: from getter */
        public final CobrandedCardsPlanHubInfoBannerAction getF82576b() {
            return this.f82570a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderCard)) {
                return false;
            }
            OrderCard orderCard = (OrderCard) obj2;
            return Intrinsics.f(this.f82570a, orderCard.f82570a) && Intrinsics.f(this.f82571b, orderCard.f82571b);
        }

        public final int hashCode() {
            return this.f82571b.hashCode() + (this.f82570a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82570a, i);
            dest.writeParcelable(this.f82571b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscribe implements CobrandedCardsPlanHubScreenContract$ActionBannerPayload {

        @NotNull
        public static final Parcelable.Creator<Subscribe> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubPlan f82572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerAction f82573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerActionSuccess f82574c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscribe((CobrandedCardsPlanHubPlan) parcel.readParcelable(Subscribe.class.getClassLoader()), (CobrandedCardsPlanHubInfoBannerAction) parcel.readParcelable(Subscribe.class.getClassLoader()), (CobrandedCardsPlanHubInfoBannerActionSuccess) parcel.readParcelable(Subscribe.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscribe[i];
            }
        }

        public Subscribe(CobrandedCardsPlanHubPlan currentPlan, CobrandedCardsPlanHubInfoBannerAction action, CobrandedCardsPlanHubInfoBannerActionSuccess successConfiguration) {
            Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(successConfiguration, "successConfiguration");
            this.f82572a = currentPlan;
            this.f82573b = action;
            this.f82574c = successConfiguration;
        }

        @Override // com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload
        /* JADX INFO: renamed from: B, reason: from getter */
        public final CobrandedCardsPlanHubInfoBannerAction getF82576b() {
            return this.f82573b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subscribe)) {
                return false;
            }
            Subscribe subscribe = (Subscribe) obj2;
            return Intrinsics.f(this.f82572a, subscribe.f82572a) && Intrinsics.f(this.f82573b, subscribe.f82573b) && Intrinsics.f(this.f82574c, subscribe.f82574c);
        }

        public final int hashCode() {
            return this.f82574c.hashCode() + ((this.f82573b.hashCode() + (this.f82572a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82572a, i);
            dest.writeParcelable(this.f82573b, i);
            dest.writeParcelable(this.f82574c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload$Url;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreenContract$ActionBannerPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url implements CobrandedCardsPlanHubScreenContract$ActionBannerPayload {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoBannerAction f82576b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Url(parcel.readString(), (CobrandedCardsPlanHubInfoBannerAction) parcel.readParcelable(Url.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public Url(String url2, CobrandedCardsPlanHubInfoBannerAction action) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f82575a = url2;
            this.f82576b = action;
        }

        @Override // com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload
        /* JADX INFO: renamed from: B, reason: from getter */
        public final CobrandedCardsPlanHubInfoBannerAction getF82576b() {
            return this.f82576b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Url)) {
                return false;
            }
            Url url2 = (Url) obj2;
            return Intrinsics.f(this.f82575a, url2.f82575a) && Intrinsics.f(this.f82576b, url2.f82576b);
        }

        public final int hashCode() {
            return this.f82576b.hashCode() + (this.f82575a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82575a);
            dest.writeParcelable(this.f82576b, i);
        }
    }

    /* JADX INFO: renamed from: B */
    CobrandedCardsPlanHubInfoBannerAction getF82576b();
}
