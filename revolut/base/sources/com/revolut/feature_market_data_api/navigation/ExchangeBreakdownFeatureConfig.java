package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import h30.l;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/ExchangeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeBreakdownFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ExchangeBreakdownFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteParamsVariant f97066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuote f97067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4i.a f97068c;
    public final AnalyticsProduct d;
    public final boolean e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransactionUnitsType f97069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f97070h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f97071j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f97072l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            b bVar;
            Instant instant;
            Clause clause;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            OrderQuote orderQuote = (OrderQuote) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            c4i.a aVarValueOf = c4i.a.valueOf(parcel.readString());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            b bVar2 = (b) parcel.readSerializable();
            TransactionUnitsType transactionUnitsType = (TransactionUnitsType) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            Instant instant2 = (Instant) parcel.readSerializable();
            Clause clause2 = (Clause) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(ExchangeBreakdownFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                bVar = bVar2;
                instant = instant2;
                clause = clause3;
                z = true;
            } else {
                z = false;
                bVar = bVar2;
                instant = instant2;
                clause = clause3;
            }
            return new ExchangeBreakdownFeatureConfig(orderQuoteParamsVariant, orderQuote, aVarValueOf, analyticsProduct, z3, bVar, transactionUnitsType, instant, clause2, clause, clause4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeBreakdownFeatureConfig[i];
        }
    }

    public ExchangeBreakdownFeatureConfig(OrderQuoteParamsVariant orderQuoteParams, OrderQuote orderQuote, c4i.a transactionType, AnalyticsProduct analyticsProduct, boolean z, b bVar, TransactionUnitsType transactionUnitsType, Instant instant, Clause clause, Clause clause2, Clause clause3, boolean z3) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(transactionUnitsType, "transactionUnitsType");
        this.f97066a = orderQuoteParams;
        this.f97067b = orderQuote;
        this.f97068c = transactionType;
        this.d = analyticsProduct;
        this.e = z;
        this.f = bVar;
        this.f97069g = transactionUnitsType;
        this.f97070h = instant;
        this.i = clause;
        this.f97071j = clause2;
        this.k = clause3;
        this.f97072l = z3;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97074b() {
        return this.d;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a, reason: from getter */
    public final OrderQuoteParamsVariant getF97066a() {
        return this.f97066a;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97073a() {
        return this.f97068c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeBreakdownFeatureConfig)) {
            return false;
        }
        ExchangeBreakdownFeatureConfig exchangeBreakdownFeatureConfig = (ExchangeBreakdownFeatureConfig) obj2;
        return Intrinsics.f(this.f97066a, exchangeBreakdownFeatureConfig.f97066a) && Intrinsics.f(this.f97067b, exchangeBreakdownFeatureConfig.f97067b) && this.f97068c == exchangeBreakdownFeatureConfig.f97068c && Intrinsics.f(this.d, exchangeBreakdownFeatureConfig.d) && this.e == exchangeBreakdownFeatureConfig.e && Intrinsics.f(this.f, exchangeBreakdownFeatureConfig.f) && Intrinsics.f(this.f97069g, exchangeBreakdownFeatureConfig.f97069g) && Intrinsics.f(this.f97070h, exchangeBreakdownFeatureConfig.f97070h) && Intrinsics.f(this.i, exchangeBreakdownFeatureConfig.i) && Intrinsics.f(this.f97071j, exchangeBreakdownFeatureConfig.f97071j) && Intrinsics.f(this.k, exchangeBreakdownFeatureConfig.k) && this.f97072l == exchangeBreakdownFeatureConfig.f97072l;
    }

    public final int hashCode() {
        int iHashCode = this.f97066a.hashCode() * 31;
        OrderQuote orderQuote = this.f97067b;
        int iC = j6.a.c(l.a((this.f97068c.hashCode() + ((iHashCode + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        b bVar = this.f;
        int iHashCode2 = (this.f97069g.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        Instant instant = this.f97070h;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Clause clause = this.i;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f97071j;
        int iHashCode5 = (iHashCode4 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.k;
        return Boolean.hashCode(this.f97072l) + ((iHashCode5 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97066a, i);
        dest.writeParcelable(this.f97067b, i);
        dest.writeString(this.f97068c.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f97069g, i);
        dest.writeSerializable(this.f97070h);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f97071j, i);
        dest.writeParcelable(this.k, i);
        dest.writeInt(this.f97072l ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExchangeBreakdownFeatureConfig(LegacyOrderQuoteParams orderQuoteParams, OrderQuote orderQuote, c4i.a transactionType, AnalyticsProduct analyticsProduct, boolean z, int i) {
        AnalyticsProduct analyticsProduct2;
        OrderQuote orderQuote2 = (i & 2) != 0 ? null : orderQuote;
        if ((i & 8) != 0) {
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct2 = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProduct2 = analyticsProduct;
        }
        boolean z3 = (i & 16) != 0 ? true : z;
        boolean z4 = (i & 1024) == 0;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
        TransactionUnitsType.Units transactionUnitsType = TransactionUnitsType.Units.f97103a;
        Intrinsics.checkNotNullParameter(transactionUnitsType, "transactionUnitsType");
        this(new OrderQuoteParamsVariant.Legacy(orderQuoteParams), orderQuote2, transactionType, analyticsProduct2, z3, null, transactionUnitsType, null, null, null, null, z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExchangeBreakdownFeatureConfig(OrderQuoteParams orderQuoteParams, OrderQuote orderQuote, c4i.a transactionType, AnalyticsProduct analyticsProduct, b bVar, TransactionUnitsType transactionUnitsType, Instant instant, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, HtmlLocalisedClause htmlLocalisedClause, int i) {
        AnalyticsProduct analyticsProduct2;
        OrderQuote orderQuote2 = (i & 2) != 0 ? null : orderQuote;
        if ((i & 8) != 0) {
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct2 = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProduct2 = analyticsProduct;
        }
        boolean z = (i & 16) != 0;
        b bVar2 = (i & 32) != 0 ? null : bVar;
        TransactionUnitsType transactionUnitsType2 = (i & 64) != 0 ? TransactionUnitsType.Units.f97103a : transactionUnitsType;
        Instant instant2 = (i & 128) != 0 ? null : instant;
        TextLocalisedClause textLocalisedClause3 = (i & 256) != 0 ? null : textLocalisedClause;
        TextLocalisedClause textLocalisedClause4 = (i & 512) != 0 ? null : textLocalisedClause2;
        HtmlLocalisedClause htmlLocalisedClause2 = (i & 1024) != 0 ? null : htmlLocalisedClause;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
        Intrinsics.checkNotNullParameter(transactionUnitsType2, "transactionUnitsType");
        this(new OrderQuoteParamsVariant.Migrated(orderQuoteParams), orderQuote2, transactionType, analyticsProduct2, z, bVar2, transactionUnitsType2, instant2, textLocalisedClause3, textLocalisedClause4, htmlLocalisedClause2, false);
    }
}
