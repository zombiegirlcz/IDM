package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sy3.e;
import sy3.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "Intro", "Details", "Changes", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Changes;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Intro;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FinancialSituationConfirmationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Changes;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Changes implements FinancialSituationConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Changes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67754a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Changes((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Changes[i];
            }
        }

        public Changes(e config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67754a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Changes) && Intrinsics.f(this.f67754a, ((Changes) obj2).f67754a);
        }

        public final int hashCode() {
            return this.f67754a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67754a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements FinancialSituationConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f67755a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details((f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(f detailsConfig) {
            Intrinsics.checkNotNullParameter(detailsConfig, "detailsConfig");
            this.f67755a = detailsConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f67755a, ((Details) obj2).f67755a);
        }

        public final int hashCode() {
            return this.f67755a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67755a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements FinancialSituationConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f67756a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f67756a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/FinancialSituationConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements FinancialSituationConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67757a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(e config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67757a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67757a, ((Intro) obj2).f67757a);
        }

        public final int hashCode() {
            return this.f67757a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67757a);
        }
    }
}
