package npg;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CSV;
    public static final i PDF;
    public static final i UNKNOWN;

    @NotNull
    private final String formatName;

    static {
        i iVar = new i("PDF", 0, "PDF");
        PDF = iVar;
        i iVar2 = new i("CSV", 1, "CSV");
        CSV = iVar2;
        i iVar3 = new i("UNKNOWN", 2, "");
        UNKNOWN = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public i(String str, int i, String str2) {
        this.formatName = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
