package c1m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f ANDROID_IDFA;
    public static final f APP_SET_ID;
    public static final f APP_SET_ID_SCOPE;
    public static final f AVAILABLE_STORAGE;
    public static final f BATTERY_LEVEL;
    public static final f BATTERY_STATE;
    public static final f CARRIER;
    public static final f IS_PORTRAIT;
    public static final f LANGUAGE;
    public static final f NETWORK_TECHNOLOGY;
    public static final f NETWORK_TYPE;
    public static final f PHYSICAL_MEMORY;
    public static final f RESOLUTION;
    public static final f SCALE;
    public static final f SYSTEM_AVAILABLE_MEMORY;
    public static final f TOTAL_STORAGE;

    static {
        f fVar = new f("CARRIER", 0);
        CARRIER = fVar;
        f fVar2 = new f("NETWORK_TYPE", 1);
        NETWORK_TYPE = fVar2;
        f fVar3 = new f("NETWORK_TECHNOLOGY", 2);
        NETWORK_TECHNOLOGY = fVar3;
        f fVar4 = new f("ANDROID_IDFA", 3);
        ANDROID_IDFA = fVar4;
        f fVar5 = new f("PHYSICAL_MEMORY", 4);
        PHYSICAL_MEMORY = fVar5;
        f fVar6 = new f("SYSTEM_AVAILABLE_MEMORY", 5);
        SYSTEM_AVAILABLE_MEMORY = fVar6;
        f fVar7 = new f("BATTERY_LEVEL", 6);
        BATTERY_LEVEL = fVar7;
        f fVar8 = new f("BATTERY_STATE", 7);
        BATTERY_STATE = fVar8;
        f fVar9 = new f("AVAILABLE_STORAGE", 8);
        AVAILABLE_STORAGE = fVar9;
        f fVar10 = new f("TOTAL_STORAGE", 9);
        TOTAL_STORAGE = fVar10;
        f fVar11 = new f("IS_PORTRAIT", 10);
        IS_PORTRAIT = fVar11;
        f fVar12 = new f("RESOLUTION", 11);
        RESOLUTION = fVar12;
        f fVar13 = new f("SCALE", 12);
        SCALE = fVar13;
        f fVar14 = new f("LANGUAGE", 13);
        LANGUAGE = fVar14;
        f fVar15 = new f("APP_SET_ID", 14);
        APP_SET_ID = fVar15;
        f fVar16 = new f("APP_SET_ID_SCOPE", 15);
        APP_SET_ID_SCOPE = fVar16;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
