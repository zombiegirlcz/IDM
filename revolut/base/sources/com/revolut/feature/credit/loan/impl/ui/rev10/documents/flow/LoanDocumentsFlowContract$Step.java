package com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SectionsList", "SectionDocuments", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step$SectionDocuments;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step$SectionsList;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanDocumentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step$SectionDocuments;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionDocuments extends LoanDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SectionDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f70417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f70418b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(SectionDocuments.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(SectionDocuments.class, parcel, arrayList2, iE, 1);
                }
                return new SectionDocuments(arrayList2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionDocuments[i];
            }
        }

        public SectionDocuments(ArrayList partialDocuments, List fullDocuments) {
            Intrinsics.checkNotNullParameter(fullDocuments, "fullDocuments");
            Intrinsics.checkNotNullParameter(partialDocuments, "partialDocuments");
            this.f70417a = fullDocuments;
            this.f70418b = partialDocuments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SectionDocuments)) {
                return false;
            }
            SectionDocuments sectionDocuments = (SectionDocuments) obj2;
            return Intrinsics.f(this.f70417a, sectionDocuments.f70417a) && this.f70418b.equals(sectionDocuments.f70418b);
        }

        public final int hashCode() {
            return this.f70418b.hashCode() + (this.f70417a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f70417a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itY = j6.a.y(this.f70418b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step$SectionsList;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionsList extends LoanDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SectionsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70419a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionsList(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionsList[i];
            }
        }

        public SectionsList(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70419a = loanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SectionsList) && Intrinsics.f(this.f70419a, ((SectionsList) obj2).f70419a);
        }

        public final int hashCode() {
            return this.f70419a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70419a);
        }
    }

    private LoanDocumentsFlowContract$Step() {
    }
}
