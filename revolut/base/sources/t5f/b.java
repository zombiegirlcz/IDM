package t5f;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final b AGGRESSIVE;
    public static final b BALANCED;
    public static final b BOLD;
    public static final b CAUTIOUS;
    public static final b CONSERVATIVE;

    @NotNull
    public static final a Companion;

    static {
        b bVar = new b("CONSERVATIVE", 0);
        CONSERVATIVE = bVar;
        b bVar2 = new b("CAUTIOUS", 1);
        CAUTIOUS = bVar2;
        b bVar3 = new b("BALANCED", 2);
        BALANCED = bVar3;
        b bVar4 = new b("BOLD", 3);
        BOLD = bVar4;
        b bVar5 = new b("AGGRESSIVE", 4);
        AGGRESSIVE = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new szl.a(12));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
