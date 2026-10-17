package com.revolut.retail.feature.beneficiary.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCodeVersion;", "Landroid/os/Parcelable;", "", "Companion", "a", "V1", "V2", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentCodeVersion implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentCodeVersion[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PaymentCodeVersion> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PaymentCodeVersion V1;
    public static final PaymentCodeVersion V2;

    /* JADX INFO: renamed from: com.revolut.retail.feature.beneficiary.api.domain.PaymentCodeVersion$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PaymentCodeVersion.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCodeVersion[i];
        }
    }

    static {
        PaymentCodeVersion paymentCodeVersion = new PaymentCodeVersion("V1", 0);
        V1 = paymentCodeVersion;
        PaymentCodeVersion paymentCodeVersion2 = new PaymentCodeVersion("V2", 1);
        V2 = paymentCodeVersion2;
        PaymentCodeVersion[] paymentCodeVersionArr = {paymentCodeVersion, paymentCodeVersion2};
        $VALUES = paymentCodeVersionArr;
        $ENTRIES = s.n(paymentCodeVersionArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public static PaymentCodeVersion valueOf(String str) {
        return (PaymentCodeVersion) Enum.valueOf(PaymentCodeVersion.class, str);
    }

    public static PaymentCodeVersion[] values() {
        return (PaymentCodeVersion[]) $VALUES.clone();
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
