package o7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CABIN;
    public static final d CHECKED;

    @NotNull
    public static final c Companion;
    public static final d PERSONAL;
    public static final d UNKNOWN;

    static {
        d dVar = new d("UNKNOWN", 0);
        UNKNOWN = dVar;
        d dVar2 = new d("PERSONAL", 1);
        PERSONAL = dVar2;
        d dVar3 = new d("CABIN", 2);
        CABIN = dVar3;
        d dVar4 = new d("CHECKED", 3);
        CHECKED = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
