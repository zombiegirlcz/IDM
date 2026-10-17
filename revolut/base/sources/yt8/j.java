package yt8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADDRESS;
    public static final j IDENTITY;
    public static final j JP_MY_NUMBER;
    public static final j RIGHT_TO_REMAIN;

    static {
        j jVar = new j("JP_MY_NUMBER", 0);
        JP_MY_NUMBER = jVar;
        j jVar2 = new j("RIGHT_TO_REMAIN", 1);
        RIGHT_TO_REMAIN = jVar2;
        j jVar3 = new j("IDENTITY", 2);
        IDENTITY = jVar3;
        j jVar4 = new j("ADDRESS", 3);
        ADDRESS = jVar4;
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
