package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class TypeVariance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeVariance[] $VALUES;
    public static final TypeVariance IN;
    public static final TypeVariance INV;
    public static final TypeVariance OUT;

    @NotNull
    private final String presentation;

    static {
        TypeVariance typeVariance = new TypeVariance("IN", 0, "in");
        IN = typeVariance;
        TypeVariance typeVariance2 = new TypeVariance("OUT", 1, "out");
        OUT = typeVariance2;
        TypeVariance typeVariance3 = new TypeVariance("INV", 2, "");
        INV = typeVariance3;
        TypeVariance[] typeVarianceArr = {typeVariance, typeVariance2, typeVariance3};
        $VALUES = typeVarianceArr;
        $ENTRIES = s.n(typeVarianceArr);
    }

    public TypeVariance(String str, int i, String str2) {
        this.presentation = str2;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }
}
