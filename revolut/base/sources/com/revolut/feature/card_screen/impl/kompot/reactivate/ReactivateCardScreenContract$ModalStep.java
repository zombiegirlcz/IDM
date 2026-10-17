package com.revolut.feature.card_screen.impl.kompot.reactivate;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/reactivate/ReactivateCardScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowConfirmationDialog", "Lcom/revolut/feature/card_screen/impl/kompot/reactivate/ReactivateCardScreenContract$ModalStep$ShowConfirmationDialog;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReactivateCardScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/reactivate/ReactivateCardScreenContract$ModalStep$ShowConfirmationDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/reactivate/ReactivateCardScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationDialog implements ReactivateCardScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TerminatedCard f65488a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowConfirmationDialog((TerminatedCard) parcel.readParcelable(ShowConfirmationDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowConfirmationDialog[i];
            }
        }

        public ShowConfirmationDialog(TerminatedCard terminatedCard) {
            Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
            this.f65488a = terminatedCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowConfirmationDialog) && Intrinsics.f(this.f65488a, ((ShowConfirmationDialog) obj2).f65488a);
        }

        public final int hashCode() {
            return this.f65488a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65488a, i);
        }
    }
}
