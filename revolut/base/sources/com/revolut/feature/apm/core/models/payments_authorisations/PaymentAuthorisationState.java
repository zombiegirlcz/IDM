package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentAuthorisationState;", "Landroid/os/Parcelable;", "", "PENDING", "ACTIVE", "SUSPENDED", "DEACTIVATED", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentAuthorisationState implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentAuthorisationState[] $VALUES;
    public static final PaymentAuthorisationState ACTIVE;

    @NotNull
    public static final Parcelable.Creator<PaymentAuthorisationState> CREATOR;
    public static final PaymentAuthorisationState DEACTIVATED;
    public static final PaymentAuthorisationState PENDING;
    public static final PaymentAuthorisationState SUSPENDED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PaymentAuthorisationState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentAuthorisationState[i];
        }
    }

    static {
        PaymentAuthorisationState paymentAuthorisationState = new PaymentAuthorisationState("PENDING", 0);
        PENDING = paymentAuthorisationState;
        PaymentAuthorisationState paymentAuthorisationState2 = new PaymentAuthorisationState("ACTIVE", 1);
        ACTIVE = paymentAuthorisationState2;
        PaymentAuthorisationState paymentAuthorisationState3 = new PaymentAuthorisationState("SUSPENDED", 2);
        SUSPENDED = paymentAuthorisationState3;
        PaymentAuthorisationState paymentAuthorisationState4 = new PaymentAuthorisationState("DEACTIVATED", 3);
        DEACTIVATED = paymentAuthorisationState4;
        PaymentAuthorisationState[] paymentAuthorisationStateArr = {paymentAuthorisationState, paymentAuthorisationState2, paymentAuthorisationState3, paymentAuthorisationState4};
        $VALUES = paymentAuthorisationStateArr;
        $ENTRIES = s.n(paymentAuthorisationStateArr);
        CREATOR = new a();
    }

    public static PaymentAuthorisationState valueOf(String str) {
        return (PaymentAuthorisationState) Enum.valueOf(PaymentAuthorisationState.class, str);
    }

    public static PaymentAuthorisationState[] values() {
        return (PaymentAuthorisationState[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
