package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/ExchangePriceDescriptionFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangePriceDescriptionFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ExchangePriceDescriptionFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i.a f97073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f97074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Asset f97075c;
    public final BigDecimal d;
    public final Asset e;
    public final TransactionUnitsType f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangePriceDescriptionFeatureConfig(c4i.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ExchangePriceDescriptionFeatureConfig.class.getClassLoader()), (Asset) parcel.readParcelable(ExchangePriceDescriptionFeatureConfig.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (Asset) parcel.readParcelable(ExchangePriceDescriptionFeatureConfig.class.getClassLoader()), (TransactionUnitsType) parcel.readParcelable(ExchangePriceDescriptionFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangePriceDescriptionFeatureConfig[i];
        }
    }

    public ExchangePriceDescriptionFeatureConfig(c4i.a transactionType, AnalyticsProduct analyticsProduct, Asset baseAsset, BigDecimal expectedRate, Asset rateAsset, TransactionUnitsType unitsType) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
        Intrinsics.checkNotNullParameter(expectedRate, "expectedRate");
        Intrinsics.checkNotNullParameter(rateAsset, "rateAsset");
        Intrinsics.checkNotNullParameter(unitsType, "unitsType");
        this.f97073a = transactionType;
        this.f97074b = analyticsProduct;
        this.f97075c = baseAsset;
        this.d = expectedRate;
        this.e = rateAsset;
        this.f = unitsType;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97074b() {
        return this.f97074b;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a */
    public final OrderQuoteParamsVariant getF97066a() {
        return null;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97073a() {
        return this.f97073a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangePriceDescriptionFeatureConfig)) {
            return false;
        }
        ExchangePriceDescriptionFeatureConfig exchangePriceDescriptionFeatureConfig = (ExchangePriceDescriptionFeatureConfig) obj2;
        return this.f97073a == exchangePriceDescriptionFeatureConfig.f97073a && Intrinsics.f(this.f97074b, exchangePriceDescriptionFeatureConfig.f97074b) && Intrinsics.f(this.f97075c, exchangePriceDescriptionFeatureConfig.f97075c) && Intrinsics.f(this.d, exchangePriceDescriptionFeatureConfig.d) && Intrinsics.f(this.e, exchangePriceDescriptionFeatureConfig.e) && Intrinsics.f(this.f, exchangePriceDescriptionFeatureConfig.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + t61.a.d(this.d, (this.f97075c.hashCode() + l.a(this.f97073a.hashCode() * 31, 31, this.f97074b)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97073a.name());
        dest.writeParcelable(this.f97074b, i);
        dest.writeParcelable(this.f97075c, i);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
