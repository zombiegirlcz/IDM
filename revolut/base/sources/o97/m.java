package o97;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CRYPTO;
    public static final m DEEPLINK;
    public static final m FAQ;
    public static final m INVEST;
    public static final m SMART_TILE;

    @NotNull
    private final String value;

    static {
        m mVar = new m("CRYPTO", 0, "CRYPTO");
        CRYPTO = mVar;
        m mVar2 = new m("SMART_TILE", 1, "SMART_TILE");
        SMART_TILE = mVar2;
        m mVar3 = new m("DEEPLINK", 2, "DEEPLINK");
        DEEPLINK = mVar3;
        m mVar4 = new m("INVEST", 3, "INVEST");
        INVEST = mVar4;
        m mVar5 = new m("FAQ", 4, "FAQ");
        FAQ = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public m(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
