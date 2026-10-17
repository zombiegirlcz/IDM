package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ActionType", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanHubInfoBannerAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubInfoBannerAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionType f82342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsPlanHubInfoBannerActionConfirmation f82344c;
    public final CobrandedCardsPlanHubInfoBannerActionSuccess d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType;", "Landroid/os/Parcelable;", "<init>", "()V", "Url", "Subscribe", "CancelCardTermination", "OrderCard", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$CancelCardTermination;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$OrderCard;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$Url;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ActionType implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$CancelCardTermination;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CancelCardTermination extends ActionType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CancelCardTermination f82345a = new CancelCardTermination();

            @NotNull
            public static final Parcelable.Creator<CancelCardTermination> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CancelCardTermination.f82345a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CancelCardTermination[i];
                }
            }

            private CancelCardTermination() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$OrderCard;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OrderCard extends ActionType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OrderCard f82346a = new OrderCard();

            @NotNull
            public static final Parcelable.Creator<OrderCard> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OrderCard.f82346a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OrderCard[i];
                }
            }

            private OrderCard() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Subscribe extends ActionType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Subscribe f82347a = new Subscribe();

            @NotNull
            public static final Parcelable.Creator<Subscribe> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Subscribe.f82347a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Subscribe[i];
                }
            }

            private Subscribe() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType$Url;", "Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanHubInfoBannerAction$ActionType;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Url extends ActionType {

            @NotNull
            public static final Parcelable.Creator<Url> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82348a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Url(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Url[i];
                }
            }

            public Url(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f82348a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Url) && Intrinsics.f(this.f82348a, ((Url) obj2).f82348a);
            }

            public final int hashCode() {
                return this.f82348a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82348a);
            }
        }

        private ActionType() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsPlanHubInfoBannerAction((ActionType) parcel.readParcelable(CobrandedCardsPlanHubInfoBannerAction.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CobrandedCardsPlanHubInfoBannerActionConfirmation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CobrandedCardsPlanHubInfoBannerActionSuccess.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubInfoBannerAction[i];
        }
    }

    public CobrandedCardsPlanHubInfoBannerAction(ActionType type, String title, CobrandedCardsPlanHubInfoBannerActionConfirmation cobrandedCardsPlanHubInfoBannerActionConfirmation, CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82342a = type;
        this.f82343b = title;
        this.f82344c = cobrandedCardsPlanHubInfoBannerActionConfirmation;
        this.d = cobrandedCardsPlanHubInfoBannerActionSuccess;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanHubInfoBannerAction)) {
            return false;
        }
        CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction = (CobrandedCardsPlanHubInfoBannerAction) obj2;
        return Intrinsics.f(this.f82342a, cobrandedCardsPlanHubInfoBannerAction.f82342a) && Intrinsics.f(this.f82343b, cobrandedCardsPlanHubInfoBannerAction.f82343b) && Intrinsics.f(this.f82344c, cobrandedCardsPlanHubInfoBannerAction.f82344c) && Intrinsics.f(this.d, cobrandedCardsPlanHubInfoBannerAction.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82342a.hashCode() * 31, 31, this.f82343b);
        CobrandedCardsPlanHubInfoBannerActionConfirmation cobrandedCardsPlanHubInfoBannerActionConfirmation = this.f82344c;
        int iHashCode = (iC + (cobrandedCardsPlanHubInfoBannerActionConfirmation == null ? 0 : cobrandedCardsPlanHubInfoBannerActionConfirmation.hashCode())) * 31;
        CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess = this.d;
        return iHashCode + (cobrandedCardsPlanHubInfoBannerActionSuccess != null ? cobrandedCardsPlanHubInfoBannerActionSuccess.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82342a, i);
        dest.writeString(this.f82343b);
        CobrandedCardsPlanHubInfoBannerActionConfirmation cobrandedCardsPlanHubInfoBannerActionConfirmation = this.f82344c;
        if (cobrandedCardsPlanHubInfoBannerActionConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBannerActionConfirmation.writeToParcel(dest, i);
        }
        CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess = this.d;
        if (cobrandedCardsPlanHubInfoBannerActionSuccess == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanHubInfoBannerActionSuccess.writeToParcel(dest, i);
        }
    }
}
