package pr0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;

    @NotNull
    private static final String DATE_STYLE_SHORT_TIME_HIDDEN = "S-";
    public static final d DMY;
    public static final d MDY;
    public static final d YMD;

    static {
        d dVar = new d("DMY", 0);
        DMY = dVar;
        d dVar2 = new d("MDY", 1);
        MDY = dVar2;
        d dVar3 = new d("YMD", 2);
        YMD = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
