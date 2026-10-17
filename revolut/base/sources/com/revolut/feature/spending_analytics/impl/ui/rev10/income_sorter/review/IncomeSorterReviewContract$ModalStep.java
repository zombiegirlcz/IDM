package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExecuteSorter", "ActiveSorterConflict", "CryptoLearnMoreDialog", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$ActiveSorterConflict;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$CryptoLearnMoreDialog;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$ExecuteSorter;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterReviewContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$ActiveSorterConflict;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveSorterConflict implements IncomeSorterReviewContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ActiveSorterConflict> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f87840c;
        public final IncomeSorterDestinationId d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ActiveSorterConflict.class, parcel, arrayList, iE, 1);
                }
                return new ActiveSorterConflict(string, string2, arrayList, (IncomeSorterDestinationId) parcel.readParcelable(ActiveSorterConflict.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveSorterConflict[i];
            }
        }

        public ActiveSorterConflict(String walletId, String baseTransactionId, ArrayList destinations, IncomeSorterDestinationId remainingBalanceDestinationId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(baseTransactionId, "baseTransactionId");
            Intrinsics.checkNotNullParameter(destinations, "destinations");
            Intrinsics.checkNotNullParameter(remainingBalanceDestinationId, "remainingBalanceDestinationId");
            this.f87838a = walletId;
            this.f87839b = baseTransactionId;
            this.f87840c = destinations;
            this.d = remainingBalanceDestinationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActiveSorterConflict)) {
                return false;
            }
            ActiveSorterConflict activeSorterConflict = (ActiveSorterConflict) obj2;
            return Intrinsics.f(this.f87838a, activeSorterConflict.f87838a) && Intrinsics.f(this.f87839b, activeSorterConflict.f87839b) && this.f87840c.equals(activeSorterConflict.f87840c) && Intrinsics.f(this.d, activeSorterConflict.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f87840c, p.a.c(this.f87838a.hashCode() * 31, 31, this.f87839b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87838a);
            dest.writeString(this.f87839b);
            Iterator itY = j6.a.y(this.f87840c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$CryptoLearnMoreDialog;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoLearnMoreDialog implements IncomeSorterReviewContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoLearnMoreDialog f87841a = new CryptoLearnMoreDialog();

        @NotNull
        public static final Parcelable.Creator<CryptoLearnMoreDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoLearnMoreDialog.f87841a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoLearnMoreDialog[i];
            }
        }

        private CryptoLearnMoreDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep$ExecuteSorter;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExecuteSorter implements IncomeSorterReviewContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExecuteSorter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IncomeSorterDetailsDiff f87844c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExecuteSorter(parcel.readString(), parcel.readString(), IncomeSorterDetailsDiff.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExecuteSorter[i];
            }
        }

        public ExecuteSorter(String walletId, String executionId, IncomeSorterDetailsDiff incomeSorterDiff) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(executionId, "executionId");
            Intrinsics.checkNotNullParameter(incomeSorterDiff, "incomeSorterDiff");
            this.f87842a = walletId;
            this.f87843b = executionId;
            this.f87844c = incomeSorterDiff;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExecuteSorter)) {
                return false;
            }
            ExecuteSorter executeSorter = (ExecuteSorter) obj2;
            return Intrinsics.f(this.f87842a, executeSorter.f87842a) && Intrinsics.f(this.f87843b, executeSorter.f87843b) && Intrinsics.f(this.f87844c, executeSorter.f87844c);
        }

        public final int hashCode() {
            return this.f87844c.hashCode() + p.a.c(this.f87842a.hashCode() * 31, 31, this.f87843b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87842a);
            dest.writeString(this.f87843b);
            this.f87844c.writeToParcel(dest, i);
        }
    }
}
