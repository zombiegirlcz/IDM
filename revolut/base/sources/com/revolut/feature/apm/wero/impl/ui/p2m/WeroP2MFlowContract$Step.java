package com.revolut.feature.apm.wero.impl.ui.p2m;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Pending", "Registration", "Pay", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Pay;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Pending;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Registration;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroP2MFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro implements WeroP2MFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f63071a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f63071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Pay;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pay implements WeroP2MFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeroNavigation$StartType.Pay f63072a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pay((WeroNavigation$StartType.Pay) parcel.readParcelable(Pay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pay[i];
            }
        }

        public Pay(WeroNavigation$StartType.Pay startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f63072a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pay) && Intrinsics.f(this.f63072a, ((Pay) obj2).f63072a);
        }

        public final int hashCode() {
            return this.f63072a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63072a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Pending;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending implements WeroP2MFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63073a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(String jobId) {
            Intrinsics.checkNotNullParameter(jobId, "jobId");
            this.f63073a = jobId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pending) && Intrinsics.f(this.f63073a, ((Pending) obj2).f63073a);
        }

        public final int hashCode() {
            return this.f63073a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63073a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step$Registration;", "Lcom/revolut/feature/apm/wero/impl/ui/p2m/WeroP2MFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registration implements WeroP2MFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeroRegistrationStatus.NotRegistered f63074a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registration(WeroRegistrationStatus.NotRegistered.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registration[i];
            }
        }

        public Registration(WeroRegistrationStatus.NotRegistered status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f63074a = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registration) && Intrinsics.f(this.f63074a, ((Registration) obj2).f63074a);
        }

        public final int hashCode() {
            return this.f63074a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f63074a.writeToParcel(dest, i);
        }
    }
}
