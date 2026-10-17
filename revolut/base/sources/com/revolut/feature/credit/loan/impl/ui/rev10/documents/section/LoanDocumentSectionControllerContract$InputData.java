package com.revolut.feature.credit.loan.impl.ui.rev10.documents.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/documents/section/LoanDocumentSectionControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "PaymentReceipts", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/section/LoanDocumentSectionControllerContract$InputData$PaymentReceipts;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanDocumentSectionControllerContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/section/LoanDocumentSectionControllerContract$InputData$PaymentReceipts;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/section/LoanDocumentSectionControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentReceipts extends LoanDocumentSectionControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PaymentReceipts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f70421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f70422b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(PaymentReceipts.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(PaymentReceipts.class, parcel, arrayList2, iE, 1);
                }
                return new PaymentReceipts(arrayList2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentReceipts[i];
            }
        }

        public PaymentReceipts(ArrayList partialDocuments, List fullDocuments) {
            Intrinsics.checkNotNullParameter(fullDocuments, "fullDocuments");
            Intrinsics.checkNotNullParameter(partialDocuments, "partialDocuments");
            this.f70421a = fullDocuments;
            this.f70422b = partialDocuments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentReceipts)) {
                return false;
            }
            PaymentReceipts paymentReceipts = (PaymentReceipts) obj2;
            return Intrinsics.f(this.f70421a, paymentReceipts.f70421a) && this.f70422b.equals(paymentReceipts.f70422b);
        }

        public final int hashCode() {
            return this.f70422b.hashCode() + (this.f70421a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f70421a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itY = j6.a.y(this.f70422b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private LoanDocumentSectionControllerContract$InputData() {
    }
}
