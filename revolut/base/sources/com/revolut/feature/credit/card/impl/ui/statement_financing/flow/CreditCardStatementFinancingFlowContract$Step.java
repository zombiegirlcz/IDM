package com.revolut.feature.credit.card.impl.ui.statement_financing.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Setup", "Confirm", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step$Setup;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardStatementFinancingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirm extends CreditCardStatementFinancingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardStatementDeferralQuote f69765a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirm((CreditCardStatementDeferralQuote) parcel.readParcelable(Confirm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirm[i];
            }
        }

        public Confirm(CreditCardStatementDeferralQuote quote) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.f69765a = quote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirm) && Intrinsics.f(this.f69765a, ((Confirm) obj2).f69765a);
        }

        public final int hashCode() {
            return this.f69765a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69765a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step$Setup;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Setup extends CreditCardStatementFinancingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Setup f69766a = new Setup();

        @NotNull
        public static final Parcelable.Creator<Setup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Setup.f69766a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setup[i];
            }
        }

        private Setup() {
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

    private CreditCardStatementFinancingFlowContract$Step() {
    }
}
