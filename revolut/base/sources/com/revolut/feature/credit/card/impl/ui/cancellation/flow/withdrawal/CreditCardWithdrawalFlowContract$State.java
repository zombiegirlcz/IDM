package com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationConfig;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Loading", "Content", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State$Content;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State$Loading;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardWithdrawalFlowContract$State extends FlowState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State$Content;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements CreditCardWithdrawalFlowContract$State {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardCancellationConfig f69150a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content((CreditCardCancellationConfig) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(CreditCardCancellationConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f69150a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Content) && Intrinsics.f(this.f69150a, ((Content) obj2).f69150a);
        }

        public final int hashCode() {
            return this.f69150a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69150a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State$Loading;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/withdrawal/CreditCardWithdrawalFlowContract$State;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements CreditCardWithdrawalFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f69151a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f69151a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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
