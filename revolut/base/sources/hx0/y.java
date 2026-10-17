package hx0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y DEFAULT;
    public static final y DEFAULT_STATIC_CORNERS;
    public static final y HEADER;
    public static final y REDUCED_SCALE_STATIC_CORNERS;
    public static final y REMOVE_PRODUCT;
    private final boolean animateCornerRadius;
    private final x bounceBack;

    @NotNull
    private final x initialScaleIn;
    private final boolean isShimmerEnabled;
    private final x scaleInBounce;
    private final x stretchSpring;

    static {
        y yVar = new y("DEFAULT", 0, new x(0.5f, 0.8f, 2600L), new x(0.8f, 0.78f, 300L), new x(0.78f, 1.05f, 300L), new x(1.05f, 1.0f, 500L), true, true);
        DEFAULT = yVar;
        y yVar2 = new y("DEFAULT_STATIC_CORNERS", 1, new x(0.5f, 0.8f, 2600L), new x(0.8f, 0.78f, 300L), new x(0.78f, 1.05f, 300L), new x(1.05f, 1.0f, 500L), true, false);
        DEFAULT_STATIC_CORNERS = yVar2;
        y yVar3 = new y("REDUCED_SCALE_STATIC_CORNERS", 2, new x(0.9f, 1.0f, 1500L), null, null, null, true, false);
        REDUCED_SCALE_STATIC_CORNERS = yVar3;
        y yVar4 = new y("HEADER", 3, new x(0.6f, 1.0f, 2600L), new x(1.0f, 0.96f, 300L), new x(0.96f, 1.06f, 500L), new x(1.06f, 1.0f, 500L), true, true);
        HEADER = yVar4;
        y yVar5 = new y("REMOVE_PRODUCT", 4, new x(0.5f, 0.8f, 400L), null, new x(0.8f, 1.05f, 300L), new x(1.05f, 1.0f, 500L), false, true);
        REMOVE_PRODUCT = yVar5;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public y(String str, int i, x xVar, x xVar2, x xVar3, x xVar4, boolean z, boolean z3) {
        this.initialScaleIn = xVar;
        this.stretchSpring = xVar2;
        this.scaleInBounce = xVar3;
        this.bounceBack = xVar4;
        this.isShimmerEnabled = z;
        this.animateCornerRadius = z3;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.animateCornerRadius;
    }

    public final x b() {
        return this.bounceBack;
    }

    public final x c() {
        return this.initialScaleIn;
    }

    public final x d() {
        return this.scaleInBounce;
    }

    public final x e() {
        return this.stretchSpring;
    }

    public final boolean f() {
        return this.isShimmerEnabled;
    }
}
