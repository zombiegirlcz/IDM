package tx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 DROPDOWN;
    public static final r0 REGULAR;
    private final boolean chevronVisible;
    private final float iconMarginEndDp;
    private final float iconMarginStartDp;

    static {
        r0 r0Var = new r0("REGULAR", 0, 10.0f, 10.0f, false);
        REGULAR = r0Var;
        r0 r0Var2 = new r0("DROPDOWN", 1, 12.0f, BitmapDescriptorFactory.HUE_RED, true);
        DROPDOWN = r0Var2;
        r0[] r0VarArr = {r0Var, r0Var2};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
    }

    public r0(String str, int i, float f, float f4, boolean z) {
        this.iconMarginStartDp = f;
        this.iconMarginEndDp = f4;
        this.chevronVisible = z;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.chevronVisible;
    }

    public final float b() {
        return this.iconMarginEndDp;
    }

    public final float c() {
        return this.iconMarginStartDp;
    }
}
