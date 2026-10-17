package cxk;

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
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final b AFTER_MARKET;
    public static final b CLOSED;

    @NotNull
    public static final a Companion;
    public static final b OPEN;
    public static final b PRE_MARKET;
    public static final b UNKNOWN;

    static {
        b bVar = new b("PRE_MARKET", 0);
        PRE_MARKET = bVar;
        b bVar2 = new b("OPEN", 1);
        OPEN = bVar2;
        b bVar3 = new b("AFTER_MARKET", 2);
        AFTER_MARKET = bVar3;
        b bVar4 = new b("CLOSED", 3);
        CLOSED = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new cpi.b(21));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
