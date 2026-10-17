package ddi;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final e ABSENT;

    @NotNull
    public static final d Companion;
    public static final e OPEN;

    static {
        e eVar = new e("OPEN", 0);
        OPEN = eVar;
        e eVar2 = new e("ABSENT", 1);
        ABSENT = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new dce.b(13));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
