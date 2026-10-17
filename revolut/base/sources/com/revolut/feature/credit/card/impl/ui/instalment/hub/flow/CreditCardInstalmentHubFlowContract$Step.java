package com.revolut.feature.credit.card.impl.ui.instalment.hub.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Hub", "Topup", "StatementFinancingDetails", "PrePurchaseDetails", "PostPurchaseDetails", "CreatePostPurchaseInstalment", "PastInstalments", "CurrentInstalments", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$CreatePostPurchaseInstalment;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$CurrentInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$Hub;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PastInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PostPurchaseDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PrePurchaseDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$StatementFinancingDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$Topup;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardInstalmentHubFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$CreatePostPurchaseInstalment;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreatePostPurchaseInstalment extends CreditCardInstalmentHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreatePostPurchaseInstalment f69399a = new CreatePostPurchaseInstalment();

        @NotNull
        public static final Parcelable.Creator<CreatePostPurchaseInstalment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreatePostPurchaseInstalment.f69399a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePostPurchaseInstalment[i];
            }
        }

        private CreatePostPurchaseInstalment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$CurrentInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentInstalments extends CreditCardInstalmentHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrentInstalments f69400a = new CurrentInstalments();

        @NotNull
        public static final Parcelable.Creator<CurrentInstalments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrentInstalments.f69400a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentInstalments[i];
            }
        }

        private CurrentInstalments() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$Hub;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hub extends CreditCardInstalmentHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hub f69401a = new Hub();

        @NotNull
        public static final Parcelable.Creator<Hub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hub.f69401a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hub[i];
            }
        }

        private Hub() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PastInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PastInstalments extends CreditCardInstalmentHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PastInstalments f69402a = new PastInstalments();

        @NotNull
        public static final Parcelable.Creator<PastInstalments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PastInstalments.f69402a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PastInstalments[i];
            }
        }

        private PastInstalments() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PostPurchaseDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostPurchaseDetails extends CreditCardInstalmentHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostPurchaseDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69403a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostPurchaseDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostPurchaseDetails[i];
            }
        }

        public PostPurchaseDetails(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69403a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostPurchaseDetails) && Intrinsics.f(this.f69403a, ((PostPurchaseDetails) obj2).f69403a);
        }

        public final int hashCode() {
            return this.f69403a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69403a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$PrePurchaseDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrePurchaseDetails extends CreditCardInstalmentHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrePurchaseDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69404a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrePurchaseDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrePurchaseDetails[i];
            }
        }

        public PrePurchaseDetails(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69404a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PrePurchaseDetails) && Intrinsics.f(this.f69404a, ((PrePurchaseDetails) obj2).f69404a);
        }

        public final int hashCode() {
            return this.f69404a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69404a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$StatementFinancingDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementFinancingDetails extends CreditCardInstalmentHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StatementFinancingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69405a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatementFinancingDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancingDetails[i];
            }
        }

        public StatementFinancingDetails(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f69405a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StatementFinancingDetails) && Intrinsics.f(this.f69405a, ((StatementFinancingDetails) obj2).f69405a);
        }

        public final int hashCode() {
            return this.f69405a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69405a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step$Topup;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/flow/CreditCardInstalmentHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topup extends CreditCardInstalmentHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Topup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69406a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Topup((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Topup[i];
            }
        }

        public Topup(d dVar) {
            this.f69406a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Topup) && Intrinsics.f(this.f69406a, ((Topup) obj2).f69406a);
        }

        public final int hashCode() {
            d dVar = this.f69406a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69406a);
        }
    }

    private CreditCardInstalmentHubFlowContract$Step() {
    }
}
