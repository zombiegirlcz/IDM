package com.revolut.feature.credit.card.impl.ui.instalment.repay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectPaymentType", "FutureInstalments", "CustomAmount", "Anticipation", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$Anticipation;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$CustomAmount;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$FutureInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$SelectPaymentType;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardInstalmentRepayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$Anticipation;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Anticipation extends CreditCardInstalmentRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Anticipation f69496a = new Anticipation();

        @NotNull
        public static final Parcelable.Creator<Anticipation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Anticipation.f69496a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Anticipation[i];
            }
        }

        private Anticipation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$CustomAmount;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CustomAmount extends CreditCardInstalmentRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CustomAmount f69497a = new CustomAmount();

        @NotNull
        public static final Parcelable.Creator<CustomAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CustomAmount.f69497a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAmount[i];
            }
        }

        private CustomAmount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$FutureInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FutureInstalments extends CreditCardInstalmentRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FutureInstalments f69498a = new FutureInstalments();

        @NotNull
        public static final Parcelable.Creator<FutureInstalments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FutureInstalments.f69498a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FutureInstalments[i];
            }
        }

        private FutureInstalments() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step$SelectPaymentType;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPaymentType extends CreditCardInstalmentRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPaymentType f69499a = new SelectPaymentType();

        @NotNull
        public static final Parcelable.Creator<SelectPaymentType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPaymentType.f69499a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentType[i];
            }
        }

        private SelectPaymentType() {
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

    private CreditCardInstalmentRepayFlowContract$Step() {
    }
}
