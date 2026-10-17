package xf2;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AMENDMENT;

    @NotNull
    public static final a Companion;
    public static final b MANDATE;
    public static final b ONE_OFF;

    @NotNull
    private final String value;

    static {
        b bVar = new b("MANDATE", 0, "mandate");
        MANDATE = bVar;
        b bVar2 = new b("AMENDMENT", 1, "amendment");
        AMENDMENT = bVar2;
        b bVar3 = new b("ONE_OFF", 2, "oneOff");
        ONE_OFF = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.value = str2;
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
        return this.value;
    }
}
