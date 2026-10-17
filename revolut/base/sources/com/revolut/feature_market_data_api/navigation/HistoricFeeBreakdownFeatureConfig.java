package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z3i.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/HistoricFeeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HistoricFeeBreakdownFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<HistoricFeeBreakdownFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f97087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f97089c;
    public final xi0.b d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c4i.a f97090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f97091h;
    public final Clause i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HistoricFeeBreakdownFeatureConfig((ChargeBreakdown) parcel.readParcelable(HistoricFeeBreakdownFeatureConfig.class.getClassLoader()), parcel.readString(), b.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, c4i.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(HistoricFeeBreakdownFeatureConfig.class.getClassLoader()), (Clause) parcel.readParcelable(HistoricFeeBreakdownFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HistoricFeeBreakdownFeatureConfig[i];
        }
    }

    public HistoricFeeBreakdownFeatureConfig(ChargeBreakdown chargeBreakdown, String breakdownId, b feeBreakdownEndpoint, xi0.b bVar, boolean z, boolean z3, c4i.a transactionType, AnalyticsProduct analyticsProduct, Clause clause) {
        Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
        Intrinsics.checkNotNullParameter(feeBreakdownEndpoint, "feeBreakdownEndpoint");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97087a = chargeBreakdown;
        this.f97088b = breakdownId;
        this.f97089c = feeBreakdownEndpoint;
        this.d = bVar;
        this.e = z;
        this.f = z3;
        this.f97090g = transactionType;
        this.f97091h = analyticsProduct;
        this.i = clause;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97074b() {
        return this.f97091h;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a */
    public final OrderQuoteParamsVariant getF97066a() {
        return null;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97073a() {
        return this.f97090g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HistoricFeeBreakdownFeatureConfig)) {
            return false;
        }
        HistoricFeeBreakdownFeatureConfig historicFeeBreakdownFeatureConfig = (HistoricFeeBreakdownFeatureConfig) obj2;
        return Intrinsics.f(this.f97087a, historicFeeBreakdownFeatureConfig.f97087a) && Intrinsics.f(this.f97088b, historicFeeBreakdownFeatureConfig.f97088b) && this.f97089c == historicFeeBreakdownFeatureConfig.f97089c && Intrinsics.f(this.d, historicFeeBreakdownFeatureConfig.d) && this.e == historicFeeBreakdownFeatureConfig.e && this.f == historicFeeBreakdownFeatureConfig.f && this.f97090g == historicFeeBreakdownFeatureConfig.f97090g && Intrinsics.f(this.f97091h, historicFeeBreakdownFeatureConfig.f97091h) && Intrinsics.f(this.i, historicFeeBreakdownFeatureConfig.i);
    }

    public final int hashCode() {
        ChargeBreakdown chargeBreakdown = this.f97087a;
        int iHashCode = (this.f97089c.hashCode() + p.a.c((chargeBreakdown == null ? 0 : chargeBreakdown.hashCode()) * 31, 31, this.f97088b)) * 31;
        xi0.b bVar = this.d;
        int iA = l.a((this.f97090g.hashCode() + j6.a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f)) * 31, 31, this.f97091h);
        Clause clause = this.i;
        return iA + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97087a, i);
        dest.writeString(this.f97088b);
        dest.writeString(this.f97089c.name());
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f97090g.name());
        dest.writeParcelable(this.f97091h, i);
        dest.writeParcelable(this.i, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HistoricFeeBreakdownFeatureConfig(ChargeBreakdown chargeBreakdown, String str, b bVar, xi0.b bVar2, boolean z, boolean z3, c4i.a aVar, AnalyticsProduct.Retail retail, int i) {
        AnalyticsProduct.Retail retailH;
        ChargeBreakdown chargeBreakdown2 = (i & 1) != 0 ? null : chargeBreakdown;
        b bVar3 = (i & 4) != 0 ? b.RETAIL : bVar;
        xi0.b bVar4 = (i & 8) != 0 ? null : bVar2;
        boolean z4 = (i & 16) != 0 ? true : z;
        boolean z6 = (i & 32) != 0 ? false : z3;
        if ((i & 128) != 0) {
            k9 k9Var = k9.ProductUnspecified;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            retailH = retail;
        }
        this(chargeBreakdown2, str, bVar3, bVar4, z4, z6, aVar, retailH, (Clause) null);
    }
}
