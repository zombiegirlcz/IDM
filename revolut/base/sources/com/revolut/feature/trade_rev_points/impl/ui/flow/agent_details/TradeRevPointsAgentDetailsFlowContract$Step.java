package com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AgentDetails", "Transfer", "AccountRegistration", "SeeAllUserVouchers", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$AgentDetails;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$SeeAllUserVouchers;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$Transfer;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradeRevPointsAgentDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$AccountRegistration;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRegistration extends TradeRevPointsAgentDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountRegistration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f91119b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRegistration(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRegistration[i];
            }
        }

        public AccountRegistration(String agentId, Integer num) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f91118a = agentId;
            this.f91119b = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountRegistration)) {
                return false;
            }
            AccountRegistration accountRegistration = (AccountRegistration) obj2;
            return Intrinsics.f(this.f91118a, accountRegistration.f91118a) && Intrinsics.f(this.f91119b, accountRegistration.f91119b);
        }

        public final int hashCode() {
            int iHashCode = this.f91118a.hashCode() * 31;
            Integer num = this.f91119b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91118a);
            Integer num = this.f91119b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$AgentDetails;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AgentDetails extends TradeRevPointsAgentDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AgentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91120a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AgentDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AgentDetails[i];
            }
        }

        public AgentDetails(String agentId) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f91120a = agentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AgentDetails) && Intrinsics.f(this.f91120a, ((AgentDetails) obj2).f91120a);
        }

        public final int hashCode() {
            return this.f91120a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91120a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$SeeAllUserVouchers;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllUserVouchers extends TradeRevPointsAgentDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SeeAllUserVouchers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91121a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAllUserVouchers(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllUserVouchers[i];
            }
        }

        public SeeAllUserVouchers(String agentId) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            this.f91121a = agentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAllUserVouchers) && Intrinsics.f(this.f91121a, ((SeeAllUserVouchers) obj2).f91121a);
        }

        public final int hashCode() {
            return this.f91121a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91121a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step$Transfer;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends TradeRevPointsAgentDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradeRevPointsAccount f91123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f91124c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), (TradeRevPointsAccount) parcel.readParcelable(Transfer.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(String agentId, TradeRevPointsAccount account, Integer num) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            Intrinsics.checkNotNullParameter(account, "account");
            this.f91122a = agentId;
            this.f91123b = account;
            this.f91124c = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f91122a, transfer.f91122a) && Intrinsics.f(this.f91123b, transfer.f91123b) && Intrinsics.f(this.f91124c, transfer.f91124c);
        }

        public final int hashCode() {
            int iHashCode = (this.f91123b.hashCode() + (this.f91122a.hashCode() * 31)) * 31;
            Integer num = this.f91124c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91122a);
            dest.writeParcelable(this.f91123b, i);
            Integer num = this.f91124c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private TradeRevPointsAgentDetailsFlowContract$Step() {
    }
}
