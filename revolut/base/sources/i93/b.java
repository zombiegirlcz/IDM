package i93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CRYPTO;

    @NotNull
    public static final a Companion;
    public static final b FIAT;
    public static final b PRO_REGULAR_VAULT;
    public static final b REGULAR_VAULT;

    static {
        b bVar = new b("FIAT", 0);
        FIAT = bVar;
        b bVar2 = new b("CRYPTO", 1);
        CRYPTO = bVar2;
        b bVar3 = new b("REGULAR_VAULT", 2);
        REGULAR_VAULT = bVar3;
        b bVar4 = new b("PRO_REGULAR_VAULT", 3);
        PRO_REGULAR_VAULT = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
