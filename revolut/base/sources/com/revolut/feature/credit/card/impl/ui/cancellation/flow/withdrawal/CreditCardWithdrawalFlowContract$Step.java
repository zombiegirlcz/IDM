package com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationPrompt;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "Dialog", "CancellationDetails", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$CancellationDetails;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$Prompt;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardWithdrawalFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$CancellationDetails;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationDetails implements CreditCardWithdrawalFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancellationDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardCancellationDetails f69152a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationDetails((CreditCardCancellationDetails) parcel.readParcelable(CancellationDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationDetails[i];
            }
        }

        public CancellationDetails(CreditCardCancellationDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f69152a = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancellationDetails) && Intrinsics.f(this.f69152a, ((CancellationDetails) obj2).f69152a);
        }

        public final int hashCode() {
            return this.f69152a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69152a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements CreditCardWithdrawalFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f69153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialog((CreditCardDialogModel) parcel.readParcelable(Dialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        public Dialog(CreditCardDialogModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.f69153a = model;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dialog) && Intrinsics.f(this.f69153a, ((Dialog) obj2).f69153a);
        }

        public final int hashCode() {
            return this.f69153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69153a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements CreditCardWithdrawalFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardCancellationPrompt f69154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((CreditCardCancellationPrompt) parcel.readParcelable(Prompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(CreditCardCancellationPrompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            this.f69154a = prompt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f69154a, ((Prompt) obj2).f69154a);
        }

        public final int hashCode() {
            return this.f69154a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69154a, i);
        }
    }
}
