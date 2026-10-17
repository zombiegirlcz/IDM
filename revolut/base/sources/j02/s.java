package j02;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s AWAITING_USER_CONSENT;
    public static final s COMPLETED;
    public static final s FAILED;
    public static final s PENDING;
    public static final s VALIDATING;

    static {
        s sVar = new s("PENDING", 0);
        PENDING = sVar;
        s sVar2 = new s("AWAITING_USER_CONSENT", 1);
        AWAITING_USER_CONSENT = sVar2;
        s sVar3 = new s("VALIDATING", 2);
        VALIDATING = sVar3;
        s sVar4 = new s("FAILED", 3);
        FAILED = sVar4;
        s sVar5 = new s("COMPLETED", 4);
        COMPLETED = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
