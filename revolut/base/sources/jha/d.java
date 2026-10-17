package jha;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUSTRALIA;
    public static final d EUROPE;
    public static final d JAPAN;
    public static final d OTHER;
    public static final d SINGAPORE;
    public static final d USA;

    @NotNull
    private final String regionCode;

    static {
        d dVar = new d("EUROPE", 0, "EU");
        EUROPE = dVar;
        d dVar2 = new d("SINGAPORE", 1, "SG");
        SINGAPORE = dVar2;
        d dVar3 = new d("USA", 2, "US");
        USA = dVar3;
        d dVar4 = new d("JAPAN", 3, "JP");
        JAPAN = dVar4;
        d dVar5 = new d("AUSTRALIA", 4, "AU");
        AUSTRALIA = dVar5;
        d dVar6 = new d("OTHER", 5, "");
        OTHER = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.regionCode = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
