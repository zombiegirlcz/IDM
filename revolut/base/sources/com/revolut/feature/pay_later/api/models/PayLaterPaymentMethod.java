package com.revolut.feature.pay_later.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterPaymentMethod;", "Landroid/os/Parcelable;", "", "DEBIT_CARD", "SINGLE_USE_CARD", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterPaymentMethod implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PayLaterPaymentMethod[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PayLaterPaymentMethod> CREATOR;
    public static final PayLaterPaymentMethod DEBIT_CARD;
    public static final PayLaterPaymentMethod SINGLE_USE_CARD;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PayLaterPaymentMethod.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterPaymentMethod[i];
        }
    }

    static {
        PayLaterPaymentMethod payLaterPaymentMethod = new PayLaterPaymentMethod("DEBIT_CARD", 0);
        DEBIT_CARD = payLaterPaymentMethod;
        PayLaterPaymentMethod payLaterPaymentMethod2 = new PayLaterPaymentMethod("SINGLE_USE_CARD", 1);
        SINGLE_USE_CARD = payLaterPaymentMethod2;
        PayLaterPaymentMethod[] payLaterPaymentMethodArr = {payLaterPaymentMethod, payLaterPaymentMethod2};
        $VALUES = payLaterPaymentMethodArr;
        $ENTRIES = s.n(payLaterPaymentMethodArr);
        CREATOR = new a();
    }

    public static PayLaterPaymentMethod valueOf(String str) {
        return (PayLaterPaymentMethod) Enum.valueOf(PayLaterPaymentMethod.class, str);
    }

    public static PayLaterPaymentMethod[] values() {
        return (PayLaterPaymentMethod[]) $VALUES.clone();
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
