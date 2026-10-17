package com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import dj0.d;
import h30.l;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown;", "Landroid/os/Parcelable;", "SameCurrency", "CrossCurrency", "Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown$CrossCurrency;", "Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown$SameCurrency;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutboundPaymentBreakdown extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown$CrossCurrency;", "Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown;", "", "toString", "()Ljava/lang/String;", "ExchangeRate", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CrossCurrency implements OutboundPaymentBreakdown {

        @NotNull
        public static final Parcelable.Creator<CrossCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Charges f72379c;
        public final long d;
        public final d e;
        public final ExchangeRate f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown$CrossCurrency$ExchangeRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExchangeRate implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExchangeRate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f72380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f72381b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BigDecimal f72382c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ExchangeRate((BigDecimal) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExchangeRate[i];
                }
            }

            public ExchangeRate(BigDecimal rate, b from, b to6) {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(rate, "rate");
                this.f72380a = from;
                this.f72381b = to6;
                this.f72382c = rate;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ExchangeRate)) {
                    return false;
                }
                ExchangeRate exchangeRate = (ExchangeRate) obj2;
                return Intrinsics.f(this.f72380a, exchangeRate.f72380a) && Intrinsics.f(this.f72381b, exchangeRate.f72381b) && Intrinsics.f(this.f72382c, exchangeRate.f72382c);
            }

            public final int hashCode() {
                return this.f72382c.hashCode() + l.j(this.f72381b, this.f72380a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f72380a);
                dest.writeSerializable(this.f72381b);
                dest.writeSerializable(this.f72382c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CrossCurrency((d) parcel.readSerializable(), (d) parcel.readSerializable(), (Charges) parcel.readParcelable(CrossCurrency.class.getClassLoader()), parcel.readLong(), (d) parcel.readSerializable(), ExchangeRate.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossCurrency[i];
            }
        }

        public CrossCurrency(d paymentAmount, d totalAmount, Charges charges, long j2, d exchangedAmount, ExchangeRate exchangeRate) {
            Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            Intrinsics.checkNotNullParameter(exchangedAmount, "exchangedAmount");
            Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
            this.f72377a = paymentAmount;
            this.f72378b = totalAmount;
            this.f72379c = charges;
            this.d = j2;
            this.e = exchangedAmount;
            this.f = exchangeRate;
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: C3, reason: from getter */
        public final d getF72383a() {
            return this.f72377a;
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: E8, reason: from getter */
        public final Charges getF72385c() {
            return this.f72379c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CrossCurrency)) {
                return false;
            }
            CrossCurrency crossCurrency = (CrossCurrency) obj2;
            return Intrinsics.f(this.f72377a, crossCurrency.f72377a) && Intrinsics.f(this.f72378b, crossCurrency.f72378b) && Intrinsics.f(this.f72379c, crossCurrency.f72379c) && this.d == crossCurrency.d && Intrinsics.f(this.e, crossCurrency.e) && Intrinsics.f(this.f, crossCurrency.f);
        }

        public final int hashCode() {
            int iC = v7.c(this.f72377a.hashCode() * 31, 31, this.f72378b);
            Charges charges = this.f72379c;
            return this.f.hashCode() + v7.c(a0.d.c((iC + (charges == null ? 0 : charges.hashCode())) * 31, 31, this.d), 31, this.e);
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: w0, reason: from getter */
        public final d getF72384b() {
            return this.f72378b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72377a);
            dest.writeSerializable(this.f72378b);
            dest.writeParcelable(this.f72379c, i);
            dest.writeLong(this.d);
            dest.writeSerializable(this.e);
            this.f.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown$SameCurrency;", "Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SameCurrency implements OutboundPaymentBreakdown {

        @NotNull
        public static final Parcelable.Creator<SameCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Charges f72385c;
        public final long d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SameCurrency((d) parcel.readSerializable(), (d) parcel.readSerializable(), (Charges) parcel.readParcelable(SameCurrency.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SameCurrency[i];
            }
        }

        public SameCurrency(d paymentAmount, d totalAmount, Charges charges, long j2) {
            Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            this.f72383a = paymentAmount;
            this.f72384b = totalAmount;
            this.f72385c = charges;
            this.d = j2;
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: C3, reason: from getter */
        public final d getF72383a() {
            return this.f72383a;
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: E8, reason: from getter */
        public final Charges getF72385c() {
            return this.f72385c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SameCurrency)) {
                return false;
            }
            SameCurrency sameCurrency = (SameCurrency) obj2;
            return Intrinsics.f(this.f72383a, sameCurrency.f72383a) && Intrinsics.f(this.f72384b, sameCurrency.f72384b) && Intrinsics.f(this.f72385c, sameCurrency.f72385c) && this.d == sameCurrency.d;
        }

        public final int hashCode() {
            int iC = v7.c(this.f72383a.hashCode() * 31, 31, this.f72384b);
            Charges charges = this.f72385c;
            return Long.hashCode(this.d) + ((iC + (charges == null ? 0 : charges.hashCode())) * 31);
        }

        @Override // com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown
        /* JADX INFO: renamed from: w0, reason: from getter */
        public final d getF72384b() {
            return this.f72384b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72383a);
            dest.writeSerializable(this.f72384b);
            dest.writeParcelable(this.f72385c, i);
            dest.writeLong(this.d);
        }
    }

    /* JADX INFO: renamed from: C3 */
    d getF72383a();

    /* JADX INFO: renamed from: E8 */
    Charges getF72385c();

    /* JADX INFO: renamed from: w0 */
    d getF72384b();
}
