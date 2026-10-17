package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaContent;
import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant;
import com.revolut.feature.insurance_car.impl.data.model.TodoItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kl7.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PolicySummary", "PolicyDetails", "DocumentsList", "Claims", "UploadDocuments", "Delivery", "TelematicsDeviceDelivery", "ActivateTelematicsDevice", "TelematicsDeviceUnplugged", "SmartDriving", "ManagePolicy", "PolicyCancellation", "MidTermAdjustment", "MtaReview", "RenewPolicy", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$ActivateTelematicsDevice;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$Claims;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$Delivery;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$DocumentsList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$ManagePolicy;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$MidTermAdjustment;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$MtaReview;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicyCancellation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicyDetails;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicySummary;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$RenewPolicy;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$SmartDriving;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$TelematicsDeviceDelivery;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$TelematicsDeviceUnplugged;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$UploadDocuments;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CarPolicyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$Claims;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Claims extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Claims f75472a = new Claims();

        @NotNull
        public static final Parcelable.Creator<Claims> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Claims.f75472a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$Delivery;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Delivery extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Delivery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f75473a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Delivery(g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Delivery[i];
            }
        }

        public Delivery(g documentType) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f75473a = documentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Delivery) && this.f75473a == ((Delivery) obj2).f75473a;
        }

        public final int hashCode() {
            return this.f75473a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75473a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$DocumentsList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsList extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsList f75474a = new DocumentsList();

        @NotNull
        public static final Parcelable.Creator<DocumentsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsList.f75474a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsList[i];
            }
        }

        private DocumentsList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$ManagePolicy;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManagePolicy extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManagePolicy f75475a = new ManagePolicy();

        @NotNull
        public static final Parcelable.Creator<ManagePolicy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManagePolicy.f75475a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManagePolicy[i];
            }
        }

        private ManagePolicy() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$MidTermAdjustment;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MidTermAdjustment extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MidTermAdjustment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MtaFlowVariant f75476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MtaAvailabilityContainer f75477b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MidTermAdjustment((MtaFlowVariant) parcel.readParcelable(MidTermAdjustment.class.getClassLoader()), MtaAvailabilityContainer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MidTermAdjustment[i];
            }
        }

        public MidTermAdjustment(MtaFlowVariant variant, MtaAvailabilityContainer mtaAvailability) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
            this.f75476a = variant;
            this.f75477b = mtaAvailability;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MidTermAdjustment)) {
                return false;
            }
            MidTermAdjustment midTermAdjustment = (MidTermAdjustment) obj2;
            return Intrinsics.f(this.f75476a, midTermAdjustment.f75476a) && Intrinsics.f(this.f75477b, midTermAdjustment.f75477b);
        }

        public final int hashCode() {
            return this.f75477b.hashCode() + (this.f75476a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75476a, i);
            this.f75477b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$MtaReview;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MtaReview extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MtaReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MtaContent f75478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MtaCreateResult f75479b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MtaReview(MtaContent.CREATOR.createFromParcel(parcel), (MtaCreateResult) parcel.readParcelable(MtaReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MtaReview[i];
            }
        }

        public MtaReview(MtaContent mtaContent, MtaCreateResult mtaCreateResult) {
            Intrinsics.checkNotNullParameter(mtaContent, "mtaContent");
            Intrinsics.checkNotNullParameter(mtaCreateResult, "mtaCreateResult");
            this.f75478a = mtaContent;
            this.f75479b = mtaCreateResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MtaReview)) {
                return false;
            }
            MtaReview mtaReview = (MtaReview) obj2;
            return Intrinsics.f(this.f75478a, mtaReview.f75478a) && Intrinsics.f(this.f75479b, mtaReview.f75479b);
        }

        public final int hashCode() {
            return this.f75479b.hashCode() + (this.f75478a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75478a.writeToParcel(dest, i);
            dest.writeParcelable(this.f75479b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicyCancellation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PolicyCancellation extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PolicyCancellation f75480a = new PolicyCancellation();

        @NotNull
        public static final Parcelable.Creator<PolicyCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PolicyCancellation.f75480a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PolicyCancellation[i];
            }
        }

        private PolicyCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicyDetails;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PolicyDetails extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PolicyDetails f75481a = new PolicyDetails();

        @NotNull
        public static final Parcelable.Creator<PolicyDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PolicyDetails.f75481a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PolicyDetails[i];
            }
        }

        private PolicyDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$PolicySummary;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PolicySummary extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PolicySummary f75482a = new PolicySummary();

        @NotNull
        public static final Parcelable.Creator<PolicySummary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PolicySummary.f75482a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PolicySummary[i];
            }
        }

        private PolicySummary() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$RenewPolicy;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenewPolicy extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RenewPolicy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApplicationForm f75483a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenewPolicy(ApplicationForm.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenewPolicy[i];
            }
        }

        public RenewPolicy(ApplicationForm applicationForm) {
            Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
            this.f75483a = applicationForm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RenewPolicy) && Intrinsics.f(this.f75483a, ((RenewPolicy) obj2).f75483a);
        }

        public final int hashCode() {
            return this.f75483a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75483a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$SmartDriving;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SmartDriving extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SmartDriving f75484a = new SmartDriving();

        @NotNull
        public static final Parcelable.Creator<SmartDriving> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SmartDriving.f75484a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartDriving[i];
            }
        }

        private SmartDriving() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$TelematicsDeviceDelivery;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TelematicsDeviceDelivery extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TelematicsDeviceDelivery f75485a = new TelematicsDeviceDelivery();

        @NotNull
        public static final Parcelable.Creator<TelematicsDeviceDelivery> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TelematicsDeviceDelivery.f75485a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TelematicsDeviceDelivery[i];
            }
        }

        private TelematicsDeviceDelivery() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$TelematicsDeviceUnplugged;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TelematicsDeviceUnplugged extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TelematicsDeviceUnplugged> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TodoItem f75486a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TelematicsDeviceUnplugged(TodoItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TelematicsDeviceUnplugged[i];
            }
        }

        public TelematicsDeviceUnplugged(TodoItem todoItem) {
            Intrinsics.checkNotNullParameter(todoItem, "todoItem");
            this.f75486a = todoItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TelematicsDeviceUnplugged) && Intrinsics.f(this.f75486a, ((TelematicsDeviceUnplugged) obj2).f75486a);
        }

        public final int hashCode() {
            return this.f75486a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75486a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$UploadDocuments;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UploadDocuments extends CarPolicyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UploadDocuments f75487a = new UploadDocuments();

        @NotNull
        public static final Parcelable.Creator<UploadDocuments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UploadDocuments.f75487a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UploadDocuments[i];
            }
        }

        private UploadDocuments() {
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

    private CarPolicyFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step$ActivateTelematicsDevice;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivateTelematicsDevice extends CarPolicyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ActivateTelematicsDevice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f75471a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivateTelematicsDevice((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivateTelematicsDevice[i];
            }
        }

        public ActivateTelematicsDevice(LocalDate localDate) {
            this.f75471a = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActivateTelematicsDevice) && Intrinsics.f(this.f75471a, ((ActivateTelematicsDevice) obj2).f75471a);
        }

        public final int hashCode() {
            LocalDate localDate = this.f75471a;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f75471a);
        }

        public ActivateTelematicsDevice() {
            this(null);
        }
    }
}
