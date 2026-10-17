package com.revolut.feature.junior_profile.impl.ui.flow.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Details", "UpdateMail", "UpdateGender", "UpdatePersonalDataManagementConsent", "Workflow", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdateGender;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdateMail;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdatePersonalDataManagementConsent;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$Workflow;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorProfileDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$Details;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step;", "<init>", "()V", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details implements JuniorProfileDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f77133a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f77133a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdateGender;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step;", "<init>", "()V", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateGender implements JuniorProfileDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateGender f77134a = new UpdateGender();

        @NotNull
        public static final Parcelable.Creator<UpdateGender> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateGender.f77134a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateGender[i];
            }
        }

        private UpdateGender() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdateMail;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step;", "<init>", "()V", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateMail implements JuniorProfileDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateMail f77135a = new UpdateMail();

        @NotNull
        public static final Parcelable.Creator<UpdateMail> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateMail.f77135a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateMail[i];
            }
        }

        private UpdateMail() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$UpdatePersonalDataManagementConsent;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdatePersonalDataManagementConsent implements JuniorProfileDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpdatePersonalDataManagementConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77136a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdatePersonalDataManagementConsent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatePersonalDataManagementConsent[i];
            }
        }

        public UpdatePersonalDataManagementConsent(String consentId) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f77136a = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdatePersonalDataManagementConsent) && Intrinsics.f(this.f77136a, ((UpdatePersonalDataManagementConsent) obj2).f77136a);
        }

        public final int hashCode() {
            return this.f77136a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77136a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step$Workflow;", "Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements JuniorProfileDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77137a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f77137a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f77137a, ((Workflow) obj2).f77137a);
        }

        public final int hashCode() {
            return this.f77137a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77137a);
        }
    }
}
