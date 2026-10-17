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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPaymentMethod;", "Landroid/os/Parcelable;", "", "GIRO_HU_DIRECT_DEBIT", "IRIS", "PAY_TO", "PIX_MANDATE", "PSE", "WERO", "UPI", "MASAV_IL_DIRECT_DEBIT", "MASAV_IL_R2P", "AANI", "ALIPAY_PLUS", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmPaymentAuthorisationPaymentMethod implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApmPaymentAuthorisationPaymentMethod[] $VALUES;
    public static final ApmPaymentAuthorisationPaymentMethod AANI;
    public static final ApmPaymentAuthorisationPaymentMethod ALIPAY_PLUS;

    @NotNull
    public static final Parcelable.Creator<ApmPaymentAuthorisationPaymentMethod> CREATOR;
    public static final ApmPaymentAuthorisationPaymentMethod GIRO_HU_DIRECT_DEBIT;
    public static final ApmPaymentAuthorisationPaymentMethod IRIS;
    public static final ApmPaymentAuthorisationPaymentMethod MASAV_IL_DIRECT_DEBIT;
    public static final ApmPaymentAuthorisationPaymentMethod MASAV_IL_R2P;
    public static final ApmPaymentAuthorisationPaymentMethod PAY_TO;
    public static final ApmPaymentAuthorisationPaymentMethod PIX_MANDATE;
    public static final ApmPaymentAuthorisationPaymentMethod PSE;
    public static final ApmPaymentAuthorisationPaymentMethod UPI;
    public static final ApmPaymentAuthorisationPaymentMethod WERO;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ApmPaymentAuthorisationPaymentMethod.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentAuthorisationPaymentMethod[i];
        }
    }

    static {
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = new ApmPaymentAuthorisationPaymentMethod("GIRO_HU_DIRECT_DEBIT", 0);
        GIRO_HU_DIRECT_DEBIT = apmPaymentAuthorisationPaymentMethod;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod2 = new ApmPaymentAuthorisationPaymentMethod("IRIS", 1);
        IRIS = apmPaymentAuthorisationPaymentMethod2;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod3 = new ApmPaymentAuthorisationPaymentMethod("PAY_TO", 2);
        PAY_TO = apmPaymentAuthorisationPaymentMethod3;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod4 = new ApmPaymentAuthorisationPaymentMethod("PIX_MANDATE", 3);
        PIX_MANDATE = apmPaymentAuthorisationPaymentMethod4;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod5 = new ApmPaymentAuthorisationPaymentMethod("PSE", 4);
        PSE = apmPaymentAuthorisationPaymentMethod5;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod6 = new ApmPaymentAuthorisationPaymentMethod("WERO", 5);
        WERO = apmPaymentAuthorisationPaymentMethod6;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod7 = new ApmPaymentAuthorisationPaymentMethod("UPI", 6);
        UPI = apmPaymentAuthorisationPaymentMethod7;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod8 = new ApmPaymentAuthorisationPaymentMethod("MASAV_IL_DIRECT_DEBIT", 7);
        MASAV_IL_DIRECT_DEBIT = apmPaymentAuthorisationPaymentMethod8;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod9 = new ApmPaymentAuthorisationPaymentMethod("MASAV_IL_R2P", 8);
        MASAV_IL_R2P = apmPaymentAuthorisationPaymentMethod9;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod10 = new ApmPaymentAuthorisationPaymentMethod("AANI", 9);
        AANI = apmPaymentAuthorisationPaymentMethod10;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod11 = new ApmPaymentAuthorisationPaymentMethod("ALIPAY_PLUS", 10);
        ALIPAY_PLUS = apmPaymentAuthorisationPaymentMethod11;
        ApmPaymentAuthorisationPaymentMethod[] apmPaymentAuthorisationPaymentMethodArr = {apmPaymentAuthorisationPaymentMethod, apmPaymentAuthorisationPaymentMethod2, apmPaymentAuthorisationPaymentMethod3, apmPaymentAuthorisationPaymentMethod4, apmPaymentAuthorisationPaymentMethod5, apmPaymentAuthorisationPaymentMethod6, apmPaymentAuthorisationPaymentMethod7, apmPaymentAuthorisationPaymentMethod8, apmPaymentAuthorisationPaymentMethod9, apmPaymentAuthorisationPaymentMethod10, apmPaymentAuthorisationPaymentMethod11};
        $VALUES = apmPaymentAuthorisationPaymentMethodArr;
        $ENTRIES = s.n(apmPaymentAuthorisationPaymentMethodArr);
        CREATOR = new a();
    }

    public static ApmPaymentAuthorisationPaymentMethod valueOf(String str) {
        return (ApmPaymentAuthorisationPaymentMethod) Enum.valueOf(ApmPaymentAuthorisationPaymentMethod.class, str);
    }

    public static ApmPaymentAuthorisationPaymentMethod[] values() {
        return (ApmPaymentAuthorisationPaymentMethod[]) $VALUES.clone();
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
