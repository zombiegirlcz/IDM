package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestFundOrderData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestFundOrderData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestFundOrderData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f104542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f104543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f104544c;
    public final Instant d;
    public final Instant e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestFundOrderData((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestFundOrderData[i];
        }
    }

    public InvestFundOrderData(Instant submissionDate, Instant instant, Instant internalCutoffDate, Instant tradeDate, Instant navDate) {
        Intrinsics.checkNotNullParameter(submissionDate, "submissionDate");
        Intrinsics.checkNotNullParameter(internalCutoffDate, "internalCutoffDate");
        Intrinsics.checkNotNullParameter(tradeDate, "tradeDate");
        Intrinsics.checkNotNullParameter(navDate, "navDate");
        this.f104542a = submissionDate;
        this.f104543b = instant;
        this.f104544c = internalCutoffDate;
        this.d = tradeDate;
        this.e = navDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestFundOrderData)) {
            return false;
        }
        InvestFundOrderData investFundOrderData = (InvestFundOrderData) obj2;
        return Intrinsics.f(this.f104542a, investFundOrderData.f104542a) && Intrinsics.f(this.f104543b, investFundOrderData.f104543b) && Intrinsics.f(this.f104544c, investFundOrderData.f104544c) && Intrinsics.f(this.d, investFundOrderData.d) && Intrinsics.f(this.e, investFundOrderData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f104542a.hashCode() * 31;
        Instant instant = this.f104543b;
        return this.e.hashCode() + b.c(b.c((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f104544c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104542a);
        dest.writeSerializable(this.f104543b);
        dest.writeSerializable(this.f104544c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
