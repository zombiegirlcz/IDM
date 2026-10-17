package com.revolut.feature.credit.card.impl.ui.statement_financing.setup;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel", "Landroid/os/Parcelable;", "AmountToFinance", "DownPayment", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel$AmountToFinance;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel$DownPayment;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel$AmountToFinance;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountToFinance implements CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountToFinance f69769a = new AmountToFinance();

        @NotNull
        public static final Parcelable.Creator<AmountToFinance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountToFinance.f69769a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountToFinance[i];
            }
        }

        private AmountToFinance() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel$DownPayment;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownPayment implements CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel {

        @NotNull
        public static final Parcelable.Creator<DownPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69770a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DownPayment((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownPayment[i];
            }
        }

        public DownPayment(d minimumDownPayment) {
            Intrinsics.checkNotNullParameter(minimumDownPayment, "minimumDownPayment");
            this.f69770a = minimumDownPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DownPayment) && Intrinsics.f(this.f69770a, ((DownPayment) obj2).f69770a);
        }

        public final int hashCode() {
            return this.f69770a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69770a);
        }
    }
}
