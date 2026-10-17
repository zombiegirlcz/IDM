package gh7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACCEPTED;
    public static final l CLOSED;
    public static final l COMPLETED;
    public static final l NOT_READ;
    public static final l OPEN;
    public static final l OPENED;
    public static final l READ;
    public static final l VIEWED;

    static {
        l lVar = new l("ACCEPTED", 0);
        ACCEPTED = lVar;
        l lVar2 = new l("VIEWED", 1);
        VIEWED = lVar2;
        l lVar3 = new l("CLOSED", 2);
        CLOSED = lVar3;
        l lVar4 = new l("OPEN", 3);
        OPEN = lVar4;
        l lVar5 = new l("READ", 4);
        READ = lVar5;
        l lVar6 = new l("NOT_READ", 5);
        NOT_READ = lVar6;
        l lVar7 = new l("COMPLETED", 6);
        COMPLETED = lVar7;
        l lVar8 = new l("OPENED", 7);
        OPENED = lVar8;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
