package com.revolut.feature.credit.application.plugins.impl.ui.debts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pu3.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "DebtsHub", "AddOtherDebt", "AddDebt", "DebtDetails", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$AddDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$AddOtherDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$DebtDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$Intro;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OutstandingDebtsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$AddDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddDebt extends OutstandingDebtsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f67414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f67415b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddDebt(d.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddDebt[i];
            }
        }

        public AddDebt(d debtType, xi0.b currency) {
            Intrinsics.checkNotNullParameter(debtType, "debtType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f67414a = debtType;
            this.f67415b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddDebt)) {
                return false;
            }
            AddDebt addDebt = (AddDebt) obj2;
            return this.f67414a == addDebt.f67414a && Intrinsics.f(this.f67415b, addDebt.f67415b);
        }

        public final int hashCode() {
            return this.f67415b.hashCode() + (this.f67414a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67414a.name());
            dest.writeSerializable(this.f67415b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$AddOtherDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddOtherDebt extends OutstandingDebtsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddOtherDebt f67416a = new AddOtherDebt();

        @NotNull
        public static final Parcelable.Creator<AddOtherDebt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddOtherDebt.f67416a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddOtherDebt[i];
            }
        }

        private AddOtherDebt() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$DebtDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebtDetails extends OutstandingDebtsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DebtDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pu3.b f67417a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebtDetails((pu3.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtDetails[i];
            }
        }

        public DebtDetails(pu3.b debt) {
            Intrinsics.checkNotNullParameter(debt, "debt");
            this.f67417a = debt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DebtDetails) && Intrinsics.f(this.f67417a, ((DebtDetails) obj2).f67417a);
        }

        public final int hashCode() {
            return this.f67417a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67417a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebtsHub extends OutstandingDebtsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DebtsHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f67418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f67419b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebtsHub((xi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtsHub[i];
            }
        }

        public DebtsHub(xi0.b currency, boolean z) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f67418a = z;
            this.f67419b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DebtsHub)) {
                return false;
            }
            DebtsHub debtsHub = (DebtsHub) obj2;
            return this.f67418a == debtsHub.f67418a && Intrinsics.f(this.f67419b, debtsHub.f67419b);
        }

        public final int hashCode() {
            return this.f67419b.hashCode() + (Boolean.hashCode(this.f67418a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f67418a ? 1 : 0);
            dest.writeSerializable(this.f67419b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends OutstandingDebtsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f67420a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f67420a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    private OutstandingDebtsFlowContract$Step() {
    }
}
