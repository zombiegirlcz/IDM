package com.revolut.feature.subscriptions.impl.block_card_subscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "WhatWillHappen", "AcceptConditions", "BlockSubscription", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$AcceptConditions;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$BlockSubscription;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$WhatWillHappen;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlockCardSubscriptionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$AcceptConditions;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptConditions extends BlockCardSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AcceptConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcceptConditionsScreenContract$InputData f89162a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptConditions(AcceptConditionsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptConditions[i];
            }
        }

        public AcceptConditions(AcceptConditionsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f89162a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcceptConditions) && Intrinsics.f(this.f89162a, ((AcceptConditions) obj2).f89162a);
        }

        public final int hashCode() {
            return this.f89162a.f89167a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89162a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$BlockSubscription;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockSubscription extends BlockCardSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BlockSubscriptionScreenContract$InputData f89163a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockSubscription(BlockSubscriptionScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockSubscription[i];
            }
        }

        public BlockSubscription(BlockSubscriptionScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f89163a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockSubscription) && Intrinsics.f(this.f89163a, ((BlockSubscription) obj2).f89163a);
        }

        public final int hashCode() {
            return this.f89163a.f89168a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89163a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step$WhatWillHappen;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/BlockCardSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WhatWillHappen extends BlockCardSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WhatWillHappen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WhatWillHappenScreenContract$InputData f89164a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WhatWillHappen(WhatWillHappenScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatWillHappen[i];
            }
        }

        public WhatWillHappen(WhatWillHappenScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f89164a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WhatWillHappen) && Intrinsics.f(this.f89164a, ((WhatWillHappen) obj2).f89164a);
        }

        public final int hashCode() {
            return this.f89164a.f89170a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89164a.writeToParcel(dest, i);
        }
    }

    private BlockCardSubscriptionFlowContract$Step() {
    }
}
