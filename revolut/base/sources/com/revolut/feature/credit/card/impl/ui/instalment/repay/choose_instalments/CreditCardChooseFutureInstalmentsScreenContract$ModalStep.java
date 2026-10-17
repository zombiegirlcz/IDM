package com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectInstalment", "InterestSaved", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep$InterestSaved;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep$SelectInstalment;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardChooseFutureInstalmentsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep$InterestSaved;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InterestSaved implements CreditCardChooseFutureInstalmentsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterestSaved f69465a = new InterestSaved();

        @NotNull
        public static final Parcelable.Creator<InterestSaved> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InterestSaved.f69465a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestSaved[i];
            }
        }

        private InterestSaved() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep$SelectInstalment;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectInstalment implements CreditCardChooseFutureInstalmentsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectInstalment f69466a = new SelectInstalment();

        @NotNull
        public static final Parcelable.Creator<SelectInstalment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectInstalment.f69466a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectInstalment[i];
            }
        }

        private SelectInstalment() {
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
