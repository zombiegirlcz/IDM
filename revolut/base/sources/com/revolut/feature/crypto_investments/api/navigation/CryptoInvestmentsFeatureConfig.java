package com.revolut.feature.crypto_investments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pt5.b;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Activity", "TaxReportDestination", "ActivityDestination", "CurrencyMode", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$Activity;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoInvestmentsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$Activity;", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Activity extends CryptoInvestmentsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Activity> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f71397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CurrencyMode f71398h;
        public final lt5.a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f71399j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Activity(b.valueOf(parcel.readString()), (CurrencyMode) parcel.readParcelable(Activity.class.getClassLoader()), lt5.a.valueOf(parcel.readString()), (ActivityAnimation) parcel.readParcelable(Activity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activity[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(b activityTab, CurrencyMode currencyMode, lt5.a source, ActivityAnimation activityAnimation) {
            super(null, new ActivityDestination(activityTab, currencyMode, source, LDSFile.EF_DG12_TAG), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(activityTab, "activityTab");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f71397g = activityTab;
            this.f71398h = currencyMode;
            this.i = source;
            this.f71399j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF71399j() {
            return this.f71399j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj2;
            return this.f71397g == activity.f71397g && Intrinsics.f(this.f71398h, activity.f71398h) && this.i == activity.i && Intrinsics.f(this.f71399j, activity.f71399j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + ((this.f71398h.hashCode() + (this.f71397g.hashCode() * 31)) * 31)) * 31;
            ActivityAnimation activityAnimation = this.f71399j;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71397g.name());
            dest.writeParcelable(this.f71398h, i);
            dest.writeString(this.i.name());
            dest.writeParcelable(this.f71399j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode;", "Landroid/os/Parcelable;", "AllCurrencies", "SingleCurrency", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode$AllCurrencies;", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode$SingleCurrency;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CurrencyMode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode$AllCurrencies;", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode;", "<init>", "()V", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AllCurrencies implements CurrencyMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AllCurrencies f71404a = new AllCurrencies();

            @NotNull
            public static final Parcelable.Creator<AllCurrencies> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllCurrencies.f71404a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllCurrencies[i];
                }
            }

            private AllCurrencies() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode$SingleCurrency;", "Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$CurrencyMode;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SingleCurrency implements CurrencyMode {

            @NotNull
            public static final Parcelable.Creator<SingleCurrency> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final xi0.b f71405a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SingleCurrency((xi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SingleCurrency[i];
                }
            }

            public SingleCurrency(xi0.b currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f71405a = currency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SingleCurrency) && Intrinsics.f(this.f71405a, ((SingleCurrency) obj2).f71405a);
            }

            public final int hashCode() {
                return this.f71405a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f71405a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$TaxReportDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxReportDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxReportDestination f71406a = new TaxReportDestination();

        @NotNull
        public static final Parcelable.Creator<TaxReportDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxReportDestination.f71406a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxReportDestination[i];
            }
        }

        private TaxReportDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/navigation/CryptoInvestmentsFeatureConfig$ActivityDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivityDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ActivityDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CurrencyMode f71401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f71402c;
        public final Clause d;
        public final lt5.a e;
        public final i7 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i7 f71403g;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivityDestination(b.valueOf(parcel.readString()), (CurrencyMode) parcel.readParcelable(ActivityDestination.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(ActivityDestination.class.getClassLoader()), lt5.a.valueOf(parcel.readString()), (i7) parcel.readSerializable(), (i7) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivityDestination[i];
            }
        }

        public ActivityDestination(b activityTab, CurrencyMode currencyMode, boolean z, Clause clause, lt5.a source, i7 i7Var, i7 i7Var2) {
            Intrinsics.checkNotNullParameter(activityTab, "activityTab");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f71400a = activityTab;
            this.f71401b = currencyMode;
            this.f71402c = z;
            this.d = clause;
            this.e = source;
            this.f = i7Var;
            this.f71403g = i7Var2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActivityDestination)) {
                return false;
            }
            ActivityDestination activityDestination = (ActivityDestination) obj2;
            return this.f71400a == activityDestination.f71400a && Intrinsics.f(this.f71401b, activityDestination.f71401b) && this.f71402c == activityDestination.f71402c && Intrinsics.f(this.d, activityDestination.d) && this.e == activityDestination.e && Intrinsics.f(this.f, activityDestination.f) && Intrinsics.f(this.f71403g, activityDestination.f71403g);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f71401b.hashCode() + (this.f71400a.hashCode() * 31)) * 31, 31, this.f71402c);
            Clause clause = this.d;
            int iHashCode = (this.e.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            i7 i7Var = this.f;
            int iHashCode2 = (iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
            i7 i7Var2 = this.f71403g;
            return iHashCode2 + (i7Var2 != null ? i7Var2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71400a.name());
            dest.writeParcelable(this.f71401b, i);
            dest.writeInt(this.f71402c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f71403g);
        }

        public /* synthetic */ ActivityDestination(b bVar, CurrencyMode currencyMode, lt5.a aVar, int i) {
            this(bVar, currencyMode, false, null, (i & 16) != 0 ? lt5.a.CRYPTO : aVar, null, null);
        }
    }
}
