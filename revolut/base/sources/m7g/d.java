package m7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BUSINESS;

    @NotNull
    public static final c Companion;
    public static final d ECONOMY;
    public static final d FIRST;
    public static final d PREMIUM_ECONOMY;
    public static final d UNKNOWN;

    static {
        d dVar = new d("FIRST", 0);
        FIRST = dVar;
        d dVar2 = new d("BUSINESS", 1);
        BUSINESS = dVar2;
        d dVar3 = new d("PREMIUM_ECONOMY", 2);
        PREMIUM_ECONOMY = dVar3;
        d dVar4 = new d("ECONOMY", 3);
        ECONOMY = dVar4;
        d dVar5 = new d("UNKNOWN", 4);
        UNKNOWN = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
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
