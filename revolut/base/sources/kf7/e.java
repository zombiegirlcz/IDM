package kf7;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final e CLAIM;

    @NotNull
    public static final d Companion;
    public static final e GO_TO_ACCOUNT;
    public static final e REJECT;
    public static final e SHARE;

    static {
        e eVar = new e("CLAIM", 0);
        CLAIM = eVar;
        e eVar2 = new e("REJECT", 1);
        REJECT = eVar2;
        e eVar3 = new e("SHARE", 2);
        SHARE = eVar3;
        e eVar4 = new e("GO_TO_ACCOUNT", 3);
        GO_TO_ACCOUNT = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
        Companion = new d();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ka9.b(15));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
