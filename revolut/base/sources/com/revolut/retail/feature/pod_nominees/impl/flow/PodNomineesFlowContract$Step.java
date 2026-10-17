package com.revolut.retail.feature.pod_nominees.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PodNomineesList", "PodNomineeDetails", "EditPodNominee", "AddPodNominee", "EditPercentage", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$AddPodNominee;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$EditPercentage;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$EditPodNominee;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$PodNomineeDetails;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$PodNomineesList;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PodNomineesFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$AddPodNominee;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddPodNominee extends PodNomineesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddPodNominee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102608a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddPodNominee(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddPodNominee[i];
            }
        }

        public AddPodNominee(boolean z) {
            this.f102608a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddPodNominee) && this.f102608a == ((AddPodNominee) obj2).f102608a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102608a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102608a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$EditPercentage;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step;", "<init>", "()V", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditPercentage extends PodNomineesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditPercentage f102609a = new EditPercentage();

        @NotNull
        public static final Parcelable.Creator<EditPercentage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditPercentage.f102609a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPercentage[i];
            }
        }

        private EditPercentage() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$EditPodNominee;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPodNominee extends PodNomineesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditPodNominee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PodNominee f102610a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPodNominee(PodNominee.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPodNominee[i];
            }
        }

        public EditPodNominee(PodNominee podNominee) {
            Intrinsics.checkNotNullParameter(podNominee, "podNominee");
            this.f102610a = podNominee;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditPodNominee) && Intrinsics.f(this.f102610a, ((EditPodNominee) obj2).f102610a);
        }

        public final int hashCode() {
            return this.f102610a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102610a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$PodNomineeDetails;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodNomineeDetails extends PodNomineesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PodNomineeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102611a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PodNomineeDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodNomineeDetails[i];
            }
        }

        public PodNomineeDetails(String podNomineeId) {
            Intrinsics.checkNotNullParameter(podNomineeId, "podNomineeId");
            this.f102611a = podNomineeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PodNomineeDetails) && Intrinsics.f(this.f102611a, ((PodNomineeDetails) obj2).f102611a);
        }

        public final int hashCode() {
            return this.f102611a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102611a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step$PodNomineesList;", "Lcom/revolut/retail/feature/pod_nominees/impl/flow/PodNomineesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodNomineesList extends PodNomineesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PodNomineesList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102612a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PodNomineesList(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodNomineesList[i];
            }
        }

        public PodNomineesList(boolean z) {
            this.f102612a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PodNomineesList) && this.f102612a == ((PodNomineesList) obj2).f102612a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102612a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102612a ? 1 : 0);
        }
    }

    private PodNomineesFlowContract$Step() {
    }
}
