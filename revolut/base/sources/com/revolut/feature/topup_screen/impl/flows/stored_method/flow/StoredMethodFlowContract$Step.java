package com.revolut.feature.topup_screen.impl.flows.stored_method.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StoredMethodDetails", "EditLabel", "UpdateMandateLimits", "CreateMandate", "RemoveMethodConfirmation", "LinkedRevokeConfirmation", "MandateRevokeConfirmation", "RemovalNotAllowed", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$EditLabel;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$LinkedRevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$MandateRevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$RemovalNotAllowed;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$RemoveMethodConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$StoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$UpdateMandateLimits;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoredMethodFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateMandate implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateMandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90777a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateMandate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateMandate[i];
            }
        }

        public CreateMandate(String institutionId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            this.f90777a = institutionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateMandate) && Intrinsics.f(this.f90777a, ((CreateMandate) obj2).f90777a);
        }

        public final int hashCode() {
            return this.f90777a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90777a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$EditLabel;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditLabel implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90780c;
        public final TopUpMethodsContext d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditLabel(parcel.readString(), parcel.readString(), parcel.readString(), (TopUpMethodsContext) parcel.readParcelable(EditLabel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditLabel[i];
            }
        }

        public EditLabel(String accountDetailsId, String originalAccountName, String customLabel, TopUpMethodsContext topUpMethodsContext) {
            Intrinsics.checkNotNullParameter(accountDetailsId, "accountDetailsId");
            Intrinsics.checkNotNullParameter(originalAccountName, "originalAccountName");
            Intrinsics.checkNotNullParameter(customLabel, "customLabel");
            this.f90778a = accountDetailsId;
            this.f90779b = originalAccountName;
            this.f90780c = customLabel;
            this.d = topUpMethodsContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditLabel)) {
                return false;
            }
            EditLabel editLabel = (EditLabel) obj2;
            return Intrinsics.f(this.f90778a, editLabel.f90778a) && Intrinsics.f(this.f90779b, editLabel.f90779b) && Intrinsics.f(this.f90780c, editLabel.f90780c) && Intrinsics.f(this.d, editLabel.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f90778a.hashCode() * 31, 31, this.f90779b), 31, this.f90780c);
            TopUpMethodsContext topUpMethodsContext = this.d;
            return iC + (topUpMethodsContext == null ? 0 : topUpMethodsContext.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90778a);
            dest.writeString(this.f90779b);
            dest.writeString(this.f90780c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$LinkedRevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedRevokeConfirmation implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedRevokeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90783c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedRevokeConfirmation(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedRevokeConfirmation[i];
            }
        }

        public LinkedRevokeConfirmation(String storedMethodAccountId, String issuerInstitutionId, String issuerInstitutionName) {
            Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
            Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
            Intrinsics.checkNotNullParameter(issuerInstitutionName, "issuerInstitutionName");
            this.f90781a = storedMethodAccountId;
            this.f90782b = issuerInstitutionId;
            this.f90783c = issuerInstitutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedRevokeConfirmation)) {
                return false;
            }
            LinkedRevokeConfirmation linkedRevokeConfirmation = (LinkedRevokeConfirmation) obj2;
            return Intrinsics.f(this.f90781a, linkedRevokeConfirmation.f90781a) && Intrinsics.f(this.f90782b, linkedRevokeConfirmation.f90782b) && Intrinsics.f(this.f90783c, linkedRevokeConfirmation.f90783c);
        }

        public final int hashCode() {
            return this.f90783c.hashCode() + p.a.c(this.f90781a.hashCode() * 31, 31, this.f90782b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90781a);
            dest.writeString(this.f90782b);
            dest.writeString(this.f90783c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$MandateRevokeConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MandateRevokeConfirmation implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MandateRevokeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90786c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MandateRevokeConfirmation(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MandateRevokeConfirmation[i];
            }
        }

        public MandateRevokeConfirmation(String storedMethodAccountId, String mandateId, String issuerInstitutionName) {
            Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
            Intrinsics.checkNotNullParameter(mandateId, "mandateId");
            Intrinsics.checkNotNullParameter(issuerInstitutionName, "issuerInstitutionName");
            this.f90784a = storedMethodAccountId;
            this.f90785b = mandateId;
            this.f90786c = issuerInstitutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MandateRevokeConfirmation)) {
                return false;
            }
            MandateRevokeConfirmation mandateRevokeConfirmation = (MandateRevokeConfirmation) obj2;
            return Intrinsics.f(this.f90784a, mandateRevokeConfirmation.f90784a) && Intrinsics.f(this.f90785b, mandateRevokeConfirmation.f90785b) && Intrinsics.f(this.f90786c, mandateRevokeConfirmation.f90786c);
        }

        public final int hashCode() {
            return this.f90786c.hashCode() + p.a.c(this.f90784a.hashCode() * 31, 31, this.f90785b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90784a);
            dest.writeString(this.f90785b);
            dest.writeString(this.f90786c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$RemovalNotAllowed;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemovalNotAllowed implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemovalNotAllowed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90789c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemovalNotAllowed(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemovalNotAllowed[i];
            }
        }

        public RemovalNotAllowed(String storedMethodAccountId, String issuerInstitutionId, String issuerInstitutionName) {
            Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
            Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
            Intrinsics.checkNotNullParameter(issuerInstitutionName, "issuerInstitutionName");
            this.f90787a = storedMethodAccountId;
            this.f90788b = issuerInstitutionId;
            this.f90789c = issuerInstitutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemovalNotAllowed)) {
                return false;
            }
            RemovalNotAllowed removalNotAllowed = (RemovalNotAllowed) obj2;
            return Intrinsics.f(this.f90787a, removalNotAllowed.f90787a) && Intrinsics.f(this.f90788b, removalNotAllowed.f90788b) && Intrinsics.f(this.f90789c, removalNotAllowed.f90789c);
        }

        public final int hashCode() {
            return this.f90789c.hashCode() + p.a.c(this.f90787a.hashCode() * 31, 31, this.f90788b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90787a);
            dest.writeString(this.f90788b);
            dest.writeString(this.f90789c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$RemoveMethodConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveMethodConfirmation implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemoveMethodConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoredMethod f90790a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveMethodConfirmation((StoredMethod) parcel.readParcelable(RemoveMethodConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveMethodConfirmation[i];
            }
        }

        public RemoveMethodConfirmation(StoredMethod storedMethod) {
            Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
            this.f90790a = storedMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveMethodConfirmation) && Intrinsics.f(this.f90790a, ((RemoveMethodConfirmation) obj2).f90790a);
        }

        public final int hashCode() {
            return this.f90790a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90790a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$StoredMethodDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StoredMethodDetails implements StoredMethodFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StoredMethodDetails f90791a = new StoredMethodDetails();

        @NotNull
        public static final Parcelable.Creator<StoredMethodDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StoredMethodDetails.f90791a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoredMethodDetails[i];
            }
        }

        private StoredMethodDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step$UpdateMandateLimits;", "Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateMandateLimits implements StoredMethodFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpdateMandateLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f90793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f90794c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateMandateLimits((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateMandateLimits[i];
            }
        }

        public UpdateMandateLimits(d limitPerTransfer, d limitPerMonth, String institutionId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
            Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
            this.f90792a = institutionId;
            this.f90793b = limitPerTransfer;
            this.f90794c = limitPerMonth;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdateMandateLimits)) {
                return false;
            }
            UpdateMandateLimits updateMandateLimits = (UpdateMandateLimits) obj2;
            return Intrinsics.f(this.f90792a, updateMandateLimits.f90792a) && Intrinsics.f(this.f90793b, updateMandateLimits.f90793b) && Intrinsics.f(this.f90794c, updateMandateLimits.f90794c);
        }

        public final int hashCode() {
            return this.f90794c.hashCode() + v7.c(this.f90792a.hashCode() * 31, 31, this.f90793b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90792a);
            dest.writeSerializable(this.f90793b);
            dest.writeSerializable(this.f90794c);
        }
    }
}
