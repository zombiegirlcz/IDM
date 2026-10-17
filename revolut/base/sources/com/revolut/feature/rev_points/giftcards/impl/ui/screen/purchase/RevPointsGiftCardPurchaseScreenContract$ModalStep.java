package com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/rev_points/giftcards/impl/ui/screen/purchase/RevPointsGiftCardPurchaseScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TermsAndConditions", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/purchase/RevPointsGiftCardPurchaseScreenContract$ModalStep$TermsAndConditions;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsGiftCardPurchaseScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/purchase/RevPointsGiftCardPurchaseScreenContract$ModalStep$TermsAndConditions;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/purchase/RevPointsGiftCardPurchaseScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements RevPointsGiftCardPurchaseScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsGiftcardsTermsAndConditionsScreenContract$InputData f83726a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsAndConditions(RevPointsGiftcardsTermsAndConditionsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        public TermsAndConditions(RevPointsGiftcardsTermsAndConditionsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f83726a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsAndConditions) && Intrinsics.f(this.f83726a, ((TermsAndConditions) obj2).f83726a);
        }

        public final int hashCode() {
            return this.f83726a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83726a.writeToParcel(dest, i);
        }
    }
}
