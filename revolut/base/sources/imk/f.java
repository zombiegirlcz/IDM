package imk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f INTRO;
    public static final f MODAL;
    public static final f PRODUCT_ARTICLE;
    public static final f PROMO_OFFER;

    static {
        f fVar = new f("PRODUCT_ARTICLE", 0);
        PRODUCT_ARTICLE = fVar;
        f fVar2 = new f("PROMO_OFFER", 1);
        PROMO_OFFER = fVar2;
        f fVar3 = new f("INTRO", 2);
        INTRO = fVar3;
        f fVar4 = new f("MODAL", 3);
        MODAL = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
