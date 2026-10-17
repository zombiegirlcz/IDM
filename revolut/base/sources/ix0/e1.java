package ix0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 CUTOUT_STAGE;
    public static final e1 MASKED_DRAWABLE;
    public static final e1 SCALE_ANIMATION;
    public static final e1 SCROLL_EDGE_TOP_EFFECT;
    public static final e1 SHAPEABLE_IMAGE_VIEW;

    static {
        e1 e1Var = new e1("CUTOUT_STAGE", 0);
        CUTOUT_STAGE = e1Var;
        e1 e1Var2 = new e1("MASKED_DRAWABLE", 1);
        MASKED_DRAWABLE = e1Var2;
        e1 e1Var3 = new e1("SHAPEABLE_IMAGE_VIEW", 2);
        SHAPEABLE_IMAGE_VIEW = e1Var3;
        e1 e1Var4 = new e1("SCALE_ANIMATION", 3);
        SCALE_ANIMATION = e1Var4;
        e1 e1Var5 = new e1("SCROLL_EDGE_TOP_EFFECT", 4);
        SCROLL_EDGE_TOP_EFFECT = e1Var5;
        e1[] e1VarArr = {e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
        $VALUES = e1VarArr;
        $ENTRIES = vc.s.n(e1VarArr);
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
