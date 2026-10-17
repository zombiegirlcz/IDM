package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pu3.d;
import qu3.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "DebtTypeSelector", "AddNewDebt", "UpdateDebt", "ShowInternalDebt", "AddOtherLiabilities", "DebtsHub", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$AddNewDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$AddOtherLiabilities;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$DebtTypeSelector;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$ShowInternalDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$UpdateDebt;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OutstandingDebtsV2FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$AddNewDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewDebt extends OutstandingDebtsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddNewDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f67455a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewDebt(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewDebt[i];
            }
        }

        public AddNewDebt(d debtType) {
            Intrinsics.checkNotNullParameter(debtType, "debtType");
            this.f67455a = debtType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNewDebt) && this.f67455a == ((AddNewDebt) obj2).f67455a;
        }

        public final int hashCode() {
            return this.f67455a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67455a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$AddOtherLiabilities;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddOtherLiabilities extends OutstandingDebtsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddOtherLiabilities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a94.b f67456a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddOtherLiabilities(a94.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddOtherLiabilities[i];
            }
        }

        public AddOtherLiabilities(a94.b selectedDebtType) {
            Intrinsics.checkNotNullParameter(selectedDebtType, "selectedDebtType");
            this.f67456a = selectedDebtType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddOtherLiabilities) && this.f67456a == ((AddOtherLiabilities) obj2).f67456a;
        }

        public final int hashCode() {
            return this.f67456a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67456a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$DebtTypeSelector;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DebtTypeSelector extends OutstandingDebtsV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DebtTypeSelector f67457a = new DebtTypeSelector();

        @NotNull
        public static final Parcelable.Creator<DebtTypeSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DebtTypeSelector.f67457a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtTypeSelector[i];
            }
        }

        private DebtTypeSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DebtsHub extends OutstandingDebtsV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DebtsHub f67458a = new DebtsHub();

        @NotNull
        public static final Parcelable.Creator<DebtsHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DebtsHub.f67458a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebtsHub[i];
            }
        }

        private DebtsHub() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends OutstandingDebtsV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f67459a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f67459a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$ShowInternalDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInternalDebt extends OutstandingDebtsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowInternalDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67460a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInternalDebt((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowInternalDebt[i];
            }
        }

        public ShowInternalDebt(e debt) {
            Intrinsics.checkNotNullParameter(debt, "debt");
            this.f67460a = debt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowInternalDebt) && Intrinsics.f(this.f67460a, ((ShowInternalDebt) obj2).f67460a);
        }

        public final int hashCode() {
            return this.f67460a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67460a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step$UpdateDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateDebt extends OutstandingDebtsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpdateDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateDebt((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateDebt[i];
            }
        }

        public UpdateDebt(e debt) {
            Intrinsics.checkNotNullParameter(debt, "debt");
            this.f67461a = debt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateDebt) && Intrinsics.f(this.f67461a, ((UpdateDebt) obj2).f67461a);
        }

        public final int hashCode() {
            return this.f67461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67461a);
        }
    }

    private OutstandingDebtsV2FlowContract$Step() {
    }
}
