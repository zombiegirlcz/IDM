package ui0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALPHA;
    public static final k BETA;

    @NotNull
    public static final j Companion;
    public static final k DEVELOPMENT;
    public static final k INTERNAL;
    public static final k PRODUCTION;
    private final int code;

    static {
        k kVar = new k("DEVELOPMENT", 0, 9);
        DEVELOPMENT = kVar;
        k kVar2 = new k("INTERNAL", 1, 7);
        INTERNAL = kVar2;
        k kVar3 = new k("ALPHA", 2, 5);
        ALPHA = kVar3;
        k kVar4 = new k("BETA", 3, 3);
        BETA = kVar4;
        k kVar5 = new k("PRODUCTION", 4, 1);
        PRODUCTION = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
        Companion = new j();
    }

    public k(String str, int i, int i2) {
        this.code = i2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }
}
