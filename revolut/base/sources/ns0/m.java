package ns0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Currency;
    public static final m Other;
    public static final m Percentage;
    public static final m Separator;
    public static final m Sign;
    private final boolean animatesEntry;
    private final boolean animatesRemoval;
    private final boolean rolls;

    static {
        m mVar = new m("Sign", true, true, true, 0);
        Sign = mVar;
        m mVar2 = new m("Percentage", true, true, true, 1);
        Percentage = mVar2;
        m mVar3 = new m("Separator", false, true, true, 2);
        Separator = mVar3;
        m mVar4 = new m("Currency", false, true, true, 3);
        Currency = mVar4;
        m mVar5 = new m("Other", false, false, false, 4);
        Other = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public m(String str, boolean z, boolean z3, boolean z4, int i) {
        this.rolls = z;
        this.animatesEntry = z3;
        this.animatesRemoval = z4;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.animatesEntry;
    }

    public final boolean b() {
        return this.animatesRemoval;
    }

    public final boolean c() {
        return this.rolls;
    }
}
