package r7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHEAPEST;

    @NotNull
    public static final c Companion;
    public static final d FASTEST;
    public static final d RECOMMENDED;
    public static final d UNKNOWN;

    static {
        d dVar = new d("RECOMMENDED", 0);
        RECOMMENDED = dVar;
        d dVar2 = new d("CHEAPEST", 1);
        CHEAPEST = dVar2;
        d dVar3 = new d("FASTEST", 2);
        FASTEST = dVar3;
        d dVar4 = new d("UNKNOWN", 3);
        UNKNOWN = dVar4;
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
