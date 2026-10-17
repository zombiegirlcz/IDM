package com.revolut.feature.card_add_to_googlepay.impl.credit_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "Result", "a", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayCreditActivationDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f64468a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<GooglePayCreditActivationDestination> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result;", "Landroid/os/Parcelable;", "<init>", "()V", "ProceedWithGPay", "ContinueWithout", "Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result$ContinueWithout;", "Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result$ProceedWithGPay;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Result implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result$ContinueWithout;", "Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result;", "<init>", "()V", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ContinueWithout extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ContinueWithout f64469a = new ContinueWithout();

            @NotNull
            public static final Parcelable.Creator<ContinueWithout> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ContinueWithout.f64469a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContinueWithout[i];
                }
            }

            private ContinueWithout() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result$ProceedWithGPay;", "Lcom/revolut/feature/card_add_to_googlepay/impl/credit_activation/GooglePayCreditActivationDestination$Result;", "<init>", "()V", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ProceedWithGPay extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ProceedWithGPay f64470a = new ProceedWithGPay();

            @NotNull
            public static final Parcelable.Creator<ProceedWithGPay> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ProceedWithGPay.f64470a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProceedWithGPay[i];
                }
            }

            private ProceedWithGPay() {
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

        private Result() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.card_add_to_googlepay.impl.credit_activation.GooglePayCreditActivationDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayCreditActivationDestination((f0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayCreditActivationDestination[i];
        }
    }

    public GooglePayCreditActivationDestination(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f64468a = card;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f0 getF64468a() {
        return this.f64468a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GooglePayCreditActivationDestination) && Intrinsics.f(this.f64468a, ((GooglePayCreditActivationDestination) obj2).f64468a);
    }

    public final int hashCode() {
        return this.f64468a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64468a);
    }
}
