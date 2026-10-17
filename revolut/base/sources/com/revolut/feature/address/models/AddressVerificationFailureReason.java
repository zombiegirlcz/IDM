package com.revolut.feature.address.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/models/AddressVerificationFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "NON_RESIDENTIAL", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressVerificationFailureReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddressVerificationFailureReason[] $VALUES;
    public static final AddressVerificationFailureReason NON_RESIDENTIAL = new AddressVerificationFailureReason("NON_RESIDENTIAL", 0);

    private static final /* synthetic */ AddressVerificationFailureReason[] $values() {
        return new AddressVerificationFailureReason[]{NON_RESIDENTIAL};
    }

    static {
        AddressVerificationFailureReason[] addressVerificationFailureReasonArr$values = $values();
        $VALUES = addressVerificationFailureReasonArr$values;
        $ENTRIES = s.n(addressVerificationFailureReasonArr$values);
    }

    private AddressVerificationFailureReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AddressVerificationFailureReason valueOf(String str) {
        return (AddressVerificationFailureReason) Enum.valueOf(AddressVerificationFailureReason.class, str);
    }

    public static AddressVerificationFailureReason[] values() {
        return (AddressVerificationFailureReason[]) $VALUES.clone();
    }
}
