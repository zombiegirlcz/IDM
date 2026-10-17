package zy5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j STORY_ADD_MONEY;
    public static final j STORY_APM_BIZUM;
    public static final j STORY_APM_BLIK;
    public static final j STORY_MOVE_MONEY;

    static {
        j jVar = new j("STORY_ADD_MONEY", 0);
        STORY_ADD_MONEY = jVar;
        j jVar2 = new j("STORY_MOVE_MONEY", 1);
        STORY_MOVE_MONEY = jVar2;
        j jVar3 = new j("STORY_APM_BIZUM", 2);
        STORY_APM_BIZUM = jVar3;
        j jVar4 = new j("STORY_APM_BLIK", 3);
        STORY_APM_BLIK = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
