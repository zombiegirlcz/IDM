package com.revolut.feature.tab.invest.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState", "Landroid/os/Parcelable;", "<init>", "()V", "Loading", "PreOnboarding", "Pending", "Onboarded", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Loading;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Pending;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$PreOnboarding;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabInvestControllerContract$HeaderState implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Loading;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState;", "<init>", "()V", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends TabInvestControllerContract$HeaderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f89835a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f89835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState;", "", "toString", "()Ljava/lang/String;", "LineChart", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarded extends TabInvestControllerContract$HeaderState {

        @NotNull
        public static final Parcelable.Creator<Onboarded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingLegalEntityInformation f89836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthAccountsBalance f89837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LineChart f89838c;
        public final ChosenBackground d;
        public final boolean e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f89839g;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart;", "Landroid/os/Parcelable;", "Empty", "Content", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart$Content;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart$Empty;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface LineChart extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart$Content;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Content implements LineChart {

                @NotNull
                public static final Parcelable.Creator<Content> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SimpleTotalValueChart f89840a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Content((SimpleTotalValueChart) parcel.readParcelable(Content.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Content[i];
                    }
                }

                public Content(SimpleTotalValueChart chart) {
                    Intrinsics.checkNotNullParameter(chart, "chart");
                    this.f89840a = chart;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Content) && Intrinsics.f(this.f89840a, ((Content) obj2).f89840a);
                }

                public final int hashCode() {
                    return this.f89840a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f89840a, i);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart$Empty;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Onboarded$LineChart;", "<init>", "()V", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Empty implements LineChart {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Empty f89841a = new Empty();

                @NotNull
                public static final Parcelable.Creator<Empty> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Empty.f89841a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Empty[i];
                    }
                }

                private Empty() {
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

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarded((TradingLegalEntityInformation) parcel.readParcelable(Onboarded.class.getClassLoader()), (WealthAccountsBalance) parcel.readParcelable(Onboarded.class.getClassLoader()), (LineChart) parcel.readParcelable(Onboarded.class.getClassLoader()), (ChosenBackground) parcel.readParcelable(Onboarded.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(Onboarded.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarded[i];
            }
        }

        public Onboarded(TradingLegalEntityInformation tradingLegalEntity, WealthAccountsBalance wealthAccountsBalance, LineChart lineChart, ChosenBackground background, boolean z, Clause clause, boolean z3) {
            Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
            Intrinsics.checkNotNullParameter(wealthAccountsBalance, "wealthAccountsBalance");
            Intrinsics.checkNotNullParameter(lineChart, "lineChart");
            Intrinsics.checkNotNullParameter(background, "background");
            this.f89836a = tradingLegalEntity;
            this.f89837b = wealthAccountsBalance;
            this.f89838c = lineChart;
            this.d = background;
            this.e = z;
            this.f = clause;
            this.f89839g = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onboarded)) {
                return false;
            }
            Onboarded onboarded = (Onboarded) obj2;
            return Intrinsics.f(this.f89836a, onboarded.f89836a) && Intrinsics.f(this.f89837b, onboarded.f89837b) && Intrinsics.f(this.f89838c, onboarded.f89838c) && Intrinsics.f(this.d, onboarded.d) && this.e == onboarded.e && Intrinsics.f(this.f, onboarded.f) && this.f89839g == onboarded.f89839g;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.d.hashCode() + ((this.f89838c.hashCode() + ((this.f89837b.hashCode() + (this.f89836a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
            Clause clause = this.f;
            return Boolean.hashCode(this.f89839g) + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89836a, i);
            dest.writeParcelable(this.f89837b, i);
            dest.writeParcelable(this.f89838c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f89839g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$Pending;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending extends TabInvestControllerContract$HeaderState {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingLegalEntityInformation f89842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthAccountsBalance f89843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChosenBackground f89844c;
        public final boolean d;
        public final Clause e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending((TradingLegalEntityInformation) parcel.readParcelable(Pending.class.getClassLoader()), (WealthAccountsBalance) parcel.readParcelable(Pending.class.getClassLoader()), (ChosenBackground) parcel.readParcelable(Pending.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(Pending.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(TradingLegalEntityInformation tradingLegalEntity, WealthAccountsBalance wealthAccountsBalance, ChosenBackground background, boolean z, Clause clause, boolean z3) {
            Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
            Intrinsics.checkNotNullParameter(wealthAccountsBalance, "wealthAccountsBalance");
            Intrinsics.checkNotNullParameter(background, "background");
            this.f89842a = tradingLegalEntity;
            this.f89843b = wealthAccountsBalance;
            this.f89844c = background;
            this.d = z;
            this.e = clause;
            this.f = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj2;
            return Intrinsics.f(this.f89842a, pending.f89842a) && Intrinsics.f(this.f89843b, pending.f89843b) && Intrinsics.f(this.f89844c, pending.f89844c) && this.d == pending.d && Intrinsics.f(this.e, pending.e) && this.f == pending.f;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f89844c.hashCode() + ((this.f89843b.hashCode() + (this.f89842a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            Clause clause = this.e;
            return Boolean.hashCode(this.f) + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89842a, i);
            dest.writeParcelable(this.f89843b, i);
            dest.writeParcelable(this.f89844c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState$PreOnboarding;", "Lcom/revolut/feature/tab/invest/impl/ui/home/TabInvestControllerContract$HeaderState;", "", "toString", "()Ljava/lang/String;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreOnboarding extends TabInvestControllerContract$HeaderState {

        @NotNull
        public static final Parcelable.Creator<PreOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingLegalEntityInformation f89845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChosenBackground f89846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f89847c;
        public final Clause d;
        public final TradingAccounts e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreOnboarding((TradingLegalEntityInformation) parcel.readParcelable(PreOnboarding.class.getClassLoader()), (ChosenBackground) parcel.readParcelable(PreOnboarding.class.getClassLoader()), parcel.createStringArrayList(), (Clause) parcel.readParcelable(PreOnboarding.class.getClassLoader()), (TradingAccounts) parcel.readParcelable(PreOnboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreOnboarding[i];
            }
        }

        public PreOnboarding(TradingLegalEntityInformation tradingLegalEntity, ChosenBackground background, List popularAssets, Clause clause, TradingAccounts accounts) {
            Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(popularAssets, "popularAssets");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            this.f89845a = tradingLegalEntity;
            this.f89846b = background;
            this.f89847c = popularAssets;
            this.d = clause;
            this.e = accounts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreOnboarding)) {
                return false;
            }
            PreOnboarding preOnboarding = (PreOnboarding) obj2;
            return Intrinsics.f(this.f89845a, preOnboarding.f89845a) && Intrinsics.f(this.f89846b, preOnboarding.f89846b) && Intrinsics.f(this.f89847c, preOnboarding.f89847c) && Intrinsics.f(this.d, preOnboarding.d) && Intrinsics.f(this.e, preOnboarding.e);
        }

        public final int hashCode() {
            int iD = p.a.d((this.f89846b.hashCode() + (this.f89845a.hashCode() * 31)) * 31, 31, this.f89847c);
            Clause clause = this.d;
            return this.e.hashCode() + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89845a, i);
            dest.writeParcelable(this.f89846b, i);
            dest.writeStringList(this.f89847c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    private TabInvestControllerContract$HeaderState() {
    }
}
