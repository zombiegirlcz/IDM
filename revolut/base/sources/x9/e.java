package x9;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes16.dex */
public final class e {
    public static final e e = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f303502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f303503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f303504c;
    public final String d;

    public e() {
        String string;
        Field fieldA;
        String string2;
        Field fieldA2 = null;
        try {
            fieldA = a(EnumSet.class, "elementType");
            string = null;
        } catch (Exception e2) {
            string = e2.toString();
            fieldA = null;
        }
        this.f303502a = fieldA;
        this.f303504c = string;
        try {
            string2 = null;
            fieldA2 = a(EnumMap.class, "keyType");
        } catch (Exception e4) {
            string2 = e4.toString();
        }
        this.f303503b = fieldA2;
        this.d = string2;
    }

    public static Field a(Class cls, String str) {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException(j6.a.s("No field named '", str, "' in class '", cls.getName(), "'"));
    }
}
