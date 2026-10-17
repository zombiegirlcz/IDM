package zz9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BLOCKED_BY_TOO_MANY_USERS;
    public static final s CHAT_IS_NOT_SUPPORTED_BY_CONTACT;
    public static final s DISABLED;
    public static final s DISABLED_BY_CONTACT;
    public static final s DISABLED_BY_PRIVACY;
    public static final s EMPTY_REMOTE_CONTACT;
    public static final s ENABLED;
    public static final s NON_REVOLUT_CONTACT;
    public static final s TEXT_NOT_SUPPORTED;
    public static final s USER_IS_BLOCKED;
    public static final s USER_IS_COMPLETELY_BLOCKED;

    static {
        s sVar = new s("ENABLED", 0);
        ENABLED = sVar;
        s sVar2 = new s("USER_IS_BLOCKED", 1);
        USER_IS_BLOCKED = sVar2;
        s sVar3 = new s("DISABLED_BY_PRIVACY", 2);
        DISABLED_BY_PRIVACY = sVar3;
        s sVar4 = new s("DISABLED_BY_CONTACT", 3);
        DISABLED_BY_CONTACT = sVar4;
        s sVar5 = new s("DISABLED", 4);
        DISABLED = sVar5;
        s sVar6 = new s("CHAT_IS_NOT_SUPPORTED_BY_CONTACT", 5);
        CHAT_IS_NOT_SUPPORTED_BY_CONTACT = sVar6;
        s sVar7 = new s("TEXT_NOT_SUPPORTED", 6);
        TEXT_NOT_SUPPORTED = sVar7;
        s sVar8 = new s("NON_REVOLUT_CONTACT", 7);
        NON_REVOLUT_CONTACT = sVar8;
        s sVar9 = new s("EMPTY_REMOTE_CONTACT", 8);
        EMPTY_REMOTE_CONTACT = sVar9;
        s sVar10 = new s("USER_IS_COMPLETELY_BLOCKED", 9);
        USER_IS_COMPLETELY_BLOCKED = sVar10;
        s sVar11 = new s("BLOCKED_BY_TOO_MANY_USERS", 10);
        BLOCKED_BY_TOO_MANY_USERS = sVar11;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11};
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
