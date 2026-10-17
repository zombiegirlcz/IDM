package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @NotNull
    public static final w Companion;
    public static final x NONE;
    public static final x PENDING_ACTIVATION;

    static {
        x xVar = new x("PENDING_ACTIVATION", 0);
        PENDING_ACTIVATION = xVar;
        x xVar2 = new x("NONE", 1);
        NONE = xVar2;
        x[] xVarArr = {xVar, xVar2};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
        Companion = new w();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
