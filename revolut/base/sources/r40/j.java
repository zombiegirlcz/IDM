package r40;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j DISMISS_CALL;
    public static final j DISMISS_CHAT;
    public static final j NONE;

    static {
        j jVar = new j("NONE", 0);
        NONE = jVar;
        j jVar2 = new j("DISMISS_CHAT", 1);
        DISMISS_CHAT = jVar2;
        j jVar3 = new j("DISMISS_CALL", 2);
        DISMISS_CALL = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
