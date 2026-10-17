package com.revolut.feature.rev_points.buying.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OneOffBuy", "RecurringBuy", "Info", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$Info;", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$OneOffBuy;", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$RecurringBuy;", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsBuyingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$Info;", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step;", "<init>", "()V", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Info extends RevPointsBuyingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Info f83560a = new Info();

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Info.f83560a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        private Info() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$OneOffBuy;", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step;", "<init>", "()V", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OneOffBuy extends RevPointsBuyingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OneOffBuy f83561a = new OneOffBuy();

        @NotNull
        public static final Parcelable.Creator<OneOffBuy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OneOffBuy.f83561a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneOffBuy[i];
            }
        }

        private OneOffBuy() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step$RecurringBuy;", "Lcom/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$Step;", "<init>", "()V", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecurringBuy extends RevPointsBuyingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecurringBuy f83562a = new RecurringBuy();

        @NotNull
        public static final Parcelable.Creator<RecurringBuy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecurringBuy.f83562a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringBuy[i];
            }
        }

        private RecurringBuy() {
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

    private RevPointsBuyingFlowContract$Step() {
    }
}
