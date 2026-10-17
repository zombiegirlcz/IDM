package com.revolut.feature.insurance.impl.ui.cfac.claim;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CancellationReasonGroup", "ExactCancellationReason", "OtherReason", "CoverageInfo", "SupportingDocuments", "SelectExpenses", "ManageExpenses", "ReviewClaimDetails", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$CancellationReasonGroup;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$CoverageInfo;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ExactCancellationReason;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ManageExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$OtherReason;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ReviewClaimDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$SelectExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$SupportingDocuments;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACInsuranceClaimFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$CancellationReasonGroup;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationReasonGroup extends CFACInsuranceClaimFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationReasonGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f75050a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CancellationReasonGroup.class, parcel, arrayList, iE, 1);
                }
                return new CancellationReasonGroup(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationReasonGroup[i];
            }
        }

        public CancellationReasonGroup(ArrayList reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            this.f75050a = reasons;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationReasonGroup) && this.f75050a.equals(((CancellationReasonGroup) obj2).f75050a);
        }

        public final int hashCode() {
            return this.f75050a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f75050a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$CoverageInfo;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CoverageInfo extends CFACInsuranceClaimFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CoverageInfo f75051a = new CoverageInfo();

        @NotNull
        public static final Parcelable.Creator<CoverageInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CoverageInfo.f75051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageInfo[i];
            }
        }

        private CoverageInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ExactCancellationReason;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExactCancellationReason extends CFACInsuranceClaimFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExactCancellationReason> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACCancellationReason f75052a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExactCancellationReason((CFACCancellationReason) parcel.readParcelable(ExactCancellationReason.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExactCancellationReason[i];
            }
        }

        public ExactCancellationReason(CFACCancellationReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f75052a = reason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExactCancellationReason) && Intrinsics.f(this.f75052a, ((ExactCancellationReason) obj2).f75052a);
        }

        public final int hashCode() {
            return this.f75052a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75052a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ManageExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageExpenses extends CFACInsuranceClaimFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageExpenses f75053a = new ManageExpenses();

        @NotNull
        public static final Parcelable.Creator<ManageExpenses> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageExpenses.f75053a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageExpenses[i];
            }
        }

        private ManageExpenses() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$OtherReason;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OtherReason extends CFACInsuranceClaimFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OtherReason f75054a = new OtherReason();

        @NotNull
        public static final Parcelable.Creator<OtherReason> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OtherReason.f75054a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherReason[i];
            }
        }

        private OtherReason() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$ReviewClaimDetails;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReviewClaimDetails extends CFACInsuranceClaimFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReviewClaimDetails f75055a = new ReviewClaimDetails();

        @NotNull
        public static final Parcelable.Creator<ReviewClaimDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReviewClaimDetails.f75055a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewClaimDetails[i];
            }
        }

        private ReviewClaimDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$SupportingDocuments;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SupportingDocuments extends CFACInsuranceClaimFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SupportingDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f75057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f75059c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iC = 0;
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new SupportingDocuments(arrayList, z, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SupportingDocuments[i];
            }
        }

        public SupportingDocuments() {
            this(7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SupportingDocuments)) {
                return false;
            }
            SupportingDocuments supportingDocuments = (SupportingDocuments) obj2;
            return this.f75057a == supportingDocuments.f75057a && this.f75058b == supportingDocuments.f75058b && Intrinsics.f(this.f75059c, supportingDocuments.f75059c);
        }

        public final int hashCode() {
            return this.f75059c.hashCode() + j6.a.c(Boolean.hashCode(this.f75057a) * 31, 31, this.f75058b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f75057a ? 1 : 0);
            dest.writeInt(this.f75058b ? 1 : 0);
            Iterator itV = p.a.v(this.f75059c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }

        public SupportingDocuments(List claimedDocuments, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(claimedDocuments, "claimedDocuments");
            this.f75057a = z;
            this.f75058b = z3;
            this.f75059c = claimedDocuments;
        }

        public SupportingDocuments(int i) {
            this(f0.f322471a, (i & 1) != 0, false);
        }
    }

    private CFACInsuranceClaimFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step$SelectExpenses;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectExpenses extends CFACInsuranceClaimFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectExpenses> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f75056a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectExpenses(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectExpenses[i];
            }
        }

        public SelectExpenses(boolean z) {
            this.f75056a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectExpenses) && this.f75056a == ((SelectExpenses) obj2).f75056a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75056a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f75056a ? 1 : 0);
        }

        public SelectExpenses() {
            this(false);
        }
    }
}
