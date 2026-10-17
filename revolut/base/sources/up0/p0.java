package up0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 ACCOUNT_SWITCH_IN;
    public static final p0 ACCOUNT_SWITCH_OUT;
    public static final p0 BALANCE_DECREASE;
    public static final p0 BALANCE_INCREASE;
    public static final float BLACK_HOLE_GLOW = 1.0f;
    public static final float BLACK_HOLE_RADIUS_DP = 500.0f;

    @NotNull
    public static final m0 Companion;
    public static final float HOVER_STRENGTH_DP = 170.0f;
    public static final float SOURCE_SPHERE_DIAMETER_DP = 200.0f;

    @NotNull
    private final n0 direction;

    @NotNull
    private final o0 motion;

    @NotNull
    private final o0 opacity;

    static {
        n0 n0Var = n0.TO_BLACK_HOLE;
        p0 p0Var = new p0("ACCOUNT_SWITCH_OUT", 0, n0Var, new o0(1.2f, 0.08f), new o0(0.35f, BitmapDescriptorFactory.HUE_RED));
        ACCOUNT_SWITCH_OUT = p0Var;
        n0 n0Var2 = n0.FROM_BLACK_HOLE;
        p0 p0Var2 = new p0("ACCOUNT_SWITCH_IN", 1, n0Var2, new o0(1.2f, 0.08f), new o0(0.8f, BitmapDescriptorFactory.HUE_RED));
        ACCOUNT_SWITCH_IN = p0Var2;
        p0 p0Var3 = new p0("BALANCE_INCREASE", 2, n0Var2, new o0(2.2f, 0.08f), new o0(1.2f, BitmapDescriptorFactory.HUE_RED));
        BALANCE_INCREASE = p0Var3;
        p0 p0Var4 = new p0("BALANCE_DECREASE", 3, n0Var, new o0(2.2f, 0.08f), new o0(0.8f, BitmapDescriptorFactory.HUE_RED));
        BALANCE_DECREASE = p0Var4;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
        Companion = new m0();
    }

    public p0(String str, int i, n0 n0Var, o0 o0Var, o0 o0Var2) {
        this.direction = n0Var;
        this.motion = o0Var;
        this.opacity = o0Var2;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final n0 a() {
        return this.direction;
    }

    public final o0 b() {
        return this.motion;
    }

    public final o0 c() {
        return this.opacity;
    }
}
