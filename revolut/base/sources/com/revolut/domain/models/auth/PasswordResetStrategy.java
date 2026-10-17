package com.revolut.domain.models.auth;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/domain/models/auth/PasswordResetStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "CODE", "LAST_FOUR", "LAST_AMOUNT", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasswordResetStrategy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PasswordResetStrategy[] $VALUES;
    public static final PasswordResetStrategy CODE = new PasswordResetStrategy("CODE", 0);
    public static final PasswordResetStrategy LAST_FOUR = new PasswordResetStrategy("LAST_FOUR", 1);
    public static final PasswordResetStrategy LAST_AMOUNT = new PasswordResetStrategy("LAST_AMOUNT", 2);

    private static final /* synthetic */ PasswordResetStrategy[] $values() {
        return new PasswordResetStrategy[]{CODE, LAST_FOUR, LAST_AMOUNT};
    }

    static {
        PasswordResetStrategy[] passwordResetStrategyArr$values = $values();
        $VALUES = passwordResetStrategyArr$values;
        $ENTRIES = s.n(passwordResetStrategyArr$values);
    }

    private PasswordResetStrategy(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PasswordResetStrategy valueOf(String str) {
        return (PasswordResetStrategy) Enum.valueOf(PasswordResetStrategy.class, str);
    }

    public static PasswordResetStrategy[] values() {
        return (PasswordResetStrategy[]) $VALUES.clone();
    }
}
