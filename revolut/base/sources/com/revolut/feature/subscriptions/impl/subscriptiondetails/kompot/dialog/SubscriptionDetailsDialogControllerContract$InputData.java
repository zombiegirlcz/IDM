package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.kompot.common.IOData$Input;
import fva.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"com/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "UnblockSubscription", "BlockFuturePayments", "UnblockFuturePayments", "CancelSubscription", "CancelNzDirectDebit", "UnblockNzDirectDebit", "DeactivateSubscription", "DisableSubscription", "DeleteSubscription", "DeleteScheduledPayment", "DeleteJuniorAllowance", "DeleteDirectDebit", "DeleteRecurringPayment", "NextPayment", "ApmMandateCancelSubscription", "EditFrequency", "ConfirmSubaccountSource", "CancelSplit", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$ApmMandateCancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$BlockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelSplit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$ConfirmSubaccountSource;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeactivateSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteJuniorAllowance;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteRecurringPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteScheduledPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DisableSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$EditFrequency;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$NextPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockSubscription;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubscriptionDetailsDialogControllerContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$ApmMandateCancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmMandateCancelSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ApmMandateCancelSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89273a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApmMandateCancelSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmMandateCancelSubscription[i];
            }
        }

        public ApmMandateCancelSubscription(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89273a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ApmMandateCancelSubscription) && Intrinsics.f(this.f89273a, ((ApmMandateCancelSubscription) obj2).f89273a);
        }

        public final int hashCode() {
            return this.f89273a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89273a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$BlockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockFuturePayments extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<BlockFuturePayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockFuturePayments((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockFuturePayments[i];
            }
        }

        public BlockFuturePayments(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89274a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockFuturePayments) && Intrinsics.f(this.f89274a, ((BlockFuturePayments) obj2).f89274a);
        }

        public final int hashCode() {
            return this.f89274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89274a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelNzDirectDebit extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CancelNzDirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89276b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelNzDirectDebit((p) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelNzDirectDebit[i];
            }
        }

        public CancelNzDirectDebit(p subscription, boolean z) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89275a = subscription;
            this.f89276b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelNzDirectDebit)) {
                return false;
            }
            CancelNzDirectDebit cancelNzDirectDebit = (CancelNzDirectDebit) obj2;
            return Intrinsics.f(this.f89275a, cancelNzDirectDebit.f89275a) && this.f89276b == cancelNzDirectDebit.f89276b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89276b) + (this.f89275a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89275a);
            dest.writeInt(this.f89276b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelSplit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSplit extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CancelSplit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecurringSplit f89277a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelSplit((RecurringSplit) parcel.readParcelable(CancelSplit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelSplit[i];
            }
        }

        public CancelSplit(RecurringSplit split) {
            Intrinsics.checkNotNullParameter(split, "split");
            this.f89277a = split;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSplit) && Intrinsics.f(this.f89277a, ((CancelSplit) obj2).f89277a);
        }

        public final int hashCode() {
            return this.f89277a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89277a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$CancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CancelSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelSubscription[i];
            }
        }

        public CancelSubscription(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89278a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSubscription) && Intrinsics.f(this.f89278a, ((CancelSubscription) obj2).f89278a);
        }

        public final int hashCode() {
            return this.f89278a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89278a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$ConfirmSubaccountSource;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmSubaccountSource extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ConfirmSubaccountSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89279a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmSubaccountSource(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmSubaccountSource[i];
            }
        }

        public ConfirmSubaccountSource(String subaccountName) {
            Intrinsics.checkNotNullParameter(subaccountName, "subaccountName");
            this.f89279a = subaccountName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmSubaccountSource) && Intrinsics.f(this.f89279a, ((ConfirmSubaccountSource) obj2).f89279a);
        }

        public final int hashCode() {
            return this.f89279a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89279a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeactivateSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeactivateSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeactivateSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89280a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeactivateSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeactivateSubscription[i];
            }
        }

        public DeactivateSubscription(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89280a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeactivateSubscription) && Intrinsics.f(this.f89280a, ((DeactivateSubscription) obj2).f89280a);
        }

        public final int hashCode() {
            return this.f89280a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89280a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteDirectDebit extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeleteDirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteDirectDebit((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteDirectDebit[i];
            }
        }

        public DeleteDirectDebit(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89281a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteDirectDebit) && Intrinsics.f(this.f89281a, ((DeleteDirectDebit) obj2).f89281a);
        }

        public final int hashCode() {
            return this.f89281a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89281a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteJuniorAllowance;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteJuniorAllowance extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeleteJuniorAllowance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteJuniorAllowance((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteJuniorAllowance[i];
            }
        }

        public DeleteJuniorAllowance(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89282a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteJuniorAllowance) && Intrinsics.f(this.f89282a, ((DeleteJuniorAllowance) obj2).f89282a);
        }

        public final int hashCode() {
            return this.f89282a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89282a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteRecurringPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteRecurringPayment extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeleteRecurringPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89283a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteRecurringPayment((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteRecurringPayment[i];
            }
        }

        public DeleteRecurringPayment(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89283a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteRecurringPayment) && Intrinsics.f(this.f89283a, ((DeleteRecurringPayment) obj2).f89283a);
        }

        public final int hashCode() {
            return this.f89283a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89283a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteScheduledPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteScheduledPayment extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeleteScheduledPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89284a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteScheduledPayment((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteScheduledPayment[i];
            }
        }

        public DeleteScheduledPayment(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89284a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteScheduledPayment) && Intrinsics.f(this.f89284a, ((DeleteScheduledPayment) obj2).f89284a);
        }

        public final int hashCode() {
            return this.f89284a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89284a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DeleteSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DeleteSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89285a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteSubscription[i];
            }
        }

        public DeleteSubscription(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89285a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteSubscription) && Intrinsics.f(this.f89285a, ((DeleteSubscription) obj2).f89285a);
        }

        public final int hashCode() {
            return this.f89285a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89285a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$DisableSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisableSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DisableSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscriptionDetailsDialogControllerContract$SubscriptionOwner f89287b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisableSubscription((p) parcel.readSerializable(), (SubscriptionDetailsDialogControllerContract$SubscriptionOwner) parcel.readParcelable(DisableSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableSubscription[i];
            }
        }

        public DisableSubscription(p subscription, SubscriptionDetailsDialogControllerContract$SubscriptionOwner subscriptionOwner) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Intrinsics.checkNotNullParameter(subscriptionOwner, "subscriptionOwner");
            this.f89286a = subscription;
            this.f89287b = subscriptionOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisableSubscription)) {
                return false;
            }
            DisableSubscription disableSubscription = (DisableSubscription) obj2;
            return Intrinsics.f(this.f89286a, disableSubscription.f89286a) && Intrinsics.f(this.f89287b, disableSubscription.f89287b);
        }

        public final int hashCode() {
            return this.f89287b.hashCode() + (this.f89286a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89286a);
            dest.writeParcelable(this.f89287b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$EditFrequency;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditFrequency extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditFrequency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f89288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f89289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f89290c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                e eVarValueOf = parcel.readInt() == 0 ? null : e.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(e.valueOf(parcel.readString()));
                }
                return new EditFrequency(eVarValueOf, arrayList, (p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditFrequency[i];
            }
        }

        public EditFrequency(e eVar, ArrayList availableFrequencies, p subscription) {
            Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89288a = eVar;
            this.f89289b = availableFrequencies;
            this.f89290c = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditFrequency)) {
                return false;
            }
            EditFrequency editFrequency = (EditFrequency) obj2;
            return this.f89288a == editFrequency.f89288a && this.f89289b.equals(editFrequency.f89289b) && Intrinsics.f(this.f89290c, editFrequency.f89290c);
        }

        public final int hashCode() {
            e eVar = this.f89288a;
            return this.f89290c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f89289b, (eVar == null ? 0 : eVar.hashCode()) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e eVar = this.f89288a;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            Iterator itY = j6.a.y(this.f89289b, dest);
            while (itY.hasNext()) {
                dest.writeString(((e) itY.next()).name());
            }
            dest.writeSerializable(this.f89290c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$NextPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NextPayment extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NextPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89291a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NextPayment((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextPayment[i];
            }
        }

        public NextPayment(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89291a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NextPayment) && Intrinsics.f(this.f89291a, ((NextPayment) obj2).f89291a);
        }

        public final int hashCode() {
            return this.f89291a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89291a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnblockFuturePayments extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<UnblockFuturePayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89292a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnblockFuturePayments((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockFuturePayments[i];
            }
        }

        public UnblockFuturePayments(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89292a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnblockFuturePayments) && Intrinsics.f(this.f89292a, ((UnblockFuturePayments) obj2).f89292a);
        }

        public final int hashCode() {
            return this.f89292a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89292a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnblockNzDirectDebit extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<UnblockNzDirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89294b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnblockNzDirectDebit((p) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockNzDirectDebit[i];
            }
        }

        public UnblockNzDirectDebit(p subscription, boolean z) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89293a = subscription;
            this.f89294b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnblockNzDirectDebit)) {
                return false;
            }
            UnblockNzDirectDebit unblockNzDirectDebit = (UnblockNzDirectDebit) obj2;
            return Intrinsics.f(this.f89293a, unblockNzDirectDebit.f89293a) && this.f89294b == unblockNzDirectDebit.f89294b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89294b) + (this.f89293a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89293a);
            dest.writeInt(this.f89294b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData$UnblockSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/dialog/SubscriptionDetailsDialogControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnblockSubscription extends SubscriptionDetailsDialogControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<UnblockSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89295a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnblockSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockSubscription[i];
            }
        }

        public UnblockSubscription(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89295a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnblockSubscription) && Intrinsics.f(this.f89295a, ((UnblockSubscription) obj2).f89295a);
        }

        public final int hashCode() {
            return this.f89295a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89295a);
        }
    }

    private SubscriptionDetailsDialogControllerContract$InputData() {
    }
}
