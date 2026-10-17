package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Features", "DowngradeReason", "Feedback", "Block", "ChatWithSupport", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Block;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$ChatWithSupport;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$DowngradeReason;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Features;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Feedback;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanCancelFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Block;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Block extends PlanCancelFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Block> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103484a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Block.class, parcel, arrayList, iE, 1);
                }
                return new Block(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Block[i];
            }
        }

        public Block(List ineligibilityReasons) {
            Intrinsics.checkNotNullParameter(ineligibilityReasons, "ineligibilityReasons");
            this.f103484a = ineligibilityReasons;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Block) && Intrinsics.f(this.f103484a, ((Block) obj2).f103484a);
        }

        public final int hashCode() {
            return this.f103484a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103484a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$ChatWithSupport;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatWithSupport extends PlanCancelFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChatWithSupport f103485a = new ChatWithSupport();

        @NotNull
        public static final Parcelable.Creator<ChatWithSupport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatWithSupport.f103485a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatWithSupport[i];
            }
        }

        private ChatWithSupport() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$DowngradeReason;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DowngradeReason extends PlanCancelFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DowngradeReason f103486a = new DowngradeReason();

        @NotNull
        public static final Parcelable.Creator<DowngradeReason> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DowngradeReason.f103486a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DowngradeReason[i];
            }
        }

        private DowngradeReason() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Features;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Features extends PlanCancelFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Features f103487a = new Features();

        @NotNull
        public static final Parcelable.Creator<Features> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Features.f103487a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Features[i];
            }
        }

        private Features() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step$Feedback;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Feedback extends PlanCancelFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Feedback f103488a = new Feedback();

        @NotNull
        public static final Parcelable.Creator<Feedback> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Feedback.f103488a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Feedback[i];
            }
        }

        private Feedback() {
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

    private PlanCancelFlowContract$Step() {
    }
}
