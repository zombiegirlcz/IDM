package l15;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CONTACT_SUPPORT;
    public static final j NEW_APPLICATION;
    public static final j RESUME_APPLICATION;

    static {
        j jVar = new j("NEW_APPLICATION", 0);
        NEW_APPLICATION = jVar;
        j jVar2 = new j("RESUME_APPLICATION", 1);
        RESUME_APPLICATION = jVar2;
        j jVar3 = new j("CONTACT_SUPPORT", 2);
        CONTACT_SUPPORT = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
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
