package com.revolut.feature.wealth.api.declaration;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Destinations", "CompositeAddMoney", "EditRecurringDeposit", "ManageRecurringFunding", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$EditRecurringDeposit;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$ManageRecurringFunding;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddMoneyFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$Destinations;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$Destination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$EditRecurringDeposit$Destination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$ManageRecurringFunding$Destination;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Destinations extends KompotDestination {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$EditRecurringDeposit;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditRecurringDeposit extends AddMoneyFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WealthAccountType f95183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PortfolioRecurringOrder f95184h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$EditRecurringDeposit$Destination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$Destinations;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements Destinations {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WealthAccountType f95185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PortfolioRecurringOrder f95186b;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((WealthAccountType) parcel.readParcelable(Destination.class.getClassLoader()), (PortfolioRecurringOrder) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(WealthAccountType product, PortfolioRecurringOrder recurringOrder) {
                Intrinsics.checkNotNullParameter(product, "product");
                Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
                this.f95185a = product;
                this.f95186b = recurringOrder;
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
                return this.f95185a == destination.f95185a && Intrinsics.f(this.f95186b, destination.f95186b);
            }

            public final int hashCode() {
                return this.f95186b.hashCode() + (this.f95185a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f95185a, i);
                dest.writeParcelable(this.f95186b, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditRecurringDeposit(WealthAccountType product, PortfolioRecurringOrder recurringOrder) {
            super(new Destination(product, recurringOrder));
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
            this.f95183g = product;
            this.f95184h = recurringOrder;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF82495h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditRecurringDeposit)) {
                return false;
            }
            EditRecurringDeposit editRecurringDeposit = (EditRecurringDeposit) obj2;
            return this.f95183g == editRecurringDeposit.f95183g && Intrinsics.f(this.f95184h, editRecurringDeposit.f95184h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f95184h.hashCode() + (this.f95183g.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$ManageRecurringFunding;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/wealth/api/declaration/a", "Destination", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageRecurringFunding extends AddMoneyFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f95187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f95188h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$ManageRecurringFunding$Destination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$Destinations;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements Destinations {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f95189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.revolut.feature.wealth.api.declaration.a f95190b;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), com.revolut.feature.wealth.api.declaration.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String portfolioId, com.revolut.feature.wealth.api.declaration.a portfolioType) {
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
                this.f95189a = portfolioId;
                this.f95190b = portfolioType;
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
                return Intrinsics.f(this.f95189a, destination.f95189a) && this.f95190b == destination.f95190b;
            }

            public final int hashCode() {
                return this.f95190b.hashCode() + (this.f95189a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95189a);
                dest.writeString(this.f95190b.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageRecurringFunding(String portfolioId, a portfolioType) {
            super(new Destination(portfolioId, portfolioType));
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
            this.f95187g = portfolioId;
            this.f95188h = portfolioType;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF82495h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManageRecurringFunding)) {
                return false;
            }
            ManageRecurringFunding manageRecurringFunding = (ManageRecurringFunding) obj2;
            return Intrinsics.f(this.f95187g, manageRecurringFunding.f95187g) && this.f95188h == manageRecurringFunding.f95188h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f95188h.hashCode() + (this.f95187g.hashCode() * 31);
        }
    }

    public AddMoneyFeatureConfig(Destinations destinations) {
        super((ActivityAnimation) null, (ParcelableDestination) destinations, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "InputData", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompositeAddMoney extends AddMoneyFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputData.WithTransferSubjectIdAndWealthAccountType f95172g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$Destination;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$Destinations;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements Destinations {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InputData f95173a;

            /* JADX INFO: loaded from: classes9.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((InputData) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(InputData inputData) {
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                this.f95173a = inputData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f95173a, ((Destination) obj2).f95173a);
            }

            public final int hashCode() {
                return this.f95173a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f95173a, i);
            }
        }

        public CompositeAddMoney(int i, long j2, TransferSubjectId transferSubjectId, WealthAccountType product, j0h.a aVar) {
            j0h.a mode = (i & 8) != 0 ? j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT : aVar;
            j2 = (i & 16) != 0 ? 0L : j2;
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(mode, "mode");
            InputData.WithTransferSubjectIdAndWealthAccountType inputData = new InputData.WithTransferSubjectIdAndWealthAccountType(1, j2, transferSubjectId, product, mode);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            super(new Destination(inputData));
            this.f95172g = inputData;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF82495h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CompositeAddMoney) && Intrinsics.f(this.f95172g, ((CompositeAddMoney) obj2).f95172g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f95172g.hashCode();
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData;", "Landroid/os/Parcelable;", "WithTransferSubjectIdAndWealthAccountType", "WithPocketId", "WithAccountIdAndHoldingId", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithAccountIdAndHoldingId;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithPocketId;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithTransferSubjectIdAndWealthAccountType;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InputData extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithAccountIdAndHoldingId;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithAccountIdAndHoldingId implements InputData {

                @NotNull
                public static final Parcelable.Creator<WithAccountIdAndHoldingId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KompotDestination f95174a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j0h.a f95175b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f95176c;
                public final String d;
                public final String e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithAccountIdAndHoldingId((KompotDestination) parcel.readParcelable(WithAccountIdAndHoldingId.class.getClassLoader()), j0h.a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithAccountIdAndHoldingId[i];
                    }
                }

                public WithAccountIdAndHoldingId(KompotDestination kompotDestination, j0h.a mode, long j2, String accountId, String str) {
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    this.f95174a = kompotDestination;
                    this.f95175b = mode;
                    this.f95176c = j2;
                    this.d = accountId;
                    this.e = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof WithAccountIdAndHoldingId)) {
                        return false;
                    }
                    WithAccountIdAndHoldingId withAccountIdAndHoldingId = (WithAccountIdAndHoldingId) obj2;
                    return Intrinsics.f(this.f95174a, withAccountIdAndHoldingId.f95174a) && this.f95175b == withAccountIdAndHoldingId.f95175b && this.f95176c == withAccountIdAndHoldingId.f95176c && Intrinsics.f(this.d, withAccountIdAndHoldingId.d) && Intrinsics.f(this.e, withAccountIdAndHoldingId.e);
                }

                public final int hashCode() {
                    KompotDestination kompotDestination = this.f95174a;
                    int iC = p.a.c(d.c((this.f95175b.hashCode() + ((kompotDestination == null ? 0 : kompotDestination.hashCode()) * 31)) * 31, 31, this.f95176c), 31, this.d);
                    String str = this.e;
                    return iC + (str != null ? str.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f95174a, i);
                    dest.writeString(this.f95175b.name());
                    dest.writeLong(this.f95176c);
                    dest.writeString(this.d);
                    dest.writeString(this.e);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithPocketId;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithPocketId implements InputData {

                @NotNull
                public static final Parcelable.Creator<WithPocketId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KompotDestination f95177a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j0h.a f95178b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f95179c;
                public final String d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithPocketId((KompotDestination) parcel.readParcelable(WithPocketId.class.getClassLoader()), j0h.a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithPocketId[i];
                    }
                }

                public WithPocketId(KompotDestination kompotDestination, j0h.a mode, long j2, String pocketId) {
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                    this.f95177a = kompotDestination;
                    this.f95178b = mode;
                    this.f95179c = j2;
                    this.d = pocketId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof WithPocketId)) {
                        return false;
                    }
                    WithPocketId withPocketId = (WithPocketId) obj2;
                    return Intrinsics.f(this.f95177a, withPocketId.f95177a) && this.f95178b == withPocketId.f95178b && this.f95179c == withPocketId.f95179c && Intrinsics.f(this.d, withPocketId.d);
                }

                public final int hashCode() {
                    KompotDestination kompotDestination = this.f95177a;
                    return this.d.hashCode() + d.c((this.f95178b.hashCode() + ((kompotDestination == null ? 0 : kompotDestination.hashCode()) * 31)) * 31, 31, this.f95179c);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f95177a, i);
                    dest.writeString(this.f95178b.name());
                    dest.writeLong(this.f95179c);
                    dest.writeString(this.d);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithTransferSubjectIdAndWealthAccountType;", "Lcom/revolut/feature/wealth/api/declaration/AddMoneyFeatureConfig$CompositeAddMoney$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithTransferSubjectIdAndWealthAccountType implements InputData {

                @NotNull
                public static final Parcelable.Creator<WithTransferSubjectIdAndWealthAccountType> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KompotDestination f95180a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j0h.a f95181b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f95182c;
                public final TransferSubjectId d;
                public final WealthAccountType e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithTransferSubjectIdAndWealthAccountType((KompotDestination) parcel.readParcelable(WithTransferSubjectIdAndWealthAccountType.class.getClassLoader()), j0h.a.valueOf(parcel.readString()), parcel.readLong(), (TransferSubjectId) parcel.readParcelable(WithTransferSubjectIdAndWealthAccountType.class.getClassLoader()), (WealthAccountType) parcel.readParcelable(WithTransferSubjectIdAndWealthAccountType.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithTransferSubjectIdAndWealthAccountType[i];
                    }
                }

                public WithTransferSubjectIdAndWealthAccountType(KompotDestination kompotDestination, j0h.a mode, long j2, TransferSubjectId transferSubjectId, WealthAccountType product) {
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
                    Intrinsics.checkNotNullParameter(product, "product");
                    this.f95180a = kompotDestination;
                    this.f95181b = mode;
                    this.f95182c = j2;
                    this.d = transferSubjectId;
                    this.e = product;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof WithTransferSubjectIdAndWealthAccountType)) {
                        return false;
                    }
                    WithTransferSubjectIdAndWealthAccountType withTransferSubjectIdAndWealthAccountType = (WithTransferSubjectIdAndWealthAccountType) obj2;
                    return Intrinsics.f(this.f95180a, withTransferSubjectIdAndWealthAccountType.f95180a) && this.f95181b == withTransferSubjectIdAndWealthAccountType.f95181b && this.f95182c == withTransferSubjectIdAndWealthAccountType.f95182c && Intrinsics.f(this.d, withTransferSubjectIdAndWealthAccountType.d) && this.e == withTransferSubjectIdAndWealthAccountType.e;
                }

                public final int hashCode() {
                    KompotDestination kompotDestination = this.f95180a;
                    return this.e.hashCode() + ((this.d.hashCode() + d.c((this.f95181b.hashCode() + ((kompotDestination == null ? 0 : kompotDestination.hashCode()) * 31)) * 31, 31, this.f95182c)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f95180a, i);
                    dest.writeString(this.f95181b.name());
                    dest.writeLong(this.f95182c);
                    dest.writeParcelable(this.d, i);
                    dest.writeParcelable(this.e, i);
                }

                public /* synthetic */ WithTransferSubjectIdAndWealthAccountType(int i, long j2, TransferSubjectId transferSubjectId, WealthAccountType wealthAccountType, j0h.a aVar) {
                    this((KompotDestination) null, (i & 2) != 0 ? j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT : aVar, (i & 4) != 0 ? 0L : j2, transferSubjectId, wealthAccountType);
                }
            }
        }
    }
}
