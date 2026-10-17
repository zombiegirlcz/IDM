package com.revolut.feature.trusted_merchants.impl.ui.kompot.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/trusted_merchants/impl/ui/kompot/list/TrustedMerchantsListContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ApproveConfirmation", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/list/TrustedMerchantsListContract$ModalStep$ApproveConfirmation;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrustedMerchantsListContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/list/TrustedMerchantsListContract$ModalStep$ApproveConfirmation;", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/list/TrustedMerchantsListContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApproveConfirmation implements TrustedMerchantsListContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ApproveConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrustedMerchant.ToReview f94431a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApproveConfirmation((TrustedMerchant.ToReview) parcel.readParcelable(ApproveConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApproveConfirmation[i];
            }
        }

        public ApproveConfirmation(TrustedMerchant.ToReview merchant) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            this.f94431a = merchant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ApproveConfirmation) && Intrinsics.f(this.f94431a, ((ApproveConfirmation) obj2).f94431a);
        }

        public final int hashCode() {
            return this.f94431a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94431a, i);
        }
    }
}
