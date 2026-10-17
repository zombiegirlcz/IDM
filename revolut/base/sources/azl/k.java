package azl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final k LEFT_TO_RIGHT;
    public static final k NONE;
    public static final k RIGHT_TO_LEFT;

    static {
        k kVar = new k("NONE", 0);
        NONE = kVar;
        k kVar2 = new k("LEFT_TO_RIGHT", 1);
        LEFT_TO_RIGHT = kVar2;
        k kVar3 = new k("RIGHT_TO_LEFT", 2);
        RIGHT_TO_LEFT = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
        Companion = new j();
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
