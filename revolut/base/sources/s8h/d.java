package s8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BOND;
    public static final d CFD;
    public static final d CRYPTO;

    @NotNull
    public static final c Companion;
    public static final d SECURITY;
    public static final d STOCK;

    @NotNull
    private final String value;

    static {
        d dVar = new d("STOCK", 0, "stock");
        STOCK = dVar;
        d dVar2 = new d("SECURITY", 1, "security");
        SECURITY = dVar2;
        d dVar3 = new d("BOND", 2, "bond");
        BOND = dVar3;
        d dVar4 = new d("CFD", 3, "cfd");
        CFD = dVar4;
        d dVar5 = new d("CRYPTO", 4, "crypto");
        CRYPTO = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, String str2) {
        this.value = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
