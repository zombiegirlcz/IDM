package com.revolut.domain.models.tracking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/tracking/ProfileType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REVOLUT_USER", "NON_REVOLUT_USER", "GROUP", "BANK_BENEFICIARY", "PAYMENT_LINK", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfileType[] $VALUES;

    @NotNull
    private final String value;
    public static final ProfileType REVOLUT_USER = new ProfileType("REVOLUT_USER", 0, "RevUser");
    public static final ProfileType NON_REVOLUT_USER = new ProfileType("NON_REVOLUT_USER", 1, "NonRevUser");
    public static final ProfileType GROUP = new ProfileType("GROUP", 2, "Group");
    public static final ProfileType BANK_BENEFICIARY = new ProfileType("BANK_BENEFICIARY", 3, "BankBeneficiary");
    public static final ProfileType PAYMENT_LINK = new ProfileType("PAYMENT_LINK", 4, "PaymentLink");

    private static final /* synthetic */ ProfileType[] $values() {
        return new ProfileType[]{REVOLUT_USER, NON_REVOLUT_USER, GROUP, BANK_BENEFICIARY, PAYMENT_LINK};
    }

    static {
        ProfileType[] profileTypeArr$values = $values();
        $VALUES = profileTypeArr$values;
        $ENTRIES = s.n(profileTypeArr$values);
    }

    private ProfileType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ProfileType valueOf(String str) {
        return (ProfileType) Enum.valueOf(ProfileType.class, str);
    }

    public static ProfileType[] values() {
        return (ProfileType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
