package com.revolut.feature.shared.beneficiary.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/domain/PaymentCodeType;", "Landroid/os/Parcelable;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "a", "EUROPEAN", "SWISS", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentCodeType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentCodeType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PaymentCodeType> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PaymentCodeType EUROPEAN;
    public static final PaymentCodeType SWISS;

    @NotNull
    private final String id;

    /* JADX INFO: renamed from: com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PaymentCodeType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCodeType[i];
        }
    }

    static {
        PaymentCodeType paymentCodeType = new PaymentCodeType("EUROPEAN", 0, "BCD");
        EUROPEAN = paymentCodeType;
        PaymentCodeType paymentCodeType2 = new PaymentCodeType("SWISS", 1, "SPC");
        SWISS = paymentCodeType2;
        PaymentCodeType[] paymentCodeTypeArr = {paymentCodeType, paymentCodeType2};
        $VALUES = paymentCodeTypeArr;
        $ENTRIES = s.n(paymentCodeTypeArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public PaymentCodeType(String str, int i, String str2) {
        this.id = str2;
    }

    public static PaymentCodeType valueOf(String str) {
        return (PaymentCodeType) Enum.valueOf(PaymentCodeType.class, str);
    }

    public static PaymentCodeType[] values() {
        return (PaymentCodeType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
