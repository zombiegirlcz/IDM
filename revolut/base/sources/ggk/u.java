package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u TERMINATED_AFTER_CREDIT_CARD_ACTIVATION;

    static {
        u uVar = new u("TERMINATED_AFTER_CREDIT_CARD_ACTIVATION", 0);
        TERMINATED_AFTER_CREDIT_CARD_ACTIVATION = uVar;
        u[] uVarArr = {uVar};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
