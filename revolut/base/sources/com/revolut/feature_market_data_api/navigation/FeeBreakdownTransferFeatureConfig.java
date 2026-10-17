package com.revolut.feature_market_data_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/FeeBreakdownTransferFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeeBreakdownTransferFeatureConfig extends TransactionBreakdownFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<FeeBreakdownTransferFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f97082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4i.a f97083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferQuoteUserIdentifier f97084c;
    public final d d;
    public final b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f97086h;
    public final Clause i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeBreakdownTransferFeatureConfig((ChargeBreakdown) parcel.readParcelable(FeeBreakdownTransferFeatureConfig.class.getClassLoader()), c4i.a.valueOf(parcel.readString()), (TransferQuoteUserIdentifier) parcel.readParcelable(FeeBreakdownTransferFeatureConfig.class.getClassLoader()), (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(FeeBreakdownTransferFeatureConfig.class.getClassLoader()), (Clause) parcel.readParcelable(FeeBreakdownTransferFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeBreakdownTransferFeatureConfig[i];
        }
    }

    public FeeBreakdownTransferFeatureConfig(ChargeBreakdown orderFee, c4i.a transactionType, TransferQuoteUserIdentifier userIdentifier, d recipientAmount, b senderCurrency, String str, boolean z, AnalyticsProduct analyticsProduct, Clause clause) {
        Intrinsics.checkNotNullParameter(orderFee, "orderFee");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(userIdentifier, "userIdentifier");
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97082a = orderFee;
        this.f97083b = transactionType;
        this.f97084c = userIdentifier;
        this.d = recipientAmount;
        this.e = senderCurrency;
        this.f = str;
        this.f97085g = z;
        this.f97086h = analyticsProduct;
        this.i = clause;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF97074b() {
        return this.f97086h;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: a */
    public final OrderQuoteParamsVariant getF97066a() {
        return null;
    }

    @Override // com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4i.a getF97073a() {
        return this.f97083b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeeBreakdownTransferFeatureConfig)) {
            return false;
        }
        FeeBreakdownTransferFeatureConfig feeBreakdownTransferFeatureConfig = (FeeBreakdownTransferFeatureConfig) obj2;
        return Intrinsics.f(this.f97082a, feeBreakdownTransferFeatureConfig.f97082a) && this.f97083b == feeBreakdownTransferFeatureConfig.f97083b && Intrinsics.f(this.f97084c, feeBreakdownTransferFeatureConfig.f97084c) && Intrinsics.f(this.d, feeBreakdownTransferFeatureConfig.d) && Intrinsics.f(this.e, feeBreakdownTransferFeatureConfig.e) && Intrinsics.f(this.f, feeBreakdownTransferFeatureConfig.f) && this.f97085g == feeBreakdownTransferFeatureConfig.f97085g && Intrinsics.f(this.f97086h, feeBreakdownTransferFeatureConfig.f97086h) && Intrinsics.f(this.i, feeBreakdownTransferFeatureConfig.i);
    }

    public final int hashCode() {
        int iJ = l.j(this.e, v7.c((this.f97084c.hashCode() + ((this.f97083b.hashCode() + (this.f97082a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31);
        String str = this.f;
        int iA = l.a(j6.a.c((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f97085g), 31, this.f97086h);
        Clause clause = this.i;
        return iA + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97082a, i);
        dest.writeString(this.f97083b.name());
        dest.writeParcelable(this.f97084c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f97085g ? 1 : 0);
        dest.writeParcelable(this.f97086h, i);
        dest.writeParcelable(this.i, i);
    }
}
