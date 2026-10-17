package xl2;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ICONIZED;
    public static final m ICONIZED_COMPACT;
    public static final m IMAGE_BANNER;
    public static final m NUMBERED;
    public static final m PARAGRAPH;

    static {
        m mVar = new m("ICONIZED", 0);
        ICONIZED = mVar;
        m mVar2 = new m("NUMBERED", 1);
        NUMBERED = mVar2;
        m mVar3 = new m("PARAGRAPH", 2);
        PARAGRAPH = mVar3;
        m mVar4 = new m("ICONIZED_COMPACT", 3);
        ICONIZED_COMPACT = mVar4;
        m mVar5 = new m("IMAGE_BANNER", 4);
        IMAGE_BANNER = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
