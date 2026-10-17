package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/ChargeDescriptionFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChargeDescriptionFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ChargeDescriptionFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i.a f97063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f97064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChargeEntry f97065c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChargeDescriptionFeatureConfig(c4i.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ChargeDescriptionFeatureConfig.class.getClassLoader()), (ChargeEntry) parcel.readParcelable(ChargeDescriptionFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChargeDescriptionFeatureConfig[i];
        }
    }

    public ChargeDescriptionFeatureConfig(c4i.a transactionType, AnalyticsProduct analyticsProduct, ChargeEntry charge) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(charge, "charge");
        this.f97063a = transactionType;
        this.f97064b = analyticsProduct;
        this.f97065c = charge;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97064b() {
        return this.f97064b;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a */
    public final OrderQuoteParamsVariant getF97076a() {
        return null;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97063a() {
        return this.f97063a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChargeDescriptionFeatureConfig)) {
            return false;
        }
        ChargeDescriptionFeatureConfig chargeDescriptionFeatureConfig = (ChargeDescriptionFeatureConfig) obj2;
        return this.f97063a == chargeDescriptionFeatureConfig.f97063a && Intrinsics.f(this.f97064b, chargeDescriptionFeatureConfig.f97064b) && Intrinsics.f(this.f97065c, chargeDescriptionFeatureConfig.f97065c);
    }

    public final int hashCode() {
        return this.f97065c.hashCode() + l.a(this.f97063a.hashCode() * 31, 31, this.f97064b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97063a.name());
        dest.writeParcelable(this.f97064b, i);
        dest.writeParcelable(this.f97065c, i);
    }
}
