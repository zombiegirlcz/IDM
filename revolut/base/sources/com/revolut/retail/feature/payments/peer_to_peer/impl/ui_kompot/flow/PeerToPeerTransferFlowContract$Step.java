package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Amount", "Review", "Personalisation", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Amount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Personalisation;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Review;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Amount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements PeerToPeerTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerAmountScreenContract$InputData f102341a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((PeerToPeerAmountScreenContract$InputData) parcel.readParcelable(Amount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(PeerToPeerAmountScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102341a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f102341a, ((Amount) obj2).f102341a);
        }

        public final int hashCode() {
            return this.f102341a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102341a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Personalisation;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personalisation implements PeerToPeerTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Personalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StyleScreenInput f102342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PeerToPeerAmountScreenContract$InputData.WithTransferData f102343b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personalisation((StyleScreenInput) parcel.readParcelable(Personalisation.class.getClassLoader()), PeerToPeerAmountScreenContract$InputData.WithTransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personalisation[i];
            }
        }

        public Personalisation(StyleScreenInput styleScreenInput, PeerToPeerAmountScreenContract$InputData.WithTransferData amountInputData) {
            Intrinsics.checkNotNullParameter(styleScreenInput, "styleScreenInput");
            Intrinsics.checkNotNullParameter(amountInputData, "amountInputData");
            this.f102342a = styleScreenInput;
            this.f102343b = amountInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Personalisation)) {
                return false;
            }
            Personalisation personalisation = (Personalisation) obj2;
            return Intrinsics.f(this.f102342a, personalisation.f102342a) && Intrinsics.f(this.f102343b, personalisation.f102343b);
        }

        public final int hashCode() {
            return this.f102343b.hashCode() + (this.f102342a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102342a, i);
            this.f102343b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step$Review;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements PeerToPeerTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerReviewScreenInputData f102344a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review((PeerToPeerReviewScreenInputData) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(PeerToPeerReviewScreenInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102344a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f102344a, ((Review) obj2).f102344a);
        }

        public final int hashCode() {
            return this.f102344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102344a, i);
        }
    }
}
