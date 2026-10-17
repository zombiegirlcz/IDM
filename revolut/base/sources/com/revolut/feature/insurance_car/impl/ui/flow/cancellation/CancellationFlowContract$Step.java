package com.revolut.feature.insurance_car.impl.ui.flow.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.QuestionnaireAnswer;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CancellationConformation", "CancellationFeedback", "CancellationRefund", "DocumentsList", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationConformation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationFeedback;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationRefund;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$DocumentsList;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CancellationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationConformation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancellationConformation extends CancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationConformation f75339a = new CancellationConformation();

        @NotNull
        public static final Parcelable.Creator<CancellationConformation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancellationConformation.f75339a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationConformation[i];
            }
        }

        private CancellationConformation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationFeedback;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancellationFeedback extends CancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationFeedback f75340a = new CancellationFeedback();

        @NotNull
        public static final Parcelable.Creator<CancellationFeedback> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancellationFeedback.f75340a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationFeedback[i];
            }
        }

        private CancellationFeedback() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$CancellationRefund;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationRefund extends CancellationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f75341a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(QuestionnaireAnswer.CREATOR, parcel, arrayList, iA, 1);
                }
                return new CancellationRefund(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationRefund[i];
            }
        }

        public CancellationRefund(ArrayList answers) {
            Intrinsics.checkNotNullParameter(answers, "answers");
            this.f75341a = answers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationRefund) && this.f75341a.equals(((CancellationRefund) obj2).f75341a);
        }

        public final int hashCode() {
            return this.f75341a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f75341a, dest);
            while (itY.hasNext()) {
                ((QuestionnaireAnswer) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step$DocumentsList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsList extends CancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsList f75342a = new DocumentsList();

        @NotNull
        public static final Parcelable.Creator<DocumentsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsList.f75342a;
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

    private CancellationFlowContract$Step() {
    }
}
