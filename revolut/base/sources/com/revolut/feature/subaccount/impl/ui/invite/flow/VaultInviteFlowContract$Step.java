package com.revolut.feature.subaccount.impl.ui.invite.flow;

import android.os.Parcel;
import android.os.Parcelable;
import bla.c;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "VaultInvitationConfirmation", "DeclineConfirmation", "McyFlowStep", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$DeclineConfirmation;", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$McyFlowStep;", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$VaultInvitationConfirmation;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VaultInviteFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$DeclineConfirmation;", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeclineConfirmation extends VaultInviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeclineConfirmation f89086a = new DeclineConfirmation();

        @NotNull
        public static final Parcelable.Creator<DeclineConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeclineConfirmation.f89086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclineConfirmation[i];
            }
        }

        private DeclineConfirmation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$McyFlowStep;", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyFlowStep extends VaultInviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<McyFlowStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f89087a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyFlowStep(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyFlowStep[i];
            }
        }

        public McyFlowStep(c mcyState) {
            Intrinsics.checkNotNullParameter(mcyState, "mcyState");
            this.f89087a = mcyState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof McyFlowStep) && this.f89087a == ((McyFlowStep) obj2).f89087a;
        }

        public final int hashCode() {
            return this.f89087a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89087a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step$VaultInvitationConfirmation;", "Lcom/revolut/feature/subaccount/impl/ui/invite/flow/VaultInviteFlowContract$Step;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VaultInvitationConfirmation extends VaultInviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VaultInvitationConfirmation f89088a = new VaultInvitationConfirmation();

        @NotNull
        public static final Parcelable.Creator<VaultInvitationConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VaultInvitationConfirmation.f89088a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultInvitationConfirmation[i];
            }
        }

        private VaultInvitationConfirmation() {
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

    private VaultInviteFlowContract$Step() {
    }
}
