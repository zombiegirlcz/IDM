package com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Details", "Transfer", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData$Details;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData$Transfer;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradeRevPointsAgentDetailsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData$Details;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends TradeRevPointsAgentDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f91113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e0 f91114c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), j.valueOf(parcel.readString()), e0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String agentId, j product, e0 revPointsBottomSheetContext) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
            this.f91112a = agentId;
            this.f91113b = product;
            this.f91114c = revPointsBottomSheetContext;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final j getF91116b() {
            return this.f91113b;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final e0 getF91117c() {
            return this.f91114c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f91112a, details.f91112a) && this.f91113b == details.f91113b && this.f91114c == details.f91114c;
        }

        public final int hashCode() {
            return this.f91114c.hashCode() + ((this.f91113b.hashCode() + (this.f91112a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91112a);
            dest.writeString(this.f91113b.name());
            dest.writeString(this.f91114c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData$Transfer;", "Lcom/revolut/feature/trade_rev_points/impl/ui/flow/agent_details/TradeRevPointsAgentDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends TradeRevPointsAgentDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f91116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e0 f91117c;
        public final Integer d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer(parcel.readString(), j.valueOf(parcel.readString()), e0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(String agentId, j product, e0 revPointsBottomSheetContext, Integer num) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
            this.f91115a = agentId;
            this.f91116b = product;
            this.f91117c = revPointsBottomSheetContext;
            this.d = num;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final j getF91116b() {
            return this.f91116b;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final e0 getF91117c() {
            return this.f91117c;
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
            return Intrinsics.f(this.f91115a, transfer.f91115a) && this.f91116b == transfer.f91116b && this.f91117c == transfer.f91117c && Intrinsics.f(this.d, transfer.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f91117c.hashCode() + ((this.f91116b.hashCode() + (this.f91115a.hashCode() * 31)) * 31)) * 31;
            Integer num = this.d;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91115a);
            dest.writeString(this.f91116b.name());
            dest.writeString(this.f91117c.name());
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    private TradeRevPointsAgentDetailsFlowContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract j getF91116b();

    /* JADX INFO: renamed from: b */
    public abstract e0 getF91117c();
}
