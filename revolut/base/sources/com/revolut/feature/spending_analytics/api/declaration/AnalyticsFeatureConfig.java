package com.revolut.feature.spending_analytics.api.declaration;

import amd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import xi0.b;
import yld.d;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "SpendingScreen", "Budget", "TotalWealthScreen", "TotalWealthAddOtherAsset", "IncomeSorterCreation", "IncomeSorterExecutionScreen", "IncomeSorterDetails", "IncomeSortersList", "CategoryManagement", "Dashboard", "Trips", "SavingsAnalyticsDetails", "TotalWealthCustomAssetDetails", "TravelMode", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Budget;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Dashboard;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterCreation;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterExecutionScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SavingsAnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SpendingScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthAddOtherAsset;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthCustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TravelMode;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Trips;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AnalyticsFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActivityAnimation f87400g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Budget;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Budget extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Budget$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId f87401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f87402b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((AccountId) parcel.readParcelable(Destination.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(AccountId accountId, boolean z) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f87401a = accountId;
                this.f87402b = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF87402b() {
                return this.f87402b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f87401a, destination.f87401a) && this.f87402b == destination.f87402b;
            }

            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId getF87401a() {
                return this.f87401a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87402b) + (this.f87401a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87401a, i);
                dest.writeInt(this.f87402b ? 1 : 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Budget(AccountId accountId, boolean z) {
            super(new Destination(accountId, z), null);
            Intrinsics.checkNotNullParameter(accountId, "accountId");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "Mode", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CategoryManagement extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Mode f87404b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(((WalletId) parcel.readParcelable(Destination.class.getClassLoader())).f66106a, (Mode) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String walletId, Mode mode) {
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.f87403a = walletId;
                this.f87404b = mode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Mode getF87404b() {
                return this.f87404b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF87403a() {
                return this.f87403a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f87403a, destination.f87403a) && Intrinsics.f(this.f87404b, destination.f87404b);
            }

            public final int hashCode() {
                return this.f87404b.hashCode() + (this.f87403a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(new WalletId(this.f87403a), i);
                dest.writeParcelable(this.f87404b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode;", "Landroid/os/Parcelable;", "Select", "Manage", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode$Manage;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode$Select;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Mode extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode$Manage;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Manage implements Mode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Manage f87405a = new Manage();

                @NotNull
                public static final Parcelable.Creator<Manage> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Manage.f87405a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Manage[i];
                    }
                }

                private Manage() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode$Select;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$CategoryManagement$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Select implements Mode {

                @NotNull
                public static final Parcelable.Creator<Select> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a3 f87406a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Select((a3) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Select[i];
                    }
                }

                public Select(a3 transaction) {
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    this.f87406a = transaction;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Select) && Intrinsics.f(this.f87406a, ((Select) obj2).f87406a);
                }

                /* JADX INFO: renamed from: getTransaction, reason: from getter */
                public final a3 getF87406a() {
                    return this.f87406a;
                }

                public final int hashCode() {
                    return this.f87406a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f87406a);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Dashboard;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dashboard extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Dashboard$Destination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProductAccountDescriptor$Value f87410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransitionAnimation f87411c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((ProductAccountDescriptor$Value) parcel.readParcelable(Destination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination() {
                this((ZoomTransitionAnimation.Widgets) null, 3);
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF87443c() {
                return this.f87411c;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ProductAccountDescriptor$Value getF87410b() {
                return this.f87410b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f87410b, destination.f87410b) && Intrinsics.f(this.f87411c, destination.f87411c);
            }

            public final int hashCode() {
                ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f87410b;
                int iHashCode = (productAccountDescriptor$Value == null ? 0 : productAccountDescriptor$Value.hashCode()) * 31;
                TransitionAnimation transitionAnimation = this.f87411c;
                return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87410b, i);
                dest.writeParcelable(this.f87411c, i);
            }

            public /* synthetic */ Destination(ZoomTransitionAnimation.Widgets widgets, int i) {
                this((ProductAccountDescriptor$Value) null, (i & 2) != 0 ? null : widgets);
            }

            public Destination(ProductAccountDescriptor$Value productAccountDescriptor$Value, TransitionAnimation transitionAnimation) {
                super(IOData$EmptyInput.f98299a);
                this.f87410b = productAccountDescriptor$Value;
                this.f87411c = transitionAnimation;
            }
        }

        public Dashboard() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Dashboard);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public Dashboard(int i) {
            super(new Destination((ZoomTransitionAnimation.Widgets) null, 2), new ActivityAnimation.System(Integer.valueOf(R$anim.slide_in_end), Integer.valueOf(R$anim.no_animation)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterCreation;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSorterCreation extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterCreation$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87414a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String str) {
                this.f87414a = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF87414a() {
                return this.f87414a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f87414a, ((Destination) obj2).f87414a);
            }

            public final int hashCode() {
                String str = this.f87414a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87414a);
            }
        }

        public IncomeSorterCreation(String str) {
            super(new Destination(str), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSorterDetails extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterDetails$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87415a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String incomeSorterId) {
                Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
                this.f87415a = incomeSorterId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF87415a() {
                return this.f87415a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f87415a, ((Destination) obj2).f87415a);
            }

            public final int hashCode() {
                return this.f87415a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncomeSorterDetails(String incomeSorterId) {
            super(new Destination(incomeSorterId), null);
            Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterExecutionScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSorterExecutionScreen extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSorterExecutionScreen$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87416a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String executionId) {
                Intrinsics.checkNotNullParameter(executionId, "executionId");
                this.f87416a = executionId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF87416a() {
                return this.f87416a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f87416a, ((Destination) obj2).f87416a);
            }

            public final int hashCode() {
                return this.f87416a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87416a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncomeSorterExecutionScreen(String executionId) {
            super(new Destination(executionId), null);
            Intrinsics.checkNotNullParameter(executionId, "executionId");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "<init>", "()V", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSortersList extends AnalyticsFeatureConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final IncomeSortersList f87417h = new IncomeSortersList();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$IncomeSortersList$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Destination implements KompotDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Destination f87418a = new Destination();

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Destination.f87418a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            private Destination() {
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

        private IncomeSortersList() {
            super(Destination.f87418a, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SavingsAnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAnalyticsDetails extends AnalyticsFeatureConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f87420h;
        public final AnalyticsAccount.Savings i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SavingsAnalyticsDetails$Destination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements StackDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f87421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnalyticsAccount.Savings f87422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransitionAnimation f87423c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(d.valueOf(parcel.readString()), (AnalyticsAccount.Savings) parcel.readParcelable(Destination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(d analyticsScreenType, AnalyticsAccount.Savings analyticsAccount, TransitionAnimation transitionAnimation) {
                Intrinsics.checkNotNullParameter(analyticsScreenType, "analyticsScreenType");
                Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
                this.f87421a = analyticsScreenType;
                this.f87422b = analyticsAccount;
                this.f87423c = transitionAnimation;
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF87443c() {
                return this.f87423c;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AnalyticsAccount.Savings getF87422b() {
                return this.f87422b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d getF87421a() {
                return this.f87421a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return this.f87421a == destination.f87421a && Intrinsics.f(this.f87422b, destination.f87422b) && Intrinsics.f(this.f87423c, destination.f87423c);
            }

            public final int hashCode() {
                int iHashCode = (this.f87422b.hashCode() + (this.f87421a.hashCode() * 31)) * 31;
                TransitionAnimation transitionAnimation = this.f87423c;
                return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87421a.name());
                dest.writeParcelable(this.f87422b, i);
                dest.writeParcelable(this.f87423c, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsAnalyticsDetails(d analyticsScreenType, AnalyticsAccount.Savings analyticsAccount) {
            super(new Destination(analyticsScreenType, analyticsAccount, null), null);
            Intrinsics.checkNotNullParameter(analyticsScreenType, "analyticsScreenType");
            Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
            this.f87420h = analyticsScreenType;
            this.i = analyticsAccount;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsAnalyticsDetails)) {
                return false;
            }
            SavingsAnalyticsDetails savingsAnalyticsDetails = (SavingsAnalyticsDetails) obj2;
            return this.f87420h == savingsAnalyticsDetails.f87420h && Intrinsics.f(this.i, savingsAnalyticsDetails.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.i.hashCode() + (this.f87420h.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SpendingScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpendingScreen extends AnalyticsFeatureConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f87426h;
        public final PeriodPreferenceType i;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SpendingScreen$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PeriodPreferenceType f87428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AnalyticsAccount f87429c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), (PeriodPreferenceType) parcel.readParcelable(Destination.class.getClassLoader()), (AnalyticsAccount) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String str, PeriodPreferenceType periodPreferenceType, AnalyticsAccount analyticsAccount) {
                this.f87427a = str;
                this.f87428b = periodPreferenceType;
                this.f87429c = analyticsAccount;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AnalyticsAccount getF87429c() {
                return this.f87429c;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF87427a() {
                return this.f87427a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final PeriodPreferenceType getF87428b() {
                return this.f87428b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87427a);
                dest.writeParcelable(this.f87428b, i);
                dest.writeParcelable(this.f87429c, i);
            }
        }

        public SpendingScreen(String str, PeriodPreferenceType periodPreferenceType) {
            super(new Destination(str, periodPreferenceType, null), new ActivityAnimation.System(Integer.valueOf(R$anim.slide_in_end), Integer.valueOf(R$anim.no_animation)));
            this.f87426h = str;
            this.i = periodPreferenceType;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpendingScreen)) {
                return false;
            }
            SpendingScreen spendingScreen = (SpendingScreen) obj2;
            return Intrinsics.f(this.f87426h, spendingScreen.f87426h) && this.i == spendingScreen.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f87426h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PeriodPreferenceType periodPreferenceType = this.i;
            return (iHashCode + (periodPreferenceType != null ? periodPreferenceType.hashCode() : 0)) * 31;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthAddOtherAsset;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalWealthAddOtherAsset extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthAddOtherAsset$Destination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f87430b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransitionAnimation f87431c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((b) parcel.readSerializable(), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Destination(b currency, TransitionAnimation transitionAnimation) {
                super(IOData$EmptyInput.f98299a);
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f87430b = currency;
                this.f87431c = transitionAnimation;
            }

            /* JADX INFO: renamed from: T8, reason: from getter */
            public final b getF87430b() {
                return this.f87430b;
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF87443c() {
                return this.f87431c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f87430b, destination.f87430b) && Intrinsics.f(this.f87431c, destination.f87431c);
            }

            public final int hashCode() {
                int iHashCode = this.f87430b.hashCode() * 31;
                TransitionAnimation transitionAnimation = this.f87431c;
                return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f87430b);
                dest.writeParcelable(this.f87431c, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthCustomAssetDetails;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalWealthCustomAssetDetails extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthCustomAssetDetails$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87432a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String customAssetId) {
                Intrinsics.checkNotNullParameter(customAssetId, "customAssetId");
                this.f87432a = customAssetId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF87432a() {
                return this.f87432a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f87432a, ((Destination) obj2).f87432a);
            }

            public final int hashCode() {
                return this.f87432a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87432a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthScreen;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalWealthScreen extends AnalyticsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TotalWealthScreen$Destination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f87433b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final NetWorthAccount f87434c;
            public final amd.b d;
            public final amd.a e;
            public final TransitionAnimation f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(g.valueOf(parcel.readString()), (NetWorthAccount) parcel.readParcelable(Destination.class.getClassLoader()), parcel.readInt() == 0 ? null : amd.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? amd.a.valueOf(parcel.readString()) : null, (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public /* synthetic */ Destination(g gVar, NetWorthAccount netWorthAccount, amd.b bVar, amd.a aVar, ZoomTransitionAnimation.Widgets widgets, int i) {
                this(gVar, netWorthAccount, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : widgets);
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF87443c() {
                return this.f;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final amd.a getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final NetWorthAccount getF87434c() {
                return this.f87434c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final g getF87433b() {
                return this.f87433b;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return this.f87433b == destination.f87433b && Intrinsics.f(this.f87434c, destination.f87434c) && this.d == destination.d && this.e == destination.e && Intrinsics.f(this.f, destination.f);
            }

            public final int hashCode() {
                int iHashCode = (this.f87434c.hashCode() + (this.f87433b.hashCode() * 31)) * 31;
                amd.b bVar = this.d;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                amd.a aVar = this.e;
                int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                TransitionAnimation transitionAnimation = this.f;
                return iHashCode3 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final amd.b getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87433b.name());
                dest.writeParcelable(this.f87434c, i);
                amd.b bVar = this.d;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
                amd.a aVar = this.e;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar.name());
                }
                dest.writeParcelable(this.f, i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Destination(g netWorthType, NetWorthAccount netWorthAccount, amd.b bVar, amd.a aVar, TransitionAnimation transitionAnimation) {
                super(IOData$EmptyInput.f98299a);
                Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
                Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
                this.f87433b = netWorthType;
                this.f87434c = netWorthAccount;
                this.d = bVar;
                this.e = aVar;
                this.f = transitionAnimation;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TotalWealthScreen(g netWorthType, amd.b bVar, a aVar) {
            Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
            NetWorthAccount.Personal netWorthAccount = NetWorthAccount.Personal.f87455a;
            Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
            super(new Destination(netWorthType, netWorthAccount, bVar, aVar, null, 16), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TravelMode;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "<init>", "()V", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TravelMode extends AnalyticsFeatureConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final TravelMode f87437h = new TravelMode();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$TravelMode$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Destination implements KompotDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Destination f87438a = new Destination();

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Destination.f87438a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            private Destination() {
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

        private TravelMode() {
            super(Destination.f87438a, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Trips;", "Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Trips extends AnalyticsFeatureConfig {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f87441h;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Trips$Destination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87442b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransitionAnimation f87443c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String str, TransitionAnimation transitionAnimation) {
                super(IOData$EmptyInput.f98299a);
                this.f87442b = str;
                this.f87443c = transitionAnimation;
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getF87443c() {
                return this.f87443c;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF87442b() {
                return this.f87442b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f87442b, destination.f87442b) && Intrinsics.f(this.f87443c, destination.f87443c);
            }

            public final int hashCode() {
                String str = this.f87442b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                TransitionAnimation transitionAnimation = this.f87443c;
                return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87442b);
                dest.writeParcelable(this.f87443c, i);
            }
        }

        public Trips(String str) {
            super(new Destination(str, null), new ActivityAnimation.System(Integer.valueOf(R$anim.slide_in_end), Integer.valueOf(R$anim.no_animation)));
            this.f87441h = str;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Trips) && Intrinsics.f(this.f87441h, ((Trips) obj2).f87441h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f87441h;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    public AnalyticsFeatureConfig(StackDestination stackDestination, ActivityAnimation.System system) {
        super((ActivityAnimation) system, (ParcelableDestination) stackDestination, false, (Integer) null, 0, 60);
        this.f87400g = system;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ActivityAnimation getF87400g() {
        return this.f87400g;
    }
}
