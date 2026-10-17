package r00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BLUR;
    public static final b BRIGHT;
    public static final b COLORIZED;
    public static final b DARK;
    public static final b DARK_COUNTOUR;
    public static final b EYES_CLOSED;
    public static final b FACE_OCCLUDED;
    public static final b FRAUD;
    public static final b GLARE;
    public static final b MISSING_FACE;
    public static final b SUNGLASSES;

    static {
        b bVar = new b("DARK", 0);
        DARK = bVar;
        b bVar2 = new b("DARK_COUNTOUR", 1);
        DARK_COUNTOUR = bVar2;
        b bVar3 = new b("BRIGHT", 2);
        BRIGHT = bVar3;
        b bVar4 = new b("BLUR", 3);
        BLUR = bVar4;
        b bVar5 = new b("GLARE", 4);
        GLARE = bVar5;
        b bVar6 = new b("COLORIZED", 5);
        COLORIZED = bVar6;
        b bVar7 = new b("FRAUD", 6);
        FRAUD = bVar7;
        b bVar8 = new b("EYES_CLOSED", 7);
        EYES_CLOSED = bVar8;
        b bVar9 = new b("MISSING_FACE", 8);
        MISSING_FACE = bVar9;
        b bVar10 = new b("FACE_OCCLUDED", 9);
        FACE_OCCLUDED = bVar10;
        b bVar11 = new b("SUNGLASSES", 10);
        SUNGLASSES = bVar11;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
