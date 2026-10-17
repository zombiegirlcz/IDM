package com.revolut.domain.models.externalcards;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/externalcards/CardholderVerificationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PASSED", "FAILED", "AUTOMATIC_VERIFICATION_UNSUPPORTED", "IN_PROGRESS", "AUTOMATIC_VERIFICATION_NEEDED", "VERIFICATION_PROHIBITED", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardholderVerificationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardholderVerificationStatus[] $VALUES;
    public static final CardholderVerificationStatus PASSED = new CardholderVerificationStatus("PASSED", 0);
    public static final CardholderVerificationStatus FAILED = new CardholderVerificationStatus("FAILED", 1);
    public static final CardholderVerificationStatus AUTOMATIC_VERIFICATION_UNSUPPORTED = new CardholderVerificationStatus("AUTOMATIC_VERIFICATION_UNSUPPORTED", 2);
    public static final CardholderVerificationStatus IN_PROGRESS = new CardholderVerificationStatus("IN_PROGRESS", 3);
    public static final CardholderVerificationStatus AUTOMATIC_VERIFICATION_NEEDED = new CardholderVerificationStatus("AUTOMATIC_VERIFICATION_NEEDED", 4);
    public static final CardholderVerificationStatus VERIFICATION_PROHIBITED = new CardholderVerificationStatus("VERIFICATION_PROHIBITED", 5);

    private static final /* synthetic */ CardholderVerificationStatus[] $values() {
        return new CardholderVerificationStatus[]{PASSED, FAILED, AUTOMATIC_VERIFICATION_UNSUPPORTED, IN_PROGRESS, AUTOMATIC_VERIFICATION_NEEDED, VERIFICATION_PROHIBITED};
    }

    static {
        CardholderVerificationStatus[] cardholderVerificationStatusArr$values = $values();
        $VALUES = cardholderVerificationStatusArr$values;
        $ENTRIES = s.n(cardholderVerificationStatusArr$values);
    }

    private CardholderVerificationStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CardholderVerificationStatus valueOf(String str) {
        return (CardholderVerificationStatus) Enum.valueOf(CardholderVerificationStatus.class, str);
    }

    public static CardholderVerificationStatus[] values() {
        return (CardholderVerificationStatus[]) $VALUES.clone();
    }
}
