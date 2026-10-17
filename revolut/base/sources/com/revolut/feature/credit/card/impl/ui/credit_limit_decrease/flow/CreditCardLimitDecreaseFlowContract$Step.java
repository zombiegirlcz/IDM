package com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Amount", "Ineligible", "Error", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Amount;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Ineligible;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardLimitDecreaseFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Amount;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends CreditCardLimitDecreaseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69198c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(d minCreditLimit, d maxCreditLimit, d nonSelectableMinCreditLimit) {
            Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
            Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
            Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
            this.f69196a = minCreditLimit;
            this.f69197b = maxCreditLimit;
            this.f69198c = nonSelectableMinCreditLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj2;
            return Intrinsics.f(this.f69196a, amount.f69196a) && Intrinsics.f(this.f69197b, amount.f69197b) && Intrinsics.f(this.f69198c, amount.f69198c);
        }

        public final int hashCode() {
            return this.f69198c.hashCode() + v7.c(this.f69196a.hashCode() * 31, 31, this.f69197b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69196a);
            dest.writeSerializable(this.f69197b);
            dest.writeSerializable(this.f69198c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error extends CreditCardLimitDecreaseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f69199a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f69199a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step$Ineligible;", "Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/flow/CreditCardLimitDecreaseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ineligible extends CreditCardLimitDecreaseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Ineligible> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kl4.a f69200a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ineligible(parcel.readInt() == 0 ? null : kl4.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ineligible[i];
            }
        }

        public Ineligible(kl4.a aVar) {
            this.f69200a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ineligible) && this.f69200a == ((Ineligible) obj2).f69200a;
        }

        public final int hashCode() {
            kl4.a aVar = this.f69200a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            kl4.a aVar = this.f69200a;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    private CreditCardLimitDecreaseFlowContract$Step() {
    }
}
