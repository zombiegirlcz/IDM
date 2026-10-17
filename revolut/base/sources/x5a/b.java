package x5a;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@g
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final b BOTH;
    public static final b CARD_PAYMENT;

    @NotNull
    public static final a Companion;
    public static final b DIRECT_DEBIT;

    static {
        b bVar = new b("CARD_PAYMENT", 0);
        CARD_PAYMENT = bVar;
        b bVar2 = new b("DIRECT_DEBIT", 1);
        DIRECT_DEBIT = bVar2;
        b bVar3 = new b("BOTH", 2);
        BOTH = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new x1e.g(26));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
