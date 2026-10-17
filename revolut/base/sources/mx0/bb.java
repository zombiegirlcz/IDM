package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class bb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ bb[] $VALUES;
    public static final bb LARGE;
    public static final bb LARGE12;
    public static final bb MEDIUM;
    public static final bb REGULAR;
    public static final bb REGULAR12;
    public static final bb REGULAR20;
    public static final bb SIZE16_OFFSET4;
    public static final bb SIZE20_OFFSET4;
    public static final bb SIZE32_OFFSET8;
    public static final bb SMALL;
    private final float offsetDp;
    private final float sizeDp;

    static {
        bb bbVar = new bb("SMALL", 0, 16.0f, 6.0f);
        SMALL = bbVar;
        bb bbVar2 = new bb("SIZE16_OFFSET4", 1, 16.0f, 4.0f);
        SIZE16_OFFSET4 = bbVar2;
        bb bbVar3 = new bb("SIZE20_OFFSET4", 2, 20.0f, 4.0f);
        SIZE20_OFFSET4 = bbVar3;
        bb bbVar4 = new bb("SIZE32_OFFSET8", 3, 32.0f, 8.0f);
        SIZE32_OFFSET8 = bbVar4;
        bb bbVar5 = new bb("MEDIUM", 4, 24.0f, 4.0f);
        MEDIUM = bbVar5;
        bb bbVar6 = new bb("REGULAR12", 5, 40.0f, 12.0f);
        REGULAR12 = bbVar6;
        bb bbVar7 = new bb("REGULAR", 6, 40.0f, 16.0f);
        REGULAR = bbVar7;
        bb bbVar8 = new bb("REGULAR20", 7, 40.0f, 20.0f);
        REGULAR20 = bbVar8;
        bb bbVar9 = new bb("LARGE12", 8, 56.0f, 12.0f);
        LARGE12 = bbVar9;
        bb bbVar10 = new bb("LARGE", 9, 56.0f, 16.0f);
        LARGE = bbVar10;
        bb[] bbVarArr = {bbVar, bbVar2, bbVar3, bbVar4, bbVar5, bbVar6, bbVar7, bbVar8, bbVar9, bbVar10};
        $VALUES = bbVarArr;
        $ENTRIES = vc.s.n(bbVarArr);
    }

    public bb(String str, int i, float f, float f4) {
        this.sizeDp = f;
        this.offsetDp = f4;
    }

    public static bb valueOf(String str) {
        return (bb) Enum.valueOf(bb.class, str);
    }

    public static bb[] values() {
        return (bb[]) $VALUES.clone();
    }

    public final float a() {
        return this.offsetDp;
    }

    public final float b() {
        return this.sizeDp;
    }
}
