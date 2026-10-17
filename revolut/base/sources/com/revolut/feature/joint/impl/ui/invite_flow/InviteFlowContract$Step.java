package com.revolut.feature.joint.impl.ui.invite_flow;

import android.os.Parcel;
import android.os.Parcelable;
import cci.g;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import d58.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.v;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "WrapWithProductArticle", "Consent", "PurposesOfAccount", "SelectUser", "Relationship", "Confirmation", "InviteConfirmation", "Workflow", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Confirmation;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Consent;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$InviteConfirmation;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$PurposesOfAccount;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Relationship;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$SelectUser;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Workflow;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$WrapWithProductArticle;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InviteFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Confirmation;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "<init>", "()V", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Confirmation extends InviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirmation f76561a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f76561a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Consent;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f76562a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(g.valueOf(parcel.readString()));
                }
                return new Consent(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Consent) && Intrinsics.f(this.f76562a, ((Consent) obj2).f76562a);
        }

        public final int hashCode() {
            return this.f76562a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f76562a, dest);
            while (itV.hasNext()) {
                dest.writeString(((g) itV.next()).name());
            }
        }

        public Consent(List selectedPurposes) {
            Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
            this.f76562a = selectedPurposes;
        }

        public Consent(int i) {
            this(f0.f322471a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$InviteConfirmation;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteConfirmation extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f76563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f76564b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteConfirmation((f) parcel.readSerializable(), (v) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteConfirmation[i];
            }
        }

        public InviteConfirmation(f otherUserData, v inviteDetail) {
            Intrinsics.checkNotNullParameter(otherUserData, "otherUserData");
            Intrinsics.checkNotNullParameter(inviteDetail, "inviteDetail");
            this.f76563a = otherUserData;
            this.f76564b = inviteDetail;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteConfirmation)) {
                return false;
            }
            InviteConfirmation inviteConfirmation = (InviteConfirmation) obj2;
            return Intrinsics.f(this.f76563a, inviteConfirmation.f76563a) && Intrinsics.f(this.f76564b, inviteConfirmation.f76564b);
        }

        public final int hashCode() {
            return this.f76564b.hashCode() + (this.f76563a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76563a);
            dest.writeSerializable(this.f76564b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$PurposesOfAccount;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposesOfAccount extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PurposesOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f76565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f76566b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(g.valueOf(parcel.readString()));
                }
                return new PurposesOfAccount(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposesOfAccount[i];
            }
        }

        public PurposesOfAccount(List selectedPurposes, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
            this.f76565a = countryCode;
            this.f76566b = selectedPurposes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PurposesOfAccount)) {
                return false;
            }
            PurposesOfAccount purposesOfAccount = (PurposesOfAccount) obj2;
            return Intrinsics.f(this.f76565a, purposesOfAccount.f76565a) && Intrinsics.f(this.f76566b, purposesOfAccount.f76566b);
        }

        public final int hashCode() {
            return this.f76566b.hashCode() + (this.f76565a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76565a);
            Iterator itV = p.a.v(this.f76566b, dest);
            while (itV.hasNext()) {
                dest.writeString(((g) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Relationship;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Relationship extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Relationship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f76567a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Relationship((f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Relationship[i];
            }
        }

        public Relationship(f otherUserData) {
            Intrinsics.checkNotNullParameter(otherUserData, "otherUserData");
            this.f76567a = otherUserData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Relationship) && Intrinsics.f(this.f76567a, ((Relationship) obj2).f76567a);
        }

        public final int hashCode() {
            return this.f76567a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76567a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$SelectUser;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "<init>", "()V", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectUser extends InviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectUser f76568a = new SelectUser();

        @NotNull
        public static final Parcelable.Creator<SelectUser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectUser.f76568a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectUser[i];
            }
        }

        private SelectUser() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$Workflow;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowConfiguration f76569a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow((WorkflowConfiguration) parcel.readParcelable(Workflow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(WorkflowConfiguration workflowConfiguration) {
            Intrinsics.checkNotNullParameter(workflowConfiguration, "workflowConfiguration");
            this.f76569a = workflowConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f76569a, ((Workflow) obj2).f76569a);
        }

        public final int hashCode() {
            return this.f76569a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76569a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step$WrapWithProductArticle;", "Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WrapWithProductArticle extends InviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WrapWithProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f76570a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WrapWithProductArticle((ProductArticleParams) parcel.readParcelable(WrapWithProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WrapWithProductArticle[i];
            }
        }

        public WrapWithProductArticle(ProductArticleParams descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f76570a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WrapWithProductArticle) && Intrinsics.f(this.f76570a, ((WrapWithProductArticle) obj2).f76570a);
        }

        public final int hashCode() {
            return this.f76570a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76570a, i);
        }
    }

    private InviteFlowContract$Step() {
    }
}
