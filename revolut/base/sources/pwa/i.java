package pwa;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ACTIVE;
    public static final i PAST;

    @NotNull
    private final String typeCode;

    static {
        i iVar = new i("ACTIVE", 0, "active");
        ACTIVE = iVar;
        i iVar2 = new i("PAST", 1, "past");
        PAST = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public i(String str, int i, String str2) {
        this.typeCode = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.typeCode;
    }
}
