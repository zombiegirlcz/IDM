package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "InitialScreen", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitialScreen f87778a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "Landroid/os/Parcelable;", "IncomeSortersList", "IncomeSorterCreation", "SelectIncome", "IncomeSorterDetails", "IncomeSorterExecutionScreen", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterCreation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterExecutionScreen;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$SelectIncome;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InitialScreen extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterCreation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IncomeSorterCreation implements InitialScreen {

            @NotNull
            public static final Parcelable.Creator<IncomeSorterCreation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87779a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IncomeSorterCreation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IncomeSorterCreation[i];
                }
            }

            public IncomeSorterCreation(String transactionGroupId) {
                Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
                this.f87779a = transactionGroupId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof IncomeSorterCreation) && Intrinsics.f(this.f87779a, ((IncomeSorterCreation) obj2).f87779a);
            }

            public final int hashCode() {
                return this.f87779a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87779a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IncomeSorterDetails implements InitialScreen {

            @NotNull
            public static final Parcelable.Creator<IncomeSorterDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87780a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IncomeSorterDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IncomeSorterDetails[i];
                }
            }

            public IncomeSorterDetails(String incomeSorterId) {
                Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
                this.f87780a = incomeSorterId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof IncomeSorterDetails) && Intrinsics.f(this.f87780a, ((IncomeSorterDetails) obj2).f87780a);
            }

            public final int hashCode() {
                return this.f87780a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87780a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSorterExecutionScreen;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IncomeSorterExecutionScreen implements InitialScreen {

            @NotNull
            public static final Parcelable.Creator<IncomeSorterExecutionScreen> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87781a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IncomeSorterExecutionScreen(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IncomeSorterExecutionScreen[i];
                }
            }

            public IncomeSorterExecutionScreen(String executionId) {
                Intrinsics.checkNotNullParameter(executionId, "executionId");
                this.f87781a = executionId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof IncomeSorterExecutionScreen) && Intrinsics.f(this.f87781a, ((IncomeSorterExecutionScreen) obj2).f87781a);
            }

            public final int hashCode() {
                return this.f87781a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87781a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class IncomeSortersList implements InitialScreen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final IncomeSortersList f87782a = new IncomeSortersList();

            @NotNull
            public static final Parcelable.Creator<IncomeSortersList> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return IncomeSortersList.f87782a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IncomeSortersList[i];
                }
            }

            private IncomeSortersList() {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen$SelectIncome;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$InputData$InitialScreen;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectIncome implements InitialScreen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SelectIncome f87783a = new SelectIncome();

            @NotNull
            public static final Parcelable.Creator<SelectIncome> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SelectIncome.f87783a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SelectIncome[i];
                }
            }

            private SelectIncome() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof SelectIncome);
            }

            public final int hashCode() {
                return 1350178673;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterFlowContract$InputData((InitialScreen) parcel.readParcelable(IncomeSorterFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterFlowContract$InputData[i];
        }
    }

    public IncomeSorterFlowContract$InputData(InitialScreen initialScreen) {
        Intrinsics.checkNotNullParameter(initialScreen, "initialScreen");
        this.f87778a = initialScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IncomeSorterFlowContract$InputData) && Intrinsics.f(this.f87778a, ((IncomeSorterFlowContract$InputData) obj2).f87778a);
    }

    public final int hashCode() {
        return this.f87778a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87778a, i);
    }
}
