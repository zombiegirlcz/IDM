package com.revolut.feature.credit.card.impl.ui.statement_financing.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EditDownPayment", "Explainer", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep$EditDownPayment;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep$Explainer;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardStatementFinancingSetupScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep$EditDownPayment;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditDownPayment extends CreditCardStatementFinancingSetupScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditDownPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69773c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditDownPayment((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditDownPayment[i];
            }
        }

        public EditDownPayment(d downPayment, d minDownPayment, d maxDownPayment) {
            Intrinsics.checkNotNullParameter(downPayment, "downPayment");
            Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
            Intrinsics.checkNotNullParameter(maxDownPayment, "maxDownPayment");
            this.f69771a = downPayment;
            this.f69772b = minDownPayment;
            this.f69773c = maxDownPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditDownPayment)) {
                return false;
            }
            EditDownPayment editDownPayment = (EditDownPayment) obj2;
            return Intrinsics.f(this.f69771a, editDownPayment.f69771a) && Intrinsics.f(this.f69772b, editDownPayment.f69772b) && Intrinsics.f(this.f69773c, editDownPayment.f69773c);
        }

        public final int hashCode() {
            return this.f69773c.hashCode() + v7.c(this.f69771a.hashCode() * 31, 31, this.f69772b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69771a);
            dest.writeSerializable(this.f69772b);
            dest.writeSerializable(this.f69773c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep$Explainer;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explainer extends CreditCardStatementFinancingSetupScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Explainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel f69774a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Explainer((CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel) parcel.readParcelable(Explainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explainer[i];
            }
        }

        public Explainer(CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f69774a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Explainer) && Intrinsics.f(this.f69774a, ((Explainer) obj2).f69774a);
        }

        public final int hashCode() {
            return this.f69774a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69774a, i);
        }
    }

    private CreditCardStatementFinancingSetupScreenContract$ModalStep() {
    }
}
