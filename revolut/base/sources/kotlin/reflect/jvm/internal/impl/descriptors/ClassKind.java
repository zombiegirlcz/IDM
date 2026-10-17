package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ClassKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClassKind[] $VALUES;
    public static final ClassKind ANNOTATION_CLASS;
    public static final ClassKind CLASS;
    public static final ClassKind ENUM_CLASS;
    public static final ClassKind ENUM_ENTRY;
    public static final ClassKind INTERFACE;
    public static final ClassKind OBJECT;
    private final String codeRepresentation;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0, "class");
        CLASS = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1, "interface");
        INTERFACE = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2, "enum class");
        ENUM_CLASS = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3, null);
        ENUM_ENTRY = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");
        ANNOTATION_CLASS = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5, "object");
        OBJECT = classKind6;
        ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
        $VALUES = classKindArr;
        $ENTRIES = s.n(classKindArr);
    }

    public ClassKind(String str, int i, String str2) {
        this.codeRepresentation = str2;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
