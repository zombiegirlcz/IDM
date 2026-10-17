package bw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Disabled;
    public static final c DisabledNotDimmed;
    public static final c Enabled;
    private final boolean dimmed;
    private final boolean enabled;

    static {
        c cVar = new c("Enabled", 0, true, false);
        Enabled = cVar;
        c cVar2 = new c("Disabled", 1, false, true);
        Disabled = cVar2;
        c cVar3 = new c("DisabledNotDimmed", 2, false, false);
        DisabledNotDimmed = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, boolean z, boolean z3) {
        this.enabled = z;
        this.dimmed = z3;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.dimmed;
    }

    public final boolean b() {
        return this.enabled;
    }
}
