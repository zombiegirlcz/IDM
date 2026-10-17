package com.revolut.domain.models.property;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/property/ActionKey;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "ACCOUNT_DETAILS", "UNKNOWN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActionKey[] $VALUES;

    @NotNull
    private final String value;
    public static final ActionKey ACCOUNT_DETAILS = new ActionKey("ACCOUNT_DETAILS", 0, "ACCOUNT_DETAILS");
    public static final ActionKey UNKNOWN = new ActionKey("UNKNOWN", 1, "UNKNOWN");

    private static final /* synthetic */ ActionKey[] $values() {
        return new ActionKey[]{ACCOUNT_DETAILS, UNKNOWN};
    }

    static {
        ActionKey[] actionKeyArr$values = $values();
        $VALUES = actionKeyArr$values;
        $ENTRIES = s.n(actionKeyArr$values);
        INSTANCE = new Companion();
    }

    private ActionKey(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ActionKey valueOf(String str) {
        return (ActionKey) Enum.valueOf(ActionKey.class, str);
    }

    public static ActionKey[] values() {
        return (ActionKey[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
