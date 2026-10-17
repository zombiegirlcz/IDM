package hha;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ANNUAL;

    @NotNull
    public static final h Companion;
    public static final i MONTHLY;

    static {
        i iVar = new i("MONTHLY", 0);
        MONTHLY = iVar;
        i iVar2 = new i("ANNUAL", 1);
        ANNUAL = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
        Companion = new h();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
