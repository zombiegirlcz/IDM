package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b EXPIRED;
    public static final b IGNORED;
    public static final b INELIGIBLE;
    public static final b MAX_REACHED;
    public static final b REDEEMED;
    public static final b REWARD_AVAILABLE;
    public static final b VERIFYING;

    static {
        b bVar = new b("REDEEMED", 0);
        REDEEMED = bVar;
        b bVar2 = new b("REWARD_AVAILABLE", 1);
        REWARD_AVAILABLE = bVar2;
        b bVar3 = new b("VERIFYING", 2);
        VERIFYING = bVar3;
        b bVar4 = new b("ACTIVE", 3);
        ACTIVE = bVar4;
        b bVar5 = new b("EXPIRED", 4);
        EXPIRED = bVar5;
        b bVar6 = new b("IGNORED", 5);
        IGNORED = bVar6;
        b bVar7 = new b("MAX_REACHED", 6);
        MAX_REACHED = bVar7;
        b bVar8 = new b("INELIGIBLE", 7);
        INELIGIBLE = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
