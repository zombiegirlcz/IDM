package yem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f FIXED_LINE;
    public static final f FIXED_LINE_OR_MOBILE;
    public static final f MOBILE;
    public static final f PAGER;
    public static final f PERSONAL_NUMBER;
    public static final f PREMIUM_RATE;
    public static final f SHARED_COST;
    public static final f TOLL_FREE;
    public static final f UAN;
    public static final f UNKNOWN;
    public static final f VOICEMAIL;
    public static final f VOIP;

    static {
        f fVar = new f("FIXED_LINE", 0);
        FIXED_LINE = fVar;
        f fVar2 = new f("MOBILE", 1);
        MOBILE = fVar2;
        f fVar3 = new f("FIXED_LINE_OR_MOBILE", 2);
        FIXED_LINE_OR_MOBILE = fVar3;
        f fVar4 = new f("TOLL_FREE", 3);
        TOLL_FREE = fVar4;
        f fVar5 = new f("PREMIUM_RATE", 4);
        PREMIUM_RATE = fVar5;
        f fVar6 = new f("SHARED_COST", 5);
        SHARED_COST = fVar6;
        f fVar7 = new f("VOIP", 6);
        VOIP = fVar7;
        f fVar8 = new f("PERSONAL_NUMBER", 7);
        PERSONAL_NUMBER = fVar8;
        f fVar9 = new f("PAGER", 8);
        PAGER = fVar9;
        f fVar10 = new f("UAN", 9);
        UAN = fVar10;
        f fVar11 = new f("VOICEMAIL", 10);
        VOICEMAIL = fVar11;
        f fVar12 = new f("UNKNOWN", 11);
        UNKNOWN = fVar12;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
