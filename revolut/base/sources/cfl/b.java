package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b CREATED;
    public static final b OFFBOARDING;
    public static final b ONBOARDING;
    public static final b SUSPENDED;
    public static final b TERMINATED;

    static {
        b bVar = new b("CREATED", 0);
        CREATED = bVar;
        b bVar2 = new b("ONBOARDING", 1);
        ONBOARDING = bVar2;
        b bVar3 = new b("ACTIVE", 2);
        ACTIVE = bVar3;
        b bVar4 = new b("SUSPENDED", 3);
        SUSPENDED = bVar4;
        b bVar5 = new b("OFFBOARDING", 4);
        OFFBOARDING = bVar5;
        b bVar6 = new b("TERMINATED", 5);
        TERMINATED = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
