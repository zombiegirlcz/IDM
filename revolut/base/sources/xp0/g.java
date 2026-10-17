package xp0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT;
    private final float deformationIntensity = 1.0f;
    private final float tintIntensity = 1.0f;
    private final long animationDurationMs = 1300;
    private final long delayBeforeAnimationStartMs = 200;

    static {
        g gVar = new g();
        DEFAULT = gVar;
        g[] gVarArr = {gVar};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final long a() {
        return this.animationDurationMs;
    }

    public final float b() {
        return this.deformationIntensity;
    }

    public final long c() {
        return this.delayBeforeAnimationStartMs;
    }

    public final float d() {
        return this.tintIntensity;
    }
}
