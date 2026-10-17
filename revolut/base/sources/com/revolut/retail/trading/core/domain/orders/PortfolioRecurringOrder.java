package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Instant;
import java.time.LocalDate;
import k4l.c0;
import k4l.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/PortfolioRecurringOrder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "k4l/d0", "k4l/c0", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioRecurringOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioRecurringOrder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104651c;
    public final d0 d;
    public final c0 e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f104652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f104653h;
    public final d i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioRecurringOrder(parcel.readString(), parcel.readString(), parcel.readString(), d0.valueOf(parcel.readString()), c0.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (Instant) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioRecurringOrder[i];
        }
    }

    public PortfolioRecurringOrder(String orderId, String portfolioId, String str, d0 state, c0 period, LocalDate startDate, LocalDate nextDate, Instant updatedDate, d amount) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f104649a = orderId;
        this.f104650b = portfolioId;
        this.f104651c = str;
        this.d = state;
        this.e = period;
        this.f = startDate;
        this.f104652g = nextDate;
        this.f104653h = updatedDate;
        this.i = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioRecurringOrder)) {
            return false;
        }
        PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) obj2;
        return Intrinsics.f(this.f104649a, portfolioRecurringOrder.f104649a) && Intrinsics.f(this.f104650b, portfolioRecurringOrder.f104650b) && Intrinsics.f(this.f104651c, portfolioRecurringOrder.f104651c) && this.d == portfolioRecurringOrder.d && this.e == portfolioRecurringOrder.e && Intrinsics.f(this.f, portfolioRecurringOrder.f) && Intrinsics.f(this.f104652g, portfolioRecurringOrder.f104652g) && Intrinsics.f(this.f104653h, portfolioRecurringOrder.f104653h) && Intrinsics.f(this.i, portfolioRecurringOrder.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f104649a.hashCode() * 31, 31, this.f104650b);
        String str = this.f104651c;
        return this.i.hashCode() + b.c(y.a(y.a((this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f), 31, this.f104652g), 31, this.f104653h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104649a);
        dest.writeString(this.f104650b);
        dest.writeString(this.f104651c);
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104652g);
        dest.writeSerializable(this.f104653h);
        dest.writeSerializable(this.i);
    }
}
