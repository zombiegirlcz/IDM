package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001e\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "Landroid/os/Parcelable;", "<init>", "()V", "Stays", "Experiences", "Shops", "TabHeader", "HomeWidget", "Miles", "GiftCard", "PointsPocket", "PlanHub", "ExclusiveStore", "LoyaltySavings", "Deeplink", "CardSelection", "Cashback", "CreditWidget", "Esim", "Lounges", "Transport", "TransactionDetails", "RevPay", "Donations", "ChallengesPreview", "Onboarding", "TabAutoPrompt", "PointsPocketDiscovery", "SpendAnalytics", "RentAndBills", "AirportTransfers", "LuggageStorage", "Stations", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$AirportTransfers;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$CardSelection;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Cashback;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$ChallengesPreview;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$CreditWidget;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Deeplink;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Donations;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Esim;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$ExclusiveStore;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Experiences;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$GiftCard;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$HomeWidget;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Lounges;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$LoyaltySavings;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$LuggageStorage;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Miles;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Onboarding;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PlanHub;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PointsPocket;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PointsPocketDiscovery;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$RentAndBills;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$RevPay;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Shops;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$SpendAnalytics;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Stations;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Stays;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TabAutoPrompt;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TabHeader;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TransactionDetails;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Transport;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsOptInSource implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$AirportTransfers;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportTransfers extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AirportTransfers f83981a = new AirportTransfers();

        @NotNull
        public static final Parcelable.Creator<AirportTransfers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportTransfers.f83981a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportTransfers[i];
            }
        }

        private AirportTransfers() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$CardSelection;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardSelection extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardSelection f83982a = new CardSelection();

        @NotNull
        public static final Parcelable.Creator<CardSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardSelection.f83982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelection[i];
            }
        }

        private CardSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Cashback;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cashback extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cashback f83983a = new Cashback();

        @NotNull
        public static final Parcelable.Creator<Cashback> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cashback.f83983a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cashback[i];
            }
        }

        private Cashback() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$ChallengesPreview;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChallengesPreview extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChallengesPreview f83984a = new ChallengesPreview();

        @NotNull
        public static final Parcelable.Creator<ChallengesPreview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChallengesPreview.f83984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChallengesPreview[i];
            }
        }

        private ChallengesPreview() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$CreditWidget;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditWidget extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditWidget f83985a = new CreditWidget();

        @NotNull
        public static final Parcelable.Creator<CreditWidget> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditWidget.f83985a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditWidget[i];
            }
        }

        private CreditWidget() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Deeplink;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink extends RevPointsOptInSource {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83986a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String str) {
            this.f83986a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deeplink) && Intrinsics.f(this.f83986a, ((Deeplink) obj2).f83986a);
        }

        public final int hashCode() {
            String str = this.f83986a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83986a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Donations;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Donations extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Donations f83987a = new Donations();

        @NotNull
        public static final Parcelable.Creator<Donations> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Donations.f83987a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Donations[i];
            }
        }

        private Donations() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Esim;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Esim extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Esim f83988a = new Esim();

        @NotNull
        public static final Parcelable.Creator<Esim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Esim.f83988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Esim[i];
            }
        }

        private Esim() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$ExclusiveStore;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExclusiveStore extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExclusiveStore f83989a = new ExclusiveStore();

        @NotNull
        public static final Parcelable.Creator<ExclusiveStore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExclusiveStore.f83989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExclusiveStore[i];
            }
        }

        private ExclusiveStore() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Experiences;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Experiences extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Experiences f83990a = new Experiences();

        @NotNull
        public static final Parcelable.Creator<Experiences> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Experiences.f83990a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experiences[i];
            }
        }

        private Experiences() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$GiftCard;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiftCard extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiftCard f83991a = new GiftCard();

        @NotNull
        public static final Parcelable.Creator<GiftCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiftCard.f83991a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftCard[i];
            }
        }

        private GiftCard() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$HomeWidget;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HomeWidget extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeWidget f83992a = new HomeWidget();

        @NotNull
        public static final Parcelable.Creator<HomeWidget> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HomeWidget.f83992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeWidget[i];
            }
        }

        private HomeWidget() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Lounges;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Lounges extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Lounges f83993a = new Lounges();

        @NotNull
        public static final Parcelable.Creator<Lounges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Lounges.f83993a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Lounges[i];
            }
        }

        private Lounges() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$LoyaltySavings;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoyaltySavings extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoyaltySavings f83994a = new LoyaltySavings();

        @NotNull
        public static final Parcelable.Creator<LoyaltySavings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoyaltySavings.f83994a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoyaltySavings[i];
            }
        }

        private LoyaltySavings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$LuggageStorage;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LuggageStorage extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LuggageStorage f83995a = new LuggageStorage();

        @NotNull
        public static final Parcelable.Creator<LuggageStorage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LuggageStorage.f83995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LuggageStorage[i];
            }
        }

        private LuggageStorage() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Miles;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Miles extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Miles f83996a = new Miles();

        @NotNull
        public static final Parcelable.Creator<Miles> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Miles.f83996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Miles[i];
            }
        }

        private Miles() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Onboarding;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Onboarding extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Onboarding f83997a = new Onboarding();

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Onboarding.f83997a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        private Onboarding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PlanHub;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanHub extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanHub f83998a = new PlanHub();

        @NotNull
        public static final Parcelable.Creator<PlanHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanHub.f83998a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHub[i];
            }
        }

        private PlanHub() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PointsPocket;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PointsPocket extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PointsPocket f83999a = new PointsPocket();

        @NotNull
        public static final Parcelable.Creator<PointsPocket> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PointsPocket.f83999a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PointsPocket[i];
            }
        }

        private PointsPocket() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$PointsPocketDiscovery;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PointsPocketDiscovery extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PointsPocketDiscovery f84000a = new PointsPocketDiscovery();

        @NotNull
        public static final Parcelable.Creator<PointsPocketDiscovery> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PointsPocketDiscovery.f84000a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PointsPocketDiscovery[i];
            }
        }

        private PointsPocketDiscovery() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$RentAndBills;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RentAndBills extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RentAndBills f84001a = new RentAndBills();

        @NotNull
        public static final Parcelable.Creator<RentAndBills> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RentAndBills.f84001a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RentAndBills[i];
            }
        }

        private RentAndBills() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$RevPay;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPay extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPay f84002a = new RevPay();

        @NotNull
        public static final Parcelable.Creator<RevPay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPay.f84002a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPay[i];
            }
        }

        private RevPay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Shops;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Shops extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Shops f84003a = new Shops();

        @NotNull
        public static final Parcelable.Creator<Shops> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Shops.f84003a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Shops[i];
            }
        }

        private Shops() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$SpendAnalytics;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpendAnalytics extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpendAnalytics f84004a = new SpendAnalytics();

        @NotNull
        public static final Parcelable.Creator<SpendAnalytics> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpendAnalytics.f84004a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpendAnalytics[i];
            }
        }

        private SpendAnalytics() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Stations;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stations extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stations f84005a = new Stations();

        @NotNull
        public static final Parcelable.Creator<Stations> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stations.f84005a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stations[i];
            }
        }

        private Stations() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Stays;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stays extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stays f84006a = new Stays();

        @NotNull
        public static final Parcelable.Creator<Stays> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stays.f84006a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stays[i];
            }
        }

        private Stays() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TabAutoPrompt;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TabAutoPrompt extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TabAutoPrompt f84007a = new TabAutoPrompt();

        @NotNull
        public static final Parcelable.Creator<TabAutoPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TabAutoPrompt.f84007a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TabAutoPrompt[i];
            }
        }

        private TabAutoPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TabHeader;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TabHeader extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TabHeader f84008a = new TabHeader();

        @NotNull
        public static final Parcelable.Creator<TabHeader> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TabHeader.f84008a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TabHeader[i];
            }
        }

        private TabHeader() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$TransactionDetails;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionDetails extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionDetails f84009a = new TransactionDetails();

        @NotNull
        public static final Parcelable.Creator<TransactionDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionDetails.f84009a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetails[i];
            }
        }

        private TransactionDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsOptInSource$Transport;", "Lcom/revolut/feature/rev_points/models/RevPointsOptInSource;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transport extends RevPointsOptInSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transport f84010a = new Transport();

        @NotNull
        public static final Parcelable.Creator<Transport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transport.f84010a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transport[i];
            }
        }

        private Transport() {
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

    private RevPointsOptInSource() {
    }
}
