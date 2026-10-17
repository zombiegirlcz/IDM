package mxl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BASE_COLOR_MAP;
    public static final k METALLIC_MAP;
    public static final k NORMAL_MAP;
    public static final k ROUGHNESS_MAP;

    @NotNull
    private final String value;

    static {
        k kVar = new k("BASE_COLOR_MAP", 0, "baseColorMap");
        BASE_COLOR_MAP = kVar;
        k kVar2 = new k("ROUGHNESS_MAP", 1, "roughnessMap");
        ROUGHNESS_MAP = kVar2;
        k kVar3 = new k("NORMAL_MAP", 2, "normalMap");
        NORMAL_MAP = kVar3;
        k kVar4 = new k("METALLIC_MAP", 3, "metallicMap");
        METALLIC_MAP = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public k(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
