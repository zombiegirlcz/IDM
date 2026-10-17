package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.BenefitCategory;
import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kl7.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CarSelector", "AddressPicker", "Licence", "Mileage", "Employment", "CurrentInsurance", "Claims", "Penalties", "AdditionalDriver", "DateSelector", "Eligibility", "PlanOptions", "ProofOfDrivingNumber", "RenewalPlanSelector", "PlanSelector", "EditApplication", "Reservation", "BenefitList", "DocumentList", "OptOutRenewalFeedback", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$AdditionalDriver;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$AddressPicker;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$BenefitList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$CarSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Claims;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$CurrentInsurance;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$DateSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$DocumentList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$EditApplication;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Eligibility;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Employment;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Licence;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Mileage;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$OptOutRenewalFeedback;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Penalties;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$PlanOptions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$PlanSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$ProofOfDrivingNumber;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$RenewalPlanSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Reservation;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CarOnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$AdditionalDriver;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalDriver extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalDriver> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f75405a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver.CREATOR, parcel, arrayList, iA, 1);
                }
                return new AdditionalDriver(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalDriver[i];
            }
        }

        public AdditionalDriver(List drivers) {
            Intrinsics.checkNotNullParameter(drivers, "drivers");
            this.f75405a = drivers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalDriver) && Intrinsics.f(this.f75405a, ((AdditionalDriver) obj2).f75405a);
        }

        public final int hashCode() {
            return this.f75405a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f75405a, dest);
            while (itV.hasNext()) {
                ((com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$AddressPicker;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressPicker extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressPicker f75406a = new AddressPicker();

        @NotNull
        public static final Parcelable.Creator<AddressPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressPicker.f75406a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressPicker[i];
            }
        }

        private AddressPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$BenefitList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BenefitList extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BenefitList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f75407a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(BenefitCategory.CREATOR, parcel, arrayList, iA, 1);
                }
                return new BenefitList(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BenefitList[i];
            }
        }

        public BenefitList(ArrayList benefits) {
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.f75407a = benefits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BenefitList) && this.f75407a.equals(((BenefitList) obj2).f75407a);
        }

        public final int hashCode() {
            return this.f75407a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f75407a, dest);
            while (itY.hasNext()) {
                ((BenefitCategory) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$CarSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CarSelector extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CarSelector f75408a = new CarSelector();

        @NotNull
        public static final Parcelable.Creator<CarSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CarSelector.f75408a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarSelector[i];
            }
        }

        private CarSelector() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Claims;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Claims extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Claims f75409a = new Claims();

        @NotNull
        public static final Parcelable.Creator<Claims> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Claims.f75409a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Claims[i];
            }
        }

        private Claims() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$CurrentInsurance;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentInsurance extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrentInsurance f75410a = new CurrentInsurance();

        @NotNull
        public static final Parcelable.Creator<CurrentInsurance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrentInsurance.f75410a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentInsurance[i];
            }
        }

        private CurrentInsurance() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$DateSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DateSelector extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateSelector f75411a = new DateSelector();

        @NotNull
        public static final Parcelable.Creator<DateSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DateSelector.f75411a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateSelector[i];
            }
        }

        private DateSelector() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$DocumentList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentList extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f75412a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DocumentList.class, parcel, arrayList, iE, 1);
                }
                return new DocumentList(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentList[i];
            }
        }

        public DocumentList(ArrayList documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f75412a = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentList) && this.f75412a.equals(((DocumentList) obj2).f75412a);
        }

        public final int hashCode() {
            return this.f75412a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f75412a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$EditApplication;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditApplication extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditApplication f75413a = new EditApplication();

        @NotNull
        public static final Parcelable.Creator<EditApplication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditApplication.f75413a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditApplication[i];
            }
        }

        private EditApplication() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Eligibility;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Eligibility extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Eligibility> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f75414a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Eligibility(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eligibility[i];
            }
        }

        public Eligibility(boolean z) {
            this.f75414a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Eligibility) && this.f75414a == ((Eligibility) obj2).f75414a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75414a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f75414a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Employment;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Employment extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Employment f75415a = new Employment();

        @NotNull
        public static final Parcelable.Creator<Employment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Employment.f75415a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Employment[i];
            }
        }

        private Employment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Licence;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Licence extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Licence f75416a = new Licence();

        @NotNull
        public static final Parcelable.Creator<Licence> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Licence.f75416a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Licence[i];
            }
        }

        private Licence() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Mileage;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Mileage extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Mileage f75417a = new Mileage();

        @NotNull
        public static final Parcelable.Creator<Mileage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Mileage.f75417a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mileage[i];
            }
        }

        private Mileage() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$OptOutRenewalFeedback;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptOutRenewalFeedback extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OptOutRenewalFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75418a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptOutRenewalFeedback(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptOutRenewalFeedback[i];
            }
        }

        public OptOutRenewalFeedback(String policyId) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f75418a = policyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptOutRenewalFeedback) && Intrinsics.f(this.f75418a, ((OptOutRenewalFeedback) obj2).f75418a);
        }

        public final int hashCode() {
            return this.f75418a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75418a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Penalties;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Penalties extends CarOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Penalties f75419a = new Penalties();

        @NotNull
        public static final Parcelable.Creator<Penalties> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Penalties.f75419a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Penalties[i];
            }
        }

        private Penalties() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$PlanOptions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanOptions extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f1 f75421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75422c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanOptions(parcel.readString(), f1.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanOptions[i];
            }
        }

        public PlanOptions(String applicationFormId, f1 paymentFrequency, String planId, boolean z) {
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f75420a = applicationFormId;
            this.f75421b = paymentFrequency;
            this.f75422c = planId;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanOptions)) {
                return false;
            }
            PlanOptions planOptions = (PlanOptions) obj2;
            return Intrinsics.f(this.f75420a, planOptions.f75420a) && this.f75421b == planOptions.f75421b && Intrinsics.f(this.f75422c, planOptions.f75422c) && this.d == planOptions.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + p.a.c((this.f75421b.hashCode() + (this.f75420a.hashCode() * 31)) * 31, 31, this.f75422c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75420a);
            dest.writeString(this.f75421b.name());
            dest.writeString(this.f75422c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$PlanSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelector extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75425c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelector(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelector[i];
            }
        }

        public PlanSelector(String applicationFormId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            this.f75423a = applicationFormId;
            this.f75424b = z;
            this.f75425c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSelector)) {
                return false;
            }
            PlanSelector planSelector = (PlanSelector) obj2;
            return Intrinsics.f(this.f75423a, planSelector.f75423a) && this.f75424b == planSelector.f75424b && this.f75425c == planSelector.f75425c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75425c) + j6.a.c(this.f75423a.hashCode() * 31, 31, this.f75424b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75423a);
            dest.writeInt(this.f75424b ? 1 : 0);
            dest.writeInt(this.f75425c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$ProofOfDrivingNumber;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProofOfDrivingNumber extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProofOfDrivingNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f75427b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(OptionValue.CREATOR.createFromParcel(parcel));
                }
                return new ProofOfDrivingNumber(string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProofOfDrivingNumber[i];
            }
        }

        public ProofOfDrivingNumber(String applicationFormId, Set selectedOptions) {
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
            this.f75426a = applicationFormId;
            this.f75427b = selectedOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProofOfDrivingNumber)) {
                return false;
            }
            ProofOfDrivingNumber proofOfDrivingNumber = (ProofOfDrivingNumber) obj2;
            return Intrinsics.f(this.f75426a, proofOfDrivingNumber.f75426a) && Intrinsics.f(this.f75427b, proofOfDrivingNumber.f75427b);
        }

        public final int hashCode() {
            return this.f75427b.hashCode() + (this.f75426a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75426a);
            Iterator itV = n.v(this.f75427b, dest);
            while (itV.hasNext()) {
                ((OptionValue) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$RenewalPlanSelector;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenewalPlanSelector extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RenewalPlanSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75428a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenewalPlanSelector(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenewalPlanSelector[i];
            }
        }

        public RenewalPlanSelector(String policyId) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f75428a = policyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RenewalPlanSelector) && Intrinsics.f(this.f75428a, ((RenewalPlanSelector) obj2).f75428a);
        }

        public final int hashCode() {
            return this.f75428a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75428a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step$Reservation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reservation extends CarOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Reservation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75429a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reservation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reservation[i];
            }
        }

        public Reservation(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f75429a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Reservation) && Intrinsics.f(this.f75429a, ((Reservation) obj2).f75429a);
        }

        public final int hashCode() {
            return this.f75429a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75429a);
        }
    }

    private CarOnboardingFlowContract$Step() {
    }
}
