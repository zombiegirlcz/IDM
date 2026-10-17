package com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import hs3.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Rejected", "Bureaus", "RejectedDetails", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$Bureaus;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$Rejected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$RejectedDetails;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RejectedLazyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$Bureaus;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bureaus extends RejectedLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Bureaus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f68305a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bureaus((m1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bureaus[i];
            }
        }

        public Bureaus(m1 rejectionData) {
            Intrinsics.checkNotNullParameter(rejectionData, "rejectionData");
            this.f68305a = rejectionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bureaus) && Intrinsics.f(this.f68305a, ((Bureaus) obj2).f68305a);
        }

        public final int hashCode() {
            return this.f68305a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68305a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$Rejected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected extends RejectedLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Rejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f68306a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rejected((m1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rejected[i];
            }
        }

        public Rejected(m1 rejectionData) {
            Intrinsics.checkNotNullParameter(rejectionData, "rejectionData");
            this.f68306a = rejectionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Rejected) && Intrinsics.f(this.f68306a, ((Rejected) obj2).f68306a);
        }

        public final int hashCode() {
            return this.f68306a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68306a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step$RejectedDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedLazyFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RejectedDetails extends RejectedLazyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RejectedDetails f68307a = new RejectedDetails();

        @NotNull
        public static final Parcelable.Creator<RejectedDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RejectedDetails.f68307a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectedDetails[i];
            }
        }

        private RejectedDetails() {
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

    private RejectedLazyFlowContract$Step() {
    }
}
