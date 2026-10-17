package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/FeeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeeBreakdownFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<FeeBreakdownFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteParamsVariant f97076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChargeBreakdown f97077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4i.a f97078c;
    public final AnalyticsProduct d;
    public final boolean e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f97080h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f97081j;
    public final Clause k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            b bVar;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OrderQuoteParamsVariant orderQuoteParamsVariant = (OrderQuoteParamsVariant) parcel.readParcelable(FeeBreakdownFeatureConfig.class.getClassLoader());
            ChargeBreakdown chargeBreakdown = (ChargeBreakdown) parcel.readParcelable(FeeBreakdownFeatureConfig.class.getClassLoader());
            c4i.a aVarValueOf = c4i.a.valueOf(parcel.readString());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(FeeBreakdownFeatureConfig.class.getClassLoader());
            boolean z6 = true;
            boolean z11 = parcel.readInt() != 0;
            b bVar2 = (b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                bVar = bVar2;
                z4 = z;
            } else {
                z3 = false;
                bVar = bVar2;
                z4 = false;
            }
            Clause clause = (Clause) parcel.readParcelable(FeeBreakdownFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = z;
            }
            return new FeeBreakdownFeatureConfig(orderQuoteParamsVariant, chargeBreakdown, aVarValueOf, analyticsProduct, z11, bVar, z6, z4, clause, z3, (Clause) parcel.readParcelable(FeeBreakdownFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeBreakdownFeatureConfig[i];
        }
    }

    public FeeBreakdownFeatureConfig(OrderQuoteParamsVariant orderQuoteParams, ChargeBreakdown chargeBreakdown, c4i.a transactionType, AnalyticsProduct analyticsProduct, boolean z, b bVar, boolean z3, boolean z4, Clause clause, boolean z6, Clause clause2) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97076a = orderQuoteParams;
        this.f97077b = chargeBreakdown;
        this.f97078c = transactionType;
        this.d = analyticsProduct;
        this.e = z;
        this.f = bVar;
        this.f97079g = z3;
        this.f97080h = z4;
        this.i = clause;
        this.f97081j = z6;
        this.k = clause2;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97074b() {
        return this.d;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a, reason: from getter */
    public final OrderQuoteParamsVariant getF97066a() {
        return this.f97076a;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97073a() {
        return this.f97078c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeeBreakdownFeatureConfig)) {
            return false;
        }
        FeeBreakdownFeatureConfig feeBreakdownFeatureConfig = (FeeBreakdownFeatureConfig) obj2;
        return Intrinsics.f(this.f97076a, feeBreakdownFeatureConfig.f97076a) && Intrinsics.f(this.f97077b, feeBreakdownFeatureConfig.f97077b) && this.f97078c == feeBreakdownFeatureConfig.f97078c && Intrinsics.f(this.d, feeBreakdownFeatureConfig.d) && this.e == feeBreakdownFeatureConfig.e && Intrinsics.f(this.f, feeBreakdownFeatureConfig.f) && this.f97079g == feeBreakdownFeatureConfig.f97079g && this.f97080h == feeBreakdownFeatureConfig.f97080h && Intrinsics.f(this.i, feeBreakdownFeatureConfig.i) && this.f97081j == feeBreakdownFeatureConfig.f97081j && Intrinsics.f(this.k, feeBreakdownFeatureConfig.k);
    }

    public final int hashCode() {
        int iHashCode = this.f97076a.hashCode() * 31;
        ChargeBreakdown chargeBreakdown = this.f97077b;
        int iC = j6.a.c(l.a((this.f97078c.hashCode() + ((iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        b bVar = this.f;
        int iC2 = j6.a.c(j6.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f97079g), 31, this.f97080h);
        Clause clause = this.i;
        int iC3 = j6.a.c((iC2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f97081j);
        Clause clause2 = this.k;
        return iC3 + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97076a, i);
        dest.writeParcelable(this.f97077b, i);
        dest.writeString(this.f97078c.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f97079g ? 1 : 0);
        dest.writeInt(this.f97080h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeInt(this.f97081j ? 1 : 0);
        dest.writeParcelable(this.k, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeeBreakdownFeatureConfig(LegacyOrderQuoteParams orderQuoteParams, ChargeBreakdown chargeBreakdown, c4i.a transactionType, AnalyticsProduct.Retail retail, boolean z, b bVar, boolean z3, boolean z4, int i) {
        AnalyticsProduct.Retail analyticsProduct;
        if ((i & 8) != 0) {
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProduct = retail;
        }
        boolean z6 = (i & 16) != 0 ? true : z;
        b bVar2 = (i & 32) != 0 ? null : bVar;
        boolean z11 = (i & 64) != 0 ? true : z3;
        boolean z12 = (i & 128) != 0 ? false : z4;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this(new OrderQuoteParamsVariant.Legacy(orderQuoteParams), chargeBreakdown, transactionType, analyticsProduct, z6, bVar2, z11, z12, null, false, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeeBreakdownFeatureConfig(OrderQuoteParams orderQuoteParams, ChargeBreakdown chargeBreakdown, c4i.a transactionType, AnalyticsProduct.Retail retail, b bVar, boolean z, Clause clause, HtmlLocalisedClause htmlLocalisedClause, int i) {
        AnalyticsProduct.Retail analyticsProduct;
        if ((i & 8) != 0) {
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProduct = retail;
        }
        boolean z3 = (i & 16) != 0;
        b bVar2 = (i & 32) != 0 ? null : bVar;
        boolean z4 = (i & 64) != 0 ? true : z;
        Clause clause2 = (i & 256) != 0 ? null : clause;
        boolean z6 = (i & 512) == 0;
        HtmlLocalisedClause htmlLocalisedClause2 = (i & 1024) != 0 ? null : htmlLocalisedClause;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this(new OrderQuoteParamsVariant.Migrated(orderQuoteParams), chargeBreakdown, transactionType, analyticsProduct, z3, bVar2, z4, false, clause2, z6, htmlLocalisedClause2);
    }
}
