package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_out/review/BankAccountSwitchingReviewOutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DirectDebits", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/BankAccountSwitchingReviewOutScreenContract$ModalStep$DirectDebits;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankAccountSwitchingReviewOutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/BankAccountSwitchingReviewOutScreenContract$ModalStep$DirectDebits;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/BankAccountSwitchingReviewOutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebits implements BankAccountSwitchingReviewOutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DirectDebits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SwitchOutReview f64054a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebits(SwitchOutReview.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebits[i];
            }
        }

        public DirectDebits(SwitchOutReview review) {
            Intrinsics.checkNotNullParameter(review, "review");
            this.f64054a = review;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DirectDebits) && Intrinsics.f(this.f64054a, ((DirectDebits) obj2).f64054a);
        }

        public final int hashCode() {
            return this.f64054a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f64054a.writeToParcel(dest, i);
        }
    }
}
