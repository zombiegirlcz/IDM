package com.revolut.feature.apm.bizum.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Confirmation", "Terms", "Remediation", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Remediation;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Terms;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BizumRegistrationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step;", "<init>", "()V", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Confirmation implements BizumRegistrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirmation f61582a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f61582a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        private Confirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step;", "<init>", "()V", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro implements BizumRegistrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f61583a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f61583a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Remediation;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remediation implements BizumRegistrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Remediation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61584a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remediation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remediation[i];
            }
        }

        public Remediation(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f61584a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Remediation) && Intrinsics.f(this.f61584a, ((Remediation) obj2).f61584a);
        }

        public final int hashCode() {
            return this.f61584a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61584a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step$Terms;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$Step;", "<init>", "()V", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terms implements BizumRegistrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terms f61585a = new Terms();

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Terms.f61585a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        private Terms() {
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
}
