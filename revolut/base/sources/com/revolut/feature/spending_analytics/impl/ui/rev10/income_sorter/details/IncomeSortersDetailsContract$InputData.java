package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.IncomeSorterCreationScenario;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSortersDetailsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeSortersDetailsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f87742a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode;", "Landroid/os/Parcelable;", "Create", "Update", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode$Update;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Create implements Mode {

            @NotNull
            public static final Parcelable.Creator<Create> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final IncomeSorterCreationScenario f87744b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Create(parcel.readString(), (IncomeSorterCreationScenario) parcel.readParcelable(Create.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Create[i];
                }
            }

            public Create(String transactionId, IncomeSorterCreationScenario scenario) {
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(scenario, "scenario");
                this.f87743a = transactionId;
                this.f87744b = scenario;
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
                return Intrinsics.f(this.f87743a, create.f87743a) && Intrinsics.f(this.f87744b, create.f87744b);
            }

            public final int hashCode() {
                return this.f87744b.hashCode() + (this.f87743a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87743a);
                dest.writeParcelable(this.f87744b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode$Update;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Update implements Mode {

            @NotNull
            public static final Parcelable.Creator<Update> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87745a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Update(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Update[i];
                }
            }

            public Update(String incomeSorterId) {
                Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
                this.f87745a = incomeSorterId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Update) && Intrinsics.f(this.f87745a, ((Update) obj2).f87745a);
            }

            public final int hashCode() {
                return this.f87745a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87745a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSortersDetailsContract$InputData((Mode) parcel.readParcelable(IncomeSortersDetailsContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSortersDetailsContract$InputData[i];
        }
    }

    public IncomeSortersDetailsContract$InputData(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f87742a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IncomeSortersDetailsContract$InputData) && Intrinsics.f(this.f87742a, ((IncomeSortersDetailsContract$InputData) obj2).f87742a);
    }

    public final int hashCode() {
        return this.f87742a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87742a, i);
    }
}
