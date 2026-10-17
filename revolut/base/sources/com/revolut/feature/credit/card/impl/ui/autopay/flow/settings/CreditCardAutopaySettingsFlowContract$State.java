package com.revolut.feature.credit.card.impl.ui.autopay.flow.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.credit_card.autopay.api.models_v3.c;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "RevolutAccount", "DirectDebit", "Loading", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$Loading;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$RevolutAccount;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopaySettingsFlowContract$State extends FlowState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebit implements CreditCardAutopaySettingsFlowContract$State {

        @NotNull
        public static final Parcelable.Creator<DirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardAutopayPayment.AutoPayment f69041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardAutopayConfig f69042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditCardAutopayPayment.BackupCard f69043c;
        public final CreditCardAutopayPayments d;
        public final CreditCardDirectDebitMandate e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebit((CreditCardAutopayPayment.AutoPayment) parcel.readParcelable(DirectDebit.class.getClassLoader()), (CreditCardAutopayConfig) parcel.readParcelable(DirectDebit.class.getClassLoader()), (CreditCardAutopayPayment.BackupCard) parcel.readParcelable(DirectDebit.class.getClassLoader()), (CreditCardAutopayPayments) parcel.readParcelable(DirectDebit.class.getClassLoader()), (CreditCardDirectDebitMandate) parcel.readParcelable(DirectDebit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebit[i];
            }
        }

        public DirectDebit(CreditCardAutopayPayment.AutoPayment payment, CreditCardAutopayConfig autopayConfig, CreditCardAutopayPayment.BackupCard backupCard, CreditCardAutopayPayments creditCardAutopayPayments, CreditCardDirectDebitMandate mandate) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
            Intrinsics.checkNotNullParameter(mandate, "mandate");
            this.f69041a = payment;
            this.f69042b = autopayConfig;
            this.f69043c = backupCard;
            this.d = creditCardAutopayPayments;
            this.e = mandate;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: C4, reason: from getter */
        public final CreditCardAutopayPayment.BackupCard getF69047c() {
            return this.f69043c;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: Q9, reason: from getter */
        public final CreditCardAutopayConfig getF69046b() {
            return this.f69042b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebit)) {
                return false;
            }
            DirectDebit directDebit = (DirectDebit) obj2;
            return Intrinsics.f(this.f69041a, directDebit.f69041a) && Intrinsics.f(this.f69042b, directDebit.f69042b) && Intrinsics.f(this.f69043c, directDebit.f69043c) && Intrinsics.f(this.d, directDebit.d) && Intrinsics.f(this.e, directDebit.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f69042b.hashCode() + (this.f69041a.hashCode() * 31)) * 31;
            CreditCardAutopayPayment.BackupCard backupCard = this.f69043c;
            int iHashCode2 = (iHashCode + (backupCard == null ? 0 : backupCard.hashCode())) * 31;
            CreditCardAutopayPayments creditCardAutopayPayments = this.d;
            return this.e.hashCode() + ((iHashCode2 + (creditCardAutopayPayments != null ? creditCardAutopayPayments.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: q3, reason: from getter */
        public final CreditCardAutopayPayment.AutoPayment getF69045a() {
            return this.f69041a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69041a, i);
            dest.writeParcelable(this.f69042b, i);
            dest.writeParcelable(this.f69043c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: z4, reason: from getter */
        public final CreditCardAutopayPayments getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$Loading;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements CreditCardAutopaySettingsFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f69044a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f69044a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: C4 */
        public final CreditCardAutopayPayment.BackupCard getF69047c() {
            return null;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: Q9 */
        public final CreditCardAutopayConfig getF69046b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: q3 */
        public final CreditCardAutopayPayment.AutoPayment getF69045a() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: z4 */
        public final CreditCardAutopayPayments getD() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State$RevolutAccount;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$State;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutAccount implements CreditCardAutopaySettingsFlowContract$State {

        @NotNull
        public static final Parcelable.Creator<RevolutAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardAutopayPayment.AutoPayment f69045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardAutopayConfig f69046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditCardAutopayPayment.BackupCard f69047c;
        public final CreditCardAutopayPayments d;
        public final List e;
        public final RepaymentSource f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditAutopaySourceConfig f69048g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                CreditCardAutopayPayment.AutoPayment autoPayment = (CreditCardAutopayPayment.AutoPayment) j6.a.f(parcel, "parcel", RevolutAccount.class);
                CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) parcel.readParcelable(RevolutAccount.class.getClassLoader());
                CreditCardAutopayPayment.BackupCard backupCard = (CreditCardAutopayPayment.BackupCard) parcel.readParcelable(RevolutAccount.class.getClassLoader());
                CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) parcel.readParcelable(RevolutAccount.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(RevolutAccount.class, parcel, arrayList, iE, 1);
                }
                return new RevolutAccount(autoPayment, creditCardAutopayConfig, backupCard, creditCardAutopayPayments, arrayList, (RepaymentSource) parcel.readParcelable(RevolutAccount.class.getClassLoader()), (CreditAutopaySourceConfig) parcel.readParcelable(RevolutAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccount[i];
            }
        }

        public RevolutAccount(CreditCardAutopayPayment.AutoPayment payment, CreditCardAutopayConfig autopayConfig, CreditCardAutopayPayment.BackupCard backupCard, CreditCardAutopayPayments payments, List revolutSources, RepaymentSource repaymentSource, CreditAutopaySourceConfig revolutSourcesConfig) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
            Intrinsics.checkNotNullParameter(payments, "payments");
            Intrinsics.checkNotNullParameter(revolutSources, "revolutSources");
            Intrinsics.checkNotNullParameter(revolutSourcesConfig, "revolutSourcesConfig");
            this.f69045a = payment;
            this.f69046b = autopayConfig;
            this.f69047c = backupCard;
            this.d = payments;
            this.e = revolutSources;
            this.f = repaymentSource;
            this.f69048g = revolutSourcesConfig;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: C4, reason: from getter */
        public final CreditCardAutopayPayment.BackupCard getF69047c() {
            return this.f69047c;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: Q9, reason: from getter */
        public final CreditCardAutopayConfig getF69046b() {
            return this.f69046b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutAccount)) {
                return false;
            }
            RevolutAccount revolutAccount = (RevolutAccount) obj2;
            return Intrinsics.f(this.f69045a, revolutAccount.f69045a) && Intrinsics.f(this.f69046b, revolutAccount.f69046b) && Intrinsics.f(this.f69047c, revolutAccount.f69047c) && Intrinsics.f(this.d, revolutAccount.d) && Intrinsics.f(this.e, revolutAccount.e) && Intrinsics.f(this.f, revolutAccount.f) && Intrinsics.f(this.f69048g, revolutAccount.f69048g);
        }

        public final int hashCode() {
            int iHashCode = (this.f69046b.hashCode() + (this.f69045a.hashCode() * 31)) * 31;
            CreditCardAutopayPayment.BackupCard backupCard = this.f69047c;
            int iD = p.a.d((this.d.hashCode() + ((iHashCode + (backupCard == null ? 0 : backupCard.hashCode())) * 31)) * 31, 31, this.e);
            RepaymentSource repaymentSource = this.f;
            return this.f69048g.hashCode() + ((iD + (repaymentSource != null ? repaymentSource.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: q3, reason: from getter */
        public final CreditCardAutopayPayment.AutoPayment getF69045a() {
            return this.f69045a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69045a, i);
            dest.writeParcelable(this.f69046b, i);
            dest.writeParcelable(this.f69047c, i);
            dest.writeParcelable(this.d, i);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f69048g, i);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State
        /* JADX INFO: renamed from: z4, reason: from getter */
        public final CreditCardAutopayPayments getD() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: C4 */
    CreditCardAutopayPayment.BackupCard getF69047c();

    /* JADX INFO: renamed from: Q9 */
    CreditCardAutopayConfig getF69046b();

    default c R4() {
        CreditCardAutopayPayment.AutoPayment f69045a = getF69045a();
        if (f69045a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new c(f69045a.f70704a, f69045a.f70705b, f69045a.f, f69045a.e, f69045a.f70706c, f69045a.d.f70719a, null);
    }

    /* JADX INFO: renamed from: q3 */
    CreditCardAutopayPayment.AutoPayment getF69045a();

    /* JADX INFO: renamed from: z4 */
    CreditCardAutopayPayments getD();
}
