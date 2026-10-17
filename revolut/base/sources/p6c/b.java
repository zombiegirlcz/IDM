package p6c;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Business;
    public static final b BusinessOnly;

    @NotNull
    public static final a Companion;
    public static final b Retail;
    public static final b RetailOnly;

    @NotNull
    private final String param;

    static {
        b bVar = new b("Retail", 0, "retail");
        Retail = bVar;
        b bVar2 = new b("RetailOnly", 1, "retail-only");
        RetailOnly = bVar2;
        b bVar3 = new b("Business", 2, "business");
        Business = bVar3;
        b bVar4 = new b("BusinessOnly", 3, "business-only");
        BusinessOnly = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.param = str2;
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
        return this.param;
    }
}
