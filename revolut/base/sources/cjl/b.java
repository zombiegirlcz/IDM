package cjl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BUSINESS;

    @NotNull
    public static final a Companion;
    public static final b RETAIL;
    public static final b YOUTH;

    @NotNull
    private final String value;

    static {
        b bVar = new b("RETAIL", 0, "RETAIL");
        RETAIL = bVar;
        b bVar2 = new b("BUSINESS", 1, "BUSINESS");
        BUSINESS = bVar2;
        b bVar3 = new b("YOUTH", 2, "YOUTH");
        YOUTH = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
