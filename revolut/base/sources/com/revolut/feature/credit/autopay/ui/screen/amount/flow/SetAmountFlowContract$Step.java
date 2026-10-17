package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectAmountType", "AmountInput", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step$AmountInput;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step$SelectAmountType;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SetAmountFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step$AmountInput;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step;", "<init>", "()V", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountInput extends SetAmountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountInput f68592a = new AmountInput();

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountInput.f68592a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        private AmountInput() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step$SelectAmountType;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step;", "<init>", "()V", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectAmountType extends SetAmountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectAmountType f68593a = new SelectAmountType();

        @NotNull
        public static final Parcelable.Creator<SelectAmountType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectAmountType.f68593a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAmountType[i];
            }
        }

        private SelectAmountType() {
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

    private SetAmountFlowContract$Step() {
    }
}
