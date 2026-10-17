package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class br {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ br[] $VALUES;
    public static final br CENTER;
    public static final br START;

    static {
        br brVar = new br("START", 0);
        START = brVar;
        br brVar2 = new br("CENTER", 1);
        CENTER = brVar2;
        br[] brVarArr = {brVar, brVar2};
        $VALUES = brVarArr;
        $ENTRIES = vc.s.n(brVarArr);
    }

    public static br valueOf(String str) {
        return (br) Enum.valueOf(br.class, str);
    }

    public static br[] values() {
        return (br[]) $VALUES.clone();
    }
}
