package ke7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AudioOutput;
    public static final e Chat;
    public static final e End;
    public static final e Mute;

    static {
        e eVar = new e("Mute", 0);
        Mute = eVar;
        e eVar2 = new e("AudioOutput", 1);
        AudioOutput = eVar2;
        e eVar3 = new e("Chat", 2);
        Chat = eVar3;
        e eVar4 = new e("End", 3);
        End = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
