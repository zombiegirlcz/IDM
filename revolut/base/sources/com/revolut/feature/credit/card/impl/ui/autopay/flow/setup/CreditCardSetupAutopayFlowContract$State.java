package com.revolut.feature.credit.card.impl.ui.autopay.flow.setup;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.kompot.navigable.flow.FlowState;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.g;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Loading", "Content", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State$Content;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State$Loading;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardSetupAutopayFlowContract$State extends FlowState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State$Content;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements CreditCardSetupAutopayFlowContract$State {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardAutopayConfig f69074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f69075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f69076c;
        public final CreditCardAutopayType d;
        public final CreditCardAutopayPayment.PaymentAmount e;
        public final CreditCardAutopayPayment.PaymentDay f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f69077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final RepaymentSource f69078h;
        public final CreditAutopaySourceConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final wi0.b f69079j;
        public final g k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) j6.a.f(parcel, "parcel", Content.class);
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                long j2 = parcel.readLong();
                CreditCardAutopayType creditCardAutopayType = (CreditCardAutopayType) parcel.readParcelable(Content.class.getClassLoader());
                CreditCardAutopayPayment.PaymentAmount paymentAmount = (CreditCardAutopayPayment.PaymentAmount) parcel.readParcelable(Content.class.getClassLoader());
                CreditCardAutopayPayment.PaymentDay paymentDay = (CreditCardAutopayPayment.PaymentDay) parcel.readParcelable(Content.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Content.class, parcel, arrayList, iE, 1);
                }
                return new Content(creditCardAutopayConfig, bVar, j2, creditCardAutopayType, paymentAmount, paymentDay, arrayList, (RepaymentSource) parcel.readParcelable(Content.class.getClassLoader()), (CreditAutopaySourceConfig) parcel.readParcelable(Content.class.getClassLoader()), (wi0.b) parcel.readSerializable(), (g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(CreditCardAutopayConfig autopayConfig, xi0.b currency, long j2, CreditCardAutopayType creditCardAutopayType, CreditCardAutopayPayment.PaymentAmount paymentAmount, CreditCardAutopayPayment.PaymentDay paymentDay, List autopaySources, RepaymentSource repaymentSource, CreditAutopaySourceConfig autopaySourcesConfig, wi0.b countryCode, g gVar) {
            Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(autopaySources, "autopaySources");
            Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
            Intrinsics.checkNotNullParameter(autopaySourcesConfig, "autopaySourcesConfig");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69074a = autopayConfig;
            this.f69075b = currency;
            this.f69076c = j2;
            this.d = creditCardAutopayType;
            this.e = paymentAmount;
            this.f = paymentDay;
            this.f69077g = autopaySources;
            this.f69078h = repaymentSource;
            this.i = autopaySourcesConfig;
            this.f69079j = countryCode;
            this.k = gVar;
        }

        public static Content a(Content content, CreditCardAutopayType creditCardAutopayType, CreditCardAutopayPayment.PaymentAmount paymentAmount, CreditCardAutopayPayment.PaymentDay paymentDay, RepaymentSource repaymentSource, g gVar, int i) {
            CreditCardAutopayConfig autopayConfig = content.f69074a;
            xi0.b currency = content.f69075b;
            long j2 = content.f69076c;
            if ((i & 8) != 0) {
                creditCardAutopayType = content.d;
            }
            CreditCardAutopayType creditCardAutopayType2 = creditCardAutopayType;
            CreditCardAutopayPayment.PaymentAmount paymentAmount2 = (i & 16) != 0 ? content.e : paymentAmount;
            CreditCardAutopayPayment.PaymentDay paymentDay2 = (i & 32) != 0 ? content.f : paymentDay;
            List autopaySources = content.f69077g;
            RepaymentSource repaymentSource2 = (i & 128) != 0 ? content.f69078h : repaymentSource;
            CreditAutopaySourceConfig autopaySourcesConfig = content.i;
            wi0.b countryCode = content.f69079j;
            g gVar2 = (i & 1024) != 0 ? content.k : gVar;
            content.getClass();
            Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(autopaySources, "autopaySources");
            Intrinsics.checkNotNullParameter(repaymentSource2, "repaymentSource");
            Intrinsics.checkNotNullParameter(autopaySourcesConfig, "autopaySourcesConfig");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new Content(autopayConfig, currency, j2, creditCardAutopayType2, paymentAmount2, paymentDay2, autopaySources, repaymentSource2, autopaySourcesConfig, countryCode, gVar2);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State
        public final Content W7() {
            return this;
        }

        public final CreditCardAutopayType.RevolutPocket b() {
            CreditCardAutopayType creditCardAutopayType = this.d;
            if (creditCardAutopayType instanceof CreditCardAutopayType.RevolutPocket) {
                return (CreditCardAutopayType.RevolutPocket) creditCardAutopayType;
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f69074a, content.f69074a) && Intrinsics.f(this.f69075b, content.f69075b) && this.f69076c == content.f69076c && Intrinsics.f(this.d, content.d) && Intrinsics.f(this.e, content.e) && Intrinsics.f(this.f, content.f) && Intrinsics.f(this.f69077g, content.f69077g) && Intrinsics.f(this.f69078h, content.f69078h) && Intrinsics.f(this.i, content.i) && Intrinsics.f(this.f69079j, content.f69079j) && Intrinsics.f(this.k, content.k);
        }

        public final int hashCode() {
            int iC = d.c(l.j(this.f69075b, this.f69074a.hashCode() * 31, 31), 31, this.f69076c);
            CreditCardAutopayType creditCardAutopayType = this.d;
            int iHashCode = (iC + (creditCardAutopayType == null ? 0 : creditCardAutopayType.hashCode())) * 31;
            CreditCardAutopayPayment.PaymentAmount paymentAmount = this.e;
            int iHashCode2 = (iHashCode + (paymentAmount == null ? 0 : paymentAmount.hashCode())) * 31;
            CreditCardAutopayPayment.PaymentDay paymentDay = this.f;
            int iC2 = p.a.c((this.i.hashCode() + ((this.f69078h.hashCode() + p.a.d((iHashCode2 + (paymentDay == null ? 0 : paymentDay.hashCode())) * 31, 31, this.f69077g)) * 31)) * 31, 31, this.f69079j.f297794a);
            g gVar = this.k;
            return iC2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69074a, i);
            dest.writeSerializable(this.f69075b);
            dest.writeLong(this.f69076c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            Iterator itV = p.a.v(this.f69077g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f69078h, i);
            dest.writeParcelable(this.i, i);
            dest.writeSerializable(this.f69079j);
            dest.writeSerializable(this.k);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State$Loading;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$State;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements CreditCardSetupAutopayFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f69080a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f69080a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State
        public final Content W7() {
            throw new IllegalStateException("Check failed.");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    Content W7();
}
