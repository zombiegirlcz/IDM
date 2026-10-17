package com.revolut.domain.models.openbanking.penny_verification;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/openbanking/penny_verification/PennyAuthorisationResult;", "", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "PASSED", "FAILED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PennyAuthorisationResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PennyAuthorisationResult[] $VALUES;
    public static final PennyAuthorisationResult IN_PROGRESS = new PennyAuthorisationResult("IN_PROGRESS", 0);
    public static final PennyAuthorisationResult PASSED = new PennyAuthorisationResult("PASSED", 1);
    public static final PennyAuthorisationResult FAILED = new PennyAuthorisationResult("FAILED", 2);

    private static final /* synthetic */ PennyAuthorisationResult[] $values() {
        return new PennyAuthorisationResult[]{IN_PROGRESS, PASSED, FAILED};
    }

    static {
        PennyAuthorisationResult[] pennyAuthorisationResultArr$values = $values();
        $VALUES = pennyAuthorisationResultArr$values;
        $ENTRIES = s.n(pennyAuthorisationResultArr$values);
    }

    private PennyAuthorisationResult(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PennyAuthorisationResult valueOf(String str) {
        return (PennyAuthorisationResult) Enum.valueOf(PennyAuthorisationResult.class, str);
    }

    public static PennyAuthorisationResult[] values() {
        return (PennyAuthorisationResult[]) $VALUES.clone();
    }
}
