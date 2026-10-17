package b93;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DISPOSABLE;
    public static final e FREELANCER;
    public static final e FREELANCER_DISPOSABLE;
    public static final e FREELANCER_VIRTUAL;
    public static final e JUNIOR;
    public static final e JUNIOR_VIRTUAL;
    public static final e PHYSICAL;
    public static final e VIRTUAL;

    static {
        e eVar = new e("PHYSICAL", 0);
        PHYSICAL = eVar;
        e eVar2 = new e("VIRTUAL", 1);
        VIRTUAL = eVar2;
        e eVar3 = new e("JUNIOR", 2);
        JUNIOR = eVar3;
        e eVar4 = new e("FREELANCER", 3);
        FREELANCER = eVar4;
        e eVar5 = new e("FREELANCER_VIRTUAL", 4);
        FREELANCER_VIRTUAL = eVar5;
        e eVar6 = new e("JUNIOR_VIRTUAL", 5);
        JUNIOR_VIRTUAL = eVar6;
        e eVar7 = new e("DISPOSABLE", 6);
        DISPOSABLE = eVar7;
        e eVar8 = new e("FREELANCER_DISPOSABLE", 7);
        FREELANCER_DISPOSABLE = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
