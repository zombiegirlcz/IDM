package uz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final c Companion;
    public static final d FAILED_BLOCKING;
    public static final d FAILED_WARNING;
    public static final d SUCCESS;

    static {
        d dVar = new d("SUCCESS", 0);
        SUCCESS = dVar;
        d dVar2 = new d("FAILED_WARNING", 1);
        FAILED_WARNING = dVar2;
        d dVar3 = new d("FAILED_BLOCKING", 2);
        FAILED_BLOCKING = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        Companion = new c();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ux7.g(21));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
