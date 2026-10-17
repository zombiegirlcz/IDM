package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class TypeUsage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeUsage[] $VALUES;
    public static final TypeUsage COMMON;
    public static final TypeUsage SUPERTYPE;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        SUPERTYPE = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage("COMMON", 1);
        COMMON = typeUsage2;
        TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        $VALUES = typeUsageArr;
        $ENTRIES = s.n(typeUsageArr);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) $VALUES.clone();
    }
}
