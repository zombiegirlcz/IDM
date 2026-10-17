package o5l;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b MAESTRO;
    public static final b MASTERCARD;
    public static final b MULTIBANCO;
    public static final b NONE;
    public static final b VISA;

    @NotNull
    private final String key;

    static {
        b bVar = new b("NONE", 0, "");
        NONE = bVar;
        b bVar2 = new b("VISA", 1, "VISA");
        VISA = bVar2;
        b bVar3 = new b("MASTERCARD", 2, "MASTERCARD");
        MASTERCARD = bVar3;
        b bVar4 = new b("MAESTRO", 3, "MAESTRO");
        MAESTRO = bVar4;
        b bVar5 = new b("MULTIBANCO", 4, "MULTIBANCO");
        MULTIBANCO = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.key = str2;
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

    public final String b() {
        return this.key;
    }
}
