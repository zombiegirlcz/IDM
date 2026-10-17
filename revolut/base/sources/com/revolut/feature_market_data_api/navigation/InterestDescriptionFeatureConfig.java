package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Interest", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterestDescriptionFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<InterestDescriptionFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i.a f97092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f97093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interest f97094c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest;", "Landroid/os/Parcelable;", "EstimatedInterest", "DailyEstimatedInterest", "InterestApplies", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$InterestApplies;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Interest extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$DailyEstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DailyEstimatedInterest implements Interest {

            @NotNull
            public static final Parcelable.Creator<DailyEstimatedInterest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f97096b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DailyEstimatedInterest((d) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DailyEstimatedInterest[i];
                }
            }

            public DailyEstimatedInterest(d dailyAmount, String str) {
                Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
                this.f97095a = dailyAmount;
                this.f97096b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DailyEstimatedInterest)) {
                    return false;
                }
                DailyEstimatedInterest dailyEstimatedInterest = (DailyEstimatedInterest) obj2;
                return Intrinsics.f(this.f97095a, dailyEstimatedInterest.f97095a) && Intrinsics.f(this.f97096b, dailyEstimatedInterest.f97096b);
            }

            public final int hashCode() {
                int iHashCode = this.f97095a.hashCode() * 31;
                String str = this.f97096b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97095a);
                dest.writeString(this.f97096b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$EstimatedInterest;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EstimatedInterest implements Interest {

            @NotNull
            public static final Parcelable.Creator<EstimatedInterest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f97098b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EstimatedInterest(parcel.readDouble(), (d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EstimatedInterest[i];
                }
            }

            public EstimatedInterest(double d, d amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.f97097a = amount;
                this.f97098b = d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EstimatedInterest)) {
                    return false;
                }
                EstimatedInterest estimatedInterest = (EstimatedInterest) obj2;
                return Intrinsics.f(this.f97097a, estimatedInterest.f97097a) && Double.compare(this.f97098b, estimatedInterest.f97098b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f97098b) + (this.f97097a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97097a);
                dest.writeDouble(this.f97098b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest$InterestApplies;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig$Interest;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InterestApplies implements Interest {

            @NotNull
            public static final Parcelable.Creator<InterestApplies> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f97099a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f97100b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f97101c;
            public final b d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InterestApplies((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InterestApplies[i];
                }
            }

            public InterestApplies(d amount, String str, String str2, b bVar) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.f97099a = amount;
                this.f97100b = str;
                this.f97101c = str2;
                this.d = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InterestApplies)) {
                    return false;
                }
                InterestApplies interestApplies = (InterestApplies) obj2;
                return Intrinsics.f(this.f97099a, interestApplies.f97099a) && Intrinsics.f(this.f97100b, interestApplies.f97100b) && Intrinsics.f(this.f97101c, interestApplies.f97101c) && Intrinsics.f(this.d, interestApplies.d);
            }

            public final int hashCode() {
                int iHashCode = this.f97099a.hashCode() * 31;
                String str = this.f97100b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f97101c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                b bVar = this.d;
                return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f97099a);
                dest.writeString(this.f97100b);
                dest.writeString(this.f97101c);
                dest.writeSerializable(this.d);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InterestDescriptionFeatureConfig(c4i.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(InterestDescriptionFeatureConfig.class.getClassLoader()), (Interest) parcel.readParcelable(InterestDescriptionFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InterestDescriptionFeatureConfig[i];
        }
    }

    public InterestDescriptionFeatureConfig(c4i.a transactionType, AnalyticsProduct analyticsProduct, Interest interest) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f97092a = transactionType;
        this.f97093b = analyticsProduct;
        this.f97094c = interest;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97093b() {
        return this.f97093b;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a */
    public final OrderQuoteParamsVariant getF97076a() {
        return null;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97092a() {
        return this.f97092a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InterestDescriptionFeatureConfig)) {
            return false;
        }
        InterestDescriptionFeatureConfig interestDescriptionFeatureConfig = (InterestDescriptionFeatureConfig) obj2;
        return this.f97092a == interestDescriptionFeatureConfig.f97092a && Intrinsics.f(this.f97093b, interestDescriptionFeatureConfig.f97093b) && Intrinsics.f(this.f97094c, interestDescriptionFeatureConfig.f97094c);
    }

    public final int hashCode() {
        return this.f97094c.hashCode() + l.a(this.f97092a.hashCode() * 31, 31, this.f97093b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97092a.name());
        dest.writeParcelable(this.f97093b, i);
        dest.writeParcelable(this.f97094c, i);
    }
}
