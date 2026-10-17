package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import android.os.Parcel;
import android.os.Parcelable;
import aqd.i0;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode", "Landroid/os/Parcelable;", "Create", "Update", "Activate", "ManualExecution", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Activate;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$ManualExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Update;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterReviewContract$ReviewMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Activate;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Activate implements IncomeSorterReviewContract$ReviewMode {

        @NotNull
        public static final Parcelable.Creator<Activate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IncomeSorterDetailsDiff f87847c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Activate(parcel.readString(), parcel.readString(), IncomeSorterDetailsDiff.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activate[i];
            }
        }

        public Activate(String walletId, String incomeSorterId, IncomeSorterDetailsDiff incomeSorterDiff) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
            Intrinsics.checkNotNullParameter(incomeSorterDiff, "incomeSorterDiff");
            this.f87845a = walletId;
            this.f87846b = incomeSorterId;
            this.f87847c = incomeSorterDiff;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Activate)) {
                return false;
            }
            Activate activate = (Activate) obj2;
            return Intrinsics.f(this.f87845a, activate.f87845a) && Intrinsics.f(this.f87846b, activate.f87846b) && Intrinsics.f(this.f87847c, activate.f87847c);
        }

        public final int hashCode() {
            return this.f87847c.hashCode() + p.a.c(this.f87845a.hashCode() * 31, 31, this.f87846b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87845a);
            dest.writeString(this.f87846b);
            this.f87847c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements IncomeSorterReviewContract$ReviewMode {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f87850c;
        public final IncomeSorterDestinationId d;
        public final i0 e;
        public final boolean f;

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
                    iE = j6.a.e(Create.class, parcel, arrayList, iE, 1);
                }
                return new Create(string, string2, arrayList, (IncomeSorterDestinationId) parcel.readParcelable(Create.class.getClassLoader()), i0.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(String walletId, String baseTransactionId, ArrayList destinations, IncomeSorterDestinationId remainingBalanceDestinationId, i0 sortMethod, boolean z) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(baseTransactionId, "baseTransactionId");
            Intrinsics.checkNotNullParameter(destinations, "destinations");
            Intrinsics.checkNotNullParameter(remainingBalanceDestinationId, "remainingBalanceDestinationId");
            Intrinsics.checkNotNullParameter(sortMethod, "sortMethod");
            this.f87848a = walletId;
            this.f87849b = baseTransactionId;
            this.f87850c = destinations;
            this.d = remainingBalanceDestinationId;
            this.e = sortMethod;
            this.f = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Create)) {
                return false;
            }
            Create create = (Create) obj2;
            return Intrinsics.f(this.f87848a, create.f87848a) && Intrinsics.f(this.f87849b, create.f87849b) && this.f87850c.equals(create.f87850c) && Intrinsics.f(this.d, create.d) && this.e == create.e && this.f == create.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f87850c, p.a.c(this.f87848a.hashCode() * 31, 31, this.f87849b), 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87848a);
            dest.writeString(this.f87849b);
            Iterator itY = j6.a.y(this.f87850c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$ManualExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualExecution implements IncomeSorterReviewContract$ReviewMode {

        @NotNull
        public static final Parcelable.Creator<ManualExecution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87853c;
        public final IncomeSorterDetailsDiff d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualExecution(parcel.readString(), parcel.readString(), parcel.readString(), IncomeSorterDetailsDiff.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualExecution[i];
            }
        }

        public ManualExecution(String walletId, String incomeSorterId, String executionId, IncomeSorterDetailsDiff incomeSorterDiff) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
            Intrinsics.checkNotNullParameter(executionId, "executionId");
            Intrinsics.checkNotNullParameter(incomeSorterDiff, "incomeSorterDiff");
            this.f87851a = walletId;
            this.f87852b = incomeSorterId;
            this.f87853c = executionId;
            this.d = incomeSorterDiff;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManualExecution)) {
                return false;
            }
            ManualExecution manualExecution = (ManualExecution) obj2;
            return Intrinsics.f(this.f87851a, manualExecution.f87851a) && Intrinsics.f(this.f87852b, manualExecution.f87852b) && Intrinsics.f(this.f87853c, manualExecution.f87853c) && Intrinsics.f(this.d, manualExecution.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f87851a.hashCode() * 31, 31, this.f87852b), 31, this.f87853c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87851a);
            dest.writeString(this.f87852b);
            dest.writeString(this.f87853c);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode$Update;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/review/IncomeSorterReviewContract$ReviewMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update implements IncomeSorterReviewContract$ReviewMode {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IncomeSorterDetailsDiff f87856c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Update(parcel.readString(), parcel.readString(), IncomeSorterDetailsDiff.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Update[i];
            }
        }

        public Update(String walletId, String incomeSorterId, IncomeSorterDetailsDiff incomeSorterDiff) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
            Intrinsics.checkNotNullParameter(incomeSorterDiff, "incomeSorterDiff");
            this.f87854a = walletId;
            this.f87855b = incomeSorterId;
            this.f87856c = incomeSorterDiff;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Update)) {
                return false;
            }
            Update update = (Update) obj2;
            return Intrinsics.f(this.f87854a, update.f87854a) && Intrinsics.f(this.f87855b, update.f87855b) && Intrinsics.f(this.f87856c, update.f87856c);
        }

        public final int hashCode() {
            return this.f87856c.hashCode() + p.a.c(this.f87854a.hashCode() * 31, 31, this.f87855b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87854a);
            dest.writeString(this.f87855b);
            this.f87856c.writeToParcel(dest, i);
        }
    }
}
