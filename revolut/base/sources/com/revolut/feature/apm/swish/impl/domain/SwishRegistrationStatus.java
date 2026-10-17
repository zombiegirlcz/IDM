package com.revolut.feature.apm.swish.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "Landroid/os/Parcelable;", "Registered", "Pending", "PendingUserAction", "NotRegistered", "RemediationRequired", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$PendingUserAction;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$Registered;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$RemediationRequired;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SwishRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements SwishRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62903c;
        public final String d;
        public final ApmOnboardingConflict e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotRegistered(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ApmOnboardingConflict) parcel.readParcelable(NotRegistered.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(String name, String phone, String accountNumber, String termsUri, ApmOnboardingConflict apmOnboardingConflict) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(termsUri, "termsUri");
            this.f62901a = name;
            this.f62902b = phone;
            this.f62903c = accountNumber;
            this.d = termsUri;
            this.e = apmOnboardingConflict;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotRegistered)) {
                return false;
            }
            NotRegistered notRegistered = (NotRegistered) obj2;
            return Intrinsics.f(this.f62901a, notRegistered.f62901a) && Intrinsics.f(this.f62902b, notRegistered.f62902b) && Intrinsics.f(this.f62903c, notRegistered.f62903c) && Intrinsics.f(this.d, notRegistered.d) && Intrinsics.f(this.e, notRegistered.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f62901a.hashCode() * 31, 31, this.f62902b), 31, this.f62903c), 31, this.d);
            ApmOnboardingConflict apmOnboardingConflict = this.e;
            return iC + (apmOnboardingConflict == null ? 0 : apmOnboardingConflict.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62901a);
            dest.writeString(this.f62902b);
            dest.writeString(this.f62903c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "<init>", "()V", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements SwishRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f62904a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f62904a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$PendingUserAction;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "<init>", "()V", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingUserAction implements SwishRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingUserAction f62905a = new PendingUserAction();

        @NotNull
        public static final Parcelable.Creator<PendingUserAction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingUserAction.f62905a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingUserAction[i];
            }
        }

        private PendingUserAction() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$Registered;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registered implements SwishRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<Registered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AreaContent f62906a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registered(AreaContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registered[i];
            }
        }

        public Registered(AreaContent areaContent) {
            Intrinsics.checkNotNullParameter(areaContent, "areaContent");
            this.f62906a = areaContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registered) && Intrinsics.f(this.f62906a, ((Registered) obj2).f62906a);
        }

        public final int hashCode() {
            return this.f62906a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62906a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus$RemediationRequired;", "Lcom/revolut/feature/apm/swish/impl/domain/SwishRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemediationRequired implements SwishRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<RemediationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62907a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemediationRequired(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemediationRequired[i];
            }
        }

        public RemediationRequired(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f62907a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemediationRequired) && Intrinsics.f(this.f62907a, ((RemediationRequired) obj2).f62907a);
        }

        public final int hashCode() {
            return this.f62907a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62907a);
        }
    }
}
