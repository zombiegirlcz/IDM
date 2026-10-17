package b7l;

import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b GRENKE;
    public static final b PAYSAFE;
    public static final b VIACASH;

    @NotNull
    private static final Map<String, b> mapping;

    static {
        b bVar = new b("GRENKE", 0);
        GRENKE = bVar;
        b bVar2 = new b("PAYSAFE", 1);
        PAYSAFE = bVar2;
        b bVar3 = new b("VIACASH", 2);
        VIACASH = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        mapping = r0.k(new Pair("GRENKE", bVar), new Pair("PAYSAFE", bVar2), new Pair("VIACASH", bVar3));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
