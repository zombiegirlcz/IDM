package xo0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CHAT_INPUT;
    public static final e PROMPT_SUGGESTION;
    public static final e REPLY;
    public static final e SUGGESTION;

    static {
        e eVar = new e("CHAT_INPUT", 0);
        CHAT_INPUT = eVar;
        e eVar2 = new e("SUGGESTION", 1);
        SUGGESTION = eVar2;
        e eVar3 = new e("REPLY", 2);
        REPLY = eVar3;
        e eVar4 = new e("PROMPT_SUGGESTION", 3);
        PROMPT_SUGGESTION = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
