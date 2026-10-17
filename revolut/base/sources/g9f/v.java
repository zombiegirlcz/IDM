package g9f;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final u Companion;
    public static final v IN;
    public static final v OUT;

    static {
        v vVar = new v("IN", 0);
        IN = vVar;
        v vVar2 = new v("OUT", 1);
        OUT = vVar2;
        v[] vVarArr = {vVar, vVar2};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
        Companion = new u();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new g53.e(19));
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
