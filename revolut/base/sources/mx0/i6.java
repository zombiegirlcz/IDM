package mx0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public abstract class i6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i6[] $VALUES;
    public static final i6 DARK;
    public static final i6 LIGHT;

    static {
        i6 i6Var = new i6() { // from class: mx0.h6
            @Override // mx0.i6
            public final int a() {
                return R$drawable.internal_fixed_tabs_background_light;
            }
        };
        LIGHT = i6Var;
        i6 i6Var2 = new i6() { // from class: mx0.g6
            @Override // mx0.i6
            public final int a() {
                return R$drawable.internal_fixed_tabs_background_dark;
            }
        };
        DARK = i6Var2;
        i6[] i6VarArr = {i6Var, i6Var2};
        $VALUES = i6VarArr;
        $ENTRIES = vc.s.n(i6VarArr);
    }

    public static i6 valueOf(String str) {
        return (i6) Enum.valueOf(i6.class, str);
    }

    public static i6[] values() {
        return (i6[]) $VALUES.clone();
    }

    public abstract int a();
}
