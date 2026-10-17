package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectAccount", "WaitForCoBorrowerExplainer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep$SelectAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep$WaitForCoBorrowerExplainer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SepaDirectDebitSetUpContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep$SelectAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectAccount extends SepaDirectDebitSetUpContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectAccount f68365a = new SelectAccount();

        @NotNull
        public static final Parcelable.Creator<SelectAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectAccount.f68365a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAccount[i];
            }
        }

        private SelectAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep$WaitForCoBorrowerExplainer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForCoBorrowerExplainer extends SepaDirectDebitSetUpContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WaitForCoBorrowerExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dz3.a f68366a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitForCoBorrowerExplainer((dz3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitForCoBorrowerExplainer[i];
            }
        }

        public WaitForCoBorrowerExplainer(dz3.a popup) {
            Intrinsics.checkNotNullParameter(popup, "popup");
            this.f68366a = popup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WaitForCoBorrowerExplainer) && Intrinsics.f(this.f68366a, ((WaitForCoBorrowerExplainer) obj2).f68366a);
        }

        public final int hashCode() {
            return this.f68366a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68366a);
        }
    }

    private SepaDirectDebitSetUpContract$ModalStep() {
    }
}
