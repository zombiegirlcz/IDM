package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ACTIVE;
    public static final s CONFIRMED;
    public static final s CREATED;
    public static final s DELETED;
    public static final s DISABLED;
    public static final s LOCKED;
    public static final s TERMINATED;
    public static final s WAITING;

    static {
        s sVar = new s("CREATED", 0);
        CREATED = sVar;
        s sVar2 = new s("CONFIRMED", 1);
        CONFIRMED = sVar2;
        s sVar3 = new s("ACTIVE", 2);
        ACTIVE = sVar3;
        s sVar4 = new s("DELETED", 3);
        DELETED = sVar4;
        s sVar5 = new s("LOCKED", 4);
        LOCKED = sVar5;
        s sVar6 = new s("DISABLED", 5);
        DISABLED = sVar6;
        s sVar7 = new s("TERMINATED", 6);
        TERMINATED = sVar7;
        s sVar8 = new s("WAITING", 7);
        WAITING = sVar8;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8};
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
