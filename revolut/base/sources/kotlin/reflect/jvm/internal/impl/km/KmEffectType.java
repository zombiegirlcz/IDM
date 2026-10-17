package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class KmEffectType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KmEffectType[] $VALUES;
    public static final KmEffectType CALLS;
    public static final KmEffectType RETURNS_CONSTANT;
    public static final KmEffectType RETURNS_NOT_NULL;

    static {
        KmEffectType kmEffectType = new KmEffectType("RETURNS_CONSTANT", 0);
        RETURNS_CONSTANT = kmEffectType;
        KmEffectType kmEffectType2 = new KmEffectType("CALLS", 1);
        CALLS = kmEffectType2;
        KmEffectType kmEffectType3 = new KmEffectType("RETURNS_NOT_NULL", 2);
        RETURNS_NOT_NULL = kmEffectType3;
        KmEffectType[] kmEffectTypeArr = {kmEffectType, kmEffectType2, kmEffectType3};
        $VALUES = kmEffectTypeArr;
        $ENTRIES = s.n(kmEffectTypeArr);
    }

    public static KmEffectType valueOf(String str) {
        return (KmEffectType) Enum.valueOf(KmEffectType.class, str);
    }

    public static KmEffectType[] values() {
        return (KmEffectType[]) $VALUES.clone();
    }
}
