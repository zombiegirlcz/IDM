package sdl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACTIVE;
    public static final m CREATED;
    public static final m OFFBOARDING;
    public static final m ONBOARDING;
    public static final m SUSPENDED;
    public static final m TERMINATED;

    static {
        m mVar = new m("CREATED", 0);
        CREATED = mVar;
        m mVar2 = new m("ONBOARDING", 1);
        ONBOARDING = mVar2;
        m mVar3 = new m("ACTIVE", 2);
        ACTIVE = mVar3;
        m mVar4 = new m("SUSPENDED", 3);
        SUSPENDED = mVar4;
        m mVar5 = new m("OFFBOARDING", 4);
        OFFBOARDING = mVar5;
        m mVar6 = new m("TERMINATED", 5);
        TERMINATED = mVar6;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
