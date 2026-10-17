package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/extensions/AvailableTypesErrorHandlerExtension$ErrorType", "Landroid/os/Parcelable;", "", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/extensions/AvailableTypesErrorHandlerExtension$ErrorType;", "", "code", "I", "a", "()I", "Companion", "WITHDRAWAL_COOLDOWN", "TRANSACTION_LIMIT", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvailableTypesErrorHandlerExtension$ErrorType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvailableTypesErrorHandlerExtension$ErrorType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<AvailableTypesErrorHandlerExtension$ErrorType> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AvailableTypesErrorHandlerExtension$ErrorType TRANSACTION_LIMIT;
    public static final AvailableTypesErrorHandlerExtension$ErrorType WITHDRAWAL_COOLDOWN;
    private final int code;

    /* JADX INFO: renamed from: com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.AvailableTypesErrorHandlerExtension$ErrorType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return AvailableTypesErrorHandlerExtension$ErrorType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvailableTypesErrorHandlerExtension$ErrorType[i];
        }
    }

    static {
        AvailableTypesErrorHandlerExtension$ErrorType availableTypesErrorHandlerExtension$ErrorType = new AvailableTypesErrorHandlerExtension$ErrorType("WITHDRAWAL_COOLDOWN", 0, 70206);
        WITHDRAWAL_COOLDOWN = availableTypesErrorHandlerExtension$ErrorType;
        AvailableTypesErrorHandlerExtension$ErrorType availableTypesErrorHandlerExtension$ErrorType2 = new AvailableTypesErrorHandlerExtension$ErrorType("TRANSACTION_LIMIT", 1, 4000);
        TRANSACTION_LIMIT = availableTypesErrorHandlerExtension$ErrorType2;
        AvailableTypesErrorHandlerExtension$ErrorType[] availableTypesErrorHandlerExtension$ErrorTypeArr = {availableTypesErrorHandlerExtension$ErrorType, availableTypesErrorHandlerExtension$ErrorType2};
        $VALUES = availableTypesErrorHandlerExtension$ErrorTypeArr;
        $ENTRIES = s.n(availableTypesErrorHandlerExtension$ErrorTypeArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public AvailableTypesErrorHandlerExtension$ErrorType(String str, int i, int i2) {
        this.code = i2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static AvailableTypesErrorHandlerExtension$ErrorType valueOf(String str) {
        return (AvailableTypesErrorHandlerExtension$ErrorType) Enum.valueOf(AvailableTypesErrorHandlerExtension$ErrorType.class, str);
    }

    public static AvailableTypesErrorHandlerExtension$ErrorType[] values() {
        return (AvailableTypesErrorHandlerExtension$ErrorType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
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
