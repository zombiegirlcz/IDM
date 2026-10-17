package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras;", "Landroid/os/Parcelable;", "LegacyQuote", "PaymentBreakdown", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras$LegacyQuote;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras$PaymentBreakdown;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutboundPaymentExtras extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras$LegacyQuote;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LegacyQuote implements OutboundPaymentExtras {

        @NotNull
        public static final Parcelable.Creator<LegacyQuote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderQuote f72531a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LegacyQuote((OrderQuote) parcel.readParcelable(LegacyQuote.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LegacyQuote[i];
            }
        }

        public LegacyQuote(OrderQuote quote) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.f72531a = quote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LegacyQuote) && Intrinsics.f(this.f72531a, ((LegacyQuote) obj2).f72531a);
        }

        public final int hashCode() {
            return this.f72531a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72531a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras$PaymentBreakdown;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OutboundPaymentExtras;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentBreakdown implements OutboundPaymentExtras {

        @NotNull
        public static final Parcelable.Creator<PaymentBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundPaymentBreakdown f72532a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentBreakdown((OutboundPaymentBreakdown) parcel.readParcelable(PaymentBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentBreakdown[i];
            }
        }

        public PaymentBreakdown(OutboundPaymentBreakdown value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72532a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentBreakdown) && Intrinsics.f(this.f72532a, ((PaymentBreakdown) obj2).f72532a);
        }

        public final int hashCode() {
            return this.f72532a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72532a, i);
        }
    }
}
