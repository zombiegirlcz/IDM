package hyl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final j BOTTOM;

    @NotNull
    public static final i Companion;
    public static final j LEFT;
    public static final j RIGHT;
    public static final j TOP;

    static {
        j jVar = new j("TOP", 0);
        TOP = jVar;
        j jVar2 = new j("BOTTOM", 1);
        BOTTOM = jVar2;
        j jVar3 = new j("LEFT", 2);
        LEFT = jVar3;
        j jVar4 = new j("RIGHT", 3);
        RIGHT = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
        Companion = new i();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new hul.c(26));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
