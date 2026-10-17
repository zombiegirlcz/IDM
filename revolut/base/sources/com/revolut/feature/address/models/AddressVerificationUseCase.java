package com.revolut.feature.address.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/address/models/AddressVerificationUseCase;", "", "<init>", "(Ljava/lang/String;I)V", "RESIDENTIAL", "UNSPECIFIED", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressVerificationUseCase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddressVerificationUseCase[] $VALUES;
    public static final AddressVerificationUseCase RESIDENTIAL = new AddressVerificationUseCase("RESIDENTIAL", 0);
    public static final AddressVerificationUseCase UNSPECIFIED = new AddressVerificationUseCase("UNSPECIFIED", 1);

    private static final /* synthetic */ AddressVerificationUseCase[] $values() {
        return new AddressVerificationUseCase[]{RESIDENTIAL, UNSPECIFIED};
    }

    static {
        AddressVerificationUseCase[] addressVerificationUseCaseArr$values = $values();
        $VALUES = addressVerificationUseCaseArr$values;
        $ENTRIES = s.n(addressVerificationUseCaseArr$values);
    }

    private AddressVerificationUseCase(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AddressVerificationUseCase valueOf(String str) {
        return (AddressVerificationUseCase) Enum.valueOf(AddressVerificationUseCase.class, str);
    }

    public static AddressVerificationUseCase[] values() {
        return (AddressVerificationUseCase[]) $VALUES.clone();
    }
}
