package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Overview", "Chat", "BillDetails", "UntrustedGroupPrompt", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$BillDetails;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$Chat;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$Overview;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$UntrustedGroupPrompt;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$BillDetails;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillDetails extends GroupDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79464b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillDetails((PaymentGroup) parcel.readParcelable(BillDetails.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillDetails[i];
            }
        }

        public BillDetails(PaymentGroup group, String billId) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(billId, "billId");
            this.f79463a = group;
            this.f79464b = billId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillDetails)) {
                return false;
            }
            BillDetails billDetails = (BillDetails) obj2;
            return Intrinsics.f(this.f79463a, billDetails.f79463a) && Intrinsics.f(this.f79464b, billDetails.f79464b);
        }

        public final int hashCode() {
            return this.f79464b.hashCode() + (this.f79463a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79463a, i);
            dest.writeString(this.f79464b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$Chat;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat extends GroupDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79465a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((PaymentGroup) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(PaymentGroup group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f79465a = group;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f79465a, ((Chat) obj2).f79465a);
        }

        public final int hashCode() {
            return this.f79465a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79465a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$Overview;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview extends GroupDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79467b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview((PaymentGroup) parcel.readParcelable(Overview.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview(PaymentGroup group, boolean z) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f79466a = group;
            this.f79467b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj2;
            return Intrinsics.f(this.f79466a, overview.f79466a) && this.f79467b == overview.f79467b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79467b) + (this.f79466a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79466a, i);
            dest.writeInt(this.f79467b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step$UntrustedGroupPrompt;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UntrustedGroupPrompt extends GroupDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UntrustedGroupPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79469b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UntrustedGroupPrompt(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UntrustedGroupPrompt[i];
            }
        }

        public UntrustedGroupPrompt(String groupName, String groupInvitationCode) {
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(groupInvitationCode, "groupInvitationCode");
            this.f79468a = groupName;
            this.f79469b = groupInvitationCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UntrustedGroupPrompt)) {
                return false;
            }
            UntrustedGroupPrompt untrustedGroupPrompt = (UntrustedGroupPrompt) obj2;
            return Intrinsics.f(this.f79468a, untrustedGroupPrompt.f79468a) && Intrinsics.f(this.f79469b, untrustedGroupPrompt.f79469b);
        }

        public final int hashCode() {
            return this.f79469b.hashCode() + (this.f79468a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79468a);
            dest.writeString(this.f79469b);
        }
    }

    private GroupDetailsFlowContract$Step() {
    }
}
