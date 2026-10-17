package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$SubscriptionOwner;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"com/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CancelSubscription", "CancelNzDirectDebit", "UnblockNzDirectDebit", "DeactivateSubscription", "DeleteSubscription", "DisableSubscription", "UnblockSubscription", "ConfirmSubaccountSource", "UnblockFuturePayments", "EditFrequency", "NextPayment", "CancelSplit", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelSplit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$ConfirmSubaccountSource;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DeactivateSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DeleteSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DisableSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$EditFrequency;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$NextPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockSubscription;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubscriptionDetailsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelNzDirectDebit implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelNzDirectDebit f89250a = new CancelNzDirectDebit();

        @NotNull
        public static final Parcelable.Creator<CancelNzDirectDebit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelNzDirectDebit.f89250a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelNzDirectDebit[i];
            }
        }

        private CancelNzDirectDebit() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelSplit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelSplit implements SubscriptionDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelSplit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecurringSplit f89251a;

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
            this.f89251a = split;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelSplit) && Intrinsics.f(this.f89251a, ((CancelSplit) obj2).f89251a);
        }

        public final int hashCode() {
            return this.f89251a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89251a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$CancelSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelSubscription implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelSubscription f89252a = new CancelSubscription();

        @NotNull
        public static final Parcelable.Creator<CancelSubscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelSubscription.f89252a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelSubscription[i];
            }
        }

        private CancelSubscription() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$ConfirmSubaccountSource;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmSubaccountSource implements SubscriptionDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmSubaccountSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89253a;

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
            this.f89253a = subaccountName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmSubaccountSource) && Intrinsics.f(this.f89253a, ((ConfirmSubaccountSource) obj2).f89253a);
        }

        public final int hashCode() {
            return this.f89253a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89253a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DeactivateSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeactivateSubscription implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeactivateSubscription f89254a = new DeactivateSubscription();

        @NotNull
        public static final Parcelable.Creator<DeactivateSubscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeactivateSubscription.f89254a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeactivateSubscription[i];
            }
        }

        private DeactivateSubscription() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DeleteSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeleteSubscription implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteSubscription f89255a = new DeleteSubscription();

        @NotNull
        public static final Parcelable.Creator<DeleteSubscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteSubscription.f89255a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteSubscription[i];
            }
        }

        private DeleteSubscription() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$DisableSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisableSubscription implements SubscriptionDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DisableSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionDetailsDialogControllerContract$SubscriptionOwner f89256a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisableSubscription((SubscriptionDetailsDialogControllerContract$SubscriptionOwner) parcel.readParcelable(DisableSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableSubscription[i];
            }
        }

        public DisableSubscription(SubscriptionDetailsDialogControllerContract$SubscriptionOwner subscriptionOwner) {
            Intrinsics.checkNotNullParameter(subscriptionOwner, "subscriptionOwner");
            this.f89256a = subscriptionOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisableSubscription) && Intrinsics.f(this.f89256a, ((DisableSubscription) obj2).f89256a);
        }

        public final int hashCode() {
            return this.f89256a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89256a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$EditFrequency;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditFrequency implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditFrequency f89257a = new EditFrequency();

        @NotNull
        public static final Parcelable.Creator<EditFrequency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditFrequency.f89257a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditFrequency[i];
            }
        }

        private EditFrequency() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$NextPayment;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NextPayment implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextPayment f89258a = new NextPayment();

        @NotNull
        public static final Parcelable.Creator<NextPayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NextPayment.f89258a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextPayment[i];
            }
        }

        private NextPayment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnblockFuturePayments implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnblockFuturePayments f89259a = new UnblockFuturePayments();

        @NotNull
        public static final Parcelable.Creator<UnblockFuturePayments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnblockFuturePayments.f89259a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockFuturePayments[i];
            }
        }

        private UnblockFuturePayments() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockNzDirectDebit;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnblockNzDirectDebit implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnblockNzDirectDebit f89260a = new UnblockNzDirectDebit();

        @NotNull
        public static final Parcelable.Creator<UnblockNzDirectDebit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnblockNzDirectDebit.f89260a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockNzDirectDebit[i];
            }
        }

        private UnblockNzDirectDebit() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep$UnblockSubscription;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnblockSubscription implements SubscriptionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnblockSubscription f89261a = new UnblockSubscription();

        @NotNull
        public static final Parcelable.Creator<UnblockSubscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnblockSubscription.f89261a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockSubscription[i];
            }
        }

        private UnblockSubscription() {
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
}
