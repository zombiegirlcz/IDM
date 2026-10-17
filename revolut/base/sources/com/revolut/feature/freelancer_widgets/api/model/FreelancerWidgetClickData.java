package com.revolut.feature.freelancer_widgets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import ds6.j;
import ehe.n;
import es6.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "Landroid/os/Parcelable;", "Cashback", "Pockets", "Sales", "SalesAnalytics", "Toolbox", "VatReminder", "TaxHub", "ProPerks", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$SalesAnalytics;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerWidgetClickData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "Tile", "Upgrade", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback$Tile;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback$Upgrade;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Cashback extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback$Tile;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Tile implements Cashback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Tile f74448a = new Tile();

            @NotNull
            public static final Parcelable.Creator<Tile> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Tile.f74448a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Tile[i];
                }
            }

            private Tile() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback$Upgrade;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Cashback;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Upgrade implements Cashback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Upgrade f74449a = new Upgrade();

            @NotNull
            public static final Parcelable.Creator<Upgrade> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Upgrade.f74449a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Upgrade[i];
                }
            }

            private Upgrade() {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "NewPocket", "RegularPocket", "TaxPocket", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$NewPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$RegularPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$TaxPocket;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Pockets extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$NewPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NewPocket implements Pockets {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NewPocket f74450a = new NewPocket();

            @NotNull
            public static final Parcelable.Creator<NewPocket> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NewPocket.f74450a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NewPocket[i];
                }
            }

            private NewPocket() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$RegularPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RegularPocket implements Pockets {

            @NotNull
            public static final Parcelable.Creator<RegularPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74451a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RegularPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RegularPocket[i];
                }
            }

            public RegularPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f74451a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RegularPocket) && Intrinsics.f(this.f74451a, ((RegularPocket) obj2).f74451a);
            }

            public final int hashCode() {
                return this.f74451a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74451a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets$TaxPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Pockets;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxPocket implements Pockets {

            @NotNull
            public static final Parcelable.Creator<TaxPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74452a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TaxPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxPocket[i];
                }
            }

            public TaxPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f74452a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TaxPocket) && Intrinsics.f(this.f74452a, ((TaxPocket) obj2).f74452a);
            }

            public final int hashCode() {
                return this.f74452a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74452a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "Perk", "AllPerks", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks$AllPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks$Perk;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ProPerks extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks$AllPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AllPerks implements ProPerks {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AllPerks f74453a = new AllPerks();

            @NotNull
            public static final Parcelable.Creator<AllPerks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllPerks.f74453a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllPerks[i];
                }
            }

            private AllPerks() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks$Perk;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$ProPerks;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Perk implements ProPerks {

            @NotNull
            public static final Parcelable.Creator<Perk> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74454a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Perk(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Perk[i];
                }
            }

            public Perk(String perkId) {
                Intrinsics.checkNotNullParameter(perkId, "perkId");
                this.f74454a = perkId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Perk) && Intrinsics.f(this.f74454a, ((Perk) obj2).f74454a);
            }

            public final int hashCode() {
                return this.f74454a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74454a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "Ecommerce", "InPerson", "Invoices", "PaymentLinks", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$Ecommerce;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$InPerson;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$Invoices;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$PaymentLinks;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Sales extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$Ecommerce;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Ecommerce implements Sales {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Ecommerce f74455a = new Ecommerce();

            @NotNull
            public static final Parcelable.Creator<Ecommerce> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Ecommerce.f74455a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Ecommerce[i];
                }
            }

            private Ecommerce() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$InPerson;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InPerson implements Sales {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InPerson f74456a = new InPerson();

            @NotNull
            public static final Parcelable.Creator<InPerson> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InPerson.f74456a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InPerson[i];
                }
            }

            private InPerson() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$Invoices;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Invoices implements Sales {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Invoices f74457a = new Invoices();

            @NotNull
            public static final Parcelable.Creator<Invoices> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Invoices.f74457a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Invoices[i];
                }
            }

            private Invoices() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales$PaymentLinks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Sales;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PaymentLinks implements Sales {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PaymentLinks f74458a = new PaymentLinks();

            @NotNull
            public static final Parcelable.Creator<PaymentLinks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PaymentLinks.f74458a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentLinks[i];
                }
            }

            private PaymentLinks() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$SalesAnalytics;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "SalesThisMonth", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$SalesAnalytics$SalesThisMonth;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SalesAnalytics extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$SalesAnalytics$SalesThisMonth;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$SalesAnalytics;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SalesThisMonth implements SalesAnalytics {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SalesThisMonth f74459a = new SalesThisMonth();

            @NotNull
            public static final Parcelable.Creator<SalesThisMonth> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SalesThisMonth.f74459a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SalesThisMonth[i];
                }
            }

            private SalesThisMonth() {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "CalendarEvent", "TaxHub", "TaxProfile", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$CalendarEvent;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$TaxProfile;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TaxHub extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$CalendarEvent;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CalendarEvent implements TaxHub {

            @NotNull
            public static final Parcelable.Creator<CalendarEvent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TaxHubCalendarEvent f74460a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CalendarEvent((TaxHubCalendarEvent) parcel.readParcelable(CalendarEvent.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CalendarEvent[i];
                }
            }

            public CalendarEvent(TaxHubCalendarEvent calendarEvent) {
                Intrinsics.checkNotNullParameter(calendarEvent, "calendarEvent");
                this.f74460a = calendarEvent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CalendarEvent) && Intrinsics.f(this.f74460a, ((CalendarEvent) obj2).f74460a);
            }

            public final int hashCode() {
                return this.f74460a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f74460a, i);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$TaxHub$TaxHub, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0496TaxHub implements TaxHub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0496TaxHub f74461a = new C0496TaxHub();

            @NotNull
            public static final Parcelable.Creator<C0496TaxHub> CREATOR = new a();

            /* JADX INFO: renamed from: com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$TaxHub$TaxHub$a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0496TaxHub.f74461a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new C0496TaxHub[i];
                }
            }

            private C0496TaxHub() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub$TaxProfile;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$TaxHub;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxProfile implements TaxHub {

            @NotNull
            public static final Parcelable.Creator<TaxProfile> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f74462a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(j.valueOf(parcel.readString()));
                    }
                    return new TaxProfile(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxProfile[i];
                }
            }

            public TaxProfile(Set allowedTaxTypes) {
                Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
                this.f74462a = allowedTaxTypes;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TaxProfile) && Intrinsics.f(this.f74462a, ((TaxProfile) obj2).f74462a);
            }

            public final int hashCode() {
                return this.f74462a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f74462a, dest);
                while (itV.hasNext()) {
                    dest.writeString(((j) itV.next()).name());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "TaxPocket", "Analytics", "Branding", "CardReaderManage", "CreateTaxPocket", "Ecommerce", "Hardware", "InviteFriends", "InvoiceSettings", "Learn", "ProPerks", "Products", "Pocket", "Settings", "TaxHub", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Analytics;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Branding;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$CardReaderManage;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$CreateTaxPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Ecommerce;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Hardware;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$InviteFriends;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$InvoiceSettings;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Learn;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Pocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$ProPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Products;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Settings;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$TaxPocket;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Toolbox extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Analytics;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Analytics implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Analytics f74463a = new Analytics();

            @NotNull
            public static final Parcelable.Creator<Analytics> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Analytics.f74463a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Analytics[i];
                }
            }

            private Analytics() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Branding;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Branding implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Branding f74464a = new Branding();

            @NotNull
            public static final Parcelable.Creator<Branding> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Branding.f74464a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Branding[i];
                }
            }

            private Branding() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$CardReaderManage;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CardReaderManage implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CardReaderManage f74465a = new CardReaderManage();

            @NotNull
            public static final Parcelable.Creator<CardReaderManage> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CardReaderManage.f74465a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardReaderManage[i];
                }
            }

            private CardReaderManage() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$CreateTaxPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CreateTaxPocket implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CreateTaxPocket f74466a = new CreateTaxPocket();

            @NotNull
            public static final Parcelable.Creator<CreateTaxPocket> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CreateTaxPocket.f74466a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreateTaxPocket[i];
                }
            }

            private CreateTaxPocket() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Ecommerce;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Ecommerce implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Ecommerce f74467a = new Ecommerce();

            @NotNull
            public static final Parcelable.Creator<Ecommerce> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Ecommerce.f74467a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Ecommerce[i];
                }
            }

            private Ecommerce() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Hardware;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Hardware implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Hardware f74468a = new Hardware();

            @NotNull
            public static final Parcelable.Creator<Hardware> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Hardware.f74468a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Hardware[i];
                }
            }

            private Hardware() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$InviteFriends;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InviteFriends implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InviteFriends f74469a = new InviteFriends();

            @NotNull
            public static final Parcelable.Creator<InviteFriends> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InviteFriends.f74469a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InviteFriends[i];
                }
            }

            private InviteFriends() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$InvoiceSettings;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InvoiceSettings implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvoiceSettings f74470a = new InvoiceSettings();

            @NotNull
            public static final Parcelable.Creator<InvoiceSettings> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InvoiceSettings.f74470a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InvoiceSettings[i];
                }
            }

            private InvoiceSettings() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Learn;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Learn implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Learn f74471a = new Learn();

            @NotNull
            public static final Parcelable.Creator<Learn> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Learn.f74471a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Learn[i];
                }
            }

            private Learn() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Pocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Pocket implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Pocket f74472a = new Pocket();

            @NotNull
            public static final Parcelable.Creator<Pocket> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Pocket.f74472a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pocket[i];
                }
            }

            private Pocket() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$ProPerks;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ProPerks implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ProPerks f74473a = new ProPerks();

            @NotNull
            public static final Parcelable.Creator<ProPerks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ProPerks.f74473a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProPerks[i];
                }
            }

            private ProPerks() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Products;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Products implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Products f74474a = new Products();

            @NotNull
            public static final Parcelable.Creator<Products> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Products.f74474a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Products[i];
                }
            }

            private Products() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$Settings;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Settings implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Settings f74475a = new Settings();

            @NotNull
            public static final Parcelable.Creator<Settings> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Settings.f74475a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Settings[i];
                }
            }

            private Settings() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TaxHub implements Toolbox {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TaxHub f74476a = new TaxHub();

            @NotNull
            public static final Parcelable.Creator<TaxHub> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TaxHub.f74476a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxHub[i];
                }
            }

            private TaxHub() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox$TaxPocket;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$Toolbox;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxPocket implements Toolbox {

            @NotNull
            public static final Parcelable.Creator<TaxPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74477a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TaxPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxPocket[i];
                }
            }

            public TaxPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f74477a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TaxPocket) && Intrinsics.f(this.f74477a, ((TaxPocket) obj2).f74477a);
            }

            public final int hashCode() {
                return this.f74477a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74477a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData;", "SetUpTaxSorter", "TaxHub", "NotificationToggle", "CreateVatProfile", "VatSummary", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$CreateVatProfile;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$NotificationToggle;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$SetUpTaxSorter;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$VatSummary;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface VatReminder extends FreelancerWidgetClickData {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$CreateVatProfile;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CreateVatProfile implements VatReminder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CreateVatProfile f74478a = new CreateVatProfile();

            @NotNull
            public static final Parcelable.Creator<CreateVatProfile> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CreateVatProfile.f74478a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreateVatProfile[i];
                }
            }

            private CreateVatProfile() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$NotificationToggle;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotificationToggle implements VatReminder {

            @NotNull
            public static final Parcelable.Creator<NotificationToggle> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74479a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NotificationToggle(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotificationToggle[i];
                }
            }

            public NotificationToggle(String taxProfileId) {
                Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
                this.f74479a = taxProfileId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NotificationToggle) && Intrinsics.f(this.f74479a, ((NotificationToggle) obj2).f74479a);
            }

            public final int hashCode() {
                return this.f74479a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74479a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$SetUpTaxSorter;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SetUpTaxSorter implements VatReminder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SetUpTaxSorter f74480a = new SetUpTaxSorter();

            @NotNull
            public static final Parcelable.Creator<SetUpTaxSorter> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SetUpTaxSorter.f74480a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SetUpTaxSorter[i];
                }
            }

            private SetUpTaxSorter() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$TaxHub;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "<init>", "()V", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TaxHub implements VatReminder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TaxHub f74481a = new TaxHub();

            @NotNull
            public static final Parcelable.Creator<TaxHub> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TaxHub.f74481a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxHub[i];
                }
            }

            private TaxHub() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder$VatSummary;", "Lcom/revolut/feature/freelancer_widgets/api/model/FreelancerWidgetClickData$VatReminder;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VatSummary implements VatReminder {

            @NotNull
            public static final Parcelable.Creator<VatSummary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f74482a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TaxHubVatSummary f74483b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VatSummary(b.valueOf(parcel.readString()), (TaxHubVatSummary) parcel.readParcelable(VatSummary.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new VatSummary[i];
                }
            }

            public VatSummary(b taxAllocationMode, TaxHubVatSummary vatSummary) {
                Intrinsics.checkNotNullParameter(taxAllocationMode, "taxAllocationMode");
                Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
                this.f74482a = taxAllocationMode;
                this.f74483b = vatSummary;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof VatSummary)) {
                    return false;
                }
                VatSummary vatSummary = (VatSummary) obj2;
                return this.f74482a == vatSummary.f74482a && Intrinsics.f(this.f74483b, vatSummary.f74483b);
            }

            public final int hashCode() {
                return this.f74483b.hashCode() + (this.f74482a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74482a.name());
                dest.writeParcelable(this.f74483b, i);
            }
        }
    }
}
