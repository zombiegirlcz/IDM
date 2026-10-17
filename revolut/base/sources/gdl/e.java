package gdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final e ACTIVE;

    @NotNull
    public static final d Companion;
    public static final e INACTIVE;
    public static final e PENDING_DEACTIVATION;

    static {
        e eVar = new e("ACTIVE", 0);
        ACTIVE = eVar;
        e eVar2 = new e("INACTIVE", 1);
        INACTIVE = eVar2;
        e eVar3 = new e("PENDING_DEACTIVATION", 2);
        PENDING_DEACTIVATION = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new gaa.b(10));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
