package aw0;

import com.revolut.core.ui_kit.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v1[] $VALUES;

    @NotNull
    public static final t1 Companion;
    public static final v1 DARK;
    public static final v1 LIGHT;

    static {
        v1 v1Var = new v1("LIGHT", 0);
        LIGHT = v1Var;
        v1 v1Var2 = new v1("DARK", 1);
        DARK = v1Var2;
        v1[] v1VarArr = {v1Var, v1Var2};
        $VALUES = v1VarArr;
        $ENTRIES = vc.s.n(v1VarArr);
        Companion = new t1();
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }

    public final int a() {
        int i = u1.f10553a[ordinal()];
        if (i == 1) {
            return R$attr.internal_colorForegroundTintOnDarkBackground;
        }
        if (i == 2) {
            return R$attr.internal_colorForegroundTintOnLightBackground;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final y9 c() {
        int i = u1.f10553a[ordinal()];
        if (i == 1) {
            return y9.LIGHT;
        }
        if (i == 2) {
            return y9.DARK;
        }
        throw new NoWhenBranchMatchedException();
    }
}
