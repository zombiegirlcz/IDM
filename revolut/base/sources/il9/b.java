package il9;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final b BUSINESS;

    @NotNull
    public static final a Companion;
    public static final b INDIVIDUAL;

    static {
        b bVar = new b("INDIVIDUAL", 0);
        INDIVIDUAL = bVar;
        b bVar2 = new b("BUSINESS", 1);
        BUSINESS = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new igb.j(26));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
