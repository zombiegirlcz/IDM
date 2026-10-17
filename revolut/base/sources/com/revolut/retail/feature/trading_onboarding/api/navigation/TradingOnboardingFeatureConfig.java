package com.revolut.retail.feature.trading_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Landroid/os/Parcelable;", "TradingRemediationFeatureConfig", "TradingAccountOnboardingFeatureConfig", "TradingAccountOrType", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingRemediationFeatureConfig;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingOnboardingFeatureConfig extends FeatureConfig, Parcelable {

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "Landroid/os/Parcelable;", "WithTradingAccount", "WithTradingAccountAndProducts", "WithTradingAccountType", "WithAvailableAccountId", "WithAvailableAccountIdAndProducts", "WithTradingAccountTypeAndProducts", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountId;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountIdAndProducts;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccount;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountAndProducts;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TradingAccountOrType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountId;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithAvailableAccountId implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithAvailableAccountId> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104109b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WithAvailableAccountId(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithAvailableAccountId[i];
                }
            }

            public WithAvailableAccountId(String availableAccountId, String str) {
                Intrinsics.checkNotNullParameter(availableAccountId, "availableAccountId");
                this.f104108a = availableAccountId;
                this.f104109b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithAvailableAccountId)) {
                    return false;
                }
                WithAvailableAccountId withAvailableAccountId = (WithAvailableAccountId) obj2;
                return Intrinsics.f(this.f104108a, withAvailableAccountId.f104108a) && Intrinsics.f(this.f104109b, withAvailableAccountId.f104109b);
            }

            public final int hashCode() {
                int iHashCode = this.f104108a.hashCode() * 31;
                String str = this.f104109b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104108a);
                dest.writeString(this.f104109b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountIdAndProducts;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithAvailableAccountIdAndProducts implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithAvailableAccountIdAndProducts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104110a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104111b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f104112c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(WithAvailableAccountIdAndProducts.class, parcel, arrayList, iE, 1);
                    }
                    return new WithAvailableAccountIdAndProducts(string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithAvailableAccountIdAndProducts[i];
                }
            }

            public WithAvailableAccountIdAndProducts(String availableAccountId, String str, List productCodes) {
                Intrinsics.checkNotNullParameter(availableAccountId, "availableAccountId");
                Intrinsics.checkNotNullParameter(productCodes, "productCodes");
                this.f104110a = availableAccountId;
                this.f104111b = str;
                this.f104112c = productCodes;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithAvailableAccountIdAndProducts)) {
                    return false;
                }
                WithAvailableAccountIdAndProducts withAvailableAccountIdAndProducts = (WithAvailableAccountIdAndProducts) obj2;
                return Intrinsics.f(this.f104110a, withAvailableAccountIdAndProducts.f104110a) && Intrinsics.f(this.f104111b, withAvailableAccountIdAndProducts.f104111b) && Intrinsics.f(this.f104112c, withAvailableAccountIdAndProducts.f104112c);
            }

            public final int hashCode() {
                int iHashCode = this.f104110a.hashCode() * 31;
                String str = this.f104111b;
                return this.f104112c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104110a);
                dest.writeString(this.f104111b);
                Iterator itV = p.a.v(this.f104112c, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccount;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithTradingAccount implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithTradingAccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TradingAccount f104113a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WithTradingAccount((TradingAccount) parcel.readParcelable(WithTradingAccount.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithTradingAccount[i];
                }
            }

            public WithTradingAccount(TradingAccount tradingAccount) {
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                this.f104113a = tradingAccount;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof WithTradingAccount) && Intrinsics.f(this.f104113a, ((WithTradingAccount) obj2).f104113a);
            }

            public final int hashCode() {
                return this.f104113a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104113a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountAndProducts;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithTradingAccountAndProducts implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithTradingAccountAndProducts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TradingAccount f104114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f104115b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    TradingAccount tradingAccount = (TradingAccount) j6.a.f(parcel, "parcel", WithTradingAccountAndProducts.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(WithTradingAccountAndProducts.class, parcel, arrayList, iE, 1);
                    }
                    return new WithTradingAccountAndProducts(tradingAccount, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithTradingAccountAndProducts[i];
                }
            }

            public WithTradingAccountAndProducts(TradingAccount tradingAccount, List productCodes) {
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                Intrinsics.checkNotNullParameter(productCodes, "productCodes");
                this.f104114a = tradingAccount;
                this.f104115b = productCodes;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithTradingAccountAndProducts)) {
                    return false;
                }
                WithTradingAccountAndProducts withTradingAccountAndProducts = (WithTradingAccountAndProducts) obj2;
                return Intrinsics.f(this.f104114a, withTradingAccountAndProducts.f104114a) && Intrinsics.f(this.f104115b, withTradingAccountAndProducts.f104115b);
            }

            public final int hashCode() {
                return this.f104115b.hashCode() + (this.f104114a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104114a, i);
                Iterator itV = p.a.v(this.f104115b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountType;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class WithTradingAccountType implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithTradingAccountType> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TradingAccountType f104116a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WithTradingAccountType((TradingAccountType) parcel.readParcelable(WithTradingAccountType.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithTradingAccountType[i];
                }
            }

            public WithTradingAccountType(TradingAccountType tradingAccountType) {
                Intrinsics.checkNotNullParameter(tradingAccountType, "tradingAccountType");
                this.f104116a = tradingAccountType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof WithTradingAccountType) && Intrinsics.f(this.f104116a, ((WithTradingAccountType) obj2).f104116a);
            }

            public final int hashCode() {
                return this.f104116a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104116a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOrType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class WithTradingAccountTypeAndProducts implements TradingAccountOrType {

            @NotNull
            public static final Parcelable.Creator<WithTradingAccountTypeAndProducts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TradingAccountType f104117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f104118b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    TradingAccountType tradingAccountType = (TradingAccountType) j6.a.f(parcel, "parcel", WithTradingAccountTypeAndProducts.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(WithTradingAccountTypeAndProducts.class, parcel, arrayList, iE, 1);
                    }
                    return new WithTradingAccountTypeAndProducts(tradingAccountType, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithTradingAccountTypeAndProducts[i];
                }
            }

            public WithTradingAccountTypeAndProducts(TradingAccountType tradingAccountType, List productCodes) {
                Intrinsics.checkNotNullParameter(tradingAccountType, "tradingAccountType");
                Intrinsics.checkNotNullParameter(productCodes, "productCodes");
                this.f104117a = tradingAccountType;
                this.f104118b = productCodes;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithTradingAccountTypeAndProducts)) {
                    return false;
                }
                WithTradingAccountTypeAndProducts withTradingAccountTypeAndProducts = (WithTradingAccountTypeAndProducts) obj2;
                return Intrinsics.f(this.f104117a, withTradingAccountTypeAndProducts.f104117a) && Intrinsics.f(this.f104118b, withTradingAccountTypeAndProducts.f104118b);
            }

            public final int hashCode() {
                return this.f104118b.hashCode() + (this.f104117a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104117a, i);
                Iterator itV = p.a.v(this.f104118b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingRemediationFeatureConfig;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingRemediationFeatureConfig implements TradingOnboardingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TradingRemediationFeatureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f104119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EndPromptParams f104121c;
        public final RemediationType d;
        public final AnalyticsProduct e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingRemediationFeatureConfig((NaviCommand) parcel.readParcelable(TradingRemediationFeatureConfig.class.getClassLoader()), parcel.readString(), EndPromptParams.CREATOR.createFromParcel(parcel), (RemediationType) parcel.readParcelable(TradingRemediationFeatureConfig.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TradingRemediationFeatureConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingRemediationFeatureConfig[i];
            }
        }

        public TradingRemediationFeatureConfig(NaviCommand returnCommand, String portfolioId, EndPromptParams endPromptParams, RemediationType remediationType, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(returnCommand, "returnCommand");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(endPromptParams, "endPromptParams");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f104119a = returnCommand;
            this.f104120b = portfolioId;
            this.f104121c = endPromptParams;
            this.d = remediationType;
            this.e = analyticsProduct;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: A2, reason: from getter */
        public final EndPromptParams getF104121c() {
            return this.f104121c;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: H0, reason: from getter */
        public final RemediationType getD() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: S, reason: from getter */
        public final String getF104120b() {
            return this.f104120b;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: X9, reason: from getter */
        public final NaviCommand getF104119a() {
            return this.f104119a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingRemediationFeatureConfig)) {
                return false;
            }
            TradingRemediationFeatureConfig tradingRemediationFeatureConfig = (TradingRemediationFeatureConfig) obj2;
            return Intrinsics.f(this.f104119a, tradingRemediationFeatureConfig.f104119a) && Intrinsics.f(this.f104120b, tradingRemediationFeatureConfig.f104120b) && Intrinsics.f(this.f104121c, tradingRemediationFeatureConfig.f104121c) && Intrinsics.f(this.d, tradingRemediationFeatureConfig.d) && Intrinsics.f(this.e, tradingRemediationFeatureConfig.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f104121c.hashCode() + p.a.c(this.f104119a.hashCode() * 31, 31, this.f104120b)) * 31;
            RemediationType remediationType = this.d;
            return this.e.hashCode() + ((iHashCode + (remediationType == null ? 0 : remediationType.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104119a, i);
            dest.writeString(this.f104120b);
            this.f104121c.writeToParcel(dest, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    /* JADX INFO: renamed from: A2 */
    EndPromptParams getF104121c();

    /* JADX INFO: renamed from: H0 */
    RemediationType getD();

    /* JADX INFO: renamed from: P */
    AnalyticsProduct getE();

    /* JADX INFO: renamed from: S */
    String getF104120b();

    /* JADX INFO: renamed from: X9 */
    NaviCommand getF104119a();

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/TradingOnboardingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingAccountOnboardingFeatureConfig implements TradingOnboardingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TradingAccountOnboardingFeatureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f104105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccountOrType f104106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OnboardingPart f104107c;
        public final EndPromptParams d;
        public final AnalyticsProduct e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingAccountOnboardingFeatureConfig((NaviCommand) parcel.readParcelable(TradingAccountOnboardingFeatureConfig.class.getClassLoader()), (TradingAccountOrType) parcel.readParcelable(TradingAccountOnboardingFeatureConfig.class.getClassLoader()), (OnboardingPart) parcel.readParcelable(TradingAccountOnboardingFeatureConfig.class.getClassLoader()), EndPromptParams.CREATOR.createFromParcel(parcel), (AnalyticsProduct) parcel.readParcelable(TradingAccountOnboardingFeatureConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingAccountOnboardingFeatureConfig[i];
            }
        }

        public TradingAccountOnboardingFeatureConfig(NaviCommand returnCommand, TradingAccountOrType tradingAccountOrType, OnboardingPart onboardingPart, EndPromptParams endPromptParams, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(returnCommand, "returnCommand");
            Intrinsics.checkNotNullParameter(tradingAccountOrType, "tradingAccountOrType");
            Intrinsics.checkNotNullParameter(endPromptParams, "endPromptParams");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f104105a = returnCommand;
            this.f104106b = tradingAccountOrType;
            this.f104107c = onboardingPart;
            this.d = endPromptParams;
            this.e = analyticsProduct;
        }

        public static TradingAccountOnboardingFeatureConfig a(TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig, TradingAccountOrType tradingAccountOrType) {
            NaviCommand returnCommand = tradingAccountOnboardingFeatureConfig.f104105a;
            OnboardingPart onboardingPart = tradingAccountOnboardingFeatureConfig.f104107c;
            EndPromptParams endPromptParams = tradingAccountOnboardingFeatureConfig.d;
            AnalyticsProduct analyticsProduct = tradingAccountOnboardingFeatureConfig.e;
            Intrinsics.checkNotNullParameter(returnCommand, "returnCommand");
            Intrinsics.checkNotNullParameter(tradingAccountOrType, "tradingAccountOrType");
            Intrinsics.checkNotNullParameter(endPromptParams, "endPromptParams");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            return new TradingAccountOnboardingFeatureConfig(returnCommand, tradingAccountOrType, onboardingPart, endPromptParams, analyticsProduct);
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: A2, reason: from getter */
        public final EndPromptParams getF104121c() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: H0 */
        public final RemediationType getD() {
            return null;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: S */
        public final String getF104120b() {
            TradingAccountOrType tradingAccountOrType = this.f104106b;
            if (tradingAccountOrType instanceof TradingAccountOrType.WithTradingAccount) {
                String string = ((TradingAccountOrType.WithTradingAccount) tradingAccountOrType).f104113a.getF105262a().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (tradingAccountOrType instanceof TradingAccountOrType.WithTradingAccountAndProducts) {
                String string2 = ((TradingAccountOrType.WithTradingAccountAndProducts) tradingAccountOrType).f104114a.getF105262a().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
            if (tradingAccountOrType instanceof TradingAccountOrType.WithTradingAccountType) {
                throw new IllegalStateException("TradingAccount id is called before starting onboarding and fetched from BE.");
            }
            if (tradingAccountOrType instanceof TradingAccountOrType.WithTradingAccountTypeAndProducts) {
                throw new IllegalStateException("TradingAccount id is called before starting onboarding and fetched from BE.");
            }
            if (tradingAccountOrType instanceof TradingAccountOrType.WithAvailableAccountId) {
                throw new IllegalStateException("TradingAccount id is called before starting onboarding and fetched from BE.");
            }
            if (tradingAccountOrType instanceof TradingAccountOrType.WithAvailableAccountIdAndProducts) {
                throw new IllegalStateException("TradingAccount id is called before starting onboarding and fetched from BE.");
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig
        /* JADX INFO: renamed from: X9, reason: from getter */
        public final NaviCommand getF104119a() {
            return this.f104105a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingAccountOnboardingFeatureConfig)) {
                return false;
            }
            TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig = (TradingAccountOnboardingFeatureConfig) obj2;
            return Intrinsics.f(this.f104105a, tradingAccountOnboardingFeatureConfig.f104105a) && Intrinsics.f(this.f104106b, tradingAccountOnboardingFeatureConfig.f104106b) && Intrinsics.f(this.f104107c, tradingAccountOnboardingFeatureConfig.f104107c) && Intrinsics.f(this.d, tradingAccountOnboardingFeatureConfig.d) && Intrinsics.f(this.e, tradingAccountOnboardingFeatureConfig.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f104106b.hashCode() + (this.f104105a.hashCode() * 31)) * 31;
            OnboardingPart onboardingPart = this.f104107c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (onboardingPart == null ? 0 : onboardingPart.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104105a, i);
            dest.writeParcelable(this.f104106b, i);
            dest.writeParcelable(this.f104107c, i);
            this.d.writeToParcel(dest, i);
            dest.writeParcelable(this.e, i);
        }

        public /* synthetic */ TradingAccountOnboardingFeatureConfig(NaviCommand naviCommand, TradingAccountOrType tradingAccountOrType, EndPromptParams endPromptParams, AnalyticsProduct.Retail retail) {
            this(naviCommand, tradingAccountOrType, null, endPromptParams, retail);
        }
    }
}
