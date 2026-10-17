package com.revolut.feature.giro.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PocketSelector", "Lcom/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreenContract$ModalStep$PocketSelector;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DirectDebitReviewScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreenContract$ModalStep$PocketSelector;", "Lcom/revolut/feature/giro/impl/ui/review/DirectDebitReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketSelector implements DirectDebitReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PocketSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectedPocket f74558a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketSelector(SelectedPocket.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketSelector[i];
            }
        }

        public PocketSelector(SelectedPocket selectedPocket) {
            Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
            this.f74558a = selectedPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketSelector) && Intrinsics.f(this.f74558a, ((PocketSelector) obj2).f74558a);
        }

        public final int hashCode() {
            return this.f74558a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f74558a.writeToParcel(dest, i);
        }
    }
}
