package ymm;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JAVA_RECENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes14.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c JAVA_0_9;
    public static final c JAVA_10;
    public static final c JAVA_11;
    public static final c JAVA_12;
    public static final c JAVA_13;
    public static final c JAVA_14;
    public static final c JAVA_15;
    public static final c JAVA_16;
    public static final c JAVA_1_1;
    public static final c JAVA_1_2;
    public static final c JAVA_1_3;
    public static final c JAVA_1_4;
    public static final c JAVA_1_5;
    public static final c JAVA_1_6;
    public static final c JAVA_1_7;
    public static final c JAVA_1_8;

    @Deprecated
    public static final c JAVA_1_9;
    public static final c JAVA_9;
    public static final c JAVA_RECENT;
    private final String name;
    private final float value;

    static {
        c cVar = new c("JAVA_0_9", "0.9", 1.5f, 0);
        JAVA_0_9 = cVar;
        c cVar2 = new c("JAVA_1_1", "1.1", 1.1f, 1);
        JAVA_1_1 = cVar2;
        c cVar3 = new c("JAVA_1_2", "1.2", 1.2f, 2);
        JAVA_1_2 = cVar3;
        c cVar4 = new c("JAVA_1_3", "1.3", 1.3f, 3);
        JAVA_1_3 = cVar4;
        c cVar5 = new c("JAVA_1_4", "1.4", 1.4f, 4);
        JAVA_1_4 = cVar5;
        c cVar6 = new c("JAVA_1_5", "1.5", 1.5f, 5);
        JAVA_1_5 = cVar6;
        c cVar7 = new c("JAVA_1_6", "1.6", 1.6f, 6);
        JAVA_1_6 = cVar7;
        c cVar8 = new c("JAVA_1_7", "1.7", 1.7f, 7);
        JAVA_1_7 = cVar8;
        c cVar9 = new c("JAVA_1_8", "1.8", 1.8f, 8);
        JAVA_1_8 = cVar9;
        c cVar10 = new c("JAVA_1_9", "9", 9.0f, 9);
        JAVA_1_9 = cVar10;
        c cVar11 = new c("JAVA_9", "9", 9.0f, 10);
        JAVA_9 = cVar11;
        c cVar12 = new c("JAVA_10", "10", 10.0f, 11);
        JAVA_10 = cVar12;
        c cVar13 = new c("JAVA_11", "11", 11.0f, 12);
        JAVA_11 = cVar13;
        c cVar14 = new c("JAVA_12", "12", 12.0f, 13);
        JAVA_12 = cVar14;
        c cVar15 = new c("JAVA_13", "13", 13.0f, 14);
        JAVA_13 = cVar15;
        c cVar16 = new c("JAVA_14", "14", 14.0f, 15);
        JAVA_14 = cVar16;
        c cVar17 = new c("JAVA_15", "15", 15.0f, 16);
        JAVA_15 = cVar17;
        c cVar18 = new c("JAVA_16", "16", 16.0f, 17);
        JAVA_16 = cVar18;
        float fA = a(System.getProperty("java.specification.version", "99.0"));
        fA = fA <= BitmapDescriptorFactory.HUE_RED ? 99.0f : fA;
        float fA2 = a(System.getProperty("java.specification.version", "99.0"));
        c cVar19 = new c("JAVA_RECENT", Float.toString(fA2 > BitmapDescriptorFactory.HUE_RED ? fA2 : 99.0f), fA, 18);
        JAVA_RECENT = cVar19;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19};
    }

    public c(String str, String str2, float f, int i) {
        this.value = f;
        this.name = str2;
    }

    public static float a(String str) {
        if (!str.contains(".")) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                return -1.0f;
            }
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[0] + CoreConstants.DOT + strArrSplit[1];
            if (str2 == null) {
                return -1.0f;
            }
            try {
                return Float.parseFloat(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        return -1.0f;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }
}
