package r7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ANY;

    @NotNull
    public static final h Companion;
    public static final i NON_STOP;
    public static final i UNKNOWN;
    public static final i UP_TO_ONE_STOP;
    public static final i UP_TO_TWO_STOPS;

    static {
        i iVar = new i("ANY", 0);
        ANY = iVar;
        i iVar2 = new i("NON_STOP", 1);
        NON_STOP = iVar2;
        i iVar3 = new i("UP_TO_ONE_STOP", 2);
        UP_TO_ONE_STOP = iVar3;
        i iVar4 = new i("UP_TO_TWO_STOPS", 3);
        UP_TO_TWO_STOPS = iVar4;
        i iVar5 = new i("UNKNOWN", 4);
        UNKNOWN = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
        Companion = new h();
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
