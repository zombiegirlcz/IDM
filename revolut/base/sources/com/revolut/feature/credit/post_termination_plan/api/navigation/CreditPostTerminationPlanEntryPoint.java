package com.revolut.feature.credit.post_termination_plan.api.navigation;

import aii.e;
import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zx4.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint;", "Laii/r;", "OUT", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/e;", "<init>", "()V", "PlanDetailsFlow", "PlanDetailsExplainer", "Repay", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$PlanDetailsExplainer;", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$PlanDetailsFlow;", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$Repay;", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditPostTerminationPlanEntryPoint<OUT extends r> extends InternalDestination<IOData$EmptyInput> implements e {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$PlanDetailsExplainer;", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint;", "Lzx4/d;", "", "toString", "()Ljava/lang/String;", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDetailsExplainer extends CreditPostTerminationPlanEntryPoint<d> {

        @NotNull
        public static final Parcelable.Creator<PlanDetailsExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditPostTerminationPlanDetails f70660b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDetailsExplainer(CreditPostTerminationPlanDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDetailsExplainer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanDetailsExplainer(CreditPostTerminationPlanDetails planDetails) {
            super(0);
            Intrinsics.checkNotNullParameter(planDetails, "planDetails");
            this.f70660b = planDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDetailsExplainer) && Intrinsics.f(this.f70660b, ((PlanDetailsExplainer) obj2).f70660b);
        }

        public final int hashCode() {
            return this.f70660b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70660b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$PlanDetailsFlow;", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint;", "Lzx4/d;", "", "toString", "()Ljava/lang/String;", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDetailsFlow extends CreditPostTerminationPlanEntryPoint<d> {

        @NotNull
        public static final Parcelable.Creator<PlanDetailsFlow> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditPostTerminationPlanDetails f70662c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDetailsFlow(parcel.readString(), parcel.readInt() == 0 ? null : CreditPostTerminationPlanDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDetailsFlow[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanDetailsFlow(String planId, CreditPostTerminationPlanDetails creditPostTerminationPlanDetails) {
            super(0);
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f70661b = planId;
            this.f70662c = creditPostTerminationPlanDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanDetailsFlow)) {
                return false;
            }
            PlanDetailsFlow planDetailsFlow = (PlanDetailsFlow) obj2;
            return Intrinsics.f(this.f70661b, planDetailsFlow.f70661b) && Intrinsics.f(this.f70662c, planDetailsFlow.f70662c);
        }

        public final int hashCode() {
            int iHashCode = this.f70661b.hashCode() * 31;
            CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.f70662c;
            return iHashCode + (creditPostTerminationPlanDetails == null ? 0 : creditPostTerminationPlanDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70661b);
            CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.f70662c;
            if (creditPostTerminationPlanDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditPostTerminationPlanDetails.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint$Repay;", "Lcom/revolut/feature/credit/post_termination_plan/api/navigation/CreditPostTerminationPlanEntryPoint;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_post_termination_plan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Repay extends CreditPostTerminationPlanEntryPoint<Object> {

        @NotNull
        public static final Parcelable.Creator<Repay> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditPostTerminationPlanDetails f70664c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Repay(parcel.readString(), parcel.readInt() == 0 ? null : CreditPostTerminationPlanDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Repay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Repay(String planId, CreditPostTerminationPlanDetails creditPostTerminationPlanDetails) {
            super(0);
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f70663b = planId;
            this.f70664c = creditPostTerminationPlanDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Repay)) {
                return false;
            }
            Repay repay = (Repay) obj2;
            return Intrinsics.f(this.f70663b, repay.f70663b) && Intrinsics.f(this.f70664c, repay.f70664c);
        }

        public final int hashCode() {
            int iHashCode = this.f70663b.hashCode() * 31;
            CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.f70664c;
            return iHashCode + (creditPostTerminationPlanDetails == null ? 0 : creditPostTerminationPlanDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70663b);
            CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = this.f70664c;
            if (creditPostTerminationPlanDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditPostTerminationPlanDetails.writeToParcel(dest, i);
            }
        }
    }

    public /* synthetic */ CreditPostTerminationPlanEntryPoint(int i) {
        this();
    }

    private CreditPostTerminationPlanEntryPoint() {
        super(IOData$EmptyInput.f98299a);
    }
}
