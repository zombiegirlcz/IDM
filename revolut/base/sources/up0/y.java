package up0;

import com.revolut.core.ui_kit.R$color;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y BG552;
    public static final y BG553;
    public static final y BG554;
    public static final y BG555;
    public static final y BG556;
    public static final y BG557;
    public static final y BG558;
    public static final y BG559;
    public static final y BG560;
    public static final y BG561;
    public static final y BG562;
    private final int backgroundColorRes;
    private final int glowColorRes;

    static {
        y yVar = new y("BG552", 0, R$color.internal_color_particles_bg552_background, R$color.internal_color_particles_bg552_glow);
        BG552 = yVar;
        y yVar2 = new y("BG553", 1, R$color.internal_color_particles_bg553_background, R$color.internal_color_particles_bg553_glow);
        BG553 = yVar2;
        y yVar3 = new y("BG554", 2, R$color.internal_color_particles_bg554_background, R$color.internal_color_particles_bg554_glow);
        BG554 = yVar3;
        y yVar4 = new y("BG555", 3, R$color.internal_color_particles_bg555_background, R$color.internal_color_particles_bg555_glow);
        BG555 = yVar4;
        y yVar5 = new y("BG556", 4, R$color.internal_color_particles_bg556_background, R$color.internal_color_particles_bg556_glow);
        BG556 = yVar5;
        y yVar6 = new y("BG557", 5, R$color.internal_color_particles_bg557_background, R$color.internal_color_particles_bg557_glow);
        BG557 = yVar6;
        y yVar7 = new y("BG558", 6, R$color.internal_color_particles_bg558_background, R$color.internal_color_particles_bg558_glow);
        BG558 = yVar7;
        y yVar8 = new y("BG559", 7, R$color.internal_color_particles_bg559_background, R$color.internal_color_particles_bg559_glow);
        BG559 = yVar8;
        y yVar9 = new y("BG560", 8, R$color.internal_color_particles_bg560_background, R$color.internal_color_particles_bg560_glow);
        BG560 = yVar9;
        y yVar10 = new y("BG561", 9, R$color.internal_color_particles_bg561_background, R$color.internal_color_particles_bg561_glow);
        BG561 = yVar10;
        y yVar11 = new y("BG562", 10, R$color.internal_color_particles_bg562_background, R$color.internal_color_particles_bg562_glow);
        BG562 = yVar11;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10, yVar11};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public y(String str, int i, int i2, int i3) {
        this.backgroundColorRes = i2;
        this.glowColorRes = i3;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    public final int a() {
        return this.backgroundColorRes;
    }

    public final int b() {
        return this.glowColorRes;
    }
}
