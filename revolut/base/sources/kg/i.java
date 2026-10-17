package kg;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i IDENTITY;
    public static final i LOWER_CASE_WITH_DASHES;
    public static final i LOWER_CASE_WITH_DOTS;
    public static final i LOWER_CASE_WITH_UNDERSCORES;
    public static final i UPPER_CAMEL_CASE;
    public static final i UPPER_CAMEL_CASE_WITH_SPACES;
    public static final i UPPER_CASE_WITH_UNDERSCORES;

    static {
        i iVar = new i() { // from class: kg.b
            @Override // kg.i
            public final String b(Field field) {
                return field.getName();
            }
        };
        IDENTITY = iVar;
        i iVar2 = new i() { // from class: kg.c
            @Override // kg.i
            public final String b(Field field) {
                return i.c(field.getName());
            }
        };
        UPPER_CAMEL_CASE = iVar2;
        i iVar3 = new i() { // from class: kg.d
            @Override // kg.i
            public final String b(Field field) {
                return i.c(i.a(zsc.p.SPACE_CHAR, field.getName()));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = iVar3;
        i iVar4 = new i() { // from class: kg.e
            @Override // kg.i
            public final String b(Field field) {
                return i.a('_', field.getName()).toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = iVar4;
        i iVar5 = new i() { // from class: kg.f
            @Override // kg.i
            public final String b(Field field) {
                return i.a('_', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = iVar5;
        i iVar6 = new i() { // from class: kg.g
            @Override // kg.i
            public final String b(Field field) {
                return i.a(CoreConstants.DASH_CHAR, field.getName()).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = iVar6;
        i iVar7 = new i() { // from class: kg.h
            @Override // kg.i
            public final String b(Field field) {
                return i.a(CoreConstants.DOT, field.getName()).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = iVar7;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    public static String a(char c2, String str) {
        StringBuilder sb6 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb6.length() != 0) {
                sb6.append(c2);
            }
            sb6.append(cCharAt);
        }
        return sb6.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public abstract String b(Field field);
}
