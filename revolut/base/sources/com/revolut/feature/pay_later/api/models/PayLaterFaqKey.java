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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterFaqKey;", "Landroid/os/Parcelable;", "", "GENERAL_TOPIC", "QUESTION_WHEN_AND_WHERE_CAN_I_USE_IT", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterFaqKey implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PayLaterFaqKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PayLaterFaqKey> CREATOR;
    public static final PayLaterFaqKey GENERAL_TOPIC;
    public static final PayLaterFaqKey QUESTION_WHEN_AND_WHERE_CAN_I_USE_IT;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PayLaterFaqKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterFaqKey[i];
        }
    }

    static {
        PayLaterFaqKey payLaterFaqKey = new PayLaterFaqKey("GENERAL_TOPIC", 0);
        GENERAL_TOPIC = payLaterFaqKey;
        PayLaterFaqKey payLaterFaqKey2 = new PayLaterFaqKey("QUESTION_WHEN_AND_WHERE_CAN_I_USE_IT", 1);
        QUESTION_WHEN_AND_WHERE_CAN_I_USE_IT = payLaterFaqKey2;
        PayLaterFaqKey[] payLaterFaqKeyArr = {payLaterFaqKey, payLaterFaqKey2};
        $VALUES = payLaterFaqKeyArr;
        $ENTRIES = s.n(payLaterFaqKeyArr);
        CREATOR = new a();
    }

    public static PayLaterFaqKey valueOf(String str) {
        return (PayLaterFaqKey) Enum.valueOf(PayLaterFaqKey.class, str);
    }

    public static PayLaterFaqKey[] values() {
        return (PayLaterFaqKey[]) $VALUES.clone();
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
