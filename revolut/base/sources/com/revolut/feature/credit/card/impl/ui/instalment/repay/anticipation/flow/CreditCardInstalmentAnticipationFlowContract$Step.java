package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectQuote", "Confirm", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step$SelectQuote;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardInstalmentAnticipationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirm extends CreditCardInstalmentAnticipationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardInstalmentAnticipationQuote f69452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f69453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f69454c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirm((CreditCardInstalmentAnticipationQuote) parcel.readParcelable(Confirm.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirm[i];
            }
        }

        public Confirm(CreditCardInstalmentAnticipationQuote quote, LocalDate currentCycleDueDate, LocalDate lastInstalmentOldDueDate) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
            Intrinsics.checkNotNullParameter(lastInstalmentOldDueDate, "lastInstalmentOldDueDate");
            this.f69452a = quote;
            this.f69453b = currentCycleDueDate;
            this.f69454c = lastInstalmentOldDueDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) obj2;
            return Intrinsics.f(this.f69452a, confirm.f69452a) && Intrinsics.f(this.f69453b, confirm.f69453b) && Intrinsics.f(this.f69454c, confirm.f69454c);
        }

        public final int hashCode() {
            return this.f69454c.hashCode() + y.a(this.f69452a.hashCode() * 31, 31, this.f69453b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69452a, i);
            dest.writeSerializable(this.f69453b);
            dest.writeSerializable(this.f69454c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step$SelectQuote;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectQuote extends CreditCardInstalmentAnticipationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectQuote f69455a = new SelectQuote();

        @NotNull
        public static final Parcelable.Creator<SelectQuote> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectQuote.f69455a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectQuote[i];
            }
        }

        private SelectQuote() {
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

    private CreditCardInstalmentAnticipationFlowContract$Step() {
    }
}
