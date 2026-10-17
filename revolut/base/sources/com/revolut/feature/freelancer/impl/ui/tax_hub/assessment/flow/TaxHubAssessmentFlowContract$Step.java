package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ds6.j;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MakePayment", "TaxAssessment", "TransactionExport", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$MakePayment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$TaxAssessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$TransactionExport;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubAssessmentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$MakePayment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakePayment implements TaxHubAssessmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MakePayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f74251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74253c;
        public final j d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MakePayment((wi0.b) parcel.readSerializable(), parcel.readString(), parcel.readString(), j.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakePayment[i];
            }
        }

        public MakePayment(wi0.b countryCode, String taxCalendarEventId, String taxCalendarEventStepId, j taxType, boolean z) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
            Intrinsics.checkNotNullParameter(taxCalendarEventStepId, "taxCalendarEventStepId");
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f74251a = countryCode;
            this.f74252b = taxCalendarEventId;
            this.f74253c = taxCalendarEventStepId;
            this.d = taxType;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MakePayment)) {
                return false;
            }
            MakePayment makePayment = (MakePayment) obj2;
            return Intrinsics.f(this.f74251a, makePayment.f74251a) && Intrinsics.f(this.f74252b, makePayment.f74252b) && Intrinsics.f(this.f74253c, makePayment.f74253c) && this.d == makePayment.d && this.e == makePayment.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + p.a.c(p.a.c(this.f74251a.f297794a.hashCode() * 31, 31, this.f74252b), 31, this.f74253c)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74251a);
            dest.writeString(this.f74252b);
            dest.writeString(this.f74253c);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$TaxAssessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxAssessment implements TaxHubAssessmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxAssessment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f74255b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxAssessment(j.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxAssessment[i];
            }
        }

        public TaxAssessment(j taxType, String taxCalendarEventId) {
            Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f74254a = taxCalendarEventId;
            this.f74255b = taxType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxAssessment)) {
                return false;
            }
            TaxAssessment taxAssessment = (TaxAssessment) obj2;
            return Intrinsics.f(this.f74254a, taxAssessment.f74254a) && this.f74255b == taxAssessment.f74255b;
        }

        public final int hashCode() {
            return this.f74255b.hashCode() + (this.f74254a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74254a);
            dest.writeString(this.f74255b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step$TransactionExport;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/flow/TaxHubAssessmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionExport implements TaxHubAssessmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionExport> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f74256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74258c;
        public final String d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionExport((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionExport[i];
            }
        }

        public TransactionExport(LocalDate localDate, LocalDate localDate2, String taxCalendarEventId, String taxCalendarEventStepId, boolean z) {
            Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
            Intrinsics.checkNotNullParameter(taxCalendarEventStepId, "taxCalendarEventStepId");
            this.f74256a = localDate;
            this.f74257b = localDate2;
            this.f74258c = taxCalendarEventId;
            this.d = taxCalendarEventStepId;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionExport)) {
                return false;
            }
            TransactionExport transactionExport = (TransactionExport) obj2;
            return Intrinsics.f(this.f74256a, transactionExport.f74256a) && Intrinsics.f(this.f74257b, transactionExport.f74257b) && Intrinsics.f(this.f74258c, transactionExport.f74258c) && Intrinsics.f(this.d, transactionExport.d) && this.e == transactionExport.e;
        }

        public final int hashCode() {
            LocalDate localDate = this.f74256a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f74257b;
            return Boolean.hashCode(this.e) + p.a.c(p.a.c((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.f74258c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74256a);
            dest.writeSerializable(this.f74257b);
            dest.writeString(this.f74258c);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }
    }
}
