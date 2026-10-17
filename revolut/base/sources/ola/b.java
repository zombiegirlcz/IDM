package ola;

import aw0.l6;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements l6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LIFESTYLE_NON_REVPOINTS;
    public static final b LIFESTYLE_REVPOINTS;
    public static final b PLAN_HUB_METAL;
    public static final b PLAN_HUB_PLUS;
    public static final b PLAN_HUB_PREMIUM;
    public static final b PLAN_HUB_PRIVATE;
    public static final b PLAN_HUB_ULTRA;

    @NotNull
    private final AnimatedBackgroundType background;
    private final boolean checkUserCreationDate = false;

    @NotNull
    private final String introId;

    static {
        AnimatedBackgroundType.REV_POINTS rev_points = AnimatedBackgroundType.REV_POINTS.f51487a;
        b bVar = new b("LIFESTYLE_REVPOINTS", 0, "LIFESTYLE_REVPOINTS", rev_points);
        LIFESTYLE_REVPOINTS = bVar;
        b bVar2 = new b("LIFESTYLE_NON_REVPOINTS", 1, "LIFESTYLE_NON_REVPOINTS", rev_points);
        LIFESTYLE_NON_REVPOINTS = bVar2;
        b bVar3 = new b("PLAN_HUB_PLUS", 2, "PLAN_HUB_PLUS", AnimatedBackgroundType.PLAN_PLUS.f51480a);
        PLAN_HUB_PLUS = bVar3;
        b bVar4 = new b("PLAN_HUB_PREMIUM", 3, "PLAN_HUB_PREMIUM", AnimatedBackgroundType.PLAN_PREMIUM.f51481a);
        PLAN_HUB_PREMIUM = bVar4;
        b bVar5 = new b("PLAN_HUB_METAL", 4, "PLAN_HUB_METAL", AnimatedBackgroundType.PLAN_METAL.f51479a);
        PLAN_HUB_METAL = bVar5;
        b bVar6 = new b("PLAN_HUB_ULTRA", 5, "PLAN_HUB_ULTRA", AnimatedBackgroundType.PLAN_ULTRA.f51483a);
        PLAN_HUB_ULTRA = bVar6;
        b bVar7 = new b("PLAN_HUB_PRIVATE", 6, "PLAN_HUB_PRIVATE", AnimatedBackgroundType.PLAN_PRIVATE.f51482a);
        PLAN_HUB_PRIVATE = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2, AnimatedBackgroundType animatedBackgroundType) {
        this.introId = str2;
        this.background = animatedBackgroundType;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // aw0.l6
    public final boolean a() {
        return this.checkUserCreationDate;
    }

    @Override // aw0.l6
    public final String b() {
        return this.introId;
    }

    @Override // aw0.l6
    public final AnimatedBackgroundType getBackground() {
        return this.background;
    }
}
