package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IncludedCountries", "RevPointsBottomSheet", "PlanFeatureInfoBottomSheet", "MobilePlanSummary", "AbroadWarning", "ChooseCoverage", "PlanDurationPicker", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$AbroadWarning;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$ChooseCoverage;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$IncludedCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$MobilePlanSummary;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$PlanDurationPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$PlanFeatureInfoBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$RevPointsBottomSheet;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimGetPlanScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$AbroadWarning;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AbroadWarning implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AbroadWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimDataPlan f100996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f100997b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AbroadWarning((EsimDataPlan) parcel.readParcelable(AbroadWarning.class.getClassLoader()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AbroadWarning[i];
            }
        }

        public AbroadWarning(EsimDataPlan selectedPlan, wi0.b abroadWarningCountry) {
            Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
            Intrinsics.checkNotNullParameter(abroadWarningCountry, "abroadWarningCountry");
            this.f100996a = selectedPlan;
            this.f100997b = abroadWarningCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AbroadWarning)) {
                return false;
            }
            AbroadWarning abroadWarning = (AbroadWarning) obj2;
            return Intrinsics.f(this.f100996a, abroadWarning.f100996a) && Intrinsics.f(this.f100997b, abroadWarning.f100997b);
        }

        public final int hashCode() {
            return this.f100997b.f297794a.hashCode() + (this.f100996a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100996a, i);
            dest.writeSerializable(this.f100997b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$ChooseCoverage;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCoverage implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChooseCoverage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimGetPlanScreenContract$DomainState.CoverageOptions f100998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChooseCoverage(EsimGetPlanScreenContract$DomainState.CoverageOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCoverage[i];
            }
        }

        public ChooseCoverage(EsimGetPlanScreenContract$DomainState.CoverageOptions coverageOptions) {
            Intrinsics.checkNotNullParameter(coverageOptions, "coverageOptions");
            this.f100998a = coverageOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChooseCoverage) && Intrinsics.f(this.f100998a, ((ChooseCoverage) obj2).f100998a);
        }

        public final int hashCode() {
            return this.f100998a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100998a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$IncludedCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncludedCountries implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<IncludedCountries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimCoverage f100999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101000b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncludedCountries((EsimCoverage) parcel.readParcelable(IncludedCountries.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncludedCountries[i];
            }
        }

        public IncludedCountries(EsimCoverage coverage, boolean z) {
            Intrinsics.checkNotNullParameter(coverage, "coverage");
            this.f100999a = coverage;
            this.f101000b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncludedCountries)) {
                return false;
            }
            IncludedCountries includedCountries = (IncludedCountries) obj2;
            return Intrinsics.f(this.f100999a, includedCountries.f100999a) && this.f101000b == includedCountries.f101000b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101000b) + (this.f100999a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100999a, i);
            dest.writeInt(this.f101000b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$MobilePlanSummary;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanSummary implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MobilePlanSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimDataPlan f101001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimGiftRecipient f101002b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanSummary((EsimDataPlan) parcel.readParcelable(MobilePlanSummary.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(MobilePlanSummary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanSummary[i];
            }
        }

        public MobilePlanSummary(EsimDataPlan mobilePlan, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
            this.f101001a = mobilePlan;
            this.f101002b = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanSummary)) {
                return false;
            }
            MobilePlanSummary mobilePlanSummary = (MobilePlanSummary) obj2;
            return Intrinsics.f(this.f101001a, mobilePlanSummary.f101001a) && Intrinsics.f(this.f101002b, mobilePlanSummary.f101002b);
        }

        public final int hashCode() {
            int iHashCode = this.f101001a.hashCode() * 31;
            EsimGiftRecipient esimGiftRecipient = this.f101002b;
            return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101001a, i);
            dest.writeParcelable(this.f101002b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$PlanDurationPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDurationPicker implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanDurationPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f101003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101004b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PlanDurationPicker.class, parcel, arrayList, iE, 1);
                }
                return new PlanDurationPicker(parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDurationPicker[i];
            }
        }

        public PlanDurationPicker(String str, ArrayList plans) {
            Intrinsics.checkNotNullParameter(plans, "plans");
            this.f101003a = plans;
            this.f101004b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanDurationPicker)) {
                return false;
            }
            PlanDurationPicker planDurationPicker = (PlanDurationPicker) obj2;
            return this.f101003a.equals(planDurationPicker.f101003a) && Intrinsics.f(this.f101004b, planDurationPicker.f101004b);
        }

        public final int hashCode() {
            int iHashCode = this.f101003a.hashCode() * 31;
            String str = this.f101004b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f101003a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.f101004b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$PlanFeatureInfoBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanFeatureInfoBottomSheet implements EsimGetPlanScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanFeatureInfoBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimInfoBottomSheetData f101005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimIcon f101006b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanFeatureInfoBottomSheet((EsimIcon) parcel.readParcelable(PlanFeatureInfoBottomSheet.class.getClassLoader()), (EsimInfoBottomSheetData) parcel.readParcelable(PlanFeatureInfoBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanFeatureInfoBottomSheet[i];
            }
        }

        public PlanFeatureInfoBottomSheet(EsimIcon esimIcon, EsimInfoBottomSheetData details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f101005a = details;
            this.f101006b = esimIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanFeatureInfoBottomSheet)) {
                return false;
            }
            PlanFeatureInfoBottomSheet planFeatureInfoBottomSheet = (PlanFeatureInfoBottomSheet) obj2;
            return Intrinsics.f(this.f101005a, planFeatureInfoBottomSheet.f101005a) && Intrinsics.f(this.f101006b, planFeatureInfoBottomSheet.f101006b);
        }

        public final int hashCode() {
            int iHashCode = this.f101005a.hashCode() * 31;
            EsimIcon esimIcon = this.f101006b;
            return iHashCode + (esimIcon == null ? 0 : esimIcon.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101005a, i);
            dest.writeParcelable(this.f101006b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/get_plan/EsimGetPlanScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet implements EsimGetPlanScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f101007a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f101007a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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
}
