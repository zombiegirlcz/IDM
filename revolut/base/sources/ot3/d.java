package ot3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHECK_LIST;
    public static final d DOCUMENT_ISSUE;
    public static final d LIMIT_EXCEEDED;
    public static final d NEWTONS_CRADLE;
    public static final d TICK;
    public static final d TROPHY_WINNER;

    static {
        d dVar = new d("TICK", 0);
        TICK = dVar;
        d dVar2 = new d("NEWTONS_CRADLE", 1);
        NEWTONS_CRADLE = dVar2;
        d dVar3 = new d("DOCUMENT_ISSUE", 2);
        DOCUMENT_ISSUE = dVar3;
        d dVar4 = new d("TROPHY_WINNER", 3);
        TROPHY_WINNER = dVar4;
        d dVar5 = new d("LIMIT_EXCEEDED", 4);
        LIMIT_EXCEEDED = dVar5;
        d dVar6 = new d("CHECK_LIST", 5);
        CHECK_LIST = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
